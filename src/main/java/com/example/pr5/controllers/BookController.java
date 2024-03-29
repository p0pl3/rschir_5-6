package com.example.pr5.controllers;

import com.example.pr5.models.Book;
import com.example.pr5.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService service;

    @PostMapping("/")
    private ResponseEntity<Book> saveBook(@RequestBody Book object) {
        return ResponseEntity.ok(service.create(object));
    }

    @GetMapping("/")
    private List<Book> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    private Book getById(@PathVariable("id") int id) {
        return service.getById(id);
    }

    @DeleteMapping("/{id}")
    private void deleteBook(@PathVariable("id") int id) {
        service.delete(id);
    }


    @PutMapping("/")
    private Book update(@RequestBody Book object) {
        service.create(object);
        return object;
    }
}