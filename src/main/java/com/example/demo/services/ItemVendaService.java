package com.example.demo.services;

import com.example.demo.model.ItemVenda;
import com.example.demo.repository.ItemVendaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ItemVendaService {
    @Autowired
    ItemVendaRepository itemVendaRepository;

    public void cadastrarItemVenda(ItemVenda itemv) {
        itemVendaRepository.save(itemv);
    }

    public void editarItemVenda(ItemVenda itemv) {
        itemVendaRepository.save(itemv);
    }

   public void excluirItemVenda(Long id) {
        itemVendaRepository.deleteById(id);
    }

   public ItemVenda buscaItemVenda(Long id) {
        return itemVendaRepository.findById(id).get();
    }
}
