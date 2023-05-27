package net.mbo.shopperservice;

import net.mbo.shopperservice.entities.Shopper;
import net.mbo.shopperservice.repositories.ShopperRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ShopperServiceApplication {
    @Autowired
    private ShopperRepository shopperRepository;

    public static void main(String[] args) {
        SpringApplication.run(ShopperServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(ShopperRepository shopperRepository) {
        return args -> {
            shopperRepository.save(Shopper.builder().name("BIG SMOKE").email("bigsmoke@mail.org").build());
            shopperRepository.save(   Shopper.builder().name("EAZY E").email("eazye@mail.org").build());
            shopperRepository.save(Shopper.builder().name("Cesar Johnson").email("cj@mail.org").build());
        };
    }
}
