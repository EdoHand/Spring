package com.example.demo.controller;

import com.example.demo.Repository.DetailsRepository;
import com.example.demo.entity.DetailsStock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import java.net.URI;
import java.util.List;

@RestController
@RequestMapping("/details")
public class DetailController {
    @Autowired
    private DetailsRepository detailsRepository;

    @GetMapping("/list")
    public List<DetailsStock>listAll(){
        return detailsRepository.findAll();
    }

    @PostMapping("/create")
    public ResponseEntity<DetailsStock> createNewStok(@RequestBody @Valid DetailsStock newDetailsStok){
        DetailsStock savedStock = detailsRepository.save(newDetailsStok);
        URI newStockURI = URI.create("/details/"+savedStock.getId());
        return ResponseEntity.created(newStockURI).body(savedStock);
    }
}
