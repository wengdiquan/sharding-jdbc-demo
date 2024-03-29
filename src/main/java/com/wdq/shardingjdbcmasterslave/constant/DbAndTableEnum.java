package com.wdq.shardingjdbcmasterslave.constant;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @description: 库表规则枚举类
 * @author: wdq-bg405275
 * @data: 2019-10-15 10:54
 **/

@Getter
@AllArgsConstructor
public enum DbAndTableEnum {
    /**
     * 用户信息表 UD+db+table+01+yyMMddHHmmssSSS+机器id+序列号id
     * 例如：UD000000011902261230103345300002 共 2+6+2+15+2+5=32位
     */
    T_USER("t_user", "user_id", "01", "01", "UD",
            2, 2, 4, 4, 16, "用户数据表枚举"),

    T_NEW_ORDER("t_new_order", "order_id", "01", "01", "OD",
            2,2, 4, 4, 8, "订单数据表枚举");

    /**分片表名*/
    private String tableName;
    /**分片键*/
    private String shardingKey;
    /**系统标识*/
    private String bizType;
    /**主键规则版本*/
    private String idVersion;
    /**表名字母前缀*/
    private String charsPrefix;
    /**分片键值中纯数字起始下标索引，第一位是0,第二位是1，依次类推*/
    private int numStartIndex;
    /**数据库索引位开始下标索引*/
    private int dbIndexBegin;
    /**表索引位开始下标索引*/
    private int tbIndexBegin;
    /**分布所在库数量*/
    private int dbCount;
    /**分布所在表数量-所有库中表数量总计*/
    private int tbCount;
    /**描述*/
    private String desc;
}
