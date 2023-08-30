package com.example.demo.entity;

import jakarta.persistence.*;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "Product")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 50)
    @NotNull
    @Length(min = 5, max = 50)
    private String name_stock;

    private float price;
    @Column(nullable = false, length = 50)
    @NotNull
    @Length(min = 5, max = 50)
    private Integer stock_ready;

    @Temporal(TemporalType.DATE)
    @Column(name = "stock_date")
    private Date stockDate;

    public Product (){

    }
    @PrePersist
    protected void onCreate() {
        stockDate = new Date(); // Mengatur tanggal persediaan saat entitas dibuat
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName_stock() {
        return name_stock;
    }

    public void setName_stock(String name_stock) {
        this.name_stock = name_stock;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Integer getStock_ready() {
        return stock_ready;
    }

    public void setStock_ready(Integer stock_ready) {
        this.stock_ready = stock_ready;
    }

    public Date getStockDate() {
        return stockDate;
    }

    public void setStockDate(Date stockDate) {
        this.stockDate = stockDate;
    }
}
