package com.example.reviewservice.service;

import com.example.reviewservice.models.Review;
import com.example.reviewservice.repos.ReviewServiceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ReviewServiceImp")
public class ReviewServiceImp implements ReviewService {
    private ReviewServiceRepository serviceRepository;
    public ReviewServiceImp(ReviewServiceRepository serviceRepository) {
        this.serviceRepository = serviceRepository;
    }
    @Override
    public List<Review> getReviewByBookId(Long id) {
        return serviceRepository.findAllByBookId(id);
    }

    @Override
    public Review AddBookReview(Long bookId, String reviewer, double rating, String comment) {
        return serviceRepository.save(new Review(bookId,reviewer,rating,comment));
    }

    @Override
    public void DeleteReview(Long id) {

    }
}
