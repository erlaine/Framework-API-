/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.controller;

import com.example.demo.model.ItemCarrinho;
import com.example.demo.services.ItemCarrinhoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


public class ItemCarrinhoController {
     @Autowired
    ItemCarrinhoService ItemCarrinhoService;
    
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity cadastrarItemCarrinho(@RequestBody ItemCarrinho itemc) {
        
        ItemCarrinhoService.cadastrarItemCarrinho(itemc);
        
        return new ResponseEntity(HttpStatus.CREATED);
        
    }
    
    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    void removerItemCarrinho(@PathVariable Long id) {
        ItemCarrinhoService.excluirItemCarrinho(id);
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    void editarItemCarrinho(ItemCarrinho itemc) {
        ItemCarrinhoService.editarItemCarrinho(itemc);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    void mostraItemCarrinho(Long id) {
         ItemCarrinhoService.buscaItemCarrinho(id);
    }
}
