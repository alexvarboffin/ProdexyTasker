package com.walhalla.prodexytasker.ui.adapter.item;

public class Notice {

    private boolean readable = false;
    private int id;

    public boolean isReadable() {
        return readable;
    }

    public void setReadable(boolean readable) {
        this.readable = readable;
    }



    public Notice(boolean b) {
    }

    public int getId() {
        return id;
    }
}
