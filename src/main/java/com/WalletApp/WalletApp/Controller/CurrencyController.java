package com.WalletApp.WalletApp.Controller;

import com.WalletApp.WalletApp.Entity.Currency;
import com.WalletApp.WalletApp.Entity.CurrencyRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/api")
public class CurrencyController {

    public CurrencyRepo currencyRepo;

    public CurrencyController(CurrencyRepo currencyRepo){
        super();
        this.currencyRepo = currencyRepo;
    }

    @GetMapping("/currencies")
    Iterable<Currency> getCurrencies(){
        return currencyRepo.findAll();
    }

    @PutMapping("/currencies")
    void updateCurrency(@RequestParam Currency currency){
        currencyRepo.save(currency);
    }

    @PostMapping("/currencies")
    void addCurrency(@RequestParam Currency currency){
        currencyRepo.save(currency);
    }

    @DeleteMapping("/currencies")
    void deleteCurrency(@RequestParam Long Id){
        currencyRepo.deleteById(Id);
    }



}
