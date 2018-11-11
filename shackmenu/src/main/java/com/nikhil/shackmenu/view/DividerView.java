package com.nikhil.shackmenu.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;

import com.nikhil.shackmenu.util.ViewUtils;

/**
 * @author Nikhil Joshi

 * @description The divider view.
 */
class DividerView extends View {

    public DividerView(Context context, Drawable drawable) {
        super(context);

        ViewUtils.setDrawable(this, drawable);
    }
}
