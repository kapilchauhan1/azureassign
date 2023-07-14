package com.repo;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;



import com.entity.Serviceability;

public  interface ServiceabilityRepository extends JpaRepository<Serviceability, Integer>{

	
    List<Serviceability> findByPidAndPincodes(int id ,int code);
}