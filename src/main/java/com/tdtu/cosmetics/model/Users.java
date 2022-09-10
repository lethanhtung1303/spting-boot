package com.tdtu.cosmetics.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Builder
@Data
@AllArgsConstructor
public class Users {
    private BigDecimal id;
    private String name;
    private String email;
    private LocalDateTime email_verified_at;
    private String password;
    private String image;
    private Boolean is_active;
    private String remember_token;
    private LocalDateTime created_at;
    private LocalDateTime updated_at;
}
