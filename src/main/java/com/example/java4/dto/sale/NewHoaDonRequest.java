package com.example.java4.dto.sale;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import org.hibernate.validator.constraints.NotBlank;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class NewHoaDonRequest {
    @NotBlank(message = "Do not empty id")
    private String id;
    @NotBlank(message = "Do not empty ma")
    private String ma;
    @NotBlank(message = "Do not empty ten")
    private String ten;
    @NotBlank(message = "Do not empty trang thai")
    private String trangThai;
}