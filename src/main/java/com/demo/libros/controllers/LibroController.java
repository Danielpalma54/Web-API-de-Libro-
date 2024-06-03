package com.demo.libros.controllers;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.demo.libros.models.Libro;
import com.demo.libros.services.LibroService;
import com.demo.libros.utils.LibroException;

@RestController
public class LibroController {

    private final LibroService libroService;

    @Autowired
    public LibroController(LibroService libroService) {
        this.libroService = libroService;
    }

    @GetMapping("/libros")
    public List<Libro> getLibros() {
        return libroService.getLibros();
    }

    @GetMapping("/libros/{id}")
    public ResponseEntity<Libro> getLibro(@PathVariable int id) {
        Libro libro = libroService.getLibro(id);
        if (libro == null) {
            throw new LibroException("No se ha encontrado un libro con el id " + id);
        }
        return ResponseEntity.ok(libro);
    }

    @PostMapping("/libros")
    public ResponseEntity<Libro> nuevoLibro(@RequestBody Libro libro) {
        Libro newLibro = libroService.nuevLibro(libro);
        return ResponseEntity.status(HttpStatus.CREATED).body(newLibro);
    }
}
