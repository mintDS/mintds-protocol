package com.arturmkrtchyan.mintds.protocol.response;

public interface Response {

    static Response fromString(final String msg) {
        return EnumResponse.fromString(msg)
                .orElse(NumericResponse.fromString(msg)
                        .orElse(new FailureResponse(msg)));
    }


}
