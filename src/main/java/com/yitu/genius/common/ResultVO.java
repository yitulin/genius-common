package com.yitu.genius.common;

/**
 * @Author: ⚡
 * @Description:
 * @Date: Created in 2020-09-07 下午 07:09
 * Modified By:
 */
public class ResultVO<T> {

    private boolean success;
    private T data;
    private String errorMessage;

    public ResultVO(T data) {
        this.data = data;
        this.success=true;
    }

    public ResultVO(String errorMessage) {
        this.errorMessage = errorMessage;
        this.success=false;
    }

    public static <T> ResultVO<T> success(T data){
        return new ResultVO<T>(data);
    }

    public static <T> ResultVO<T> fail(String errorMessage){
        return new ResultVO<T>(errorMessage);
    }

}
