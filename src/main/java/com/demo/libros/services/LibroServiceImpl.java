package com.demo.libros.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.libros.models.Libro;
import com.demo.libros.repositories.LibroRepositoryImpl;

@Service
public class LibroServiceImpl implements LibroService {
    @Autowired
    private LibroRepositoryImpl libroRepository;

    @Override
    public Libro getLibro(int id) {
        return libroRepository.getLibro(id);
    }

    @Override
    public List<Libro> getLibros() {
        return libroRepository.getLibros();
    }

    @Override
    public Libro nuevLibro(Libro libro) {
        return libroRepository.nuevoLibro(libro);
    }

}
