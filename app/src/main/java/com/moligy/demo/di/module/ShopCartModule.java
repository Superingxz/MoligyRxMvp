package com.moligy.demo.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import com.moligy.demo.mvp.contract.ShopCartContract;
import com.moligy.demo.mvp.model.ShopCartModel;


@Module
public class ShopCartModule {
    private ShopCartContract.View view;

    /**
     * 构建ShopCartModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public ShopCartModule(ShopCartContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    ShopCartContract.View provideShopCartView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    ShopCartContract.Model provideShopCartModel(ShopCartModel model) {
        return model;
    }
}