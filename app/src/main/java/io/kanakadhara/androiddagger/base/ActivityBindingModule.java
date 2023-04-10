package io.kanakadhara.androiddagger.base;

import android.app.Activity;

import dagger.Binds;
import dagger.Module;
import dagger.Provides;
import dagger.android.AndroidInjector;
import dagger.multibindings.ClassKey;
import dagger.multibindings.IntoMap;
import io.kanakadhara.androiddagger.home.MainActivity;
import io.kanakadhara.androiddagger.home.MainActivityComponent;

/**
 * In ActivityBindingModule
 * this is a module and it is composed of subcomponents
 * in our case there is going to be only one subcomponent MainActivityComponent and one method
 *  we need to provide the method that will provide an injector for this MainActivity
 *  use @Binds, we define an abstract method and it will take the argument of that method and
 *  return it as the type of the method, kind of little shorthand
 *
 *  https://stackoverflow.com/questions/60476663/dagger-android-activitykey-not-found-how-to-create-sub-components-explicitly
 *  As this dagger 2.25.2 can not find dagger.android.ActivityKey, we use @ClassKey instead
 *
 */



@Module(subcomponents = {
        MainActivityComponent.class,
})
public abstract class ActivityBindingModule {

   /* @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity> provideMainActivityInjector(MainActivityComponent.Builder builder);
*/

    @Binds
    @IntoMap
    @ClassKey(MainActivity.class)
    abstract AndroidInjector.Factory<?> provideMainActivityInjector(MainActivityComponent.Builder builder);


}

