package com.example.user_service.application.controllers;

import com.example.user_service.domain.dtos.achievement.AchievementDTO;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v1/achievement")
public class AchievementController {
    @GetMapping("/{achievementId}")
    public ResponseEntity<Object> get(
            @PathVariable("userId") String id
    ){
        return null;
    }

    @PostMapping("")
    public ResponseEntity<Object> create(
            @RequestBody AchievementDTO achievement
    ){
        return null;
    }

    @PutMapping("/{id}")
    public ResponseEntity<Object> update(
            @RequestBody AchievementDTO achievement
    ){
        return null;
    }

}
