package com.example.embedded_database_spring_boot.controller;

import com.example.embedded_database_spring_boot.model.Vendor;
import com.example.embedded_database_spring_boot.repository.VendorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class VendorController {
    @Autowired
    private VendorRepository repository;
    @PostMapping("/saveall")
    public String saveVendor(@RequestBody List<Vendor> vendors)
    {
        repository.saveAll(vendors);
        return vendors.size()+" Vendor Saved...";
    }
    @GetMapping("/getvendor")
    public List<Vendor> getallVendor()
    {
        return (List<Vendor>) repository.findAll();
    }
    @GetMapping("/getVendorById/{id}")
    public Optional<Vendor> getVendorById(@PathVariable int id)
    {
        return repository.findById((long) id);
    }
    @GetMapping("/getVendorByName/{firstName}")
    public Optional<Vendor> getVendorByName(@PathVariable String firstName)
    {
        return repository.findByName(firstName);
    }
    @GetMapping("/")
    public String getHello()
    {
        return "Hello Durjoy";
    }
}
