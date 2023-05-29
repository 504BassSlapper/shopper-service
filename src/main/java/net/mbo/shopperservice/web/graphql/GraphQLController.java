package net.mbo.shopperservice.web.graphql;


import net.mbo.shopperservice.dto.ShopperRequest;
import net.mbo.shopperservice.entities.Shopper;
import net.mbo.shopperservice.mapper.ShopperMapper;
import net.mbo.shopperservice.repositories.ShopperRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class GraphQLController {
    private static final Logger LOG = LoggerFactory.getLogger(GraphQLController.class);
    ShopperRepository shopperRepository;
    private ShopperMapper shopperMapper;

    GraphQLController(ShopperRepository shopperRepository, ShopperMapper shopperMapper) {
        this.shopperRepository = shopperRepository;
        this.shopperMapper = shopperMapper;
    }

    /**
     * returns all shoppers
     *
     * @return List<Shopper>
     */
    @QueryMapping
    public List<Shopper> allShoppers() {
        return shopperRepository.findAll();

    }

    /**
     * retunrs shopper by id
     *
     * @param id Long id of shopper
     * @return Shopper
     */
    @QueryMapping
    public Shopper shopperById(@Argument Long id) {
        Shopper shopper = shopperRepository.findById(id).orElse(null);
        if (shopper == null) {
            LOG.error("Shopper {} not found in database!", id);
            throw new RuntimeException("Shopper not found in database");
        }
        return shopper;
    }

    @MutationMapping
    public Shopper createShopper(@Argument(name = "shopper") ShopperRequest shopperRequest) {
        Shopper shopper = shopperMapper.mapShopperDtoToShopper(shopperRequest);
        return shopperRepository.save(shopper);
    }
}
