package com.example.project.controller;

import com.example.project.entity.Badge;
import com.example.project.service.BadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * REST controller for managing {@link Badge} entities.
 */
@RestController
@RequestMapping("/badges")
@CrossOrigin
public class BadgeController {

    private final BadgeService badgeService;

    @Autowired
    public BadgeController(BadgeService badgeService) {
        this.badgeService = badgeService;
    }

    /**
     * GET /badges : get all badges.
     *
     * @return the ResponseEntity with status 200 (OK) and the list of badges
     */
    @GetMapping
    public List<Badge> getAllBadges() {
        return badgeService.getAllBadges();
    }
}