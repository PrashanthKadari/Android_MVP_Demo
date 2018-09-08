package com.kadari.mvp_demo.homeScreen;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.kadari.mvp_demo.R;

public class HomeScreen extends AppCompatActivity implements HomeScreenView {

    private HomeScreenPresenter mPresenter;
    private TextView mTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        init();
    }

    private void init() {
        mPresenter = new HomeScreenPresenter(this);
        mTextView = findViewById(R.id.text);
        mPresenter.fetchAndUpdateMessage();
    }

    @Override
    public void displayMessage(String message) {
        if (mTextView != null) {
            mTextView.setText(message);
        }
    }

    @Override
    protected void onDestroy() {
        mPresenter.onDestroy();
        mPresenter = null;
        super.onDestroy();
    }
}
