package com.andy.sbm.entity;

import com.andy.cmn.base.BaseEntity;
import javax.persistence.*;

public class Orderdetail extends BaseEntity {
    @Id
    private Integer id;

    /**
     * 订单id
     */
    @Column(name = "orders_id")
    private Integer ordersId;

    /**
     * 商品id
     */
    @Column(name = "items_id")
    private Integer itemsId;

    /**
     * 商品购买数量
     */
    @Column(name = "items_num")
    private Integer itemsNum;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取订单id
     *
     * @return orders_id - 订单id
     */
    public Integer getOrdersId() {
        return ordersId;
    }

    /**
     * 设置订单id
     *
     * @param ordersId 订单id
     */
    public void setOrdersId(Integer ordersId) {
        this.ordersId = ordersId;
    }

    /**
     * 获取商品id
     *
     * @return items_id - 商品id
     */
    public Integer getItemsId() {
        return itemsId;
    }

    /**
     * 设置商品id
     *
     * @param itemsId 商品id
     */
    public void setItemsId(Integer itemsId) {
        this.itemsId = itemsId;
    }

    /**
     * 获取商品购买数量
     *
     * @return items_num - 商品购买数量
     */
    public Integer getItemsNum() {
        return itemsNum;
    }

    /**
     * 设置商品购买数量
     *
     * @param itemsNum 商品购买数量
     */
    public void setItemsNum(Integer itemsNum) {
        this.itemsNum = itemsNum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", ordersId=").append(ordersId);
        sb.append(", itemsId=").append(itemsId);
        sb.append(", itemsNum=").append(itemsNum);
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Orderdetail other = (Orderdetail) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getOrdersId() == null ? other.getOrdersId() == null : this.getOrdersId().equals(other.getOrdersId()))
            && (this.getItemsId() == null ? other.getItemsId() == null : this.getItemsId().equals(other.getItemsId()))
            && (this.getItemsNum() == null ? other.getItemsNum() == null : this.getItemsNum().equals(other.getItemsNum()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getOrdersId() == null) ? 0 : getOrdersId().hashCode());
        result = prime * result + ((getItemsId() == null) ? 0 : getItemsId().hashCode());
        result = prime * result + ((getItemsNum() == null) ? 0 : getItemsNum().hashCode());
        return result;
    }
}