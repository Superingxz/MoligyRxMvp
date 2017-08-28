package com.moligy.demo.di.component;

import com.jess.arms.di.component.AppComponent;
import com.jess.arms.di.scope.ActivityScope;
import com.moligy.demo.di.module.ShopCartModule;
import com.moligy.demo.mvp.ui.fragment.ShopCartFragment;

import dagger.Component;

@ActivityScope
@Component(modules = ShopCartModule.class, dependencies = AppComponent.class)
public interface ShopCartComponent {
    void inject(ShopCartFragment fragment);
}