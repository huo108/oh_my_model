package com.ailian.designpattern.prototypepattern;

/**
 * 浅克隆
 * Created by Ailian on 16/12/28.
 */

public class ShadowWeeklyLog implements Cloneable {

    private Attachment attachment;
    private String name;
    private String date;
    private String content;

    public Attachment getAttachment() {
        return attachment;
    }

    public void setAttachment(Attachment attachment) {
        this.attachment = attachment;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    protected ShadowWeeklyLog clone() {
        try {
            return (ShadowWeeklyLog) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }
}
