package com.krishna.app.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.krishna.app.model.Shoe;

@Repository
public interface ShoeRepository extends JpaRepository<Shoe, Integer>{
	
}
