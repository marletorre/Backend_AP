
package com.portfolio.marle.repository;

import com.portfolio.marle.model.Skills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SkillsRepository extends JpaRepository<Skills,Integer>{
    
}
