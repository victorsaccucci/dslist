package com.victorsaccucci.dslist.repositories;

import com.victorsaccucci.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game, Long> {
}
