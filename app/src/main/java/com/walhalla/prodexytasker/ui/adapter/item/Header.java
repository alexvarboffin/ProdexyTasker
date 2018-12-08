package com.walhalla.prodexytasker.ui.adapter.item;

public class Header {
    //    More fields can be defined here after your need
    private String header;

    public Header(){}

    public Header(String header) {
        this.header = header.toUpperCase();
    }

    public String getHeader() {
        return header;
    }
    public void setHeader(String header) {
        this.header = header;
    }
}