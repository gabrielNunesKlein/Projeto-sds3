package com.klein.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klein.dsvendas.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
