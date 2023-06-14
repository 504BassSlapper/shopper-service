package net.mbo.shopperservice.stub;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.15.0)",
    comments = "Source: ShopperService.proto")
public final class ShopperServiceGrpc {

  private ShopperServiceGrpc() {}

  public static final String SERVICE_NAME = "ShopperService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<net.mbo.shopperservice.stub.ShopperServiceOuterClass.GetAllShopperRequest,
      net.mbo.shopperservice.stub.ShopperServiceOuterClass.GetShopperResponse> getGetShopperRequestMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getShopperRequest",
      requestType = net.mbo.shopperservice.stub.ShopperServiceOuterClass.GetAllShopperRequest.class,
      responseType = net.mbo.shopperservice.stub.ShopperServiceOuterClass.GetShopperResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.mbo.shopperservice.stub.ShopperServiceOuterClass.GetAllShopperRequest,
      net.mbo.shopperservice.stub.ShopperServiceOuterClass.GetShopperResponse> getGetShopperRequestMethod() {
    io.grpc.MethodDescriptor<net.mbo.shopperservice.stub.ShopperServiceOuterClass.GetAllShopperRequest, net.mbo.shopperservice.stub.ShopperServiceOuterClass.GetShopperResponse> getGetShopperRequestMethod;
    if ((getGetShopperRequestMethod = ShopperServiceGrpc.getGetShopperRequestMethod) == null) {
      synchronized (ShopperServiceGrpc.class) {
        if ((getGetShopperRequestMethod = ShopperServiceGrpc.getGetShopperRequestMethod) == null) {
          ShopperServiceGrpc.getGetShopperRequestMethod = getGetShopperRequestMethod = 
              io.grpc.MethodDescriptor.<net.mbo.shopperservice.stub.ShopperServiceOuterClass.GetAllShopperRequest, net.mbo.shopperservice.stub.ShopperServiceOuterClass.GetShopperResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ShopperService", "getShopperRequest"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.mbo.shopperservice.stub.ShopperServiceOuterClass.GetAllShopperRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.mbo.shopperservice.stub.ShopperServiceOuterClass.GetShopperResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ShopperServiceMethodDescriptorSupplier("getShopperRequest"))
                  .build();
          }
        }
     }
     return getGetShopperRequestMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.mbo.shopperservice.stub.ShopperServiceOuterClass.GetShopperByIdRequest,
      net.mbo.shopperservice.stub.ShopperServiceOuterClass.GetShopperByIdResponse> getGetShopperByIdMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getShopperById",
      requestType = net.mbo.shopperservice.stub.ShopperServiceOuterClass.GetShopperByIdRequest.class,
      responseType = net.mbo.shopperservice.stub.ShopperServiceOuterClass.GetShopperByIdResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.mbo.shopperservice.stub.ShopperServiceOuterClass.GetShopperByIdRequest,
      net.mbo.shopperservice.stub.ShopperServiceOuterClass.GetShopperByIdResponse> getGetShopperByIdMethod() {
    io.grpc.MethodDescriptor<net.mbo.shopperservice.stub.ShopperServiceOuterClass.GetShopperByIdRequest, net.mbo.shopperservice.stub.ShopperServiceOuterClass.GetShopperByIdResponse> getGetShopperByIdMethod;
    if ((getGetShopperByIdMethod = ShopperServiceGrpc.getGetShopperByIdMethod) == null) {
      synchronized (ShopperServiceGrpc.class) {
        if ((getGetShopperByIdMethod = ShopperServiceGrpc.getGetShopperByIdMethod) == null) {
          ShopperServiceGrpc.getGetShopperByIdMethod = getGetShopperByIdMethod = 
              io.grpc.MethodDescriptor.<net.mbo.shopperservice.stub.ShopperServiceOuterClass.GetShopperByIdRequest, net.mbo.shopperservice.stub.ShopperServiceOuterClass.GetShopperByIdResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ShopperService", "getShopperById"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.mbo.shopperservice.stub.ShopperServiceOuterClass.GetShopperByIdRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.mbo.shopperservice.stub.ShopperServiceOuterClass.GetShopperByIdResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ShopperServiceMethodDescriptorSupplier("getShopperById"))
                  .build();
          }
        }
     }
     return getGetShopperByIdMethod;
  }

  private static volatile io.grpc.MethodDescriptor<net.mbo.shopperservice.stub.ShopperServiceOuterClass.SaveShopperRequest,
      net.mbo.shopperservice.stub.ShopperServiceOuterClass.SaveShopperResponse> getSaveShopperMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "saveShopper",
      requestType = net.mbo.shopperservice.stub.ShopperServiceOuterClass.SaveShopperRequest.class,
      responseType = net.mbo.shopperservice.stub.ShopperServiceOuterClass.SaveShopperResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<net.mbo.shopperservice.stub.ShopperServiceOuterClass.SaveShopperRequest,
      net.mbo.shopperservice.stub.ShopperServiceOuterClass.SaveShopperResponse> getSaveShopperMethod() {
    io.grpc.MethodDescriptor<net.mbo.shopperservice.stub.ShopperServiceOuterClass.SaveShopperRequest, net.mbo.shopperservice.stub.ShopperServiceOuterClass.SaveShopperResponse> getSaveShopperMethod;
    if ((getSaveShopperMethod = ShopperServiceGrpc.getSaveShopperMethod) == null) {
      synchronized (ShopperServiceGrpc.class) {
        if ((getSaveShopperMethod = ShopperServiceGrpc.getSaveShopperMethod) == null) {
          ShopperServiceGrpc.getSaveShopperMethod = getSaveShopperMethod = 
              io.grpc.MethodDescriptor.<net.mbo.shopperservice.stub.ShopperServiceOuterClass.SaveShopperRequest, net.mbo.shopperservice.stub.ShopperServiceOuterClass.SaveShopperResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(
                  "ShopperService", "saveShopper"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.mbo.shopperservice.stub.ShopperServiceOuterClass.SaveShopperRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  net.mbo.shopperservice.stub.ShopperServiceOuterClass.SaveShopperResponse.getDefaultInstance()))
                  .setSchemaDescriptor(new ShopperServiceMethodDescriptorSupplier("saveShopper"))
                  .build();
          }
        }
     }
     return getSaveShopperMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ShopperServiceStub newStub(io.grpc.Channel channel) {
    return new ShopperServiceStub(channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ShopperServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ShopperServiceBlockingStub(channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ShopperServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ShopperServiceFutureStub(channel);
  }

  /**
   */
  public static abstract class ShopperServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void getShopperRequest(net.mbo.shopperservice.stub.ShopperServiceOuterClass.GetAllShopperRequest request,
        io.grpc.stub.StreamObserver<net.mbo.shopperservice.stub.ShopperServiceOuterClass.GetShopperResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetShopperRequestMethod(), responseObserver);
    }

    /**
     */
    public void getShopperById(net.mbo.shopperservice.stub.ShopperServiceOuterClass.GetShopperByIdRequest request,
        io.grpc.stub.StreamObserver<net.mbo.shopperservice.stub.ShopperServiceOuterClass.GetShopperByIdResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGetShopperByIdMethod(), responseObserver);
    }

    /**
     */
    public void saveShopper(net.mbo.shopperservice.stub.ShopperServiceOuterClass.SaveShopperRequest request,
        io.grpc.stub.StreamObserver<net.mbo.shopperservice.stub.ShopperServiceOuterClass.SaveShopperResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSaveShopperMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetShopperRequestMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.mbo.shopperservice.stub.ShopperServiceOuterClass.GetAllShopperRequest,
                net.mbo.shopperservice.stub.ShopperServiceOuterClass.GetShopperResponse>(
                  this, METHODID_GET_SHOPPER_REQUEST)))
          .addMethod(
            getGetShopperByIdMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.mbo.shopperservice.stub.ShopperServiceOuterClass.GetShopperByIdRequest,
                net.mbo.shopperservice.stub.ShopperServiceOuterClass.GetShopperByIdResponse>(
                  this, METHODID_GET_SHOPPER_BY_ID)))
          .addMethod(
            getSaveShopperMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                net.mbo.shopperservice.stub.ShopperServiceOuterClass.SaveShopperRequest,
                net.mbo.shopperservice.stub.ShopperServiceOuterClass.SaveShopperResponse>(
                  this, METHODID_SAVE_SHOPPER)))
          .build();
    }
  }

  /**
   */
  public static final class ShopperServiceStub extends io.grpc.stub.AbstractStub<ShopperServiceStub> {
    private ShopperServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ShopperServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShopperServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ShopperServiceStub(channel, callOptions);
    }

    /**
     */
    public void getShopperRequest(net.mbo.shopperservice.stub.ShopperServiceOuterClass.GetAllShopperRequest request,
        io.grpc.stub.StreamObserver<net.mbo.shopperservice.stub.ShopperServiceOuterClass.GetShopperResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetShopperRequestMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getShopperById(net.mbo.shopperservice.stub.ShopperServiceOuterClass.GetShopperByIdRequest request,
        io.grpc.stub.StreamObserver<net.mbo.shopperservice.stub.ShopperServiceOuterClass.GetShopperByIdResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetShopperByIdMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void saveShopper(net.mbo.shopperservice.stub.ShopperServiceOuterClass.SaveShopperRequest request,
        io.grpc.stub.StreamObserver<net.mbo.shopperservice.stub.ShopperServiceOuterClass.SaveShopperResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSaveShopperMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class ShopperServiceBlockingStub extends io.grpc.stub.AbstractStub<ShopperServiceBlockingStub> {
    private ShopperServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ShopperServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShopperServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ShopperServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public net.mbo.shopperservice.stub.ShopperServiceOuterClass.GetShopperResponse getShopperRequest(net.mbo.shopperservice.stub.ShopperServiceOuterClass.GetAllShopperRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetShopperRequestMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.mbo.shopperservice.stub.ShopperServiceOuterClass.GetShopperByIdResponse getShopperById(net.mbo.shopperservice.stub.ShopperServiceOuterClass.GetShopperByIdRequest request) {
      return blockingUnaryCall(
          getChannel(), getGetShopperByIdMethod(), getCallOptions(), request);
    }

    /**
     */
    public net.mbo.shopperservice.stub.ShopperServiceOuterClass.SaveShopperResponse saveShopper(net.mbo.shopperservice.stub.ShopperServiceOuterClass.SaveShopperRequest request) {
      return blockingUnaryCall(
          getChannel(), getSaveShopperMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class ShopperServiceFutureStub extends io.grpc.stub.AbstractStub<ShopperServiceFutureStub> {
    private ShopperServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ShopperServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ShopperServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ShopperServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.mbo.shopperservice.stub.ShopperServiceOuterClass.GetShopperResponse> getShopperRequest(
        net.mbo.shopperservice.stub.ShopperServiceOuterClass.GetAllShopperRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetShopperRequestMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.mbo.shopperservice.stub.ShopperServiceOuterClass.GetShopperByIdResponse> getShopperById(
        net.mbo.shopperservice.stub.ShopperServiceOuterClass.GetShopperByIdRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGetShopperByIdMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<net.mbo.shopperservice.stub.ShopperServiceOuterClass.SaveShopperResponse> saveShopper(
        net.mbo.shopperservice.stub.ShopperServiceOuterClass.SaveShopperRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSaveShopperMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_SHOPPER_REQUEST = 0;
  private static final int METHODID_GET_SHOPPER_BY_ID = 1;
  private static final int METHODID_SAVE_SHOPPER = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final ShopperServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(ShopperServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_SHOPPER_REQUEST:
          serviceImpl.getShopperRequest((net.mbo.shopperservice.stub.ShopperServiceOuterClass.GetAllShopperRequest) request,
              (io.grpc.stub.StreamObserver<net.mbo.shopperservice.stub.ShopperServiceOuterClass.GetShopperResponse>) responseObserver);
          break;
        case METHODID_GET_SHOPPER_BY_ID:
          serviceImpl.getShopperById((net.mbo.shopperservice.stub.ShopperServiceOuterClass.GetShopperByIdRequest) request,
              (io.grpc.stub.StreamObserver<net.mbo.shopperservice.stub.ShopperServiceOuterClass.GetShopperByIdResponse>) responseObserver);
          break;
        case METHODID_SAVE_SHOPPER:
          serviceImpl.saveShopper((net.mbo.shopperservice.stub.ShopperServiceOuterClass.SaveShopperRequest) request,
              (io.grpc.stub.StreamObserver<net.mbo.shopperservice.stub.ShopperServiceOuterClass.SaveShopperResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class ShopperServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ShopperServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return net.mbo.shopperservice.stub.ShopperServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("ShopperService");
    }
  }

  private static final class ShopperServiceFileDescriptorSupplier
      extends ShopperServiceBaseDescriptorSupplier {
    ShopperServiceFileDescriptorSupplier() {}
  }

  private static final class ShopperServiceMethodDescriptorSupplier
      extends ShopperServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    ShopperServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (ShopperServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ShopperServiceFileDescriptorSupplier())
              .addMethod(getGetShopperRequestMethod())
              .addMethod(getGetShopperByIdMethod())
              .addMethod(getSaveShopperMethod())
              .build();
        }
      }
    }
    return result;
  }
}
