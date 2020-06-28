package com.chy.mall.controller.vo;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * 订单列表页面VO
 */
@Getter
@Setter
public class MallOrderListVO implements Serializable {

    private Long orderId;

    private String orderNo;

    private Integer totalPrice;

    private Byte payType;

    private Byte orderStatus;

    private String orderStatusString;

    private String userAddress;

    private Date createTime;

    private List<MallOrderItemVO> mallOrderItemVOS;

}
