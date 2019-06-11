package com.example.eurekaClient.controller;

import com.example.pojo.Rating;
import com.example.pojo.UserRating;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ratingsData")
public class RatingController {

    @GetMapping ("/movies/{movieId}")
    public Rating getMovieRating(@PathVariable("moiveId") String movieId){
        return new Rating(movieId, 4);
    }

    @GetMapping("/user/{userId}")
    public UserRating getUserRatings(@PathVariable("userId") String userId){
        UserRating userRating = new UserRating();
        userRating.initData(userId);
        return userRating;
    }
}

