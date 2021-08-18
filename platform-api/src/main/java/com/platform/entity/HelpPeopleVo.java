package com.platform.entity;

import javax.xml.crypto.Data;
import java.io.Serializable;

public class HelpPeopleVo implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 求助人id
     */
    private Integer id;
    /**
     *求助人姓名
     */
    private String name;
    /**
     *求助人性别
     */
    private Integer sex;
    /**
     *求助人电话
     */
    private String phone;
    /**
     *求助时间
     */
    private Data createTime;
    /**
     *求助人会员等级
     */
    private Integer vipLeave;

    public HelpPeopleVo() {
    }

    public HelpPeopleVo(Integer id, String name, Integer sex, String phone, Data createTime, Integer vipLeave) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.phone = phone;
        this.createTime = createTime;
        this.vipLeave = vipLeave;
    }

    @Override
    public String toString() {
        return "HelpPeopleVo{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", phone='" + phone + '\'' +
                ", createTime=" + createTime +
                ", vipLeave=" + vipLeave +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Data getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Data createTime) {
        this.createTime = createTime;
    }

    public Integer getVipLeave() {
        return vipLeave;
    }

    public void setVipLeave(Integer vipLeave) {
        this.vipLeave = vipLeave;
    }
}
