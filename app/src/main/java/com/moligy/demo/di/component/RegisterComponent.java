package com.moligy.demo.di.component;

import com.jess.arms.di.component.AppComponent;
import com.jess.arms.di.scope.ActivityScope;
import com.moligy.demo.di.module.RegisterModule;
import com.moligy.demo.mvp.ui.activity.RegisterActivity;

import dagger.Component;

@ActivityScope
@Component(modules = RegisterModule.class, dependencies = AppComponent.class)
public interface RegisterComponent {
    void inject(RegisterActivity activity);
}