package com.example.pr5.controllers;

import com.example.pr5.models.Client;
import com.example.pr5.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    ClientService service;

    @PostMapping("/")
    private ResponseEntity<Client> saveBook(@RequestBody Client object) {
        return ResponseEntity.ok(service.create(object));
    }

    @GetMapping("/")
    private List<Client> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    private Client getById(@PathVariable("id") int id) {
        return service.getById(id);
    }

    @PutMapping("/")
    private Client update(@RequestBody Client object) {
        service.create(object);
        return object;
    }

    @DeleteMapping("/{id}")
    private void deleteBook(@PathVariable("id") int id) {
        service.delete(id);
    }
}