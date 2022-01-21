package com.example.demo.result;

import lombok.experimental.UtilityClass;
import org.springframework.lang.Nullable;

import java.util.Optional;

/**
 * @author maqiang
 * @date 2021/12/31  15:08
 */
@UtilityClass
public class Results {
    /**
     * 判断返回是否为成功
     *
     * @param result Result
     * @return 是否成功
     */
    public static boolean isSuccess(@Nullable Result<?> result) {
        return Optional.ofNullable(result)
                .map(Result::isSuccess)
                .orElse(Boolean.FALSE);
    }

    /**
     * 判断返回是否为不成功
     *
     * @param result Result
     * @return 是否成功
     */
    public static boolean isNotSuccess(@Nullable Result<?> result) {
        return !Results.isSuccess(result);
    }

    /**
     * 获取data
     * @param result Result
     * @param <T> 泛型标记
     * @return 泛型对象
     */
    @Nullable
    public static <T> T getData(@Nullable Result<T> result) {
        return Optional.ofNullable(result)
                .filter(Result::isSuccess)
                .map(Result::getData)
                .orElse(null);
    }

    /**
     * 返回成功
     * @param <T> 泛型标记
     * @return Result
     */
    public static <T> Result<T> success() {
        return result(SystemCode.SYSTEM_SUCCESS, SystemCode.SYSTEM_SUCCESS.getDesc(), null);
    }

    /**
     * 返回成功
     * @param <T> 泛型标记
     * @param msg 自定义成功消息
     * @return Result
     */
    public static <T> Result<T> successAndMsg(String msg) {
        return result(SystemCode.SYSTEM_SUCCESS, msg, null);
    }

    /**
     * 成功-携带数据
     *
     * @param data 数据
     * @param <T> 泛型标记
     * @return Result
     */
    public static <T> Result<T> success(@Nullable T data) {
        return result(SystemCode.SYSTEM_SUCCESS, SystemCode.SYSTEM_SUCCESS.getDesc(), data);
    }

    /**
     * 返回成功
     * @param <T> 泛型标记
     * @param msg 自定义成功消息
     * @param data 数据
     * @return Result
     */
    public static <T> Result<T> success(String msg, @Nullable T data) {
        return result(SystemCode.SYSTEM_SUCCESS, msg, data);
    }

    /**
     * 根据状态返回成功或者失败
     * @param status 状态
     * @param sCode 异常code码
     * @param <T> 泛型标记
     * @return Result
     */
    public static <T> Result<T> status(boolean status, IStatusCode sCode) {
        return status ? Results.success() : Results.failure(sCode);
    }

    /**
     * 返回失败信息
     *
     * @param out 结果集
     * @param <T> 泛型标记
     * @return {Result}
     */
    public static <T> Result<T> failure(Result out) {
        Result<T> result = new Result<>();
        result.setCode(out.getCode());
        result.setMsg(out.getMsg());
        result.setSuccess(out.isSuccess());
        return result;
    }

    /**
     * 返回失败信息
     *
     * @param sCode 异常枚举
     * @param msg 失败信息
     * @param <T> 泛型标记
     * @return {Result}
     */
    public static <T> Result<T> failure(IStatusCode sCode, String msg) {
        return result(sCode, msg, null);
    }

    /**
     * 返回失败信息和失败结果
     *
     * @param sCode 异常枚举
     * @param data 数据
     * @param <T> 泛型标记
     * @return {Result}
     */
    public static <T> Result<T> failure(IStatusCode sCode, T data) {
        return result(sCode, sCode.getDesc(), data);
    }

    /**
     * 返回失败信息
     *
     * @param sCode 异常枚举
     * @param <T> 泛型标记
     * @return {Result}
     */
    public static <T> Result<T> failure(IStatusCode sCode) {
        return failure(sCode, sCode.getDesc());
    }

    private static <T> Result<T> result(IStatusCode sCode, String msg, @Nullable T data) {
        Result<T> result = new Result<>();
        result.setSuccess(SystemCode.SYSTEM_SUCCESS == sCode);
        result.setCode(sCode.getCode());
        result.setMsg(msg);
        result.setData(data);
        return result;
    }
}
