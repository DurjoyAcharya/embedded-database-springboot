package com.example.derby.api.repository;

import com.example.derby.api.model.Vendor;
import org.springframework.data.repository.CrudRepository;
import java.util.Optional;
public interface VendorRepository extends CrudRepository<Vendor,Long> {
    Optional<Vendor> findByName(String firstName);
}
