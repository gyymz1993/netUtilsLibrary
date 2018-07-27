package com.ryan.corelibs.model.entity;

import java.io.Serializable;

/**
 * Created by guoh on 2018/7/25.
 * 功能描述：
 * 需要的参数：
 */
public class Module implements Serializable{

    /**
     * author : 郑双玲
     * create_time : 2017-12-15 17:35:06.0
     * duration : 10.04
     * h : 1080.0
     * id : 9117.0
     * name : 渐变炫酷服饰节日促销视频
     * opType : 2.0
     * order : 997.0
     * setId : 18.0
     * setInfo : [{"setId":18,"setName":"产品推广","use":0},{"setId":26,"setName":"教育专区","use":10},{"setId":30,"setName":"国际广告","use":0},{"setId":42,"setName":"广告传媒","use":1},{"setId":46,"setName":"服装饰品","use":1}]
     * showTypeId : 2.0
     * thumb : http://itbour-user.oss-cn-hangzhou.aliyuncs.com/images/U670651/2017/12/15/17331974_uzRpTYxI4S/weishang02.JPG
     * time : 2017-12-15 17:35:06
     * typeDesc : 视频
     * upTime : 2018-7-13 15:51:08
     * update_time : 2018-07-13 15:51:08.0
     * useCounts : 444.0
     * video : http://itbour-generate.itbour.com/video/U670651/2017/12/15/191008472_YGVa1AZYwpB25qEtSIVW/0.mp4
     * vip : 0.0
     * w : 1920.0
     */

    private String author;
    private String create_time;
    private double duration;
    private double h;
    private double id;
    private String name;
    private double opType;
    private double order;
    private double setId;
    private String setInfo;
    private double showTypeId;
    private String thumb;
    private String time;
    private String typeDesc;
    private String upTime;
    private String update_time;
    private double useCounts;
    private String video;
    private double vip;
    private double w;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getId() {
        return id;
    }

    public void setId(double id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getOpType() {
        return opType;
    }

    public void setOpType(double opType) {
        this.opType = opType;
    }

    public double getOrder() {
        return order;
    }

    public void setOrder(double order) {
        this.order = order;
    }

    public double getSetId() {
        return setId;
    }

    public void setSetId(double setId) {
        this.setId = setId;
    }

    public String getSetInfo() {
        return setInfo;
    }

    public void setSetInfo(String setInfo) {
        this.setInfo = setInfo;
    }

    public double getShowTypeId() {
        return showTypeId;
    }

    public void setShowTypeId(double showTypeId) {
        this.showTypeId = showTypeId;
    }

    public String getThumb() {
        return thumb;
    }

    public void setThumb(String thumb) {
        this.thumb = thumb;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getTypeDesc() {
        return typeDesc;
    }

    public void setTypeDesc(String typeDesc) {
        this.typeDesc = typeDesc;
    }

    public String getUpTime() {
        return upTime;
    }

    public void setUpTime(String upTime) {
        this.upTime = upTime;
    }

    public String getUpdate_time() {
        return update_time;
    }

    public void setUpdate_time(String update_time) {
        this.update_time = update_time;
    }

    public double getUseCounts() {
        return useCounts;
    }

    public void setUseCounts(double useCounts) {
        this.useCounts = useCounts;
    }

    public String getVideo() {
        return video;
    }

    public void setVideo(String video) {
        this.video = video;
    }

    public double getVip() {
        return vip;
    }

    public void setVip(double vip) {
        this.vip = vip;
    }

    public double getW() {
        return w;
    }

    public void setW(double w) {
        this.w = w;
    }

    @Override
    public String toString() {
        return "Module{" +
                "author='" + author + '\'' +
                ", create_time='" + create_time + '\'' +
                ", duration=" + duration +
                ", h=" + h +
                ", id=" + id +
                ", name='" + name + '\'' +
                ", opType=" + opType +
                ", order=" + order +
                ", setId=" + setId +
                ", setInfo='" + setInfo + '\'' +
                ", showTypeId=" + showTypeId +
                ", thumb='" + thumb + '\'' +
                ", time='" + time + '\'' +
                ", typeDesc='" + typeDesc + '\'' +
                ", upTime='" + upTime + '\'' +
                ", update_time='" + update_time + '\'' +
                ", useCounts=" + useCounts +
                ", video='" + video + '\'' +
                ", vip=" + vip +
                ", w=" + w +
                '}';
    }
}
