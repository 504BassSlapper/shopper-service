package net.mbo.shopperservice.mapper;

import net.mbo.shopperservice.dto.ShopperRequest;
import net.mbo.shopperservice.entities.Shopper;
import org.springframework.stereotype.Component;

@Component
public class ShopperMapper {
    public Shopper mapShopperDtoToShopper(ShopperRequest shopperRequest) {
        Shopper shopper = new Shopper();
        shopper.setName(shopperRequest.name());
        shopper.setEmail(shopperRequest.email());
        return shopper;
    }

}
