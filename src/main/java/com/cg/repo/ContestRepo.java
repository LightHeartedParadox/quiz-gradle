package com.cg.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.entities.Contest;

@Repository
public interface ContestRepo extends JpaRepository<Contest, Integer>{

}
