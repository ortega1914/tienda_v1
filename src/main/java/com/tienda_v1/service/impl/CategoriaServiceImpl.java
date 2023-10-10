/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.tienda_v1.service.impl;

import com.tienda_v1.dao.CategoriaDao;
import org.springframework.stereotype.Service;
import com.tienda_v1.domain.Categoria;
import com.tienda_v1.service.CategoriaService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Andres Ortega
 */
@Service
public class CategoriaServiceImpl implements CategoriaService {
    
    
    @Autowired
    private CategoriaDao categoriaDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Categoria> getCategoria(boolean activos){
        var lista = categoriaDao.findAll();
        if(activos) {
            lista.removeIf(e -> !e.isActivo());
        }
        
        return lista;
    }
}
