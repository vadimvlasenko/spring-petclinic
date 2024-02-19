```java
package com.example.project;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Repository interface for Badge entity.
 */
@Repository
public interface BadgeRepository extends JpaRepository<Badge, Long> {
}
```
