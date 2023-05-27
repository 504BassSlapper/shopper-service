package net.mbo.shopperservice.repositories;

import net.mbo.shopperservice.entities.Shopper;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ShopperRepository extends JpaRepository<Shopper, Long> {
}
