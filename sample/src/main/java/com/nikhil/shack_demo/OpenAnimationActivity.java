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
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.nikhil.shackmenu.ShackMenu;
import com.nikhil.shackmenu.animation.BombItemAnimation;
import com.nikhil.shackmenu.animation.BounceInDownItemAnimation;
import com.nikhil.shackmenu.animation.BounceInUpItemAnimation;
import com.nikhil.shackmenu.animation.BounceItemAnimation;
import com.nikhil.shackmenu.animation.FlipItemAnimation;
import com.nikhil.shackmenu.animation.RotateItemAnimation;
import com.nikhil.shackmenu.animation.ScaleItemAnimation;
import com.nikhil.shackmenu.animation.StandUpItemAnimation;

/**
 * @author Nikhil Joshi

 * @description Demo for all the opening animation.
 */
public class OpenAnimationActivity extends AppCompatActivity {
    private ShackMenu mShackMenu;
    private ListView mListView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_open_animation);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            getWindow().setStatusBarColor(getResources().getColor(R.color.colorPrimary));
        }
        MenuHelper.setupToolBarBackAction(this, (Toolbar) findViewById(R.id.toolbar));

        initList();
        initMenu();
    }

    private void initList(){
        mListView = findViewById(R.id.listview);
        mListView.setAdapter(new ArrayAdapter<>(this, android.R.layout.simple_expandable_list_item_1,
                MenuHelper.getAllOpenAnimationName()));
        mListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        mShackMenu.setItemAnimation(0, FlipItemAnimation.create());
                        mShackMenu.setItemAnimation(1, FlipItemAnimation.create());
                        break;

                    case 1:
                        mShackMenu.setItemAnimation(0, ScaleItemAnimation.create());
                        mShackMenu.setItemAnimation(1, ScaleItemAnimation.create());
                        break;

                    case 2:
                        mShackMenu.setItemAnimation(0, BombItemAnimation.create());
                        mShackMenu.setItemAnimation(1, BombItemAnimation.create());
                        break;

                    case 3:
                        mShackMenu.setItemAnimation(0, StandUpItemAnimation.create());
                        mShackMenu.setItemAnimation(1, StandUpItemAnimation.create());
                        break;

                    case 4:
                        mShackMenu.setItemAnimation(0, BounceItemAnimation.create());
                        mShackMenu.setItemAnimation(1, BounceItemAnimation.create());
                        break;

                    case 5:
                        mShackMenu.setItemAnimation(0, BounceInDownItemAnimation.create());
                        mShackMenu.setItemAnimation(1, BounceInDownItemAnimation.create());
                        break;

                    case 6:
                        mShackMenu.setItemAnimation(0, BounceInUpItemAnimation.create());
                        mShackMenu.setItemAnimation(1, BounceInUpItemAnimation.create());
                        break;

                    case 7:
                        mShackMenu.setItemAnimation(0, RotateItemAnimation.create());
                        mShackMenu.setItemAnimation(1, RotateItemAnimation.create());
                        break;
                }

                mShackMenu.show();
            }
        });
    }

    private void initMenu(){
        int itemViewWidth = (getWindow().getWindowManager().getDefaultDisplay().getWidth() - 40) / 5;

        mShackMenu =  new ShackMenu.Builder(this)
                .setGravity(Gravity.CENTER)
                .setMenuMargin(new Rect(20, 20, 20, 20))
                .setMenuPadding(new Rect(0, 10, 0, 10))
                .addRow(null, MenuHelper.getTopList(itemViewWidth))
                .addRow(null, MenuHelper.getBottomList(itemViewWidth))
                .build();
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
}
