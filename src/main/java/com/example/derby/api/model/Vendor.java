package com.example.derby.api.model;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "vendor", schema = "h2db")
public class Vendor {
    @Id
    private int id;
    private String firstName;
    private String lastName;
    @ElementCollection
    private List<String> address;
}