package com.sparta.firstbootbook.controller;

import com.sparta.firstbootbook.dto.DailyRequestDto;
import com.sparta.firstbootbook.dto.DailyResponseDto;
import com.sparta.firstbootbook.entity.Daily;

import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;


@RestController
@RequestMapping("/api")
public class DailyController{

    private final Map<String, Daily> dailyList = new HashMap<>();

    @PostMapping("/daily")
    public DailyResponseDto creatdaily(@RequestBody DailyRequestDto requestDto){
        Daily daily = new Daily(requestDto);

        String maxwork = dailyList.size() > 0 ? Collections.max(dailyList.keySet()) + 1 : 1;
        daily.setwork(maxwork);

        dailyList.put(daliy.getwork(), daily);

        DailyResponseDto dailyResponseDto = new DailyResponseDto(work);

        return dailyResponseDto;
    }
}
