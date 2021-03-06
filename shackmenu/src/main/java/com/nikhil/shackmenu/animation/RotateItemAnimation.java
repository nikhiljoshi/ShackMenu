package com.nikhil.shackmenu.animation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.animation.Animation;

import com.nikhil.shackmenu.view.ShackItemView;

import java.util.Random;

/**
 * @author Nikhil Joshi

 * @description The zoom in up animator for item view when display.
 */
public class RotateItemAnimation extends ItemAnimation{
    @Override
    public Animation getAnimation(ShackItemView itemView, int positionOfVisibleViews) {
        return null;
    }

    @Override
    public Animator getAnimator(ShackItemView itemView, int positionOfVisibleViews) {
        AnimatorSet animatorSet = new AnimatorSet();
        float x = itemView.getWidth() - itemView.getPaddingRight();
        float y = itemView.getHeight() - itemView.getPaddingBottom();
        animatorSet.playTogether(
                ObjectAnimator.ofFloat(itemView, "rotation", 90, 0),
                ObjectAnimator.ofFloat(itemView, "alpha", 0, 1),
                ObjectAnimator.ofFloat(itemView, "pivotX", x, x),
                ObjectAnimator.ofFloat(itemView, "pivotY", y, y)
        );
        animatorSet.setDuration(800 + new Random().nextInt(500));
        return animatorSet;
    }

    public static RotateItemAnimation create(){
        return new RotateItemAnimation();
    }
}
