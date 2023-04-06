package io.kanakadhara.androiddagger.base;

import android.app.Application;
import android.content.Context;

import dagger.Module;
import dagger.Provides;


@Module
public class ApplicationModule {

    private final Application application;

    //this will have a constructor that will takes an instance of an Android Application
    ApplicationModule(Application application) {
        this.application = application;
    }

    @Provides
    Context provideApplicationContext(){
        return application;
    }

}

