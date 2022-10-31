
package com.portfolio.marle.repository;

import com.portfolio.marle.model.Educacion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EducacionRepository extends JpaRepository<Educacion,Integer>{
    
}
