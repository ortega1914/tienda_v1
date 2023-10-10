
package com.tienda_v1.service;

import java.util.List;
import com.tienda_v1.domain.Categoria;

/**
 *
 * @author Andres Ortega
 */
public interface CategoriaService {
    
    public List<Categoria> getCategoria(boolean activos);
}
