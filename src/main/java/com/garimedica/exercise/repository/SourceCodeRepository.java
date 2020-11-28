package com.garimedica.exercise.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.garimedica.exercise.data.SourceCode;

@Repository
public interface SourceCodeRepository extends JpaRepository<SourceCode, String> {
}