package com.example.embedded_database_spring_boot.repository;

import com.example.embedded_database_spring_boot.model.Vendor;
import org.springframework.data.repository.CrudRepository;
import java.util.Optional;
public interface VendorRepository extends CrudRepository<Vendor,Long> {
    Optional<Vendor> findByName(String firstName);
}
