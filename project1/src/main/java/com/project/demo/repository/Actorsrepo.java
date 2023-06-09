package com.project.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project.demo.model.ActorsTable;
@Repository

public interface Actorsrepo extends JpaRepository<ActorsTable, Integer> {

}
