package com.blackcode.springbootv3simpleapidbh2.review;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/companies/{companyId}")
public class ReviewController {

    private ReviewService reviewService;

    public ReviewController(ReviewService reviewService) {
        this.reviewService = reviewService;
    }

    @GetMapping("/reviews")
    public ResponseEntity<List<Review>> getAllReviews(@PathVariable Long companyId){
        return new ResponseEntity<>(reviewService.getAllReviews(companyId), HttpStatus.OK);
    }

    @PostMapping("/reviews")
    public ResponseEntity<String> addReview(@PathVariable Long companyId, @RequestBody Review review){
        boolean isReviewSave = reviewService.addReview(companyId, review);
        if(isReviewSave){
            return new ResponseEntity<>("Review Added Seccessfully", HttpStatus.OK);
        }else {
            return new ResponseEntity<>("Review Not Save", HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/reviews/{reviewId}")
    public ResponseEntity<Review> getReview(@PathVariable Long companyId, @PathVariable Long reviewId){
        return new ResponseEntity<>(reviewService.getReview(companyId, reviewId), HttpStatus.OK);
    }

    @PutMapping("/reviews/{reviewId}")
    public ResponseEntity<String> updateReview(@PathVariable Long companyId, @PathVariable Long reviewId, @RequestBody Review review){
        boolean isReviewUpdate = reviewService.updateReview(companyId, reviewId, review);
        if(isReviewUpdate){
            return new ResponseEntity<>("Review update successfully", HttpStatus.OK);
        }else{
            return new ResponseEntity<>("Review not update", HttpStatus.NOT_FOUND);
        }

    }

    @DeleteMapping("/reviews/{reviewId}")
    public ResponseEntity<String> deleteReview(@PathVariable Long companyId, @PathVariable Long reviewId){
        boolean isReviewDeleted = reviewService.deleteReview(companyId, reviewId);
        if(isReviewDeleted){
            return new ResponseEntity<>("Review update successfully", HttpStatus.OK);
        }else{
            return new ResponseEntity<>("Review not update", HttpStatus.NOT_FOUND);
        }
    }


}
