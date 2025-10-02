package com.entity;

import lombok.*;
import lombok.Builder.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class Student {
    private String id;
    private String fullname;
    private Boolean gender;
    @Default
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday = new Date();
    @Default
    String photo = "photo.png";
    private Double mark;
}
