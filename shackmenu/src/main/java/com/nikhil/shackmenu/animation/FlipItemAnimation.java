package com.nikhil.shackmenu.animation;

import android.animation.Animator;
import android.view.animation.Animation;

import com.nikhil.shackmenu.view.ShackItemView;

/**
 * @author Nikhil Joshi

 * @description The flip animation for item view when display.
 */
public class FlipItemAnimation extends ItemAnimation{

    @Override
    public Animation getAnimation(ShackItemView itemView, int positionOfVisibleViews) {
        return AnimationUtils.getItemFlipAnimation(itemView.getWidth(),
                itemView.getHeight());
    }

    @Override
    public Animator getAnimator(ShackItemView itemView, int positionOfVisibleViews) {
        return null;
    }

    public static FlipItemAnimation create(){
        return new FlipItemAnimation();
    }
}
