package com.example.demo.result;

import io.swagger.annotations.ApiModel;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 系统内置code
 *
 * @author L.cm
 */
@ApiModel(description = "系统内置code")
@Getter
@AllArgsConstructor
public enum SystemCode implements IStatusCode {
    /****************************公共状态码 start ******************/
    SYSTEM_GENERAL_FAIL(SystemCode.SYSTEM_GENERAL_FAIL_CODE, "系统未知异常"),
    SYSTEM_SUCCESS(SystemCode.SYSTEM_SUCCESS_CODE, "成功"),
    SYSTEM_MISS_PARAM(SystemCode.SYSTEM_MISS_PARAM_CODE, "缺少必要的请求参数"),
    SYSTEM_REQ_MALFORMATION(SystemCode.SYSTEM_REQ_MALFORMATION_CODE, "请求参数格式错误"),
    SYSTEM_MISS_SIGN(SystemCode.SYSTEM_MISS_SIGN_CODE, "缺少签名_sign"),
    SYSTEM_SIGN_ERROR(SystemCode.SYSTEM_SIGN_ERROR_CODE, "签名错误"),
    SYSTEM_MISS_TIMESTAMP(SystemCode.SYSTEM_MISS_TIMESTAMP_CODE, "缺少参数_timestamp"),
    SYSTEM_REQ_TIMEOUT(SystemCode.SYSTEM_REQ_TIMEOUT_CODE, "请求已过期"),
    SYSTEM_REQ_REPEATE(SystemCode.SYSTEM_REQ_REPEATE_CODE, "请求重发"),
    SYSTEM_REQ_NON_GET(SystemCode.SYSTEM_REQ_NON_GET_CODE, "HTTP请求非get方式"),
    SYSTEM_REQ_NON_POST(SystemCode.SYSTEM_REQ_NON_POST_CODE, "HTTP请求非post方式"),
    SYSTEM_REQ_VERSION_NOT_EXIST(SystemCode.SYSTEM_REQ_VERSION_NOT_EXIST_CODE, "接口版本不存在"),
    SYSTEM_NON_PERMISSION(SystemCode.SYSTEM_NON_PERMISSION_CODE, "没有接口访问权限"),
    SYSTEM_DISABLE(SystemCode.SYSTEM_DISABLE_CODE, "接口已停用"),
    SYSTEM_OFFLINE(SystemCode.SYSTEM_OFFLINE_CODE, "接口不处于上线状态"),
    SYSTEM_OVER_FREQ(SystemCode.SYSTEM_OVER_FREQ_CODE, "已超限频阀值"),
    SYSTEM_OVER_FLOW(SystemCode.SYSTEM_OVER_FLOW_CODE, "已超限流阀值"),
    SYSTEM_USER_VALIDATE_FAIL(SystemCode.SYSTEM_USER_VALIDATE_FAIL_CODE, "用户名或密码验证失败"),
    SYSTEM_REQ_REJECT(SystemCode.SYSTEM_REQ_REJECT_CODE, "请求被拒绝"),
    /****************************公共状态码 start ******************/
    ;

    /**
     * 方便swagger2中获取
     * 系统未知异常
     */
    public static final int SYSTEM_GENERAL_FAIL_CODE = 100000;
    /**
     * 成功
     */
    public static final int SYSTEM_SUCCESS_CODE = 0;
    /**
     * 缺少必要的请求参数
     */
    public static final int SYSTEM_MISS_PARAM_CODE = 100002;
    /**
     * 请求参数格式错误
     */
    public static final int SYSTEM_REQ_MALFORMATION_CODE = 100003;
    /**
     * 缺少签名_sign
     */
    public static final int SYSTEM_MISS_SIGN_CODE = 100004;
    /**
     * 签名错误
     */
    public static final int SYSTEM_SIGN_ERROR_CODE = 100005;
    /**
     * 缺少参数_timestamp
     */
    public static final int SYSTEM_MISS_TIMESTAMP_CODE = 100006;
    /**
     * 请求已过期
     */
    public static final int SYSTEM_REQ_TIMEOUT_CODE = 100007;
    /**
     * 请求重发
     */
    public static final int SYSTEM_REQ_REPEATE_CODE = 100008;
    /**
     * HTTP请求非get方式
     */
    public static final int SYSTEM_REQ_NON_GET_CODE = 100009;
    /**
     * HTTP请求非post方式
     */
    public static final int SYSTEM_REQ_NON_POST_CODE = 100010;
    /**
     * 接口版本不存在
     */
    public static final int SYSTEM_REQ_VERSION_NOT_EXIST_CODE = 100011;
    /**
     * 没有接口访问权限
     */
    public static final int SYSTEM_NON_PERMISSION_CODE = 100012;
    /**
     * 接口已停用
     */
    public static final int SYSTEM_DISABLE_CODE = 100013;
    /**
     * 接口不处于上线状态
     */
    public static final int SYSTEM_OFFLINE_CODE = 100014;
    /**
     * 已超限频阀值
     */
    public static final int SYSTEM_OVER_FREQ_CODE = 100015;
    /**
     * 已超限流阀值
     */
    public static final int SYSTEM_OVER_FLOW_CODE = 100016;
    /**
     * 用户名或密码验证失败
     */
    public static final int SYSTEM_USER_VALIDATE_FAIL_CODE = 100017;
    /**
     * 请求被拒绝
     */
    public static final int SYSTEM_REQ_REJECT_CODE = 100018;

    /**
     * code编码
     */
    final int code;
    /**
     * 中文信息描述
     */
    final String desc;
}
