package com.namphan.spotify.converter;

import com.namphan.spotify.dto.AccountsDTO;
import com.namphan.spotify.entity.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AccountConverter {
    public Account toEntity(AccountsDTO dto){
        Account entity = new Account();

        entity.setAccountId(dto.getAccountId());
        entity.setDob(dto.getDob());
        entity.setPhone(dto.getPhone());
        entity.setEmail(dto.getEmail());
        entity.setPassword(dto.getPassword());
        entity.setFullname(dto.getFullname());
        entity.setUserName(dto.getUserName());
        return entity;
    }

    public AccountsDTO toDto(Account entity){
        AccountsDTO dto = new AccountsDTO();
        dto.setAccountId(entity.getAccountId());
        dto.setDob(entity.getDob());
        dto.setPhone(entity.getPhone());
        dto.setPassword(entity.getPassword());
        dto.setFullname(entity.getFullname());
        dto.setEmail(entity.getEmail());
        dto.setUserName(entity.getUserName());
        return dto;
    }

}
