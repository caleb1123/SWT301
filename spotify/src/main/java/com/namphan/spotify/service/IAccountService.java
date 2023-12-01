package com.namphan.spotify.service;

import com.namphan.spotify.dto.AccountsDTO;
import com.namphan.spotify.entity.Account;

public interface IAccountService {
    AccountsDTO Login(String userName, String password);
}
