package com.nikhil.shackmenu;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.ImageView;

import com.nikhil.shackmenu.util.ViewUtils;

/**
 * @author Nikhil Joshi

 * @description The displayed button for {@link ShackMenu}
 */
public class ShackItemViewParameter {
    //Item view itself
    private int width;
    private int height;

    private int backgroundDrawableRes;
    private Drawable backgroundDrawable;
    private boolean useDefaultBackgroundDrawable = true;

    //ImageView
    private int imageWidth;
    private int imageHeight;

    private Rect imageMargin;
    private Rect imagePadding;

    private ImageView.ScaleType scaleType;
    private int normalImageRes;
    private Drawable normalImageDrawable;

    private int highlightedImageRes;
    private Drawable highlightedImageDrawable;

    //TextView
    private int textWidth;
    private int textHeight;

    private Rect textMargin;
    private Rect textPadding;

    private int normalTextRes;
    private String normalText;

    private int highlightedTextRes;
    private String highlightedText;

    private int normalTextColor;
    private int normalTextColorRes;

    private int highlightedTextColor;
    private int highlightedTextColorRes;

    private float textSize;
    private TextUtils.TruncateAt ellipsize;

    private ShackItemViewParameter(){
        width  = ViewUtils.dp2px(80);
        height = ViewUtils.dp2px(100);

        imageWidth = ViewUtils.dp2px(50);
        imageHeight = imageWidth;

        textWidth  = ViewUtils.dp2px(50);
        textHeight = ViewUtils.dp2px(30);

        scaleType = ImageView.ScaleType.FIT_CENTER;
        ellipsize = TextUtils.TruncateAt.MARQUEE;

        textSize = 12; //in sp
        ellipsize = TextUtils.TruncateAt.MARQUEE;

        normalTextColor = 0xFF888888;
    }

    public void setNormalImageRes(int normalImageRes) {
        this.normalImageRes = normalImageRes;
    }

    public void setNormalImageDrawable(Drawable normalImageDrawable) {
        this.normalImageDrawable = normalImageDrawable;
    }

    public void setHighlightedImageRes(int highlightedImageRes) {
        this.highlightedImageRes = highlightedImageRes;
    }

    public void setHighlightedImageDrawable(Drawable highlightedImageDrawable) {
        this.highlightedImageDrawable = highlightedImageDrawable;
    }

    public void setNormalTextRes(int normalTextRes) {
        this.normalTextRes = normalTextRes;
    }

    public void setNormalText(String normalText) {
        this.normalText = normalText;
    }

    public void setHighlightedTextRes(int highlightedTextRes) {
        this.highlightedTextRes = highlightedTextRes;
    }

    public void setHighlightedText(String highlightedText) {
        this.highlightedText = highlightedText;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setBackgroundDrawable(Drawable backgroundDrawable) {
        this.backgroundDrawable = backgroundDrawable;
    }

    public void setBackgroundDrawableRes(int backgroundDrawableRes) {
        this.backgroundDrawableRes = backgroundDrawableRes;
    }

    public int getBackgroundDrawableRes() {
        return backgroundDrawableRes;
    }

    public Drawable getBackgroundDrawable() {
        return backgroundDrawable;
    }

    public void setImageWidth(int imageWidth) {
        this.imageWidth = imageWidth;
    }

    public void setImageHeight(int imageHeight) {
        this.imageHeight = imageHeight;
    }

    public void setTextWidth(int textWidth) {
        this.textWidth = textWidth;
    }

    public void setTextHeight(int textHeight) {
        this.textHeight = textHeight;
    }

    public void setImageMargin(Rect imageMargin) {
        this.imageMargin = imageMargin;
    }

    public void setImagePadding(Rect imagePadding) {
        this.imagePadding = imagePadding;
    }

    public void setTextMargin(Rect textMargin) {
        this.textMargin = textMargin;
    }

    public void setTextPadding(Rect textPadding) {
        this.textPadding = textPadding;
    }

    public void setScaleType(ImageView.ScaleType scaleType) {
        this.scaleType = scaleType;
    }

    public void setTextSize(float textSize) {
        this.textSize = textSize;
    }

    public void setNormalTextColor(int normalTextColor) {
        this.normalTextColor = normalTextColor;
    }

    public void setNormalTextColorRes(int normalTextColorRes) {
        this.normalTextColorRes = normalTextColorRes;
    }

    public void setHighlightedTextColor(int highlightedTextColor) {
        this.highlightedTextColor = highlightedTextColor;
    }

    public void setHighlightedTextColorRes(int highlightedTextColorRes) {
        this.highlightedTextColorRes = highlightedTextColorRes;
    }

    public void setEllipsize(TextUtils.TruncateAt ellipsize) {
        this.ellipsize = ellipsize;
    }

    public void setUseDefaultBackgroundDrawable(boolean useDefaultBackgroundDrawable) {
        this.useDefaultBackgroundDrawable = useDefaultBackgroundDrawable;
    }

    public boolean isUseDefaultBackgroundDrawable() {
        return useDefaultBackgroundDrawable;
    }

    public TextUtils.TruncateAt getEllipsize() {
        return ellipsize;
    }

    public int getImageWidth() {
        return imageWidth;
    }

    public int getImageHeight() {
        return imageHeight;
    }

    public int getTextWidth() {
        return textWidth;
    }

    public int getTextHeight() {
        return textHeight;
    }

    public Rect getImageMargin() {
        return imageMargin;
    }

    public Rect getImagePadding() {
        return imagePadding;
    }

    public Rect getTextMargin() {
        return textMargin;
    }

    public Rect getTextPadding() {
        return textPadding;
    }

    public int getNormalTextColor() {
        return normalTextColor;
    }

    public int getNormalTextColorRes() {
        return normalTextColorRes;
    }

    public int getHighlightedTextColor() {
        return highlightedTextColor;
    }

    public int getHighlightedTextColorRes() {
        return highlightedTextColorRes;
    }

    public ImageView.ScaleType getScaleType() {
        return scaleType;
    }

    public float getTextSize() {
        return textSize;
    }

    public int getNormalImageRes() {
        return normalImageRes;
    }

    public Drawable getNormalImageDrawable() {
        return normalImageDrawable;
    }

    public int getHighlightedImageRes() {
        return highlightedImageRes;
    }

    public Drawable getHighlightedImageDrawable() {
        return highlightedImageDrawable;
    }

    public int getNormalTextRes() {
        return normalTextRes;
    }

    public String getNormalText() {
        return normalText;
    }

    public int getHighlightedTextRes() {
        return highlightedTextRes;
    }

    public String getHighlightedText() {
        return highlightedText;
    }

    public static class Builder{
        private ShackItemViewParameter mShackItemViewParameter = new ShackItemViewParameter();

        public Builder(){

        }


        /**
         * Set width for this item view.
         * The default is 100dp
         *
         * @param height The height value
         * */
        public Builder setHeight(int height) {
            mShackItemViewParameter.setHeight(height);
            return this;
        }

        /**
         * Set width for this item view.
         *
         *  The default is 50dp
         * @param width The width value
         * */
        public Builder setWidth(int width) {
            mShackItemViewParameter.setWidth(width);
            return this;
        }

        /**
         * Set the image resource when the button is at normal-state.
         * @param normalImageRes The image resource of normal state.
         * @return The builder.
         * */
        public Builder setNormalImageRes(int normalImageRes) {
            mShackItemViewParameter.setNormalImageRes(normalImageRes);
            return this;
        }

        /**
         * Set the image drawable when the button is at normal-state.
         * @param normalImageDrawable The image drawable of normal state.
         * @return The builder.
         * */
        public Builder setNormalImageDrawable(Drawable normalImageDrawable) {
            mShackItemViewParameter.setNormalImageDrawable(normalImageDrawable);
            return this;
        }

        /**
         * Set the image resource when the button is at highlighted-state.
         * @param highlightedImageRes The image resource of highlighted state.
         * @return The builder.
         * */
        public Builder setHighlightedImageRes(int highlightedImageRes) {
            mShackItemViewParameter.setHighlightedImageRes(highlightedImageRes);
            return this;
        }

        /**
         * Set the image drawable when the button is at highlighted-state.
         * @param highlightedImageDrawable The image drawable of highlighted state.
         * @return The builder.
         * */
        public Builder setHighlightedImageDrawable(Drawable highlightedImageDrawable) {
            mShackItemViewParameter.setHighlightedImageDrawable(highlightedImageDrawable);
            return this;
        }

        /**
         * Set the text resource when the button is at normal-state.
         * @param normalTextRes The text resource of normal state.
         * @return The builder.
         * */
        public Builder setNormalTextRes(int normalTextRes) {
            mShackItemViewParameter.setNormalTextRes(normalTextRes);
            return this;
        }

        /**
         * Set the ellipsize of the {@link android.widget.TextView}
         * */
        public Builder setEllipsize(TextUtils.TruncateAt ellipsize) {
            mShackItemViewParameter.setEllipsize(ellipsize);
            return this;
        }

        /**
         * Set the text string when the button is at normal-state.
         * @param normalText The text string of normal state.
         * @return The builder.
         * */
        public Builder setNormalText(String normalText) {
            mShackItemViewParameter.setNormalText(normalText);
            return this;
        }

        /**
         * Set the text resource when the button is at highlighted-state.
         * @param highlightedTextRes The text resource of highlighted state.
         * @return The builder.
         * */
        public Builder setHighlightedTextRes(int highlightedTextRes) {
            mShackItemViewParameter.setHighlightedTextRes(highlightedTextRes);
            return this;
        }

        /**
         * Set the text string when the button is at highlighted-state.
         * @param highlightedText The text string of highlighted state.
         * @return The builder.
         * */
        public Builder setHighlightedText(String highlightedText) {
            mShackItemViewParameter.setHighlightedText(highlightedText);
            return this;
        }

        /**
         * Set the width of {@link ImageView}
         *
         * @param imageWidth The width value in pixel.
         * */
        public Builder setImageWidth(int imageWidth) {
            mShackItemViewParameter.setImageWidth(imageWidth);
            return this;
        }

        /**
         * Set the height of {@link ImageView}
         *
         * @param imageHeight The height value in pixel.
         * */
        public Builder setImageHeight(int imageHeight) {
            mShackItemViewParameter.setImageHeight(imageHeight);
            return this;
        }

        /**
         * Set the width of {@link android.widget.TextView}
         *
         * @param textWidth The width value in pixel.
         * */
        public Builder setTextWidth(int textWidth) {
            mShackItemViewParameter.setTextWidth(textWidth);
            return this;
        }

        /**
         * Set the height of {@link android.widget.TextView}
         *
         * @param textHeight The height value in pixel.
         * */
        public Builder setTextHeight(int textHeight) {
            mShackItemViewParameter.setTextHeight(textHeight);
            return this;
        }

        /**
         * Set the margins of {@link ImageView}
         *
         * @param imageMargin Will take the value left | top | right | bottom as the margin value.
         * */
        public Builder setImageMargin(Rect imageMargin) {
            mShackItemViewParameter.setImageMargin(imageMargin);
            return this;
        }

        /**
         * Set the padding of {@link ImageView}
         *
         * @param imagePadding Will take the value left | top | right | bottom as the padding value.
         * */
        public Builder setImagePadding(Rect imagePadding) {
            mShackItemViewParameter.setImagePadding(imagePadding);
            return this;
        }

        /**
         * Set the margins of {@link android.widget.TextView}
         *
         * @param textMargin Will take the value left | top | right | bottom as the margin value.
         * */
        public Builder setTextMargin(Rect textMargin) {
            mShackItemViewParameter.setTextMargin(textMargin);
            return this;
        }

        /**
         * Set the padding of {@link android.widget.TextView}
         *
         * @param textPadding Will take the value left | top | right | bottom as the padding value.
         * */
        public Builder setTextPadding(Rect textPadding) {
            mShackItemViewParameter.setTextPadding(textPadding);
            return this;
        }

        /**
         * Set the scale type of the {@link ImageView}
         *
         * @param scaleType  The {@link android.widget.ImageView.ScaleType}
         * */
        public Builder setScaleType(ImageView.ScaleType scaleType) {
            mShackItemViewParameter.setScaleType(scaleType);
            return this;
        }

        /**
         * Set the text size of the {@link android.widget.TextView} in sp.
         *
         * @param textSize The text size.
         * */
        public Builder setTextSize(float textSize) {
            mShackItemViewParameter.setTextSize(textSize);
            return this;
        }

        /**
         * Set the normal color oft the {@link android.widget.TextView}
         * @param normalTextColor The normal color.
         * */
        public Builder setNormalTextColor(int normalTextColor) {
            mShackItemViewParameter.setNormalTextColor(normalTextColor);
            return this;
        }

        /**
         * Set the normal color resource oft the {@link android.widget.TextView}
         * @param normalTextColorRes The normal color resource.
         * */
        public Builder setNormalTextColorRes(int normalTextColorRes) {
            mShackItemViewParameter.setNormalTextColorRes(normalTextColorRes);
            return this;
        }

        /**
         * Set the highlighted color oft the {@link android.widget.TextView}
         * @param highlightedTextColor The normal color resource.
         * */
        public Builder setHighlightedTextColor(int highlightedTextColor) {
            mShackItemViewParameter.setHighlightedTextColor(highlightedTextColor);
            return this;
        }

        /**
         * Set the highlighted color resource oft the {@link android.widget.TextView}
         * @param highlightedTextColorRes The normal color resource.
         * */
        public Builder setHighlightedTextColorRes(int highlightedTextColorRes) {
            mShackItemViewParameter.setHighlightedTextColorRes(highlightedTextColorRes);
            return this;
        }

        /**
         * Set the background drawable for the item view {@link me.samlss.shackmenu.view.ShackItemView}
         *
         * @param backgroundDrawable The background drawable.
         * */
        public Builder setBackgroundDrawable(Drawable backgroundDrawable) {
            mShackItemViewParameter.setBackgroundDrawable(backgroundDrawable);
            return this;
        }

        /**
         * Set the background drawable resource for the item view {@link me.samlss.shackmenu.view.ShackItemView}
         *
         * @param backgroundDrawableRes The background drawable resource.
         * */
        public Builder setBackgroundDrawableRes(int backgroundDrawableRes) {
            mShackItemViewParameter.setBackgroundDrawableRes(backgroundDrawableRes);
            return this;
        }

        /**
         * Whether to use the default background drawable, the default is true.
         *
         * @param useDefaultBackgroundDrawable True will use the default background drawable, otherwise not.
         * */
        public Builder setUseDefaultBackgroundDrawable(boolean useDefaultBackgroundDrawable) {
            mShackItemViewParameter.setUseDefaultBackgroundDrawable(useDefaultBackgroundDrawable);
            return this;
        }

        /**
         * Return the object of {@link ShackItemViewParameter}
         * */
        public ShackItemViewParameter build(){
            return mShackItemViewParameter;
        }
    }
}
