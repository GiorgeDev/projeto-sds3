package com.projeto.dsvendas.repositories;

import com.projeto.dsvendas.entities.Sale;
import com.projeto.dsvendas.entities.Seller;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SaleRepository extends JpaRepository<Sale, Long> {
}
