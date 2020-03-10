
package com.hemosol.donantes.repositorios;

import com.hemosol.donantes.entidades.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepositorio extends JpaRepository<Admin,String> {
    
    
}
