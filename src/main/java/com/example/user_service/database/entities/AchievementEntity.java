package com.example.user_service.database.entities;

import jakarta.persistence.*;

import java.util.Map;

@Entity
public class AchievementEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Integer id;

    String name;
    String description;
    String image;

    String type;
    Map<String,Object> condition;

    Integer status;
}
