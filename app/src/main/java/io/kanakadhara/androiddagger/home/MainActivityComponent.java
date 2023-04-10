package io.kanakadhara.androiddagger.home;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;
import io.kanakadhara.androiddagger.di.ActivityScope;

/*****
 * it will be subcomponent, It will be built on top of our ApplicationComponent
 * it will also extend AndroidInjector<MainActivity>
 * we need a subcomponent builder class
 *
 */

@ActivityScope
@Subcomponent
public interface MainActivityComponent extends AndroidInjector<MainActivity> {

    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity>{

    }

}
