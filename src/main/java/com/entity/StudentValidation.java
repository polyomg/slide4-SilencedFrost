package com.entity;

import jakarta.validation.constraints.*;
import lombok.*;
import lombok.Builder.*;
import org.hibernate.validator.constraints.Range;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class StudentValidation {
    @NotBlank(message = "Chưa nhập email")
    @Email(message = "Không đúng định dạng email")
    private String id;
    @NotBlank(message = "Chưa nhập họ tên")
    private String fullname;
    @NotNull(message = "Chưa chọn giới tính")
    private Boolean gender;
    @NotNull(message = "Chưa nhập ngày sinh")
    @Default
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday = new Date();
    @NotNull(message = "Chưa nhập hình ảnh")
    @Default
    String photo = "photo.png";
    @NotNull(message = "Chưa nhập điểm")
    @Range(min = 0, max = 10, message = "Điểm phải từ 0 đến 10")
    private Double mark;
}
