package com.fdd.bean;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MybatisAnnotion {

    @NonNull
    private int id;

    private String name;

}
