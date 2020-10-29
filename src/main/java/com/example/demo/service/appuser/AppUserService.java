package com.example.demo.service.appuser;

import com.example.demo.model.AppUser;

public interface AppUserService {

    AppUser findByUsername(String username);
}
