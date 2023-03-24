package com.example.kubernates.repository;

import com.example.kubernates.entities.Cat;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CatRepository extends JpaRepository<Cat,String> {
}
