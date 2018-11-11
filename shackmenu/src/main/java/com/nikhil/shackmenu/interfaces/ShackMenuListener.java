package com.nikhil.shackmenu.interfaces;

import com.nikhil.shackmenu.ShackMenu;

/**
 * @author Nikhil Joshi

 * @description Listener for {@link ShackMenu}
 */
public interface ShackMenuListener {
    /**
     * When the menu is fully showed, will call this method.
     * */
    void onShow();

    /**
     * When the menu is fully dismissed, will call this method.
     * */
    void onDismiss();
}
