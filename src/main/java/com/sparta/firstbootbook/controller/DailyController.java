package com.sparta.firstbootbook.controller;

import com.sparta.firstbootbook.dto.DailyRequestDto;
import com.sparta.firstbootbook.dto.DailyResponseDto;
import com.sparta.firstbootbook.entity.Daily;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api")
public class DailyController{

    @PostMapping("/daily")
    public DailyResponseDto creatdaily(@RequestBody DailyRequestDto requestDto){
        Daily daily = new Daily(requestDto);

        String maxwork =

    }
}
