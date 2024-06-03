package com.demo.libros.repositories;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.demo.libros.models.Libro;

@Repository
public class LibroRepositoryDemo implements LibroRepository {

    private List<Libro> libros = new ArrayList<>();

    public LibroRepositoryDemo() {
        libros.add(new Libro(1, "Luna de Pluton", "Dross", "Ediciones Temas de Hoy", 2015));
        libros.add(new Libro(2, "Orgullo y perjuicio", "Jane Auste", "Austral Editorial", 1915));
        libros.add(new Libro(3, "Guerra y paz", "Leon Tolstoi", "Ruski Vienik", 1865));
        libros.add(new Libro(4, "Dracula", "Bram Stoker", "Austral", 1897));
        libros.add(new Libro(5, "Joyland", "Stephen King ", " DEBOLSILLO,", 2013));
    }

    public Libro getLibro(int id) {
        System.out.println("Conectado a base de datos ORACLE");
        for (Libro libro : libros) {
            if (id == libro.getId())
                return libro;

        }

        return null;
    }

    public List<Libro> getLibros() {
        System.out.println("Conectado a base de datos ORACLE");
        return libros;
    }

    @Override
    public Libro nuevoLibro(Libro libro) {
        libros.add(libro);
        return libro;
    }

}
