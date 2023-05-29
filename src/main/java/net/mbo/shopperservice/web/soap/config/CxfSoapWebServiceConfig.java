package net.mbo.shopperservice.web.soap.config;

import net.mbo.shopperservice.web.soap.ShopperSoapService;
import org.apache.cxf.Bus;

import org.apache.cxf.jaxws.EndpointImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CxfSoapWebServiceConfig {
    private Bus bus;
    private ShopperSoapService shopperSoapService;

    public CxfSoapWebServiceConfig(Bus bus, ShopperSoapService shopperSoapService) {
        this.bus = bus;
        this.shopperSoapService = shopperSoapService;
    }
    @Bean
    public EndpointImpl endpoint(){
        EndpointImpl endPoint = new EndpointImpl(bus, shopperSoapService);
        endPoint.publish("/ShopperService");
        return endPoint;
    }
}
