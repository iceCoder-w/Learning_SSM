package com.wang.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author 王冰炜
 * @create 2021-05-21 15:53
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    String username;
    String password;
}
