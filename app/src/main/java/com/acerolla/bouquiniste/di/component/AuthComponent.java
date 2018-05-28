package com.acerolla.bouquiniste.di.component;

import com.acerolla.bouquiniste.di.module.AuthModule;
import com.acerolla.bouquiniste.di.module.LoginContainerModule;
import com.acerolla.bouquiniste.di.module.LoginModule;
import com.acerolla.bouquiniste.di.module.RegisterModule;

import dagger.Subcomponent;

/**
 * Created by Evgeniy Solovev
 * Email: solevur@gmail.com
 */
@Subcomponent(modules = AuthModule.class)
public interface AuthComponent {

    LoginContainerComponent plus(LoginContainerModule module);
    LoginComponent plus(LoginModule module);
    RegisterComponent plus(RegisterModule module);
}
