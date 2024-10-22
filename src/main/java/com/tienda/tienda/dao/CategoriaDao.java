
package com.tienda.tienda.dao;

import com.tienda.tienda.domain.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Priscilla Rodríguez
 */
public interface CategoriaDao extends JpaRepository<Categoria, Long> {
    
    
}
