package com.example.batch9.repository;

import com.example.batch9.entity.Company;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CompanyRepository extends JpaRepository<Company, Integer> {

    @Query(value = "SELECT id, name, address FROM company WHERE address LIKE %?1%", nativeQuery = true)
    Company findByAddress(String address);
}
