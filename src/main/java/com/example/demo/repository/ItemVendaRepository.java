/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.repository;

import com.example.demo.model.ItemVenda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

/**
 *
 * @author Erlaine Martins
 */
public interface ItemVendaRepository extends JpaRepository<ItemVenda, Long>{
     public ItemVenda findByVenda (@Param("venda")String venda);
}
