package com.nikhil.shack_demo;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Toast;

import com.nikhil.shackmenu.ShackMenu;
import com.nikhil.shackmenu.animation.BombItemAnimation;
import com.nikhil.shackmenu.interfaces.OnShackItemClickListener;
import com.nikhil.shackmenu.interfaces.ShackMenuListener;
import com.nikhil.shackmenu.view.ShackItemView;

/**
 * @author Nikhil Joshi

 * @description Demo that the menu is displayed at the top
 */
public class TopActivity extends AppCompatActivity {
    private ShackMenu mShackMenu;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_top);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(getResources().getColor(R.color.colorPrimary));
        }
        MenuHelper.setupToolBarBackAction(this, (Toolbar) findViewById(R.id.toolbar));

        init();
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK){
            if (mShackMenu.isShowing()){
                mShackMenu.dismiss();
                return true;
            }
        }
        return super.onKeyDown(keyCode, event);
    }

    private void init(){
        int itemViewWidth = (getWindow().getWindowManager().getDefaultDisplay().getWidth() - 40) / 5;

        mShackMenu =  new ShackMenu.Builder(this)
                .setGravity(Gravity.TOP)
                .setTimoMenuListener(new ShackMenuListener() {
                    @Override
                    public void onShow() {
                        Toast.makeText(getApplicationContext(), "Show", Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onDismiss() {
                        Toast.makeText(getApplicationContext(), "Dismiss", Toast.LENGTH_SHORT).show();
                    }
                })
                .setTimoItemClickListener(new OnShackItemClickListener() {
                    @Override
                    public void onItemClick(int row, int index, ShackItemView view) {
                        Toast.makeText(getApplicationContext(), String.format("%s click~", getString(MenuHelper.ROW_TEXT[row][index])), Toast.LENGTH_SHORT).show();
                    }
                })
                .setMenuMargin(new Rect(20, 20, 20, 20))
                .setMenuPadding(new Rect(0, 10, 0, 10))
                .addRow(BombItemAnimation.create(), MenuHelper.getTopList(itemViewWidth))
                .addRow(BombItemAnimation.create(), MenuHelper.getBottomList(itemViewWidth))
                .build();
    }

    public void onShow(View view) {
        mShackMenu.show();
    }
}
