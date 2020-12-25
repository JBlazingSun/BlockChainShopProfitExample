package com.blazings.blazings.Model;

public class Profit {
    /**
     * 节点获得
     * @return
     */
    Double node;
    /**
     * 技术
     * @return
     */
    Double tech;
    /**
     * 会员获得
     * @return
     */
    Double member;

    /**
     * 平台收益
     * @return
     */
    Double platform;

    /**
     * 区级代理
     * @return
     */
    Double region;

    /**
     * 省级代理
     * @return
     */
    Double province;

    public Double getNode() {
        return node;
    }

    public void setNode(Double node) {
        this.node = node;
    }

    public Double getTech() {
        return tech;
    }

    public void setTech(Double tech) {
        this.tech = tech;
    }

    public Double getMember() {
        return member;
    }

    public void setMember(Double member) {
        this.member = member;
    }

    public Double getPlatform() {
        return platform;
    }

    public void setPlatform(Double platform) {
        this.platform = platform;
    }

    public Double getRegion() {
        return region;
    }

    public void setRegion(Double region) {
        this.region = region;
    }

    public Double getProvince() {
        return province;
    }

    public void setProvince(Double province) {
        this.province = province;
    }

}
