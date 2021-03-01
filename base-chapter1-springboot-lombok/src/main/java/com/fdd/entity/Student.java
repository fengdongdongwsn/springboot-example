package com.fdd.entity;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
@Builder
public class Student {

    @NonNull
    private int age;

    private String name;
}
