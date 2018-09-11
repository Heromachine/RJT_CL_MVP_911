package com.example.jessie.rjt_cl_mvp_9_11.ui.main;

import android.view.View;

public class Presenter implements IPresenter {


    IView view;

    IDataManager dataManager;

    public Presenter(MainActivity mainActivity)
    {
        view = mainActivity;
        dataManager = new DataManager();
    }

    @Override
    public void onButtonClicked(View v) {
        switch(v.getId())
        {
            case R.id.ButtongPutDB:
                break;
            case R.id.ButtonGetDB:
                dataManager.readRow(this);
                break;
        }

    }
}
