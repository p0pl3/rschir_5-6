package com.example.pr5.controllers;

import com.example.pr5.models.Telephone;
import com.example.pr5.service.TelephoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/phone")
public class TelephoneController {

    @Autowired
    TelephoneService service;

    @PostMapping("/")
    private ResponseEntity<Telephone> saveBook(@RequestBody Telephone object) {
        return ResponseEntity.ok(service.create(object));
    }

    @GetMapping("/")
    private List<Telephone> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    private Telephone getById(@PathVariable("id") int id) {
        return service.getById(id);
    }

    @PutMapping("/")
    private Telephone update(@RequestBody Telephone object) {
        service.create(object);
        return object;
    }

    @DeleteMapping("/{id}")
    private void deleteBook(@PathVariable("id") int id) {
        service.delete(id);
    }


}  