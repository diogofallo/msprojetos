package com.msprojetos.responses;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class DResponse<T> {

    private Integer codigoRetorno;
    private String mensagem;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private T conteudo;

    public static <T> DResponse<T> customizedReturn(T data, String message, Integer codigoRetorno){
        return new DResponse<>(codigoRetorno , message, data);
    }

    public static <T> DResponse<T> customizedReturn(String message, Integer codigoRetorno){
        return new DResponse<>(codigoRetorno , message, null);
    }

    public static <T> DResponse<T> ok(T data ,String message){
        return new DResponse<>(0 , message, data);
    }

    public static <T> DResponse<T> notOk(String message){
        return new DResponse<>(1 , message, null);
    }

    public static <T> DResponse<T> notOk(Integer codigo, String message){
        if(null == codigo){
            notOk(message);
        }
        return new DResponse<>(codigo , message, null);
    }
}
