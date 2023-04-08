package io.kanakadhara.androiddagger.base;


import android.app.Application;

/****
 * In MyApplication
 * to be able to reference our component
 * create a ApplicationComponent field
 * then prepend your component classname with Dagger
 * So that will turn this into DaggerApplicationComponent
 *
 *
 */

public class MyApplication extends Application {

    private ApplicationComponent component;

    @Override
    public void onCreate() {
        super.onCreate();

        component = DaggerApplicationComponent.builder()
                .applicationModule(new ApplicationModule(this))
                .build();

    }

}

