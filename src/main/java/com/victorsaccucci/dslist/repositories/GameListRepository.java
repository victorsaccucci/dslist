package com.victorsaccucci.dslist.repositories;

import com.victorsaccucci.dslist.entities.Game;
import com.victorsaccucci.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {
}
