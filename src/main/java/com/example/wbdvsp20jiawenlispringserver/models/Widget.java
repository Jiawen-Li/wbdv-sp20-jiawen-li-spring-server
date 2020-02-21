package com.example.wbdvsp20jiawenlispringserver.models;


public class Widget {

    private String name;
    private String id;
    private String tid;
    private String type;
    private int order;
    private String text;
    private String url;
    private int size;
    private int width;
    private int height;
    private String cssClass;
    private String style;
    private String value;

    public Widget() {
    }

    public Widget(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setCssClass(String cssClass) {
        this.cssClass = cssClass;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }


    public String getType() {
        return type;
    }

    public int getOrder() {
        return order;
    }

    public String getText() {
        return text;
    }

    public String getUrl() {
        return url;
    }

    public int getSize() {
        return size;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public String getCssClass() {
        return cssClass;
    }

    public String getStyle() {
        return style;
    }

    public String getValue() {
        return value;
    }

    public String getId() {
        return id;
    }

    public String getTid() {
        return tid;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }
}
