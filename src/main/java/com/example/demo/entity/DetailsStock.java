package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.*;
import jakarta.persistence.Table;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;

@Entity
@Table(name = "Detail Stock")
public class DetailsStock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 50)
    @NotNull
    @Length(max = 50)
    private String name_stock;

    @Column(nullable = false, length = 50)
    @NotNull
    @Length(max = 50)
    private Integer name_code;

    @Column(nullable = false, length = 50)
    @NotNull
    @Length(max = 255)
    private Integer jumlah_stok_awal;

    @Column(nullable = false, length = 50)
    @NotNull
    @Length(max = 255)
    private Integer barang_masuk;

    @Column(nullable = false, length = 50)
    @NotNull
    @Length(max = 255)
    private Integer barang_keluar;

    public DetailsStock(){

    }

    public String getName_stock() {
        return name_stock;
    }

    public void setName_stock(String name_stock) {
        this.name_stock = name_stock;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getName_code() {
        return name_code;
    }

    public void setName_code(Integer name_code) {
        this.name_code = name_code;
    }

    public Integer getJumlah_stok_awal() {
        return jumlah_stok_awal;
    }

    public void setJumlah_stok_awal(Integer jumlah_stok_awal) {
        this.jumlah_stok_awal = jumlah_stok_awal;
    }

    public Integer getBarang_masuk() {
        return barang_masuk;
    }

    public void setBarang_masuk(Integer barang_masuk) {
        this.barang_masuk = barang_masuk;
    }

    public Integer getBarang_keluar() {
        return barang_keluar;
    }

    public void setBarang_keluar(Integer barang_keluar) {
        this.barang_keluar = barang_keluar;
    }
}
