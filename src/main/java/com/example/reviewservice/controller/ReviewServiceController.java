package com.example.reviewservice.controller;

import com.example.reviewservice.dto.ReviewRequestDto;
import com.example.reviewservice.models.Review;
import com.example.reviewservice.service.ReviewService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reviews")
public class ReviewServiceController {
    private ReviewService reviewService;
    public ReviewServiceController(@Qualifier("ReviewServiceImp") ReviewService reviewService) {
        this.reviewService = reviewService;
    }
    @GetMapping("/{id}")
    public List<Review> getReviewByBookId(@PathVariable("id") Long id) {
        return reviewService.getReviewByBookId(id);
    }
    @PostMapping("")
    public Review AddBookReview(@RequestBody ReviewRequestDto review) {
        return reviewService.AddBookReview(review.getBookId(),review.getReviewer(),review.getRating(),review.getComment());
    }
    @DeleteMapping("/{id}")
    public void DeleteReview(@PathVariable("id") Long id) {

    }
}
