package com.mydieu.tindin.repositories;

import com.mydieu.tindin.models.JobLocation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JobLocationRepository extends JpaRepository<JobLocation, Integer> {
}