package tech.raj.college.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import tech.raj.college.model.College;

public interface CollegeRepository extends JpaRepository<College, String> {
	Optional<College> findById(String id);
}
