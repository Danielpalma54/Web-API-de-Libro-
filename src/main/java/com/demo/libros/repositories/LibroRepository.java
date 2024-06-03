package com.demo.libros.repositories;

import java.util.List;

import com.demo.libros.models.Libro;

public interface LibroRepository {
    Libro getLibro(int id);

    List<Libro> getLibros();

    Libro nuevoLibro(Libro libro);
}
