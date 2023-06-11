package com.norgini.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.norgini.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
