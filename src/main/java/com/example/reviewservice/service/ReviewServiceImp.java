package com.example.reviewservice.service;

import com.example.reviewservice.client.BookClient;
import com.example.reviewservice.models.Review;
import com.example.reviewservice.repos.ReviewServiceRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ReviewServiceImp")
public class ReviewServiceImp implements ReviewService {
    private BookClient bookClient;
    private ReviewServiceRepository serviceRepository;
    public ReviewServiceImp(ReviewServiceRepository serviceRepository, BookClient bookClient) {
        this.serviceRepository = serviceRepository;
        this.bookClient = bookClient;
    }
    @Override
    public List<Review> getReviewByBookId(Long id) {
        return serviceRepository.findAllByBookId(id);
    }

    @Override
    public Review AddBookReview(Long bookId, String reviewer, double rating, String comment) {
        if(bookClient.checkBook(bookId)) {
            return serviceRepository.save(new Review(bookId, reviewer, rating, comment));
        }
        else {
            throw new RuntimeException("Book does not exist");
        }
    }

    @Override
    public void DeleteReview(Long id) {
        Review review = serviceRepository.findById(id).orElse(null);
        if (review != null) {
            serviceRepository.delete(review);
        }
    }
}
