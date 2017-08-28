package com.moligy.demo.di.module;

import com.jess.arms.di.scope.ActivityScope;

import dagger.Module;
import dagger.Provides;

import com.moligy.demo.mvp.contract.ShoppingContract;
import com.moligy.demo.mvp.model.ShoppingModel;


@Module
public class ShoppingModule {
    private ShoppingContract.View view;

    /**
     * 构建ShoppingModule时,将View的实现类传进来,这样就可以提供View的实现类给presenter
     *
     * @param view
     */
    public ShoppingModule(ShoppingContract.View view) {
        this.view = view;
    }

    @ActivityScope
    @Provides
    ShoppingContract.View provideShoppingView() {
        return this.view;
    }

    @ActivityScope
    @Provides
    ShoppingContract.Model provideShoppingModel(ShoppingModel model) {
        return model;
    }
}