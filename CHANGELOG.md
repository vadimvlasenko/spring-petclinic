# Changelog

## [Unreleased]

### Added
- `Badge` entity class in `src/main/java/com/example/project/entity/Badge.java`.
- Repository interface `BadgeRepository` in `src/main/java/com/example/project/repository/BadgeRepository.java`.
- Service class `BadgeService` in `src/main/java/com/example/project/service/BadgeService.java`.
- REST controller `BadgeController` in `src/main/java/com/example/project/controller/BadgeController.java`.
- H2 Database configuration in `src/main/resources/application.properties`.
- Data initialization script `data.sql` in `src/main/resources/data.sql`.
- Dependencies for Spring Boot Web, JPA, H2, JAXB API, and org.javassist in `pom.xml`.

### Updated
- `pom.xml` with dependencies for jaxb-api and org.javassist with version '3.23.1-GA'.
- `application.properties` with H2 database configuration.