package com.example.user_service.database.repositories;

import com.example.user_service.database.entities.AchievementEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AchievementRepository extends JpaRepository<AchievementEntity,Integer> {
}
