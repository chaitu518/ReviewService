package com.example.reviewservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "reviews")
public class Review {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Long bookId;
    private String reviewer;
    private double rating;
    private String comment;

    public Review() {
    }

    public Review(Long bookId, String reviewer, double rating, String comment) {
        this.bookId = bookId;
        this.reviewer = reviewer;
        this.rating = rating;
        this.comment = comment;
    }

    public Long getId() {
        return this.id;
    }

    public Long getBookId() {
        return this.bookId;
    }

    public String getReviewer() {
        return this.reviewer;
    }

    public double getRating() {
        return this.rating;
    }

    public String getComment() {
        return this.comment;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setBookId(Long BookId) {
        this.bookId = BookId;
    }

    public void setReviewer(String reviewer) {
        this.reviewer = reviewer;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public boolean equals(final Object o) {
        if (o == this) return true;
        if (!(o instanceof Review)) return false;
        final Review other = (Review) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$id = this.getId();
        final Object other$id = other.getId();
        if (this$id == null ? other$id != null : !this$id.equals(other$id)) return false;
        final Object this$BookId = this.getBookId();
        final Object other$BookId = other.getBookId();
        if (this$BookId == null ? other$BookId != null : !this$BookId.equals(other$BookId)) return false;
        final Object this$reviewer = this.getReviewer();
        final Object other$reviewer = other.getReviewer();
        if (this$reviewer == null ? other$reviewer != null : !this$reviewer.equals(other$reviewer)) return false;
        if (Double.compare(this.getRating(), other.getRating()) != 0) return false;
        final Object this$comment = this.getComment();
        final Object other$comment = other.getComment();
        if (this$comment == null ? other$comment != null : !this$comment.equals(other$comment)) return false;
        return true;
    }

    protected boolean canEqual(final Object other) {
        return other instanceof Review;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $id = this.getId();
        result = result * PRIME + ($id == null ? 43 : $id.hashCode());
        final Object $BookId = this.getBookId();
        result = result * PRIME + ($BookId == null ? 43 : $BookId.hashCode());
        final Object $reviewer = this.getReviewer();
        result = result * PRIME + ($reviewer == null ? 43 : $reviewer.hashCode());
        final long $rating = Double.doubleToLongBits(this.getRating());
        result = result * PRIME + (int) ($rating >>> 32 ^ $rating);
        final Object $comment = this.getComment();
        result = result * PRIME + ($comment == null ? 43 : $comment.hashCode());
        return result;
    }

    public String toString() {
        return "Review(id=" + this.getId() + ", BookId=" + this.getBookId() + ", reviewer=" + this.getReviewer() + ", rating=" + this.getRating() + ", comment=" + this.getComment() + ")";
    }
}
//"bookId": 1,
//        "reviewer": "John Doe",
//        "rating": 4.5,
//        "comment": "A timeless classic!"