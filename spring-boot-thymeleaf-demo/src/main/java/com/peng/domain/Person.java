package com.peng.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 嘉宾
 */

@Data
@AllArgsConstructor
public class Person {
    private String name;
    private String role;
}
