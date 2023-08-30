package com.example.demo.controller;

import com.example.demo.Repository.TransaksiRepository;
import com.example.demo.entity.Transaksi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/transaksi")
public class TransaksiController {
    @Autowired
    private TransaksiRepository transaksiRepository;

    @GetMapping("/list")
    public List<Transaksi>listAll(){
        return transaksiRepository.findAll();
    }

    @PostMapping("/create")
    public ResponseEntity<Transaksi> createTransaksi(@RequestBody @Valid Transaksi newTransaksiData){
        Transaksi savedTransaksi = transaksiRepository.save(newTransaksiData);
        URI newTransaksiURI = URI.create("/transaksi/"+savedTransaksi.getId());
        return ResponseEntity.created(newTransaksiURI).body(savedTransaksi);
    }
}
