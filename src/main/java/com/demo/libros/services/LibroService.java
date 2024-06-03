package com.demo.libros.services;

import java.util.List;

import com.demo.libros.models.Libro;

public interface LibroService {
    Libro getLibro(int id);

    List<Libro> getLibros();

    Libro nuevLibro(Libro libro);
}
