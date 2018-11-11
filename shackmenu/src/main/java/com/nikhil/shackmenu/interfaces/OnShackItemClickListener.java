package com.nikhil.shackmenu.interfaces;

import com.nikhil.shackmenu.view.ShackItemView;

/**
 * @author Nikhil Joshi

 * @description the click listener of {@link ShackItemView}
 */
public interface OnShackItemClickListener {
    /**
     * When the item is clicked, will call this method.
     *
     * @param row The row of the menu, starting from 0.
     * @param index The index of the row, starting from 0.
     * @param view The clicked item view.
     * */
    void onItemClick(int row, int index, ShackItemView view);
}
