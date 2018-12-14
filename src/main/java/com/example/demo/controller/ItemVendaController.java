package com.example.demo.controller;

import com.example.demo.model.ItemVenda;
import com.example.demo.services.ItemVendaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/itemvenda")
public class ItemVendaController {
    @Autowired
    ItemVendaService ItemVendaService;
    
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    ResponseEntity cadastrarItemVenda(@RequestBody ItemVenda itemv) {
        
        ItemVendaService.cadastrarItemVenda(itemv);
        
        return new ResponseEntity(HttpStatus.CREATED);
        
    }
    
    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    void removerItemVenda(@PathVariable Long id) {
        ItemVendaService.excluirItemVenda(id);
    }
    
    @RequestMapping(method = RequestMethod.PUT)
    void editarItemVenda(ItemVenda itemv) {
        ItemVendaService.editarItemVenda(itemv);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    void mostraItemVenda(Long id) {
         ItemVendaService.buscaItemVenda(id);
    }
}
