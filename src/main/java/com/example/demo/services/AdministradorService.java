/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo.services;

import com.example.demo.model.Administrador;
import com.example.demo.repository.AdministradorRepository;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Erlaine Martins
 */
public class AdministradorService {
    @Autowired
    AdministradorRepository administradorRepository;

    public void cadastrarAdministrador(Administrador adm) {
        administradorRepository.save(adm);
    }

    public void editarAdministrador(Administrador adm) {
        administradorRepository.save(adm);
    }

   public void excluirAdministrador(Long id) {
        administradorRepository.deleteById(id);
    }

   public Administrador buscaAdministrador(Long id) {
        return administradorRepository.findById(id).get();
    }
}
