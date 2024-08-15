package com.sparta.firstbootbook.entity;

import com.sparta.firstbootbook.dto.DailyRequestDto;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class Daily {
    private String work;
    private String username;
    private String password;
    private String date;

    public Daily(DailyRequestDto requestDto) {
        this.username = requestDto.getUsername();
        this.password = requestDto.getPassword();
    }
}
