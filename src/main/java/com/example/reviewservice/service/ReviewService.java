package com.example.reviewservice.service;

import com.example.reviewservice.models.Review;

import java.util.List;

public interface ReviewService {
    public List<Review> getReviewByBookId(Long id);
    public Review AddBookReview(Long bookId,String reviewer,double rating,String comment);
    public void DeleteReview(Long id);
}
//"bookId": 1,
//        "reviewer": "John Doe",
//        "rating": 4.5,
//        "comment": "A timeless classic!"
