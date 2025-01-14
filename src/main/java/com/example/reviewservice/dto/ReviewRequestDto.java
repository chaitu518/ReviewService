package com.example.reviewservice.dto;

public class ReviewRequestDto {
    private Long bookId;
    private String reviewer;
    private double rating;
    private String comment;

    public ReviewRequestDto() {
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

    public void setBookId(Long bookId) {
        this.bookId = bookId;
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
        if (!(o instanceof ReviewRequestDto)) return false;
        final ReviewRequestDto other = (ReviewRequestDto) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$bookId = this.getBookId();
        final Object other$bookId = other.getBookId();
        if (this$bookId == null ? other$bookId != null : !this$bookId.equals(other$bookId)) return false;
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
        return other instanceof ReviewRequestDto;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $bookId = this.getBookId();
        result = result * PRIME + ($bookId == null ? 43 : $bookId.hashCode());
        final Object $reviewer = this.getReviewer();
        result = result * PRIME + ($reviewer == null ? 43 : $reviewer.hashCode());
        final long $rating = Double.doubleToLongBits(this.getRating());
        result = result * PRIME + (int) ($rating >>> 32 ^ $rating);
        final Object $comment = this.getComment();
        result = result * PRIME + ($comment == null ? 43 : $comment.hashCode());
        return result;
    }

    public String toString() {
        return "ReviewRequestDto(bookId=" + this.getBookId() + ", reviewer=" + this.getReviewer() + ", rating=" + this.getRating() + ", comment=" + this.getComment() + ")";
    }
}
