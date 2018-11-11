package com.nikhil.shackmenu.animation;

import android.animation.Animator;
import android.view.animation.Animation;

import com.nikhil.shackmenu.view.ShackItemView;

/**
 * @author Nikhil Joshi

 * @description The scale animation for item view when display.
 */
public class ScaleItemAnimation extends ItemAnimation {

    @Override
    public Animation getAnimation(ShackItemView itemView, int positionOfVisibleViews) {
        return AnimationUtils.getItemScaleAnimation(0, 1, positionOfVisibleViews * 100);
    }

    @Override
    public Animator getAnimator(ShackItemView itemView, int positionOfVisibleViews) {
        return null;
    }

    public static ScaleItemAnimation create(){
        return new ScaleItemAnimation();
    }
}
