package io.kanakadhara.androiddagger.base;


import javax.inject.Singleton;

import dagger.Component;


/**
 * Singleton annotation its lifecycle is the lifecycle of the app
 * Component annotation
 */



@Singleton
@Component(modules = {
        ApplicationModule.class,
})
public interface ApplicationComponent {

}
