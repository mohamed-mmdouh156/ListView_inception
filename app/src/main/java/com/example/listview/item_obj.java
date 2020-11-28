package com.example.listview;

public class item_obj {

    private int img ;
    private String title ;
    private String description ;

    public item_obj(int img, String title, String des ) {
        this.img = img;
        this.title = title;
        this.description = des;
    }


    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
