package com.projeto.dsvendas.service;

import com.projeto.dsvendas.dto.SaleDTO;
import com.projeto.dsvendas.dto.SaleSuccessDTO;
import com.projeto.dsvendas.dto.SaleSumDTO;
import com.projeto.dsvendas.dto.SellerDTO;
import com.projeto.dsvendas.entities.Sale;
import com.projeto.dsvendas.entities.Seller;
import com.projeto.dsvendas.repositories.SaleRepository;
import com.projeto.dsvendas.repositories.SellerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;


@Service
public class SaleService {

    @Autowired
    private SaleRepository repository;

    @Autowired
    private SellerRepository sallerRepository;

    @Transactional(readOnly = true)
    public Page<SaleDTO> findAll(Pageable pageable){
        sallerRepository.findAll();
     Page<Sale> result = repository.findAll(pageable);
     return result.map(x -> new SaleDTO(x));
    }

    @Transactional(readOnly = true)
    public List<SaleSumDTO> amountGroupedBySeller(){
        return repository.amountGroupedBySeller();
    }
    @Transactional(readOnly = true)
    public List<SaleSuccessDTO> successGroupedBySeller(){
        return repository.successGroupedBySeller();
    }
}
