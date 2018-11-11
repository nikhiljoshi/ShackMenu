package com.nikhil.shackmenu.animation;

import android.animation.Animator;
import android.view.animation.Animation;

import com.nikhil.shackmenu.view.ShackItemView;

/**
 * @author Nikhil Joshi

 * @description The bomb animation for item view when display.
 */
public class BombItemAnimation extends ItemAnimation {
    @Override
    public Animation getAnimation(ShackItemView itemView, int positionOfVisibleViews) {
        return AnimationUtils.getItemBombAnimation(positionOfVisibleViews * 100);
    }

    @Override
    public Animator getAnimator(ShackItemView itemView, int positionOfVisibleViews) {
        return null;
    }

    public static BombItemAnimation create(){
        return new BombItemAnimation();
    }
}
