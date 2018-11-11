package com.nikhil.shackmenu.view;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.nikhil.shackmenu.ShackItemViewParameter;
import com.nikhil.shackmenu.util.ViewUtils;

/**
 * @author Nikhil Joshi

 * @description The button view for {@link MenuView}
 */
public class ShackItemView extends LinearLayout {
    private ImageView mImageView;
    private TextView mTextView;
    private ShackItemViewParameter mShackItemViewParameter; //the button bounded data.
    private boolean isNormalState = true;

    public ShackItemView(Context context, ShackItemViewParameter shackItemViewParameter) {
        super(context);

        mShackItemViewParameter = shackItemViewParameter;
        mImageView = new ImageView(context);
        mTextView = new TextView(context);

        if (mShackItemViewParameter != null) {
            init();
        }
    }

    private void init(){
        setOrientation(VERTICAL);
        setGravity(Gravity.CENTER);

        Drawable drawable = mShackItemViewParameter.getBackgroundDrawable();
        if(drawable == null && mShackItemViewParameter.getBackgroundDrawableRes() != 0){
            try{
                drawable = ViewUtils.getDrawable(this, mShackItemViewParameter.getBackgroundDrawableRes());
            }catch (Exception e){
                e.printStackTrace();
            }
        }

        if (drawable != null){
            ViewUtils.setDrawable(this, drawable);
        }else{
            if (mShackItemViewParameter.isUseDefaultBackgroundDrawable()) {
                setDefaultBackgroundDrawable();
            }
        }

        initImageView();
        initTextView();
    }

    private void setDefaultBackgroundDrawable(){
        try {
            TypedValue typedValue = new TypedValue();
            getContext().getTheme()
                    .resolveAttribute(android.R.attr.selectableItemBackground, typedValue, true);
            int[] attribute = new int[]{android.R.attr.selectableItemBackground};
            TypedArray typedArray = getContext().getTheme().obtainStyledAttributes(typedValue.resourceId, attribute);
            ViewUtils.setDrawable(this, typedArray.getDrawable(0));
            typedArray.recycle();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private void initImageView(){
        setNormalImageState();

        if (mShackItemViewParameter.getScaleType() != null) {
            mImageView.setScaleType(mShackItemViewParameter.getScaleType());
        }

        LayoutParams layoutParams = new LayoutParams(mShackItemViewParameter.getImageWidth(),
                mShackItemViewParameter.getImageHeight());

        if (mShackItemViewParameter.getImageMargin() != null) {
            layoutParams.leftMargin = mShackItemViewParameter.getImageMargin().left;
            layoutParams.topMargin = mShackItemViewParameter.getImageMargin().top;
            layoutParams.rightMargin = mShackItemViewParameter.getImageMargin().right;
            layoutParams.bottomMargin = mShackItemViewParameter.getImageMargin().bottom;
        }

        if (mShackItemViewParameter.getImagePadding() != null) {
            mImageView.setPadding(mShackItemViewParameter.getImagePadding().left,
                    mShackItemViewParameter.getImagePadding().top,
                    mShackItemViewParameter.getImagePadding().right,
                    mShackItemViewParameter.getImagePadding().bottom);
        }

        addView(mImageView, layoutParams);
    }

    private void initTextView(){
        setNormalTextState();

        mTextView.setTextSize(TypedValue.COMPLEX_UNIT_SP, mShackItemViewParameter.getTextSize());
        mTextView.setEllipsize(mShackItemViewParameter.getEllipsize());
        mTextView.setGravity(Gravity.CENTER);

        if (mShackItemViewParameter.getEllipsize() == null
                || mShackItemViewParameter.getEllipsize() == TextUtils.TruncateAt.MARQUEE) {
            mTextView.setSingleLine(true);
            mTextView.setMarqueeRepeatLimit(-1);
            mTextView.setHorizontallyScrolling(true);
            mTextView.setFocusable(true);
            mTextView.setFocusableInTouchMode(true);
            mTextView.setFreezesText(true);
        }

        LayoutParams layoutParams = new LayoutParams(mShackItemViewParameter.getTextWidth(), mShackItemViewParameter.getTextHeight());

        if (mShackItemViewParameter.getTextMargin() != null) {
            layoutParams.leftMargin = mShackItemViewParameter.getTextMargin().left;
            layoutParams.topMargin = mShackItemViewParameter.getTextMargin().top;
            layoutParams.rightMargin = mShackItemViewParameter.getTextMargin().right;
            layoutParams.bottomMargin = mShackItemViewParameter.getTextMargin().bottom;
        }

        if (mShackItemViewParameter.getTextPadding() != null) {
            mTextView.setPadding(mShackItemViewParameter.getTextPadding().left,
                    mShackItemViewParameter.getTextPadding().top,
                    mShackItemViewParameter.getTextPadding().right,
                    mShackItemViewParameter.getTextPadding().bottom);
        }

        addView(mTextView, layoutParams);
    }

    public ImageView getImageView() {
        return mImageView;
    }

    public TextView getTextView(){
        return mTextView;
    }

    public ShackItemViewParameter getTimoItemViewParameter() {
        return mShackItemViewParameter;
    }

    @Deprecated
    private void delayToShow(){
        getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
            @Override
            public void onGlobalLayout() {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                    getViewTreeObserver().removeOnGlobalLayoutListener(this);
                }

                didShow();
            }
        });
    }

    public void didShow() {
        /**
         * Avoid calling the interface after the view has not been initialized.
         * Please do not display the menu in {@link android.app.Activity#onCreate(Bundle)} or other methods that the view has not been initialized.
         * Otherwise, the marquee effect may be not work.
         * */
        mTextView.setSelected(true);
    }

    public void didDismiss(){
        mTextView.setSelected(false);
    }

    public void showAnimation(Animation animation){
        if (animation == null){
            return;
        }

        startAnimation(animation);
    }

    public void showAnimator(Animator animator){
        if (animator == null){
            return;
        }

        animator.start();
    }

    private void onHighlighted(){
        if (!isNormalState){
            return;
        }

        isNormalState = false;
        setHighlightedImageState();
        setHighlightedTextState();
    }

    private void onNormal(){
        if (isNormalState){
            return;
        }

        isNormalState = true;
        setNormalImageState();
        setNormalTextState();
    }

    private void setNormalImageState(){
        ViewUtils.setDrawable(mImageView, mShackItemViewParameter.getNormalImageRes(),
                mShackItemViewParameter.getNormalImageDrawable());
    }

    private void setHighlightedImageState(){
        ViewUtils.setDrawable(mImageView, mShackItemViewParameter.getHighlightedImageRes(),
                mShackItemViewParameter.getHighlightedImageDrawable());
    }

    private void setNormalTextState(){
        ViewUtils.setText(mTextView, mShackItemViewParameter.getNormalTextRes(),
                mShackItemViewParameter.getNormalText());

        ViewUtils.setTextColor(mTextView, mShackItemViewParameter.getNormalTextColorRes(),
                mShackItemViewParameter.getNormalTextColor());
    }

    private void setHighlightedTextState(){
        ViewUtils.setText(mTextView, mShackItemViewParameter.getHighlightedTextRes(),
                mShackItemViewParameter.getHighlightedText());

        ViewUtils.setTextColor(mTextView, mShackItemViewParameter.getHighlightedTextColorRes(),
                mShackItemViewParameter.getHighlightedTextColor());
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN:
                onHighlighted();
                break;

            case MotionEvent.ACTION_UP:
            case MotionEvent.ACTION_CANCEL:
                onNormal();
                break;
        }

        return super.onTouchEvent(event);
    }

}
