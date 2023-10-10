package com.tienda_v1.controller;

import com.tienda_v1.service.CategoriaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Andres Ortega
 */

@Controller
@Slf4j
@RequestMapping("/categoria")
public class CategoriaController {
    
    @Autowired
    private CategoriaService categoriaService;
    
    @GetMapping("/listado")
    public String inicio(Model model) {
        var categoria = categoriaService.getCategoria(false);
        model.addAttribute("categorias", categoria);
        model.addAttribute("totalCategorias", categoria.size());
        return "/categoria/listado";
    }
}
