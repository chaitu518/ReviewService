package com.example.reviewservice.repos;

import com.example.reviewservice.models.Review;
import com.example.reviewservice.service.ReviewService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewServiceRepository extends JpaRepository<Review, Long> {
    List<Review> findAllByBookId(Long id);
}
