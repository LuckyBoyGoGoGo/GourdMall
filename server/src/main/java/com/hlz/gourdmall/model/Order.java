package com.hlz.gourdmall.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class Order {

    private String oid;

    private Date ordertime;

    private Double total;


    private Integer state;

    private String address;


    private String name;

    private String telephone;

    private Long uid;
    // 程序中体现订单对象和订单项之间关系,我们再项目中的部分功能中有类似的需求:查询订单的同时还需要获取订单下所有的订单项

    private List<OrderItem> list = new ArrayList();

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid == null ? null : oid.trim();
    }

    public Date getOrdertime() {
        return ordertime;
    }

    public void setOrdertime(Date ordertime) {
        this.ordertime = ordertime;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }


    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone == null ? null : telephone.trim();
    }

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", oid=").append(oid);
        sb.append(", ordertime=").append(ordertime);
        sb.append(", total=").append(total);
        sb.append(", state=").append(state);
        sb.append(", address=").append(address);
        sb.append(", name=").append(name);
        sb.append(", telephone=").append(telephone);
        sb.append(", uid=").append(uid);
        sb.append("]");
        return sb.toString();
    }
}