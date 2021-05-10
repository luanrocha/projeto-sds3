package com.luanrocha.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luanrocha.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
