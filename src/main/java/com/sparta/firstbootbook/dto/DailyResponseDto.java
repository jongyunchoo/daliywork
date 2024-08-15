package com.sparta.firstbootbook.dto;

import com.sparta.firstbootbook.entity.Daily;
import lombok.Getter;

@Getter
public class DailyResponseDto {
    private String work;
    private String username;
    private String password;
    private String date;

    public DailyResponseDto(Daily daily) {
        this.work = daily.getWork();
        this.username = daily.getUsername();
        this.password = daily.getPassword();
    }
}
