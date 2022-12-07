package com.ctseducare.inss.exception.decoder;

import java.io.IOException;
import java.io.InputStream;

import com.ctseducare.inss.exception.ResourceNotFoundException;
import com.ctseducare.inss.exception.response.ExceptionResponse;
import com.fasterxml.jackson.databind.ObjectMapper;

import feign.Response;
import feign.codec.ErrorDecoder;

public class FeignExceptionDecoder implements ErrorDecoder {
    private ErrorDecoder errorDecoder = new Default();

    @Override
    public Exception decode(String methodKey, Response response) {
        ExceptionResponse message = null;
        try (InputStream bodyIs = response.body().asInputStream()) {
            ObjectMapper mapper = new ObjectMapper();
            message = mapper.readValue(bodyIs, ExceptionResponse.class);
        } catch (IOException e) {
            return new Exception(e.getMessage());
        }
        switch (response.status()) {
            case 404:
                return new ResourceNotFoundException(message.getReason() != null ? message.getReason() : "Not found");
            default:
                return errorDecoder.decode(methodKey, response);
        }
    }
}
