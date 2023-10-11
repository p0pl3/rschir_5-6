package com.example.pr5.controllers;

import com.example.pr5.models.WashingMachine;
import com.example.pr5.service.WashingMachineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/washingmachine")
public class WashingMachineController {

    @Autowired
    WashingMachineService service;

    @PostMapping("/")
    private ResponseEntity<WashingMachine> saveBook(@RequestBody WashingMachine object) {
        return ResponseEntity.ok(service.create(object));
    }

    @GetMapping("/")
    private List<WashingMachine> getAll() {
        return service.getAll();
    }

    @GetMapping("/{id}")
    private WashingMachine getById(@PathVariable("id") int id) {
        return service.getById(id);
    }

    @PutMapping("/")
    private WashingMachine update(@RequestBody WashingMachine object) {
        service.create(object);
        return object;
    }

    @DeleteMapping("/{id}")
    private void deleteBook(@PathVariable("id") int id) {
        service.delete(id);
    }


}  
