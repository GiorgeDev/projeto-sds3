package com.projeto.dsvendas.controllers;

import com.projeto.dsvendas.dto.SaleDTO;
import com.projeto.dsvendas.dto.SellerDTO;
import com.projeto.dsvendas.entities.Sale;
import com.projeto.dsvendas.service.SaleService;
import com.projeto.dsvendas.service.SellerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/sales")
public class SaleController {

    @Autowired
    private SaleService service;

    @GetMapping
    public ResponseEntity<Page<SaleDTO>> findALL(Pageable pageable){
        Page<SaleDTO> list = service.findAll(pageable);
        return ResponseEntity.ok(list);
    }
}
