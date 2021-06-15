package com.example.dz3;

public class Model {
    private String title,descripton;
    private int imageModel;

    public Model(String title, String descripton, int imageModel) {
        this.title = title;
        this.descripton = descripton;
        this.imageModel = imageModel;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescripton() {
        return descripton;
    }

    public void setDescripton(String descripton) {
        this.descripton = descripton;
    }

    public int getImageModel() {
        return imageModel;
    }

    public void setImageModel(int imageModel) {
        this.imageModel = imageModel;
    }
}
