package com.moligy.demo.di.component;

import com.jess.arms.di.component.AppComponent;
import com.jess.arms.di.scope.ActivityScope;
import com.moligy.demo.di.module.ShoppingModule;
import com.moligy.demo.mvp.ui.activity.ShoppingActivity;

import dagger.Component;

@ActivityScope
@Component(modules = ShoppingModule.class, dependencies = AppComponent.class)
public interface ShoppingComponent {
    void inject(ShoppingActivity activity);
}