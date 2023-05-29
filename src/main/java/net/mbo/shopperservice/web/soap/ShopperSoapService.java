package net.mbo.shopperservice.web.soap;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import net.mbo.shopperservice.dto.ShopperRequest;
import net.mbo.shopperservice.dto.ShopperRequestClass;
import net.mbo.shopperservice.entities.Shopper;
import net.mbo.shopperservice.mapper.ShopperMapper;
import net.mbo.shopperservice.repositories.ShopperRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@WebService(serviceName = "shopperWS")
public class ShopperSoapService {
    private ShopperRepository shopperRepository;
    private ShopperMapper shopperMapper;

    public ShopperSoapService(ShopperRepository shopperRepository, ShopperMapper shopperMapper) {
        this.shopperRepository = shopperRepository;
        this.shopperMapper = shopperMapper;
    }

    @WebMethod(operationName = "allShoppers")
    public List<Shopper> shopperList() {
        return shopperRepository.findAll();
    }

    @WebMethod(operationName = "shopperById")
    public Shopper shopperById(@WebParam(partName = "id") Long id) {
        return shopperRepository.findById(id).orElse(null);
    }

    @WebMethod(operationName = "saveShopper")
    public Shopper saveShopper(@WebParam(name = "shopper") ShopperRequestClass shopperRequestClass) {
        Shopper shopper = shopperMapper.mapShopperClassDtoToShopper(shopperRequestClass);
        return shopperRepository.save(shopper);
    }

}
