package net.mbo.shopperservice.mapper;

import net.mbo.shopperservice.dto.ShopperRequest;
import net.mbo.shopperservice.dto.ShopperRequestClass;
import net.mbo.shopperservice.entities.Shopper;
import net.mbo.shopperservice.stub.ShopperServiceOuterClass;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ShopperMapper {
    ModelMapper modelMapper = new ModelMapper();

    public Shopper mapShopperDtoToShopper(ShopperRequest shopperRequest) {
        Shopper shopper = new Shopper();
        //        using shopperRequest record
        shopper.setName(shopperRequest.name());
        shopper.setEmail(shopperRequest.email());
        // needs ShopperRequest class not record ( no getter and setter in the record)
        // shopper = modelMapper.map(shopperRequest,Shopper.class);
        return shopper;
    }

    public Shopper mapShopperClassDtoToShopper(ShopperRequestClass shopperRequest) {
        return modelMapper.map(shopperRequest, Shopper.class);
    }

    public ShopperServiceOuterClass.Shopper mapGrpcShopperFromEntity(Shopper shopper) {
        return modelMapper.map(shopper, ShopperServiceOuterClass.Shopper.class);
    }

    public Shopper mapGrpcShopperRequest(ShopperServiceOuterClass.ShopperRequest shopperRequest){
        return modelMapper.map(shopperRequest, Shopper.class);
    }

}
