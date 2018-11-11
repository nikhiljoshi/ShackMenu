package com.nikhil.shackmenu.animation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.animation.Animation;

import com.nikhil.shackmenu.view.ShackItemView;

import java.util.Random;

/**
 * @author Nikhil Joshi

 * @description The stand up animator for item view when display.
 */
public class StandUpItemAnimation extends ItemAnimation{
    @Override
    public Animation getAnimation(ShackItemView itemView, int positionOfVisibleViews) {
        return null;
    }

    @Override
    public Animator getAnimator(ShackItemView itemView, int positionOfVisibleViews) {
        AnimatorSet animatorSet = new AnimatorSet();
        float x = (itemView.getWidth() - itemView.getPaddingLeft() - itemView.getPaddingRight()) / 2
                + itemView.getPaddingLeft();
        float y = itemView.getHeight() - itemView.getPaddingBottom();

        animatorSet.playTogether(
                ObjectAnimator.ofFloat(itemView, "pivotX", x, x, x, x, x),
                ObjectAnimator.ofFloat(itemView, "pivotY", y, y, y, y, y),
                ObjectAnimator.ofFloat(itemView, "rotationX", 55, -30, 15, -15, 0));
        animatorSet.setDuration(1000 + new Random().nextInt(500));
        return animatorSet;
    }

    public static StandUpItemAnimation create(){
        return new StandUpItemAnimation();
    }
}
