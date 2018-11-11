package com.nikhil.shackmenu.animation;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.animation.Animation;

import com.nikhil.shackmenu.view.ShackItemView;

import java.util.Random;

/**
 * @author Nikhil Joshi

 * @description The bounce animator for item view when display.
 */
public class BounceItemAnimation extends ItemAnimation{
    @Override
    public Animation getAnimation(ShackItemView itemView, int positionOfVisibleViews) {
        return null;
    }

    @Override
    public Animator getAnimator(ShackItemView itemView, int positionOfVisibleViews) {
        Animator animator = ObjectAnimator.ofFloat(itemView, "translationY", 0, 0, -30, 0, -15, 0, 0);
        animator.setDuration(1000 + new Random().nextInt(500));
        return animator;
    }

    public static BounceItemAnimation create(){
        return new BounceItemAnimation();
    }
}
