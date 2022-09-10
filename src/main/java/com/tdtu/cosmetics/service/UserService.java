package com.tdtu.cosmetics.service;

import com.tdtu.cosmetics.model.Users;
import com.tdtu.cosmetics.repository.UserRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.math.BigDecimal;

@Service
@Transactional
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public Users getById(@NotNull String id) {
        return userRepository.getById(BigDecimal.valueOf(Long.parseLong(id)));
    }
}
