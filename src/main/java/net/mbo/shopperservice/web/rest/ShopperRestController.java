package net.mbo.shopperservice.web.rest;

import net.mbo.shopperservice.entities.Shopper;
import net.mbo.shopperservice.repositories.ShopperRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ShopperRestController {
    private ShopperRepository shopperRepository;
     ShopperRestController(ShopperRepository shopperRepository){
         this.shopperRepository = shopperRepository;
     }
     @GetMapping("/shoppers")
     public List<Shopper>  shoppersList(){
         return shopperRepository.findAll();
     }

     @GetMapping("/shoppers/{id}")
     public Shopper  shoppersList(@PathVariable Long id){
         return shopperRepository.findById(id).get();
     }

     @PostMapping("/shoppers")
     public Shopper saveShopper(@RequestBody Shopper shopper){
         return shopperRepository.save(shopper);
     }



}
