package com.example.batch9.repository;

import com.example.batch9.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<User, Integer> {
    @Query(value = "SELECT id, name, email, instagram FROM user WHERE company_id LIKE %?1%", nativeQuery = true)
    User findByCompanyId(int companyId);

    User findByName(String name);
}
