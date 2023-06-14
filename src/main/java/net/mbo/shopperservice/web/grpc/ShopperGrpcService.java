package net.mbo.shopperservice.web.grpc;

import io.grpc.stub.StreamObserver;
import net.devh.boot.grpc.server.service.GrpcService;
import net.mbo.shopperservice.entities.Shopper;
import net.mbo.shopperservice.mapper.ShopperMapper;
import net.mbo.shopperservice.repositories.ShopperRepository;
import net.mbo.shopperservice.stub.ShopperServiceGrpc;
import net.mbo.shopperservice.stub.ShopperServiceOuterClass;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@GrpcService
public class ShopperGrpcService extends ShopperServiceGrpc.ShopperServiceImplBase {
    @Autowired
    private ShopperRepository shopperRepository;
    private ShopperMapper shopperMapper;

    @Override
    public void getShopperRequest(ShopperServiceOuterClass.GetAllShopperRequest request, StreamObserver<ShopperServiceOuterClass.GetShopperResponse> responseObserver) {
        List<Shopper> shopperList = shopperRepository.findAll();
        List<ShopperServiceOuterClass.Shopper> shoppers = shopperList.stream().map(shopperMapper::mapGrpcShopperFromEntity)
                .collect(Collectors.toList());


        ShopperServiceOuterClass.GetShopperResponse shopperResponse = ShopperServiceOuterClass.GetShopperResponse
                .newBuilder().addAllShoppers(shoppers).build();
        responseObserver.onNext(shopperResponse);
        responseObserver.onCompleted();
    }

    @Override
    public void getShopperById(ShopperServiceOuterClass.GetShopperByIdRequest request, StreamObserver<ShopperServiceOuterClass.GetShopperByIdResponse> responseObserver) {
        Shopper shopper = shopperRepository.findById(Long.valueOf(request.getCustomerId())).get();
        ShopperServiceOuterClass.GetShopperByIdResponse grpcShopper = ShopperServiceOuterClass.GetShopperByIdResponse.newBuilder()
                .setShopper(shopperMapper.mapGrpcShopperFromEntity(shopper)).build();
        responseObserver.onNext(grpcShopper);
        responseObserver.onCompleted();

    }

    @Override
    public void saveShopper(ShopperServiceOuterClass.SaveShopperRequest request, StreamObserver<ShopperServiceOuterClass.SaveShopperResponse> responseObserver) {
        Shopper shopper = shopperMapper.mapGrpcShopperRequest(request.getShopperRequest());
        Shopper shopperResponse = shopperRepository.save(shopper);
        ShopperServiceOuterClass.SaveShopperResponse saveShopperResponse = ShopperServiceOuterClass.SaveShopperResponse
                .newBuilder().setShopper(shopperMapper.mapGrpcShopperFromEntity(shopperResponse)).build();
        responseObserver.onNext(saveShopperResponse);
        responseObserver.onCompleted();
    }
}
