/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.services;

import com.example.demo.model.ItemCarrinho;
import com.example.demo.repository.ItemCarrinhoRepository;
import org.springframework.beans.factory.annotation.Autowired;


public class ItemCarrinhoService {
    @Autowired
    ItemCarrinhoRepository itemCarrinhoRepository;

    public void cadastrarItemCarrinho(ItemCarrinho itemc) {
        itemCarrinhoRepository.save(itemc);
    }

    public void editarItemCarrinho(ItemCarrinho itemc) {
        itemCarrinhoRepository.save(itemc);
    }

   public void excluirItemCarrinho(Long id) {
        itemCarrinhoRepository.deleteById(id);
    }

   public ItemCarrinho buscaItemCarrinho(Long id) {
        return itemCarrinhoRepository.findById(id).get();
    }
}
