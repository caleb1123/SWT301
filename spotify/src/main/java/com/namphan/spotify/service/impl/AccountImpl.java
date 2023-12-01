package com.namphan.spotify.service.impl;

import com.namphan.spotify.converter.AccountConverter;
import com.namphan.spotify.dto.AccountsDTO;
import com.namphan.spotify.entity.Account;
import com.namphan.spotify.repository.AccountRepository;
import com.namphan.spotify.service.IAccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountImpl implements IAccountService {

    private final AccountRepository accountRepository;
    private final AccountConverter accountConverter;
    @Autowired
    public AccountImpl(AccountRepository accountRepository, AccountConverter accountConverter) {
        this.accountRepository = accountRepository;
        this.accountConverter = accountConverter;
    }

    @Override
    public AccountsDTO Login(String userName, String password) {

        Account account = accountRepository.findAccountByUserNameAndPassword(userName, password);
        if (account != null) {
            // Nếu tìm thấy tài khoản, thực hiện các hành động cần thiết và trả về thông tin tài khoản

            // Thiết lập thông tin cho accountsDTO từ account
            return accountConverter.toDto(account);
        } else {
            // Nếu không tìm thấy tài khoản, xử lý logic hoặc trả về null
            return null;
        }
    }
}
