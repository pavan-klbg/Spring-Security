package com.telusko.basicSpringSecurity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private Integer rollNo;
    private String name;
    private Integer marks;
}
