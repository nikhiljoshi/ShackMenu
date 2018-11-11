package com.nikhil.shackmenu.interfaces;

import android.widget.HorizontalScrollView;

import com.nikhil.shackmenu.ShackMenu;
import com.nikhil.shackmenu.view.MenuView;
import com.nikhil.shackmenu.view.ShackItemView;

import java.util.List;

/**
 * @author Nikhil Joshi

 * @description The common method of {@link ShackMenu} & {@link me.samlss.shackmenu.TimoMenuImpl}
 */
public interface ShackCommonMethod {
    /**
     * Get all the rows of the menu. <br>
     *
     * You can get all the views of every row.
     *
     * @return The item view list of every row.
     * */
    List<List<ShackItemView>> getRows();


    /**
     * Get all the {@link HorizontalScrollView} of the menu. <br>
     *
     * One row corresponds to a {@link HorizontalScrollView}
     *
     * @return The list of {@link HorizontalScrollView}
     * */
    List<HorizontalScrollView> getScrollViews();

    /**
     * Get the menu view.
     * */
    MenuView getMenuView();
}
