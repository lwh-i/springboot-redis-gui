package com.example.demo.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author maqiang
 * @date 2022/1/4  11:05
 */

@AllArgsConstructor
public enum UserEnum {
    ;

    @AllArgsConstructor
    @Getter
    public enum DelEnum {
        /**
         * 正常
         */
        NORMAL((byte) 0, "正常"),

        /**
         * 禁止
         */
        BAN((byte) 1, "禁止");

        private final Byte type;

        private final String name;
    }
}
