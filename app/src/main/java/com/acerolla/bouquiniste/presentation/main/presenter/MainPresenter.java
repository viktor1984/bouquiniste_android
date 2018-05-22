package com.acerolla.bouquiniste.presentation.main.presenter;

import com.acerolla.bouquiniste.presentation.main.view.IMainView;

/**
 * Created by Acerolla (Evgeniy Solovev) on 22.05.2018.
 */
public class MainPresenter implements IMainPresenter {

    private IMainView mView;

    @Override
    public void bindView(IMainView view) {
        mView = view;
    }

    @Override
    public void release() {
        mView = null;
    }
}
