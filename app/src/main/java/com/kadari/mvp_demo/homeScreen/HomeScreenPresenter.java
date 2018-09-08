package com.kadari.mvp_demo.homeScreen;

import android.support.v7.view.menu.MenuView;

public class HomeScreenPresenter {

    private HomeScreenView mView;

    public HomeScreenPresenter(HomeScreenView view) {
        mView = view;
    }

    public void fetchAndUpdateMessage() {
        if (mView != null) {
            mView.displayMessage("Message from Presenter");
        }
    }

    public void onDestroy() {
        mView = null;
    }
}
