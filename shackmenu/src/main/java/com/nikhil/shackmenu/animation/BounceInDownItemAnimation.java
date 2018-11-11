package com.nikhil.shackmenu.animation;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.view.animation.Animation;

import com.nikhil.shackmenu.view.ShackItemView;

import java.util.Random;

/**
 * @author Nikhil Joshi

 * @description The bounce in down animator for item view when display.
 */
public class BounceInDownItemAnimation extends ItemAnimation {
    @Override
    public Animation getAnimation(ShackItemView itemView, int positionOfVisibleViews) {
        return null;
    }

    @Override
    public Animator getAnimator(ShackItemView itemView, int positionOfVisibleViews) {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(
                ObjectAnimator.ofFloat(itemView, "alpha", 0, 1, 1, 1),
                ObjectAnimator.ofFloat(itemView, "translationY", -itemView.getHeight(), 30, -10, 0)
        );
        animatorSet.setDuration(1000 + new Random().nextInt(500));
        return animatorSet;
    }

    public static BounceInDownItemAnimation create(){
        return new BounceInDownItemAnimation();
    }
}
