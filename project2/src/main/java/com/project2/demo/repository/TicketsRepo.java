package com.project2.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.project2.demo.model.Tickets;


@Repository
public interface TicketsRepo extends JpaRepository<Tickets, Integer> {

}
