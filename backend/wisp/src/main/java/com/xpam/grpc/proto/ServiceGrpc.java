package com.xpam.grpc.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@io.grpc.stub.annotations.GrpcGenerated
public final class ServiceGrpc {

  private ServiceGrpc() {}

  public static final java.lang.String SERVICE_NAME = "message.Service";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.TokenRequest,
      com.xpam.grpc.proto.ServiceOuterClass.TokenResponse> getGetTokenAuthInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetTokenAuthInfo",
      requestType = com.xpam.grpc.proto.ServiceOuterClass.TokenRequest.class,
      responseType = com.xpam.grpc.proto.ServiceOuterClass.TokenResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.TokenRequest,
      com.xpam.grpc.proto.ServiceOuterClass.TokenResponse> getGetTokenAuthInfoMethod() {
    io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.TokenRequest, com.xpam.grpc.proto.ServiceOuterClass.TokenResponse> getGetTokenAuthInfoMethod;
    if ((getGetTokenAuthInfoMethod = ServiceGrpc.getGetTokenAuthInfoMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getGetTokenAuthInfoMethod = ServiceGrpc.getGetTokenAuthInfoMethod) == null) {
          ServiceGrpc.getGetTokenAuthInfoMethod = getGetTokenAuthInfoMethod =
              io.grpc.MethodDescriptor.<com.xpam.grpc.proto.ServiceOuterClass.TokenRequest, com.xpam.grpc.proto.ServiceOuterClass.TokenResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetTokenAuthInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xpam.grpc.proto.ServiceOuterClass.TokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xpam.grpc.proto.ServiceOuterClass.TokenResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("GetTokenAuthInfo"))
              .build();
        }
      }
    }
    return getGetTokenAuthInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.TokenRequest,
      com.xpam.grpc.proto.ServiceOuterClass.StatusResponse> getRenewTokenMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RenewToken",
      requestType = com.xpam.grpc.proto.ServiceOuterClass.TokenRequest.class,
      responseType = com.xpam.grpc.proto.ServiceOuterClass.StatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.TokenRequest,
      com.xpam.grpc.proto.ServiceOuterClass.StatusResponse> getRenewTokenMethod() {
    io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.TokenRequest, com.xpam.grpc.proto.ServiceOuterClass.StatusResponse> getRenewTokenMethod;
    if ((getRenewTokenMethod = ServiceGrpc.getRenewTokenMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getRenewTokenMethod = ServiceGrpc.getRenewTokenMethod) == null) {
          ServiceGrpc.getRenewTokenMethod = getRenewTokenMethod =
              io.grpc.MethodDescriptor.<com.xpam.grpc.proto.ServiceOuterClass.TokenRequest, com.xpam.grpc.proto.ServiceOuterClass.StatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RenewToken"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xpam.grpc.proto.ServiceOuterClass.TokenRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xpam.grpc.proto.ServiceOuterClass.StatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("RenewToken"))
              .build();
        }
      }
    }
    return getRenewTokenMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.SessionCreateRequest,
      com.xpam.grpc.proto.ServiceOuterClass.SessionCreateResponse> getCreateSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateSession",
      requestType = com.xpam.grpc.proto.ServiceOuterClass.SessionCreateRequest.class,
      responseType = com.xpam.grpc.proto.ServiceOuterClass.SessionCreateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.SessionCreateRequest,
      com.xpam.grpc.proto.ServiceOuterClass.SessionCreateResponse> getCreateSessionMethod() {
    io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.SessionCreateRequest, com.xpam.grpc.proto.ServiceOuterClass.SessionCreateResponse> getCreateSessionMethod;
    if ((getCreateSessionMethod = ServiceGrpc.getCreateSessionMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getCreateSessionMethod = ServiceGrpc.getCreateSessionMethod) == null) {
          ServiceGrpc.getCreateSessionMethod = getCreateSessionMethod =
              io.grpc.MethodDescriptor.<com.xpam.grpc.proto.ServiceOuterClass.SessionCreateRequest, com.xpam.grpc.proto.ServiceOuterClass.SessionCreateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xpam.grpc.proto.ServiceOuterClass.SessionCreateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xpam.grpc.proto.ServiceOuterClass.SessionCreateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("CreateSession"))
              .build();
        }
      }
    }
    return getCreateSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.SessionFinishRequest,
      com.xpam.grpc.proto.ServiceOuterClass.SessionFinishResp> getFinishSessionMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FinishSession",
      requestType = com.xpam.grpc.proto.ServiceOuterClass.SessionFinishRequest.class,
      responseType = com.xpam.grpc.proto.ServiceOuterClass.SessionFinishResp.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.SessionFinishRequest,
      com.xpam.grpc.proto.ServiceOuterClass.SessionFinishResp> getFinishSessionMethod() {
    io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.SessionFinishRequest, com.xpam.grpc.proto.ServiceOuterClass.SessionFinishResp> getFinishSessionMethod;
    if ((getFinishSessionMethod = ServiceGrpc.getFinishSessionMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getFinishSessionMethod = ServiceGrpc.getFinishSessionMethod) == null) {
          ServiceGrpc.getFinishSessionMethod = getFinishSessionMethod =
              io.grpc.MethodDescriptor.<com.xpam.grpc.proto.ServiceOuterClass.SessionFinishRequest, com.xpam.grpc.proto.ServiceOuterClass.SessionFinishResp>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FinishSession"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xpam.grpc.proto.ServiceOuterClass.SessionFinishRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xpam.grpc.proto.ServiceOuterClass.SessionFinishResp.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("FinishSession"))
              .build();
        }
      }
    }
    return getFinishSessionMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.ReplayRequest,
      com.xpam.grpc.proto.ServiceOuterClass.ReplayResponse> getUploadReplayFileMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadReplayFile",
      requestType = com.xpam.grpc.proto.ServiceOuterClass.ReplayRequest.class,
      responseType = com.xpam.grpc.proto.ServiceOuterClass.ReplayResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.ReplayRequest,
      com.xpam.grpc.proto.ServiceOuterClass.ReplayResponse> getUploadReplayFileMethod() {
    io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.ReplayRequest, com.xpam.grpc.proto.ServiceOuterClass.ReplayResponse> getUploadReplayFileMethod;
    if ((getUploadReplayFileMethod = ServiceGrpc.getUploadReplayFileMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getUploadReplayFileMethod = ServiceGrpc.getUploadReplayFileMethod) == null) {
          ServiceGrpc.getUploadReplayFileMethod = getUploadReplayFileMethod =
              io.grpc.MethodDescriptor.<com.xpam.grpc.proto.ServiceOuterClass.ReplayRequest, com.xpam.grpc.proto.ServiceOuterClass.ReplayResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadReplayFile"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xpam.grpc.proto.ServiceOuterClass.ReplayRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xpam.grpc.proto.ServiceOuterClass.ReplayResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("UploadReplayFile"))
              .build();
        }
      }
    }
    return getUploadReplayFileMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.CommandRequest,
      com.xpam.grpc.proto.ServiceOuterClass.CommandResponse> getUploadCommandMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "UploadCommand",
      requestType = com.xpam.grpc.proto.ServiceOuterClass.CommandRequest.class,
      responseType = com.xpam.grpc.proto.ServiceOuterClass.CommandResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.CommandRequest,
      com.xpam.grpc.proto.ServiceOuterClass.CommandResponse> getUploadCommandMethod() {
    io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.CommandRequest, com.xpam.grpc.proto.ServiceOuterClass.CommandResponse> getUploadCommandMethod;
    if ((getUploadCommandMethod = ServiceGrpc.getUploadCommandMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getUploadCommandMethod = ServiceGrpc.getUploadCommandMethod) == null) {
          ServiceGrpc.getUploadCommandMethod = getUploadCommandMethod =
              io.grpc.MethodDescriptor.<com.xpam.grpc.proto.ServiceOuterClass.CommandRequest, com.xpam.grpc.proto.ServiceOuterClass.CommandResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "UploadCommand"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xpam.grpc.proto.ServiceOuterClass.CommandRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xpam.grpc.proto.ServiceOuterClass.CommandResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("UploadCommand"))
              .build();
        }
      }
    }
    return getUploadCommandMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.FinishedTaskRequest,
      com.xpam.grpc.proto.ServiceOuterClass.TaskResponse> getDispatchTaskMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DispatchTask",
      requestType = com.xpam.grpc.proto.ServiceOuterClass.FinishedTaskRequest.class,
      responseType = com.xpam.grpc.proto.ServiceOuterClass.TaskResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.FinishedTaskRequest,
      com.xpam.grpc.proto.ServiceOuterClass.TaskResponse> getDispatchTaskMethod() {
    io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.FinishedTaskRequest, com.xpam.grpc.proto.ServiceOuterClass.TaskResponse> getDispatchTaskMethod;
    if ((getDispatchTaskMethod = ServiceGrpc.getDispatchTaskMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getDispatchTaskMethod = ServiceGrpc.getDispatchTaskMethod) == null) {
          ServiceGrpc.getDispatchTaskMethod = getDispatchTaskMethod =
              io.grpc.MethodDescriptor.<com.xpam.grpc.proto.ServiceOuterClass.FinishedTaskRequest, com.xpam.grpc.proto.ServiceOuterClass.TaskResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DispatchTask"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xpam.grpc.proto.ServiceOuterClass.FinishedTaskRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xpam.grpc.proto.ServiceOuterClass.TaskResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("DispatchTask"))
              .build();
        }
      }
    }
    return getDispatchTaskMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.RemainReplayRequest,
      com.xpam.grpc.proto.ServiceOuterClass.RemainReplayResponse> getScanRemainReplaysMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "ScanRemainReplays",
      requestType = com.xpam.grpc.proto.ServiceOuterClass.RemainReplayRequest.class,
      responseType = com.xpam.grpc.proto.ServiceOuterClass.RemainReplayResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.RemainReplayRequest,
      com.xpam.grpc.proto.ServiceOuterClass.RemainReplayResponse> getScanRemainReplaysMethod() {
    io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.RemainReplayRequest, com.xpam.grpc.proto.ServiceOuterClass.RemainReplayResponse> getScanRemainReplaysMethod;
    if ((getScanRemainReplaysMethod = ServiceGrpc.getScanRemainReplaysMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getScanRemainReplaysMethod = ServiceGrpc.getScanRemainReplaysMethod) == null) {
          ServiceGrpc.getScanRemainReplaysMethod = getScanRemainReplaysMethod =
              io.grpc.MethodDescriptor.<com.xpam.grpc.proto.ServiceOuterClass.RemainReplayRequest, com.xpam.grpc.proto.ServiceOuterClass.RemainReplayResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "ScanRemainReplays"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xpam.grpc.proto.ServiceOuterClass.RemainReplayRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xpam.grpc.proto.ServiceOuterClass.RemainReplayResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("ScanRemainReplays"))
              .build();
        }
      }
    }
    return getScanRemainReplaysMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.CommandConfirmRequest,
      com.xpam.grpc.proto.ServiceOuterClass.CommandConfirmResponse> getCreateCommandTicketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateCommandTicket",
      requestType = com.xpam.grpc.proto.ServiceOuterClass.CommandConfirmRequest.class,
      responseType = com.xpam.grpc.proto.ServiceOuterClass.CommandConfirmResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.CommandConfirmRequest,
      com.xpam.grpc.proto.ServiceOuterClass.CommandConfirmResponse> getCreateCommandTicketMethod() {
    io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.CommandConfirmRequest, com.xpam.grpc.proto.ServiceOuterClass.CommandConfirmResponse> getCreateCommandTicketMethod;
    if ((getCreateCommandTicketMethod = ServiceGrpc.getCreateCommandTicketMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getCreateCommandTicketMethod = ServiceGrpc.getCreateCommandTicketMethod) == null) {
          ServiceGrpc.getCreateCommandTicketMethod = getCreateCommandTicketMethod =
              io.grpc.MethodDescriptor.<com.xpam.grpc.proto.ServiceOuterClass.CommandConfirmRequest, com.xpam.grpc.proto.ServiceOuterClass.CommandConfirmResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateCommandTicket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xpam.grpc.proto.ServiceOuterClass.CommandConfirmRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xpam.grpc.proto.ServiceOuterClass.CommandConfirmResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("CreateCommandTicket"))
              .build();
        }
      }
    }
    return getCreateCommandTicketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.AssetLoginTicketRequest,
      com.xpam.grpc.proto.ServiceOuterClass.AssetLoginTicketResponse> getCheckOrCreateAssetLoginTicketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckOrCreateAssetLoginTicket",
      requestType = com.xpam.grpc.proto.ServiceOuterClass.AssetLoginTicketRequest.class,
      responseType = com.xpam.grpc.proto.ServiceOuterClass.AssetLoginTicketResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.AssetLoginTicketRequest,
      com.xpam.grpc.proto.ServiceOuterClass.AssetLoginTicketResponse> getCheckOrCreateAssetLoginTicketMethod() {
    io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.AssetLoginTicketRequest, com.xpam.grpc.proto.ServiceOuterClass.AssetLoginTicketResponse> getCheckOrCreateAssetLoginTicketMethod;
    if ((getCheckOrCreateAssetLoginTicketMethod = ServiceGrpc.getCheckOrCreateAssetLoginTicketMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getCheckOrCreateAssetLoginTicketMethod = ServiceGrpc.getCheckOrCreateAssetLoginTicketMethod) == null) {
          ServiceGrpc.getCheckOrCreateAssetLoginTicketMethod = getCheckOrCreateAssetLoginTicketMethod =
              io.grpc.MethodDescriptor.<com.xpam.grpc.proto.ServiceOuterClass.AssetLoginTicketRequest, com.xpam.grpc.proto.ServiceOuterClass.AssetLoginTicketResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckOrCreateAssetLoginTicket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xpam.grpc.proto.ServiceOuterClass.AssetLoginTicketRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xpam.grpc.proto.ServiceOuterClass.AssetLoginTicketResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("CheckOrCreateAssetLoginTicket"))
              .build();
        }
      }
    }
    return getCheckOrCreateAssetLoginTicketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.TicketRequest,
      com.xpam.grpc.proto.ServiceOuterClass.TicketStateResponse> getCheckTicketStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckTicketState",
      requestType = com.xpam.grpc.proto.ServiceOuterClass.TicketRequest.class,
      responseType = com.xpam.grpc.proto.ServiceOuterClass.TicketStateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.TicketRequest,
      com.xpam.grpc.proto.ServiceOuterClass.TicketStateResponse> getCheckTicketStateMethod() {
    io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.TicketRequest, com.xpam.grpc.proto.ServiceOuterClass.TicketStateResponse> getCheckTicketStateMethod;
    if ((getCheckTicketStateMethod = ServiceGrpc.getCheckTicketStateMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getCheckTicketStateMethod = ServiceGrpc.getCheckTicketStateMethod) == null) {
          ServiceGrpc.getCheckTicketStateMethod = getCheckTicketStateMethod =
              io.grpc.MethodDescriptor.<com.xpam.grpc.proto.ServiceOuterClass.TicketRequest, com.xpam.grpc.proto.ServiceOuterClass.TicketStateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckTicketState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xpam.grpc.proto.ServiceOuterClass.TicketRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xpam.grpc.proto.ServiceOuterClass.TicketStateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("CheckTicketState"))
              .build();
        }
      }
    }
    return getCheckTicketStateMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.TicketRequest,
      com.xpam.grpc.proto.ServiceOuterClass.StatusResponse> getCancelTicketMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CancelTicket",
      requestType = com.xpam.grpc.proto.ServiceOuterClass.TicketRequest.class,
      responseType = com.xpam.grpc.proto.ServiceOuterClass.StatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.TicketRequest,
      com.xpam.grpc.proto.ServiceOuterClass.StatusResponse> getCancelTicketMethod() {
    io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.TicketRequest, com.xpam.grpc.proto.ServiceOuterClass.StatusResponse> getCancelTicketMethod;
    if ((getCancelTicketMethod = ServiceGrpc.getCancelTicketMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getCancelTicketMethod = ServiceGrpc.getCancelTicketMethod) == null) {
          ServiceGrpc.getCancelTicketMethod = getCancelTicketMethod =
              io.grpc.MethodDescriptor.<com.xpam.grpc.proto.ServiceOuterClass.TicketRequest, com.xpam.grpc.proto.ServiceOuterClass.StatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CancelTicket"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xpam.grpc.proto.ServiceOuterClass.TicketRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xpam.grpc.proto.ServiceOuterClass.StatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("CancelTicket"))
              .build();
        }
      }
    }
    return getCancelTicketMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.ForwardRequest,
      com.xpam.grpc.proto.ServiceOuterClass.ForwardResponse> getCreateForwardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CreateForward",
      requestType = com.xpam.grpc.proto.ServiceOuterClass.ForwardRequest.class,
      responseType = com.xpam.grpc.proto.ServiceOuterClass.ForwardResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.ForwardRequest,
      com.xpam.grpc.proto.ServiceOuterClass.ForwardResponse> getCreateForwardMethod() {
    io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.ForwardRequest, com.xpam.grpc.proto.ServiceOuterClass.ForwardResponse> getCreateForwardMethod;
    if ((getCreateForwardMethod = ServiceGrpc.getCreateForwardMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getCreateForwardMethod = ServiceGrpc.getCreateForwardMethod) == null) {
          ServiceGrpc.getCreateForwardMethod = getCreateForwardMethod =
              io.grpc.MethodDescriptor.<com.xpam.grpc.proto.ServiceOuterClass.ForwardRequest, com.xpam.grpc.proto.ServiceOuterClass.ForwardResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CreateForward"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xpam.grpc.proto.ServiceOuterClass.ForwardRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xpam.grpc.proto.ServiceOuterClass.ForwardResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("CreateForward"))
              .build();
        }
      }
    }
    return getCreateForwardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.ForwardDeleteRequest,
      com.xpam.grpc.proto.ServiceOuterClass.StatusResponse> getDeleteForwardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "DeleteForward",
      requestType = com.xpam.grpc.proto.ServiceOuterClass.ForwardDeleteRequest.class,
      responseType = com.xpam.grpc.proto.ServiceOuterClass.StatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.ForwardDeleteRequest,
      com.xpam.grpc.proto.ServiceOuterClass.StatusResponse> getDeleteForwardMethod() {
    io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.ForwardDeleteRequest, com.xpam.grpc.proto.ServiceOuterClass.StatusResponse> getDeleteForwardMethod;
    if ((getDeleteForwardMethod = ServiceGrpc.getDeleteForwardMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getDeleteForwardMethod = ServiceGrpc.getDeleteForwardMethod) == null) {
          ServiceGrpc.getDeleteForwardMethod = getDeleteForwardMethod =
              io.grpc.MethodDescriptor.<com.xpam.grpc.proto.ServiceOuterClass.ForwardDeleteRequest, com.xpam.grpc.proto.ServiceOuterClass.StatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "DeleteForward"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xpam.grpc.proto.ServiceOuterClass.ForwardDeleteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xpam.grpc.proto.ServiceOuterClass.StatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("DeleteForward"))
              .build();
        }
      }
    }
    return getDeleteForwardMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.Empty,
      com.xpam.grpc.proto.ServiceOuterClass.PublicSettingResponse> getGetPublicSettingMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPublicSetting",
      requestType = com.xpam.grpc.proto.ServiceOuterClass.Empty.class,
      responseType = com.xpam.grpc.proto.ServiceOuterClass.PublicSettingResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.Empty,
      com.xpam.grpc.proto.ServiceOuterClass.PublicSettingResponse> getGetPublicSettingMethod() {
    io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.Empty, com.xpam.grpc.proto.ServiceOuterClass.PublicSettingResponse> getGetPublicSettingMethod;
    if ((getGetPublicSettingMethod = ServiceGrpc.getGetPublicSettingMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getGetPublicSettingMethod = ServiceGrpc.getGetPublicSettingMethod) == null) {
          ServiceGrpc.getGetPublicSettingMethod = getGetPublicSettingMethod =
              io.grpc.MethodDescriptor.<com.xpam.grpc.proto.ServiceOuterClass.Empty, com.xpam.grpc.proto.ServiceOuterClass.PublicSettingResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPublicSetting"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xpam.grpc.proto.ServiceOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xpam.grpc.proto.ServiceOuterClass.PublicSettingResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("GetPublicSetting"))
              .build();
        }
      }
    }
    return getGetPublicSettingMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.Empty,
      com.xpam.grpc.proto.ServiceOuterClass.ListenPortResponse> getGetListenPortsMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetListenPorts",
      requestType = com.xpam.grpc.proto.ServiceOuterClass.Empty.class,
      responseType = com.xpam.grpc.proto.ServiceOuterClass.ListenPortResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.Empty,
      com.xpam.grpc.proto.ServiceOuterClass.ListenPortResponse> getGetListenPortsMethod() {
    io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.Empty, com.xpam.grpc.proto.ServiceOuterClass.ListenPortResponse> getGetListenPortsMethod;
    if ((getGetListenPortsMethod = ServiceGrpc.getGetListenPortsMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getGetListenPortsMethod = ServiceGrpc.getGetListenPortsMethod) == null) {
          ServiceGrpc.getGetListenPortsMethod = getGetListenPortsMethod =
              io.grpc.MethodDescriptor.<com.xpam.grpc.proto.ServiceOuterClass.Empty, com.xpam.grpc.proto.ServiceOuterClass.ListenPortResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetListenPorts"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xpam.grpc.proto.ServiceOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xpam.grpc.proto.ServiceOuterClass.ListenPortResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("GetListenPorts"))
              .build();
        }
      }
    }
    return getGetListenPortsMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.PortInfoRequest,
      com.xpam.grpc.proto.ServiceOuterClass.PortInfoResponse> getGetPortInfoMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetPortInfo",
      requestType = com.xpam.grpc.proto.ServiceOuterClass.PortInfoRequest.class,
      responseType = com.xpam.grpc.proto.ServiceOuterClass.PortInfoResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.PortInfoRequest,
      com.xpam.grpc.proto.ServiceOuterClass.PortInfoResponse> getGetPortInfoMethod() {
    io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.PortInfoRequest, com.xpam.grpc.proto.ServiceOuterClass.PortInfoResponse> getGetPortInfoMethod;
    if ((getGetPortInfoMethod = ServiceGrpc.getGetPortInfoMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getGetPortInfoMethod = ServiceGrpc.getGetPortInfoMethod) == null) {
          ServiceGrpc.getGetPortInfoMethod = getGetPortInfoMethod =
              io.grpc.MethodDescriptor.<com.xpam.grpc.proto.ServiceOuterClass.PortInfoRequest, com.xpam.grpc.proto.ServiceOuterClass.PortInfoResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetPortInfo"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xpam.grpc.proto.ServiceOuterClass.PortInfoRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xpam.grpc.proto.ServiceOuterClass.PortInfoResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("GetPortInfo"))
              .build();
        }
      }
    }
    return getGetPortInfoMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.PortFailureRequest,
      com.xpam.grpc.proto.ServiceOuterClass.StatusResponse> getHandlePortFailureMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "HandlePortFailure",
      requestType = com.xpam.grpc.proto.ServiceOuterClass.PortFailureRequest.class,
      responseType = com.xpam.grpc.proto.ServiceOuterClass.StatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.PortFailureRequest,
      com.xpam.grpc.proto.ServiceOuterClass.StatusResponse> getHandlePortFailureMethod() {
    io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.PortFailureRequest, com.xpam.grpc.proto.ServiceOuterClass.StatusResponse> getHandlePortFailureMethod;
    if ((getHandlePortFailureMethod = ServiceGrpc.getHandlePortFailureMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getHandlePortFailureMethod = ServiceGrpc.getHandlePortFailureMethod) == null) {
          ServiceGrpc.getHandlePortFailureMethod = getHandlePortFailureMethod =
              io.grpc.MethodDescriptor.<com.xpam.grpc.proto.ServiceOuterClass.PortFailureRequest, com.xpam.grpc.proto.ServiceOuterClass.StatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "HandlePortFailure"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xpam.grpc.proto.ServiceOuterClass.PortFailureRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xpam.grpc.proto.ServiceOuterClass.StatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("HandlePortFailure"))
              .build();
        }
      }
    }
    return getHandlePortFailureMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.CookiesRequest,
      com.xpam.grpc.proto.ServiceOuterClass.UserResponse> getCheckUserByCookiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CheckUserByCookies",
      requestType = com.xpam.grpc.proto.ServiceOuterClass.CookiesRequest.class,
      responseType = com.xpam.grpc.proto.ServiceOuterClass.UserResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.CookiesRequest,
      com.xpam.grpc.proto.ServiceOuterClass.UserResponse> getCheckUserByCookiesMethod() {
    io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.CookiesRequest, com.xpam.grpc.proto.ServiceOuterClass.UserResponse> getCheckUserByCookiesMethod;
    if ((getCheckUserByCookiesMethod = ServiceGrpc.getCheckUserByCookiesMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getCheckUserByCookiesMethod = ServiceGrpc.getCheckUserByCookiesMethod) == null) {
          ServiceGrpc.getCheckUserByCookiesMethod = getCheckUserByCookiesMethod =
              io.grpc.MethodDescriptor.<com.xpam.grpc.proto.ServiceOuterClass.CookiesRequest, com.xpam.grpc.proto.ServiceOuterClass.UserResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CheckUserByCookies"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xpam.grpc.proto.ServiceOuterClass.CookiesRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xpam.grpc.proto.ServiceOuterClass.UserResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("CheckUserByCookies"))
              .build();
        }
      }
    }
    return getCheckUserByCookiesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.SessionLifecycleLogRequest,
      com.xpam.grpc.proto.ServiceOuterClass.StatusResponse> getRecordSessionLifecycleLogMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "RecordSessionLifecycleLog",
      requestType = com.xpam.grpc.proto.ServiceOuterClass.SessionLifecycleLogRequest.class,
      responseType = com.xpam.grpc.proto.ServiceOuterClass.StatusResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.SessionLifecycleLogRequest,
      com.xpam.grpc.proto.ServiceOuterClass.StatusResponse> getRecordSessionLifecycleLogMethod() {
    io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.SessionLifecycleLogRequest, com.xpam.grpc.proto.ServiceOuterClass.StatusResponse> getRecordSessionLifecycleLogMethod;
    if ((getRecordSessionLifecycleLogMethod = ServiceGrpc.getRecordSessionLifecycleLogMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getRecordSessionLifecycleLogMethod = ServiceGrpc.getRecordSessionLifecycleLogMethod) == null) {
          ServiceGrpc.getRecordSessionLifecycleLogMethod = getRecordSessionLifecycleLogMethod =
              io.grpc.MethodDescriptor.<com.xpam.grpc.proto.ServiceOuterClass.SessionLifecycleLogRequest, com.xpam.grpc.proto.ServiceOuterClass.StatusResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "RecordSessionLifecycleLog"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xpam.grpc.proto.ServiceOuterClass.SessionLifecycleLogRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xpam.grpc.proto.ServiceOuterClass.StatusResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("RecordSessionLifecycleLog"))
              .build();
        }
      }
    }
    return getRecordSessionLifecycleLogMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.FaceRecognitionCallbackRequest,
      com.xpam.grpc.proto.ServiceOuterClass.FaceRecognitionCallbackResponse> getFaceRecognitionCallbackMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FaceRecognitionCallback",
      requestType = com.xpam.grpc.proto.ServiceOuterClass.FaceRecognitionCallbackRequest.class,
      responseType = com.xpam.grpc.proto.ServiceOuterClass.FaceRecognitionCallbackResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.FaceRecognitionCallbackRequest,
      com.xpam.grpc.proto.ServiceOuterClass.FaceRecognitionCallbackResponse> getFaceRecognitionCallbackMethod() {
    io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.FaceRecognitionCallbackRequest, com.xpam.grpc.proto.ServiceOuterClass.FaceRecognitionCallbackResponse> getFaceRecognitionCallbackMethod;
    if ((getFaceRecognitionCallbackMethod = ServiceGrpc.getFaceRecognitionCallbackMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getFaceRecognitionCallbackMethod = ServiceGrpc.getFaceRecognitionCallbackMethod) == null) {
          ServiceGrpc.getFaceRecognitionCallbackMethod = getFaceRecognitionCallbackMethod =
              io.grpc.MethodDescriptor.<com.xpam.grpc.proto.ServiceOuterClass.FaceRecognitionCallbackRequest, com.xpam.grpc.proto.ServiceOuterClass.FaceRecognitionCallbackResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FaceRecognitionCallback"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xpam.grpc.proto.ServiceOuterClass.FaceRecognitionCallbackRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xpam.grpc.proto.ServiceOuterClass.FaceRecognitionCallbackResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("FaceRecognitionCallback"))
              .build();
        }
      }
    }
    return getFaceRecognitionCallbackMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.FaceMonitorCallbackRequest,
      com.xpam.grpc.proto.ServiceOuterClass.FaceMonitorCallbackResponse> getFaceMonitorCallbackMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "FaceMonitorCallback",
      requestType = com.xpam.grpc.proto.ServiceOuterClass.FaceMonitorCallbackRequest.class,
      responseType = com.xpam.grpc.proto.ServiceOuterClass.FaceMonitorCallbackResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.FaceMonitorCallbackRequest,
      com.xpam.grpc.proto.ServiceOuterClass.FaceMonitorCallbackResponse> getFaceMonitorCallbackMethod() {
    io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.FaceMonitorCallbackRequest, com.xpam.grpc.proto.ServiceOuterClass.FaceMonitorCallbackResponse> getFaceMonitorCallbackMethod;
    if ((getFaceMonitorCallbackMethod = ServiceGrpc.getFaceMonitorCallbackMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getFaceMonitorCallbackMethod = ServiceGrpc.getFaceMonitorCallbackMethod) == null) {
          ServiceGrpc.getFaceMonitorCallbackMethod = getFaceMonitorCallbackMethod =
              io.grpc.MethodDescriptor.<com.xpam.grpc.proto.ServiceOuterClass.FaceMonitorCallbackRequest, com.xpam.grpc.proto.ServiceOuterClass.FaceMonitorCallbackResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "FaceMonitorCallback"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xpam.grpc.proto.ServiceOuterClass.FaceMonitorCallbackRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xpam.grpc.proto.ServiceOuterClass.FaceMonitorCallbackResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("FaceMonitorCallback"))
              .build();
        }
      }
    }
    return getFaceMonitorCallbackMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.JoinFaceMonitorRequest,
      com.xpam.grpc.proto.ServiceOuterClass.JoinFaceMonitorResponse> getJoinFaceMonitorMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "JoinFaceMonitor",
      requestType = com.xpam.grpc.proto.ServiceOuterClass.JoinFaceMonitorRequest.class,
      responseType = com.xpam.grpc.proto.ServiceOuterClass.JoinFaceMonitorResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.JoinFaceMonitorRequest,
      com.xpam.grpc.proto.ServiceOuterClass.JoinFaceMonitorResponse> getJoinFaceMonitorMethod() {
    io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.JoinFaceMonitorRequest, com.xpam.grpc.proto.ServiceOuterClass.JoinFaceMonitorResponse> getJoinFaceMonitorMethod;
    if ((getJoinFaceMonitorMethod = ServiceGrpc.getJoinFaceMonitorMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getJoinFaceMonitorMethod = ServiceGrpc.getJoinFaceMonitorMethod) == null) {
          ServiceGrpc.getJoinFaceMonitorMethod = getJoinFaceMonitorMethod =
              io.grpc.MethodDescriptor.<com.xpam.grpc.proto.ServiceOuterClass.JoinFaceMonitorRequest, com.xpam.grpc.proto.ServiceOuterClass.JoinFaceMonitorResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "JoinFaceMonitor"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xpam.grpc.proto.ServiceOuterClass.JoinFaceMonitorRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xpam.grpc.proto.ServiceOuterClass.JoinFaceMonitorResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("JoinFaceMonitor"))
              .build();
        }
      }
    }
    return getJoinFaceMonitorMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.Empty,
      com.xpam.grpc.proto.ServiceOuterClass.AccountDetailResponse> getGetAccountChatMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "GetAccountChat",
      requestType = com.xpam.grpc.proto.ServiceOuterClass.Empty.class,
      responseType = com.xpam.grpc.proto.ServiceOuterClass.AccountDetailResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.Empty,
      com.xpam.grpc.proto.ServiceOuterClass.AccountDetailResponse> getGetAccountChatMethod() {
    io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.Empty, com.xpam.grpc.proto.ServiceOuterClass.AccountDetailResponse> getGetAccountChatMethod;
    if ((getGetAccountChatMethod = ServiceGrpc.getGetAccountChatMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getGetAccountChatMethod = ServiceGrpc.getGetAccountChatMethod) == null) {
          ServiceGrpc.getGetAccountChatMethod = getGetAccountChatMethod =
              io.grpc.MethodDescriptor.<com.xpam.grpc.proto.ServiceOuterClass.Empty, com.xpam.grpc.proto.ServiceOuterClass.AccountDetailResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "GetAccountChat"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xpam.grpc.proto.ServiceOuterClass.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xpam.grpc.proto.ServiceOuterClass.AccountDetailResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("GetAccountChat"))
              .build();
        }
      }
    }
    return getGetAccountChatMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.HTTPRequest,
      com.xpam.grpc.proto.ServiceOuterClass.HTTPResponse> getCallAPIMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "CallAPI",
      requestType = com.xpam.grpc.proto.ServiceOuterClass.HTTPRequest.class,
      responseType = com.xpam.grpc.proto.ServiceOuterClass.HTTPResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.HTTPRequest,
      com.xpam.grpc.proto.ServiceOuterClass.HTTPResponse> getCallAPIMethod() {
    io.grpc.MethodDescriptor<com.xpam.grpc.proto.ServiceOuterClass.HTTPRequest, com.xpam.grpc.proto.ServiceOuterClass.HTTPResponse> getCallAPIMethod;
    if ((getCallAPIMethod = ServiceGrpc.getCallAPIMethod) == null) {
      synchronized (ServiceGrpc.class) {
        if ((getCallAPIMethod = ServiceGrpc.getCallAPIMethod) == null) {
          ServiceGrpc.getCallAPIMethod = getCallAPIMethod =
              io.grpc.MethodDescriptor.<com.xpam.grpc.proto.ServiceOuterClass.HTTPRequest, com.xpam.grpc.proto.ServiceOuterClass.HTTPResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "CallAPI"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xpam.grpc.proto.ServiceOuterClass.HTTPRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.xpam.grpc.proto.ServiceOuterClass.HTTPResponse.getDefaultInstance()))
              .setSchemaDescriptor(new ServiceMethodDescriptorSupplier("CallAPI"))
              .build();
        }
      }
    }
    return getCallAPIMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static ServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServiceStub>() {
        @java.lang.Override
        public ServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServiceStub(channel, callOptions);
        }
      };
    return ServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports all types of calls on the service
   */
  public static ServiceBlockingV2Stub newBlockingV2Stub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServiceBlockingV2Stub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServiceBlockingV2Stub>() {
        @java.lang.Override
        public ServiceBlockingV2Stub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServiceBlockingV2Stub(channel, callOptions);
        }
      };
    return ServiceBlockingV2Stub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static ServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServiceBlockingStub>() {
        @java.lang.Override
        public ServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServiceBlockingStub(channel, callOptions);
        }
      };
    return ServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static ServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<ServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<ServiceFutureStub>() {
        @java.lang.Override
        public ServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new ServiceFutureStub(channel, callOptions);
        }
      };
    return ServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default void getTokenAuthInfo(com.xpam.grpc.proto.ServiceOuterClass.TokenRequest request,
        io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.TokenResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetTokenAuthInfoMethod(), responseObserver);
    }

    /**
     */
    default void renewToken(com.xpam.grpc.proto.ServiceOuterClass.TokenRequest request,
        io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.StatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRenewTokenMethod(), responseObserver);
    }

    /**
     */
    default void createSession(com.xpam.grpc.proto.ServiceOuterClass.SessionCreateRequest request,
        io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.SessionCreateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateSessionMethod(), responseObserver);
    }

    /**
     */
    default void finishSession(com.xpam.grpc.proto.ServiceOuterClass.SessionFinishRequest request,
        io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.SessionFinishResp> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFinishSessionMethod(), responseObserver);
    }

    /**
     */
    default void uploadReplayFile(com.xpam.grpc.proto.ServiceOuterClass.ReplayRequest request,
        io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.ReplayResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUploadReplayFileMethod(), responseObserver);
    }

    /**
     */
    default void uploadCommand(com.xpam.grpc.proto.ServiceOuterClass.CommandRequest request,
        io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.CommandResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getUploadCommandMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.FinishedTaskRequest> dispatchTask(
        io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.TaskResponse> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getDispatchTaskMethod(), responseObserver);
    }

    /**
     */
    default void scanRemainReplays(com.xpam.grpc.proto.ServiceOuterClass.RemainReplayRequest request,
        io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.RemainReplayResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getScanRemainReplaysMethod(), responseObserver);
    }

    /**
     */
    default void createCommandTicket(com.xpam.grpc.proto.ServiceOuterClass.CommandConfirmRequest request,
        io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.CommandConfirmResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateCommandTicketMethod(), responseObserver);
    }

    /**
     */
    default void checkOrCreateAssetLoginTicket(com.xpam.grpc.proto.ServiceOuterClass.AssetLoginTicketRequest request,
        io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.AssetLoginTicketResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckOrCreateAssetLoginTicketMethod(), responseObserver);
    }

    /**
     */
    default void checkTicketState(com.xpam.grpc.proto.ServiceOuterClass.TicketRequest request,
        io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.TicketStateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckTicketStateMethod(), responseObserver);
    }

    /**
     */
    default void cancelTicket(com.xpam.grpc.proto.ServiceOuterClass.TicketRequest request,
        io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.StatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCancelTicketMethod(), responseObserver);
    }

    /**
     */
    default void createForward(com.xpam.grpc.proto.ServiceOuterClass.ForwardRequest request,
        io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.ForwardResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCreateForwardMethod(), responseObserver);
    }

    /**
     */
    default void deleteForward(com.xpam.grpc.proto.ServiceOuterClass.ForwardDeleteRequest request,
        io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.StatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getDeleteForwardMethod(), responseObserver);
    }

    /**
     */
    default void getPublicSetting(com.xpam.grpc.proto.ServiceOuterClass.Empty request,
        io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.PublicSettingResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPublicSettingMethod(), responseObserver);
    }

    /**
     */
    default void getListenPorts(com.xpam.grpc.proto.ServiceOuterClass.Empty request,
        io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.ListenPortResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetListenPortsMethod(), responseObserver);
    }

    /**
     */
    default void getPortInfo(com.xpam.grpc.proto.ServiceOuterClass.PortInfoRequest request,
        io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.PortInfoResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetPortInfoMethod(), responseObserver);
    }

    /**
     */
    default void handlePortFailure(com.xpam.grpc.proto.ServiceOuterClass.PortFailureRequest request,
        io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.StatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHandlePortFailureMethod(), responseObserver);
    }

    /**
     */
    default void checkUserByCookies(com.xpam.grpc.proto.ServiceOuterClass.CookiesRequest request,
        io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.UserResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCheckUserByCookiesMethod(), responseObserver);
    }

    /**
     */
    default void recordSessionLifecycleLog(com.xpam.grpc.proto.ServiceOuterClass.SessionLifecycleLogRequest request,
        io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.StatusResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRecordSessionLifecycleLogMethod(), responseObserver);
    }

    /**
     */
    default void faceRecognitionCallback(com.xpam.grpc.proto.ServiceOuterClass.FaceRecognitionCallbackRequest request,
        io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.FaceRecognitionCallbackResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFaceRecognitionCallbackMethod(), responseObserver);
    }

    /**
     */
    default void faceMonitorCallback(com.xpam.grpc.proto.ServiceOuterClass.FaceMonitorCallbackRequest request,
        io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.FaceMonitorCallbackResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFaceMonitorCallbackMethod(), responseObserver);
    }

    /**
     */
    default void joinFaceMonitor(com.xpam.grpc.proto.ServiceOuterClass.JoinFaceMonitorRequest request,
        io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.JoinFaceMonitorResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getJoinFaceMonitorMethod(), responseObserver);
    }

    /**
     */
    default void getAccountChat(com.xpam.grpc.proto.ServiceOuterClass.Empty request,
        io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.AccountDetailResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGetAccountChatMethod(), responseObserver);
    }

    /**
     */
    default void callAPI(com.xpam.grpc.proto.ServiceOuterClass.HTTPRequest request,
        io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.HTTPResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getCallAPIMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service Service.
   */
  public static abstract class ServiceImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return ServiceGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service Service.
   */
  public static final class ServiceStub
      extends io.grpc.stub.AbstractAsyncStub<ServiceStub> {
    private ServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServiceStub(channel, callOptions);
    }

    /**
     */
    public void getTokenAuthInfo(com.xpam.grpc.proto.ServiceOuterClass.TokenRequest request,
        io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.TokenResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetTokenAuthInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void renewToken(com.xpam.grpc.proto.ServiceOuterClass.TokenRequest request,
        io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.StatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRenewTokenMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createSession(com.xpam.grpc.proto.ServiceOuterClass.SessionCreateRequest request,
        io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.SessionCreateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void finishSession(com.xpam.grpc.proto.ServiceOuterClass.SessionFinishRequest request,
        io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.SessionFinishResp> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFinishSessionMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void uploadReplayFile(com.xpam.grpc.proto.ServiceOuterClass.ReplayRequest request,
        io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.ReplayResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUploadReplayFileMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void uploadCommand(com.xpam.grpc.proto.ServiceOuterClass.CommandRequest request,
        io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.CommandResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getUploadCommandMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.FinishedTaskRequest> dispatchTask(
        io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.TaskResponse> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getDispatchTaskMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public void scanRemainReplays(com.xpam.grpc.proto.ServiceOuterClass.RemainReplayRequest request,
        io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.RemainReplayResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getScanRemainReplaysMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createCommandTicket(com.xpam.grpc.proto.ServiceOuterClass.CommandConfirmRequest request,
        io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.CommandConfirmResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateCommandTicketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void checkOrCreateAssetLoginTicket(com.xpam.grpc.proto.ServiceOuterClass.AssetLoginTicketRequest request,
        io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.AssetLoginTicketResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCheckOrCreateAssetLoginTicketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void checkTicketState(com.xpam.grpc.proto.ServiceOuterClass.TicketRequest request,
        io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.TicketStateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCheckTicketStateMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void cancelTicket(com.xpam.grpc.proto.ServiceOuterClass.TicketRequest request,
        io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.StatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCancelTicketMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void createForward(com.xpam.grpc.proto.ServiceOuterClass.ForwardRequest request,
        io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.ForwardResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCreateForwardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void deleteForward(com.xpam.grpc.proto.ServiceOuterClass.ForwardDeleteRequest request,
        io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.StatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getDeleteForwardMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPublicSetting(com.xpam.grpc.proto.ServiceOuterClass.Empty request,
        io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.PublicSettingResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPublicSettingMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getListenPorts(com.xpam.grpc.proto.ServiceOuterClass.Empty request,
        io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.ListenPortResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetListenPortsMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getPortInfo(com.xpam.grpc.proto.ServiceOuterClass.PortInfoRequest request,
        io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.PortInfoResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetPortInfoMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void handlePortFailure(com.xpam.grpc.proto.ServiceOuterClass.PortFailureRequest request,
        io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.StatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHandlePortFailureMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void checkUserByCookies(com.xpam.grpc.proto.ServiceOuterClass.CookiesRequest request,
        io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.UserResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCheckUserByCookiesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void recordSessionLifecycleLog(com.xpam.grpc.proto.ServiceOuterClass.SessionLifecycleLogRequest request,
        io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.StatusResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRecordSessionLifecycleLogMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void faceRecognitionCallback(com.xpam.grpc.proto.ServiceOuterClass.FaceRecognitionCallbackRequest request,
        io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.FaceRecognitionCallbackResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFaceRecognitionCallbackMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void faceMonitorCallback(com.xpam.grpc.proto.ServiceOuterClass.FaceMonitorCallbackRequest request,
        io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.FaceMonitorCallbackResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFaceMonitorCallbackMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void joinFaceMonitor(com.xpam.grpc.proto.ServiceOuterClass.JoinFaceMonitorRequest request,
        io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.JoinFaceMonitorResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getJoinFaceMonitorMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getAccountChat(com.xpam.grpc.proto.ServiceOuterClass.Empty request,
        io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.AccountDetailResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGetAccountChatMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void callAPI(com.xpam.grpc.proto.ServiceOuterClass.HTTPRequest request,
        io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.HTTPResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getCallAPIMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service Service.
   */
  public static final class ServiceBlockingV2Stub
      extends io.grpc.stub.AbstractBlockingStub<ServiceBlockingV2Stub> {
    private ServiceBlockingV2Stub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceBlockingV2Stub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServiceBlockingV2Stub(channel, callOptions);
    }

    /**
     */
    public com.xpam.grpc.proto.ServiceOuterClass.TokenResponse getTokenAuthInfo(com.xpam.grpc.proto.ServiceOuterClass.TokenRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetTokenAuthInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xpam.grpc.proto.ServiceOuterClass.StatusResponse renewToken(com.xpam.grpc.proto.ServiceOuterClass.TokenRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getRenewTokenMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xpam.grpc.proto.ServiceOuterClass.SessionCreateResponse createSession(com.xpam.grpc.proto.ServiceOuterClass.SessionCreateRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCreateSessionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xpam.grpc.proto.ServiceOuterClass.SessionFinishResp finishSession(com.xpam.grpc.proto.ServiceOuterClass.SessionFinishRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getFinishSessionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xpam.grpc.proto.ServiceOuterClass.ReplayResponse uploadReplayFile(com.xpam.grpc.proto.ServiceOuterClass.ReplayRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getUploadReplayFileMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xpam.grpc.proto.ServiceOuterClass.CommandResponse uploadCommand(com.xpam.grpc.proto.ServiceOuterClass.CommandRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getUploadCommandMethod(), getCallOptions(), request);
    }

    /**
     */
    @io.grpc.ExperimentalApi("https://github.com/grpc/grpc-java/issues/10918")
    public io.grpc.stub.BlockingClientCall<com.xpam.grpc.proto.ServiceOuterClass.FinishedTaskRequest, com.xpam.grpc.proto.ServiceOuterClass.TaskResponse>
        dispatchTask() {
      return io.grpc.stub.ClientCalls.blockingBidiStreamingCall(
          getChannel(), getDispatchTaskMethod(), getCallOptions());
    }

    /**
     */
    public com.xpam.grpc.proto.ServiceOuterClass.RemainReplayResponse scanRemainReplays(com.xpam.grpc.proto.ServiceOuterClass.RemainReplayRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getScanRemainReplaysMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xpam.grpc.proto.ServiceOuterClass.CommandConfirmResponse createCommandTicket(com.xpam.grpc.proto.ServiceOuterClass.CommandConfirmRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCreateCommandTicketMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xpam.grpc.proto.ServiceOuterClass.AssetLoginTicketResponse checkOrCreateAssetLoginTicket(com.xpam.grpc.proto.ServiceOuterClass.AssetLoginTicketRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCheckOrCreateAssetLoginTicketMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xpam.grpc.proto.ServiceOuterClass.TicketStateResponse checkTicketState(com.xpam.grpc.proto.ServiceOuterClass.TicketRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCheckTicketStateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xpam.grpc.proto.ServiceOuterClass.StatusResponse cancelTicket(com.xpam.grpc.proto.ServiceOuterClass.TicketRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCancelTicketMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xpam.grpc.proto.ServiceOuterClass.ForwardResponse createForward(com.xpam.grpc.proto.ServiceOuterClass.ForwardRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCreateForwardMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xpam.grpc.proto.ServiceOuterClass.StatusResponse deleteForward(com.xpam.grpc.proto.ServiceOuterClass.ForwardDeleteRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getDeleteForwardMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xpam.grpc.proto.ServiceOuterClass.PublicSettingResponse getPublicSetting(com.xpam.grpc.proto.ServiceOuterClass.Empty request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetPublicSettingMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xpam.grpc.proto.ServiceOuterClass.ListenPortResponse getListenPorts(com.xpam.grpc.proto.ServiceOuterClass.Empty request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetListenPortsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xpam.grpc.proto.ServiceOuterClass.PortInfoResponse getPortInfo(com.xpam.grpc.proto.ServiceOuterClass.PortInfoRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetPortInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xpam.grpc.proto.ServiceOuterClass.StatusResponse handlePortFailure(com.xpam.grpc.proto.ServiceOuterClass.PortFailureRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getHandlePortFailureMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xpam.grpc.proto.ServiceOuterClass.UserResponse checkUserByCookies(com.xpam.grpc.proto.ServiceOuterClass.CookiesRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCheckUserByCookiesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xpam.grpc.proto.ServiceOuterClass.StatusResponse recordSessionLifecycleLog(com.xpam.grpc.proto.ServiceOuterClass.SessionLifecycleLogRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getRecordSessionLifecycleLogMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xpam.grpc.proto.ServiceOuterClass.FaceRecognitionCallbackResponse faceRecognitionCallback(com.xpam.grpc.proto.ServiceOuterClass.FaceRecognitionCallbackRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getFaceRecognitionCallbackMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xpam.grpc.proto.ServiceOuterClass.FaceMonitorCallbackResponse faceMonitorCallback(com.xpam.grpc.proto.ServiceOuterClass.FaceMonitorCallbackRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getFaceMonitorCallbackMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xpam.grpc.proto.ServiceOuterClass.JoinFaceMonitorResponse joinFaceMonitor(com.xpam.grpc.proto.ServiceOuterClass.JoinFaceMonitorRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getJoinFaceMonitorMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xpam.grpc.proto.ServiceOuterClass.AccountDetailResponse getAccountChat(com.xpam.grpc.proto.ServiceOuterClass.Empty request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getGetAccountChatMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xpam.grpc.proto.ServiceOuterClass.HTTPResponse callAPI(com.xpam.grpc.proto.ServiceOuterClass.HTTPRequest request) throws io.grpc.StatusException {
      return io.grpc.stub.ClientCalls.blockingV2UnaryCall(
          getChannel(), getCallAPIMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do limited synchronous rpc calls to service Service.
   */
  public static final class ServiceBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<ServiceBlockingStub> {
    private ServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public com.xpam.grpc.proto.ServiceOuterClass.TokenResponse getTokenAuthInfo(com.xpam.grpc.proto.ServiceOuterClass.TokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetTokenAuthInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xpam.grpc.proto.ServiceOuterClass.StatusResponse renewToken(com.xpam.grpc.proto.ServiceOuterClass.TokenRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRenewTokenMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xpam.grpc.proto.ServiceOuterClass.SessionCreateResponse createSession(com.xpam.grpc.proto.ServiceOuterClass.SessionCreateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateSessionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xpam.grpc.proto.ServiceOuterClass.SessionFinishResp finishSession(com.xpam.grpc.proto.ServiceOuterClass.SessionFinishRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFinishSessionMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xpam.grpc.proto.ServiceOuterClass.ReplayResponse uploadReplayFile(com.xpam.grpc.proto.ServiceOuterClass.ReplayRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUploadReplayFileMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xpam.grpc.proto.ServiceOuterClass.CommandResponse uploadCommand(com.xpam.grpc.proto.ServiceOuterClass.CommandRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getUploadCommandMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xpam.grpc.proto.ServiceOuterClass.RemainReplayResponse scanRemainReplays(com.xpam.grpc.proto.ServiceOuterClass.RemainReplayRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getScanRemainReplaysMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xpam.grpc.proto.ServiceOuterClass.CommandConfirmResponse createCommandTicket(com.xpam.grpc.proto.ServiceOuterClass.CommandConfirmRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateCommandTicketMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xpam.grpc.proto.ServiceOuterClass.AssetLoginTicketResponse checkOrCreateAssetLoginTicket(com.xpam.grpc.proto.ServiceOuterClass.AssetLoginTicketRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckOrCreateAssetLoginTicketMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xpam.grpc.proto.ServiceOuterClass.TicketStateResponse checkTicketState(com.xpam.grpc.proto.ServiceOuterClass.TicketRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckTicketStateMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xpam.grpc.proto.ServiceOuterClass.StatusResponse cancelTicket(com.xpam.grpc.proto.ServiceOuterClass.TicketRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCancelTicketMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xpam.grpc.proto.ServiceOuterClass.ForwardResponse createForward(com.xpam.grpc.proto.ServiceOuterClass.ForwardRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCreateForwardMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xpam.grpc.proto.ServiceOuterClass.StatusResponse deleteForward(com.xpam.grpc.proto.ServiceOuterClass.ForwardDeleteRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getDeleteForwardMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xpam.grpc.proto.ServiceOuterClass.PublicSettingResponse getPublicSetting(com.xpam.grpc.proto.ServiceOuterClass.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPublicSettingMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xpam.grpc.proto.ServiceOuterClass.ListenPortResponse getListenPorts(com.xpam.grpc.proto.ServiceOuterClass.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetListenPortsMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xpam.grpc.proto.ServiceOuterClass.PortInfoResponse getPortInfo(com.xpam.grpc.proto.ServiceOuterClass.PortInfoRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetPortInfoMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xpam.grpc.proto.ServiceOuterClass.StatusResponse handlePortFailure(com.xpam.grpc.proto.ServiceOuterClass.PortFailureRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHandlePortFailureMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xpam.grpc.proto.ServiceOuterClass.UserResponse checkUserByCookies(com.xpam.grpc.proto.ServiceOuterClass.CookiesRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCheckUserByCookiesMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xpam.grpc.proto.ServiceOuterClass.StatusResponse recordSessionLifecycleLog(com.xpam.grpc.proto.ServiceOuterClass.SessionLifecycleLogRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRecordSessionLifecycleLogMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xpam.grpc.proto.ServiceOuterClass.FaceRecognitionCallbackResponse faceRecognitionCallback(com.xpam.grpc.proto.ServiceOuterClass.FaceRecognitionCallbackRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFaceRecognitionCallbackMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xpam.grpc.proto.ServiceOuterClass.FaceMonitorCallbackResponse faceMonitorCallback(com.xpam.grpc.proto.ServiceOuterClass.FaceMonitorCallbackRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFaceMonitorCallbackMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xpam.grpc.proto.ServiceOuterClass.JoinFaceMonitorResponse joinFaceMonitor(com.xpam.grpc.proto.ServiceOuterClass.JoinFaceMonitorRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getJoinFaceMonitorMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xpam.grpc.proto.ServiceOuterClass.AccountDetailResponse getAccountChat(com.xpam.grpc.proto.ServiceOuterClass.Empty request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGetAccountChatMethod(), getCallOptions(), request);
    }

    /**
     */
    public com.xpam.grpc.proto.ServiceOuterClass.HTTPResponse callAPI(com.xpam.grpc.proto.ServiceOuterClass.HTTPRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getCallAPIMethod(), getCallOptions(), request);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service Service.
   */
  public static final class ServiceFutureStub
      extends io.grpc.stub.AbstractFutureStub<ServiceFutureStub> {
    private ServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new ServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xpam.grpc.proto.ServiceOuterClass.TokenResponse> getTokenAuthInfo(
        com.xpam.grpc.proto.ServiceOuterClass.TokenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetTokenAuthInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xpam.grpc.proto.ServiceOuterClass.StatusResponse> renewToken(
        com.xpam.grpc.proto.ServiceOuterClass.TokenRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRenewTokenMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xpam.grpc.proto.ServiceOuterClass.SessionCreateResponse> createSession(
        com.xpam.grpc.proto.ServiceOuterClass.SessionCreateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateSessionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xpam.grpc.proto.ServiceOuterClass.SessionFinishResp> finishSession(
        com.xpam.grpc.proto.ServiceOuterClass.SessionFinishRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFinishSessionMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xpam.grpc.proto.ServiceOuterClass.ReplayResponse> uploadReplayFile(
        com.xpam.grpc.proto.ServiceOuterClass.ReplayRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUploadReplayFileMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xpam.grpc.proto.ServiceOuterClass.CommandResponse> uploadCommand(
        com.xpam.grpc.proto.ServiceOuterClass.CommandRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getUploadCommandMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xpam.grpc.proto.ServiceOuterClass.RemainReplayResponse> scanRemainReplays(
        com.xpam.grpc.proto.ServiceOuterClass.RemainReplayRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getScanRemainReplaysMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xpam.grpc.proto.ServiceOuterClass.CommandConfirmResponse> createCommandTicket(
        com.xpam.grpc.proto.ServiceOuterClass.CommandConfirmRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateCommandTicketMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xpam.grpc.proto.ServiceOuterClass.AssetLoginTicketResponse> checkOrCreateAssetLoginTicket(
        com.xpam.grpc.proto.ServiceOuterClass.AssetLoginTicketRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCheckOrCreateAssetLoginTicketMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xpam.grpc.proto.ServiceOuterClass.TicketStateResponse> checkTicketState(
        com.xpam.grpc.proto.ServiceOuterClass.TicketRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCheckTicketStateMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xpam.grpc.proto.ServiceOuterClass.StatusResponse> cancelTicket(
        com.xpam.grpc.proto.ServiceOuterClass.TicketRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCancelTicketMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xpam.grpc.proto.ServiceOuterClass.ForwardResponse> createForward(
        com.xpam.grpc.proto.ServiceOuterClass.ForwardRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCreateForwardMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xpam.grpc.proto.ServiceOuterClass.StatusResponse> deleteForward(
        com.xpam.grpc.proto.ServiceOuterClass.ForwardDeleteRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getDeleteForwardMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xpam.grpc.proto.ServiceOuterClass.PublicSettingResponse> getPublicSetting(
        com.xpam.grpc.proto.ServiceOuterClass.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPublicSettingMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xpam.grpc.proto.ServiceOuterClass.ListenPortResponse> getListenPorts(
        com.xpam.grpc.proto.ServiceOuterClass.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetListenPortsMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xpam.grpc.proto.ServiceOuterClass.PortInfoResponse> getPortInfo(
        com.xpam.grpc.proto.ServiceOuterClass.PortInfoRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetPortInfoMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xpam.grpc.proto.ServiceOuterClass.StatusResponse> handlePortFailure(
        com.xpam.grpc.proto.ServiceOuterClass.PortFailureRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHandlePortFailureMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xpam.grpc.proto.ServiceOuterClass.UserResponse> checkUserByCookies(
        com.xpam.grpc.proto.ServiceOuterClass.CookiesRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCheckUserByCookiesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xpam.grpc.proto.ServiceOuterClass.StatusResponse> recordSessionLifecycleLog(
        com.xpam.grpc.proto.ServiceOuterClass.SessionLifecycleLogRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRecordSessionLifecycleLogMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xpam.grpc.proto.ServiceOuterClass.FaceRecognitionCallbackResponse> faceRecognitionCallback(
        com.xpam.grpc.proto.ServiceOuterClass.FaceRecognitionCallbackRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFaceRecognitionCallbackMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xpam.grpc.proto.ServiceOuterClass.FaceMonitorCallbackResponse> faceMonitorCallback(
        com.xpam.grpc.proto.ServiceOuterClass.FaceMonitorCallbackRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFaceMonitorCallbackMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xpam.grpc.proto.ServiceOuterClass.JoinFaceMonitorResponse> joinFaceMonitor(
        com.xpam.grpc.proto.ServiceOuterClass.JoinFaceMonitorRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getJoinFaceMonitorMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xpam.grpc.proto.ServiceOuterClass.AccountDetailResponse> getAccountChat(
        com.xpam.grpc.proto.ServiceOuterClass.Empty request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGetAccountChatMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<com.xpam.grpc.proto.ServiceOuterClass.HTTPResponse> callAPI(
        com.xpam.grpc.proto.ServiceOuterClass.HTTPRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getCallAPIMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_TOKEN_AUTH_INFO = 0;
  private static final int METHODID_RENEW_TOKEN = 1;
  private static final int METHODID_CREATE_SESSION = 2;
  private static final int METHODID_FINISH_SESSION = 3;
  private static final int METHODID_UPLOAD_REPLAY_FILE = 4;
  private static final int METHODID_UPLOAD_COMMAND = 5;
  private static final int METHODID_SCAN_REMAIN_REPLAYS = 6;
  private static final int METHODID_CREATE_COMMAND_TICKET = 7;
  private static final int METHODID_CHECK_OR_CREATE_ASSET_LOGIN_TICKET = 8;
  private static final int METHODID_CHECK_TICKET_STATE = 9;
  private static final int METHODID_CANCEL_TICKET = 10;
  private static final int METHODID_CREATE_FORWARD = 11;
  private static final int METHODID_DELETE_FORWARD = 12;
  private static final int METHODID_GET_PUBLIC_SETTING = 13;
  private static final int METHODID_GET_LISTEN_PORTS = 14;
  private static final int METHODID_GET_PORT_INFO = 15;
  private static final int METHODID_HANDLE_PORT_FAILURE = 16;
  private static final int METHODID_CHECK_USER_BY_COOKIES = 17;
  private static final int METHODID_RECORD_SESSION_LIFECYCLE_LOG = 18;
  private static final int METHODID_FACE_RECOGNITION_CALLBACK = 19;
  private static final int METHODID_FACE_MONITOR_CALLBACK = 20;
  private static final int METHODID_JOIN_FACE_MONITOR = 21;
  private static final int METHODID_GET_ACCOUNT_CHAT = 22;
  private static final int METHODID_CALL_API = 23;
  private static final int METHODID_DISPATCH_TASK = 24;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_TOKEN_AUTH_INFO:
          serviceImpl.getTokenAuthInfo((com.xpam.grpc.proto.ServiceOuterClass.TokenRequest) request,
              (io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.TokenResponse>) responseObserver);
          break;
        case METHODID_RENEW_TOKEN:
          serviceImpl.renewToken((com.xpam.grpc.proto.ServiceOuterClass.TokenRequest) request,
              (io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.StatusResponse>) responseObserver);
          break;
        case METHODID_CREATE_SESSION:
          serviceImpl.createSession((com.xpam.grpc.proto.ServiceOuterClass.SessionCreateRequest) request,
              (io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.SessionCreateResponse>) responseObserver);
          break;
        case METHODID_FINISH_SESSION:
          serviceImpl.finishSession((com.xpam.grpc.proto.ServiceOuterClass.SessionFinishRequest) request,
              (io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.SessionFinishResp>) responseObserver);
          break;
        case METHODID_UPLOAD_REPLAY_FILE:
          serviceImpl.uploadReplayFile((com.xpam.grpc.proto.ServiceOuterClass.ReplayRequest) request,
              (io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.ReplayResponse>) responseObserver);
          break;
        case METHODID_UPLOAD_COMMAND:
          serviceImpl.uploadCommand((com.xpam.grpc.proto.ServiceOuterClass.CommandRequest) request,
              (io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.CommandResponse>) responseObserver);
          break;
        case METHODID_SCAN_REMAIN_REPLAYS:
          serviceImpl.scanRemainReplays((com.xpam.grpc.proto.ServiceOuterClass.RemainReplayRequest) request,
              (io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.RemainReplayResponse>) responseObserver);
          break;
        case METHODID_CREATE_COMMAND_TICKET:
          serviceImpl.createCommandTicket((com.xpam.grpc.proto.ServiceOuterClass.CommandConfirmRequest) request,
              (io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.CommandConfirmResponse>) responseObserver);
          break;
        case METHODID_CHECK_OR_CREATE_ASSET_LOGIN_TICKET:
          serviceImpl.checkOrCreateAssetLoginTicket((com.xpam.grpc.proto.ServiceOuterClass.AssetLoginTicketRequest) request,
              (io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.AssetLoginTicketResponse>) responseObserver);
          break;
        case METHODID_CHECK_TICKET_STATE:
          serviceImpl.checkTicketState((com.xpam.grpc.proto.ServiceOuterClass.TicketRequest) request,
              (io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.TicketStateResponse>) responseObserver);
          break;
        case METHODID_CANCEL_TICKET:
          serviceImpl.cancelTicket((com.xpam.grpc.proto.ServiceOuterClass.TicketRequest) request,
              (io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.StatusResponse>) responseObserver);
          break;
        case METHODID_CREATE_FORWARD:
          serviceImpl.createForward((com.xpam.grpc.proto.ServiceOuterClass.ForwardRequest) request,
              (io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.ForwardResponse>) responseObserver);
          break;
        case METHODID_DELETE_FORWARD:
          serviceImpl.deleteForward((com.xpam.grpc.proto.ServiceOuterClass.ForwardDeleteRequest) request,
              (io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.StatusResponse>) responseObserver);
          break;
        case METHODID_GET_PUBLIC_SETTING:
          serviceImpl.getPublicSetting((com.xpam.grpc.proto.ServiceOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.PublicSettingResponse>) responseObserver);
          break;
        case METHODID_GET_LISTEN_PORTS:
          serviceImpl.getListenPorts((com.xpam.grpc.proto.ServiceOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.ListenPortResponse>) responseObserver);
          break;
        case METHODID_GET_PORT_INFO:
          serviceImpl.getPortInfo((com.xpam.grpc.proto.ServiceOuterClass.PortInfoRequest) request,
              (io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.PortInfoResponse>) responseObserver);
          break;
        case METHODID_HANDLE_PORT_FAILURE:
          serviceImpl.handlePortFailure((com.xpam.grpc.proto.ServiceOuterClass.PortFailureRequest) request,
              (io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.StatusResponse>) responseObserver);
          break;
        case METHODID_CHECK_USER_BY_COOKIES:
          serviceImpl.checkUserByCookies((com.xpam.grpc.proto.ServiceOuterClass.CookiesRequest) request,
              (io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.UserResponse>) responseObserver);
          break;
        case METHODID_RECORD_SESSION_LIFECYCLE_LOG:
          serviceImpl.recordSessionLifecycleLog((com.xpam.grpc.proto.ServiceOuterClass.SessionLifecycleLogRequest) request,
              (io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.StatusResponse>) responseObserver);
          break;
        case METHODID_FACE_RECOGNITION_CALLBACK:
          serviceImpl.faceRecognitionCallback((com.xpam.grpc.proto.ServiceOuterClass.FaceRecognitionCallbackRequest) request,
              (io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.FaceRecognitionCallbackResponse>) responseObserver);
          break;
        case METHODID_FACE_MONITOR_CALLBACK:
          serviceImpl.faceMonitorCallback((com.xpam.grpc.proto.ServiceOuterClass.FaceMonitorCallbackRequest) request,
              (io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.FaceMonitorCallbackResponse>) responseObserver);
          break;
        case METHODID_JOIN_FACE_MONITOR:
          serviceImpl.joinFaceMonitor((com.xpam.grpc.proto.ServiceOuterClass.JoinFaceMonitorRequest) request,
              (io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.JoinFaceMonitorResponse>) responseObserver);
          break;
        case METHODID_GET_ACCOUNT_CHAT:
          serviceImpl.getAccountChat((com.xpam.grpc.proto.ServiceOuterClass.Empty) request,
              (io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.AccountDetailResponse>) responseObserver);
          break;
        case METHODID_CALL_API:
          serviceImpl.callAPI((com.xpam.grpc.proto.ServiceOuterClass.HTTPRequest) request,
              (io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.HTTPResponse>) responseObserver);
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
        case METHODID_DISPATCH_TASK:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.dispatchTask(
              (io.grpc.stub.StreamObserver<com.xpam.grpc.proto.ServiceOuterClass.TaskResponse>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getGetTokenAuthInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.xpam.grpc.proto.ServiceOuterClass.TokenRequest,
              com.xpam.grpc.proto.ServiceOuterClass.TokenResponse>(
                service, METHODID_GET_TOKEN_AUTH_INFO)))
        .addMethod(
          getRenewTokenMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.xpam.grpc.proto.ServiceOuterClass.TokenRequest,
              com.xpam.grpc.proto.ServiceOuterClass.StatusResponse>(
                service, METHODID_RENEW_TOKEN)))
        .addMethod(
          getCreateSessionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.xpam.grpc.proto.ServiceOuterClass.SessionCreateRequest,
              com.xpam.grpc.proto.ServiceOuterClass.SessionCreateResponse>(
                service, METHODID_CREATE_SESSION)))
        .addMethod(
          getFinishSessionMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.xpam.grpc.proto.ServiceOuterClass.SessionFinishRequest,
              com.xpam.grpc.proto.ServiceOuterClass.SessionFinishResp>(
                service, METHODID_FINISH_SESSION)))
        .addMethod(
          getUploadReplayFileMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.xpam.grpc.proto.ServiceOuterClass.ReplayRequest,
              com.xpam.grpc.proto.ServiceOuterClass.ReplayResponse>(
                service, METHODID_UPLOAD_REPLAY_FILE)))
        .addMethod(
          getUploadCommandMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.xpam.grpc.proto.ServiceOuterClass.CommandRequest,
              com.xpam.grpc.proto.ServiceOuterClass.CommandResponse>(
                service, METHODID_UPLOAD_COMMAND)))
        .addMethod(
          getDispatchTaskMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              com.xpam.grpc.proto.ServiceOuterClass.FinishedTaskRequest,
              com.xpam.grpc.proto.ServiceOuterClass.TaskResponse>(
                service, METHODID_DISPATCH_TASK)))
        .addMethod(
          getScanRemainReplaysMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.xpam.grpc.proto.ServiceOuterClass.RemainReplayRequest,
              com.xpam.grpc.proto.ServiceOuterClass.RemainReplayResponse>(
                service, METHODID_SCAN_REMAIN_REPLAYS)))
        .addMethod(
          getCreateCommandTicketMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.xpam.grpc.proto.ServiceOuterClass.CommandConfirmRequest,
              com.xpam.grpc.proto.ServiceOuterClass.CommandConfirmResponse>(
                service, METHODID_CREATE_COMMAND_TICKET)))
        .addMethod(
          getCheckOrCreateAssetLoginTicketMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.xpam.grpc.proto.ServiceOuterClass.AssetLoginTicketRequest,
              com.xpam.grpc.proto.ServiceOuterClass.AssetLoginTicketResponse>(
                service, METHODID_CHECK_OR_CREATE_ASSET_LOGIN_TICKET)))
        .addMethod(
          getCheckTicketStateMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.xpam.grpc.proto.ServiceOuterClass.TicketRequest,
              com.xpam.grpc.proto.ServiceOuterClass.TicketStateResponse>(
                service, METHODID_CHECK_TICKET_STATE)))
        .addMethod(
          getCancelTicketMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.xpam.grpc.proto.ServiceOuterClass.TicketRequest,
              com.xpam.grpc.proto.ServiceOuterClass.StatusResponse>(
                service, METHODID_CANCEL_TICKET)))
        .addMethod(
          getCreateForwardMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.xpam.grpc.proto.ServiceOuterClass.ForwardRequest,
              com.xpam.grpc.proto.ServiceOuterClass.ForwardResponse>(
                service, METHODID_CREATE_FORWARD)))
        .addMethod(
          getDeleteForwardMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.xpam.grpc.proto.ServiceOuterClass.ForwardDeleteRequest,
              com.xpam.grpc.proto.ServiceOuterClass.StatusResponse>(
                service, METHODID_DELETE_FORWARD)))
        .addMethod(
          getGetPublicSettingMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.xpam.grpc.proto.ServiceOuterClass.Empty,
              com.xpam.grpc.proto.ServiceOuterClass.PublicSettingResponse>(
                service, METHODID_GET_PUBLIC_SETTING)))
        .addMethod(
          getGetListenPortsMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.xpam.grpc.proto.ServiceOuterClass.Empty,
              com.xpam.grpc.proto.ServiceOuterClass.ListenPortResponse>(
                service, METHODID_GET_LISTEN_PORTS)))
        .addMethod(
          getGetPortInfoMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.xpam.grpc.proto.ServiceOuterClass.PortInfoRequest,
              com.xpam.grpc.proto.ServiceOuterClass.PortInfoResponse>(
                service, METHODID_GET_PORT_INFO)))
        .addMethod(
          getHandlePortFailureMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.xpam.grpc.proto.ServiceOuterClass.PortFailureRequest,
              com.xpam.grpc.proto.ServiceOuterClass.StatusResponse>(
                service, METHODID_HANDLE_PORT_FAILURE)))
        .addMethod(
          getCheckUserByCookiesMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.xpam.grpc.proto.ServiceOuterClass.CookiesRequest,
              com.xpam.grpc.proto.ServiceOuterClass.UserResponse>(
                service, METHODID_CHECK_USER_BY_COOKIES)))
        .addMethod(
          getRecordSessionLifecycleLogMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.xpam.grpc.proto.ServiceOuterClass.SessionLifecycleLogRequest,
              com.xpam.grpc.proto.ServiceOuterClass.StatusResponse>(
                service, METHODID_RECORD_SESSION_LIFECYCLE_LOG)))
        .addMethod(
          getFaceRecognitionCallbackMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.xpam.grpc.proto.ServiceOuterClass.FaceRecognitionCallbackRequest,
              com.xpam.grpc.proto.ServiceOuterClass.FaceRecognitionCallbackResponse>(
                service, METHODID_FACE_RECOGNITION_CALLBACK)))
        .addMethod(
          getFaceMonitorCallbackMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.xpam.grpc.proto.ServiceOuterClass.FaceMonitorCallbackRequest,
              com.xpam.grpc.proto.ServiceOuterClass.FaceMonitorCallbackResponse>(
                service, METHODID_FACE_MONITOR_CALLBACK)))
        .addMethod(
          getJoinFaceMonitorMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.xpam.grpc.proto.ServiceOuterClass.JoinFaceMonitorRequest,
              com.xpam.grpc.proto.ServiceOuterClass.JoinFaceMonitorResponse>(
                service, METHODID_JOIN_FACE_MONITOR)))
        .addMethod(
          getGetAccountChatMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.xpam.grpc.proto.ServiceOuterClass.Empty,
              com.xpam.grpc.proto.ServiceOuterClass.AccountDetailResponse>(
                service, METHODID_GET_ACCOUNT_CHAT)))
        .addMethod(
          getCallAPIMethod(),
          io.grpc.stub.ServerCalls.asyncUnaryCall(
            new MethodHandlers<
              com.xpam.grpc.proto.ServiceOuterClass.HTTPRequest,
              com.xpam.grpc.proto.ServiceOuterClass.HTTPResponse>(
                service, METHODID_CALL_API)))
        .build();
  }

  private static abstract class ServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    ServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return com.xpam.grpc.proto.ServiceOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Service");
    }
  }

  private static final class ServiceFileDescriptorSupplier
      extends ServiceBaseDescriptorSupplier {
    ServiceFileDescriptorSupplier() {}
  }

  private static final class ServiceMethodDescriptorSupplier
      extends ServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final java.lang.String methodName;

    ServiceMethodDescriptorSupplier(java.lang.String methodName) {
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
      synchronized (ServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new ServiceFileDescriptorSupplier())
              .addMethod(getGetTokenAuthInfoMethod())
              .addMethod(getRenewTokenMethod())
              .addMethod(getCreateSessionMethod())
              .addMethod(getFinishSessionMethod())
              .addMethod(getUploadReplayFileMethod())
              .addMethod(getUploadCommandMethod())
              .addMethod(getDispatchTaskMethod())
              .addMethod(getScanRemainReplaysMethod())
              .addMethod(getCreateCommandTicketMethod())
              .addMethod(getCheckOrCreateAssetLoginTicketMethod())
              .addMethod(getCheckTicketStateMethod())
              .addMethod(getCancelTicketMethod())
              .addMethod(getCreateForwardMethod())
              .addMethod(getDeleteForwardMethod())
              .addMethod(getGetPublicSettingMethod())
              .addMethod(getGetListenPortsMethod())
              .addMethod(getGetPortInfoMethod())
              .addMethod(getHandlePortFailureMethod())
              .addMethod(getCheckUserByCookiesMethod())
              .addMethod(getRecordSessionLifecycleLogMethod())
              .addMethod(getFaceRecognitionCallbackMethod())
              .addMethod(getFaceMonitorCallbackMethod())
              .addMethod(getJoinFaceMonitorMethod())
              .addMethod(getGetAccountChatMethod())
              .addMethod(getCallAPIMethod())
              .build();
        }
      }
    }
    return result;
  }
}
