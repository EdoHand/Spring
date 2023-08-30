package com.example.demo.Repository;

import com.example.demo.entity.DetailsStock;
import com.example.demo.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DetailsRepository extends JpaRepository<DetailsStock, Integer> {
}
