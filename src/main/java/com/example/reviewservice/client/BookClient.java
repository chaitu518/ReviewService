package com.example.reviewservice.client;

import com.example.reviewservice.models.Book;
import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BookClient {
    private RestTemplate restTemplate;
    public BookClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }
    @CircuitBreaker(name = "bookserviceBreaker", fallbackMethod = "bookserviceFallback")
    public boolean checkBook(Long id) {
        ResponseEntity<Book> response = restTemplate.getForEntity("http://localhost:8080/v1/books/" + id, Book.class);
        return response.getStatusCode()== HttpStatus.OK && response.getBody()!=null;
    }


    public boolean bookserviceFallback(Long id, Throwable throwable) {
        System.out.println("came to fall back");
        return false;
    }
}
