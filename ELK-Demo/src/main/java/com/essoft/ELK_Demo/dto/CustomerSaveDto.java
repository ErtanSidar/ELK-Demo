package com.essoft.ELK_Demo.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
public class CustomerSaveDto {
    private String firstName;
    private String lastName;
    private Integer age;
}
