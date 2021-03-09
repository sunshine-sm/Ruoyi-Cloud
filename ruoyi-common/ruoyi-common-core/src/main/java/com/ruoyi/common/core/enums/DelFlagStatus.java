package com.ruoyi.common.core.enums;

/**
 * 删除状态
 *
 * @author ruoyi
 */
public enum DelFlagStatus {

    NORMAL("0", "正常"), DELETED("2", "删除");

    private final String code;
    private final String info;

    DelFlagStatus(String code, String info) {
        this.code = code;
        this.info = info;
    }

    public String getCode() {
        return code;
    }

    public String getInfo() {
        return info;
    }
}
