package com.yitu.genius.common;

import lombok.Data;

/**
 * @Author: ⚡
 * @Description:
 * @Date: Created in 2020-09-07 下午 07:09
 * Modified By:
 */
@Data
public class ResultDTO<T> {

    private boolean success;
    private T data;
    private String errorMessage;

    public ResultDTO(T data) {
        this.data = data;
        this.success=true;
    }

    public ResultDTO(String errorMessage) {
        this.errorMessage = errorMessage;
        this.success=false;
    }

    public static <T> ResultDTO<T> success(T data){
        return new ResultDTO<T>(data);
    }

    public static <T> ResultDTO<T> fail(String errorMessage){
        return new ResultDTO<T>(errorMessage);
    }

}
