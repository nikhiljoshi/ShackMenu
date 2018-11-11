### Features
- Multiple row items
- The menu appearance and disappear animation
- Header & Footer
- Custom item open animation & click effect


//create menu
ShackMenu shackMenu = new ShackMenu.Builder(this)
                .setGravity(Gravity.BOTTOM)
                .setMenuMargin(new Rect(20, 20, 20, 20))
                .setMenuPadding(new Rect(0, 10, 0, 10))
                .addRow('ItemAnimation', ' List<ShackItemViewParameter>');

//Show menu
shackMenu.show();

//Dismiss menu.
shackMenu.dismiss();
