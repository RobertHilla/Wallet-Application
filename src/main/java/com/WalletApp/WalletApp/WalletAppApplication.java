package com.WalletApp.WalletApp;

import com.WalletApp.WalletApp.Entity.Currency;
import com.WalletApp.WalletApp.Entity.CurrencyRepo;
import com.WalletApp.WalletApp.Entity.User;
import com.WalletApp.WalletApp.Entity.UserRepo;
import net.bytebuddy.asm.Advice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.math.BigDecimal;

@SpringBootApplication
public class WalletAppApplication {

	@Autowired
	private CurrencyRepo currencyRepo;

	@Autowired
	private UserRepo userRepo;


	public static void main(String[] args) {
		SpringApplication.run(WalletAppApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(){
		return args -> {
//            Save demo data after start
			userRepo.save(new User("admin", "$2a$04$KNLUwOWHVQZVpXyMBNc7JOzbLiBjb9Tk9bP7KNcPI12ICuvzXQQKG"));
			currencyRepo.save(new Currency("US Dolar", "USD", new BigDecimal(100), new BigDecimal(3.92)));
			currencyRepo.save(new Currency("Euro", "EUR", new BigDecimal(300), new BigDecimal(4.52)));
		};
	}

}
