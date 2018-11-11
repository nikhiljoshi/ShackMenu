package com.nikhil.shackmenu.animation;

import android.animation.Animator;
import android.view.animation.Animation;

import com.nikhil.shackmenu.view.ShackItemView;

/**
 * @author Nikhil Joshi

 * @description Specify the display animation for {@link ShackItemView},
 *                you can extend this class to implement a custom display animation of the item view.
 *                You can refer the animations: {@link FlipItemAnimation} or {@link BombItemAnimation} or {@link ScaleItemAnimation}.
 *
 *                You can specify the following two methods to specify the opening animation.
 */
public abstract class ItemAnimation {
    /**
     * Get the animation when the menu is showing.
     *
     * @param itemView The item view.
     * @param positionOfVisibleViews The position in all visible views of the row.
     * @return The animation that executed when the item view is displayed.
     * */
    public abstract Animation getAnimation(ShackItemView itemView, int positionOfVisibleViews);

    /**
     *  Get the animator when the menu is showing.
     *
     * @param itemView The item view.
     * @param positionOfVisibleViews The position in all visible views of the row.
     * @return The animation that executed when the item view is displayed.
     * */
    public abstract Animator getAnimator(ShackItemView itemView, int positionOfVisibleViews);
}
