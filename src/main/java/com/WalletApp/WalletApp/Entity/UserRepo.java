package com.WalletApp.WalletApp.Entity;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


public interface UserRepo extends CrudRepository<User, Long> {
    Optional<User> findByUserName(String userName);
}
