package com.example.demo.Repository;

import com.example.demo.entity.Transaksi;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransaksiRepository extends JpaRepository <Transaksi, Integer> {
}
