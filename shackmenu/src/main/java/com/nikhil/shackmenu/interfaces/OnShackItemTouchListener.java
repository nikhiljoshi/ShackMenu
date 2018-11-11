package com.nikhil.shackmenu.interfaces;

import android.view.MotionEvent;

import com.nikhil.shackmenu.view.ShackItemView;

/**
 * @author Nikhil Joshi

 * @description
 */
public interface OnShackItemTouchListener {
    /**
     * When the item is on touch, will call this method.
     *
     * @param row The row of the menu, starting from 0.
     * @param index The index of the row, starting from 0.
     * @param event
     * @param view The clicked item view.
     * @return True if the listener has consumed the event, false otherwise.
     * */
    boolean onItemTouch(int row, int index, MotionEvent event, ShackItemView view);
}
