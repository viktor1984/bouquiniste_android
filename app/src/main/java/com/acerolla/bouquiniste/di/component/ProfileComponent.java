package com.acerolla.bouquiniste.di.component;

import com.acerolla.bouquiniste.di.module.ProfileModule;
import com.acerolla.bouquiniste.presentation.profile.view.ProfileFragment;

import dagger.Subcomponent;

/**
 * Created by Evgeniy Solovev
 * Date: 25.05.2018
 * Email: solevur@gmail.com
 */
@Subcomponent(modules = ProfileModule.class)
public interface ProfileComponent {

    void inject(ProfileFragment fragment);
}