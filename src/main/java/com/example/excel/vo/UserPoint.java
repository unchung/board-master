package com.example.excel.vo;

import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class UserPoint {

    private Long id;

    private String userCode;   //유저 코드

    private String userName;   //유저명

    private Integer payCnt;    //결제건수

    private Long paySum;     //결제금액

}