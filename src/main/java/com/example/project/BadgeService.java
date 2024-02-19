```java
package com.example.project;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Service class for Badge entity.
 */
@Service
public class BadgeService {

    private final BadgeRepository badgeRepository;

    @Autowired
    public BadgeService(BadgeRepository badgeRepository) {
        this.badgeRepository = badgeRepository;
    }

    /**
     * Fetch all badges from the database.
     *
     * @return a list of all badges
     */
    public List<Badge> getAllBadges() {
        return badgeRepository.findAll();
    }
}
```
