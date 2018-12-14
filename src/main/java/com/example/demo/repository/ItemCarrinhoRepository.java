/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.repository;

import com.example.demo.model.ItemCarrinho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;


public interface ItemCarrinhoRepository extends JpaRepository<ItemCarrinho, Long> {

    public ItemCarrinho findByProduto (@Param("produto")String produto);
    
}
