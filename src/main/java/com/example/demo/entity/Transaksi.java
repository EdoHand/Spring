package com.example.demo.entity;

import jakarta.persistence.*;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name = "Transaksi")
public class Transaksi {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 50)
    @NotNull
    @Length(max = 50)
    private String nama_barang;

    @Column(nullable = false, length = 50)
    @NotNull
    @Length(max = 50)
    private Integer jumlah_barang;

    @Temporal(TemporalType.DATE)
    @Column(name = "stock_date")
    private Date stockDate;

    @Column(nullable = false, length = 50)
    @NotNull
    @Length(max = 50)
    private Integer harga_barang;

    public Transaksi (){

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

    public String getNama_barang() {
        return nama_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public Integer getJumlah_barang() {
        return jumlah_barang;
    }

    public void setJumlah_barang(Integer jumlah_barang) {
        this.jumlah_barang = jumlah_barang;
    }

    public Date getStockDate() {
        return stockDate;
    }

    public void setStockDate(Date stockDate) {
        this.stockDate = stockDate;
    }

    public Integer getHarga_barang() {
        return harga_barang;
    }

    public void setHarga_barang(Integer harga_barang) {
        this.harga_barang = harga_barang;
    }
}
