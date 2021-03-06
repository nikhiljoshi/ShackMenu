package com.nikhil.shackmenu;

import android.graphics.drawable.Drawable;

/**
 * @author Nikhil Joshi

 * @description The parameter of divider line.
 */
public class ShackDividerLine {
    private int drawableRes;
    private Drawable drawable;
    private int height;

    private int marginLeft;
    private int marginRight;

    public ShackDividerLine(int drawableRes, int height, int marginLeft, int marginRight) {
        this.drawableRes = drawableRes;
        this.height = height;
        this.marginLeft = marginLeft;
        this.marginRight = marginRight;
    }

    public ShackDividerLine(Drawable drawable, int height, int marginLeft, int marginRight) {
        this.drawable = drawable;
        this.height = height;
        this.marginLeft = marginLeft;
        this.marginRight = marginRight;
    }

    public int getMarginLeft() {
        return marginLeft;
    }

    public void setMarginLeft(int marginLeft) {
        this.marginLeft = marginLeft;
    }

    public int getMarginRight() {
        return marginRight;
    }

    public void setMarginRight(int marginRight) {
        this.marginRight = marginRight;
    }

    public int getDrawableRes() {
        return drawableRes;
    }

    public void setDrawableRes(int drawableRes) {
        this.drawableRes = drawableRes;
    }

    public Drawable getDrawable() {
        return drawable;
    }

    public void setDrawable(Drawable drawable) {
        this.drawable = drawable;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

