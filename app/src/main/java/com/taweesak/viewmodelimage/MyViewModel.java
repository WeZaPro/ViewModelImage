package com.taweesak.viewmodelimage;

import android.graphics.drawable.Drawable;

import androidx.lifecycle.ViewModel;

public class MyViewModel extends ViewModel {
    private String text;
    private Drawable image;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }
}
