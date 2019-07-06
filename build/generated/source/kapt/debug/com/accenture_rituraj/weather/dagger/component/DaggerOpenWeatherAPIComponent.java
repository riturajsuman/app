package com.accenture_rituraj.weather.dagger.component;

import com.accenture_rituraj.weather.api.WorldWeatherAPI;
import com.accenture_rituraj.weather.dagger.module.GSONModule;
import com.accenture_rituraj.weather.dagger.module.GSONModule_ProvideGsonFactory;
import com.accenture_rituraj.weather.dagger.module.OpenWeatherAPIModule;
import com.accenture_rituraj.weather.dagger.module.OpenWeatherAPIModule_ProvideApiFactory;
import com.accenture_rituraj.weather.ui.presenter.MainPresenter;
import com.accenture_rituraj.weather.ui.presenter.MainPresenter_MembersInjector;
import com.google.gson.Gson;
import dagger.MembersInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerOpenWeatherAPIComponent implements OpenWeatherAPIComponent {
  private Provider<Gson> provideGsonProvider;

  private Provider<WorldWeatherAPI> provideApiProvider;

  private MembersInjector<MainPresenter> mainPresenterMembersInjector;

  private DaggerOpenWeatherAPIComponent(Builder builder) {
    assert builder != null;
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static OpenWeatherAPIComponent create() {
    return builder().build();
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {

    this.provideGsonProvider =
        DoubleCheck.provider(GSONModule_ProvideGsonFactory.create(builder.gSONModule));

    this.provideApiProvider =
        DoubleCheck.provider(
            OpenWeatherAPIModule_ProvideApiFactory.create(
                builder.openWeatherAPIModule, provideGsonProvider));

    this.mainPresenterMembersInjector = MainPresenter_MembersInjector.create(provideApiProvider);
  }

  @Override
  public void inject(MainPresenter presenter) {
    mainPresenterMembersInjector.injectMembers(presenter);
  }

  public static final class Builder {
    private GSONModule gSONModule;

    private OpenWeatherAPIModule openWeatherAPIModule;

    private Builder() {}

    public OpenWeatherAPIComponent build() {
      if (gSONModule == null) {
        this.gSONModule = new GSONModule();
      }
      if (openWeatherAPIModule == null) {
        this.openWeatherAPIModule = new OpenWeatherAPIModule();
      }
      return new DaggerOpenWeatherAPIComponent(this);
    }

    public Builder openWeatherAPIModule(OpenWeatherAPIModule openWeatherAPIModule) {
      this.openWeatherAPIModule = Preconditions.checkNotNull(openWeatherAPIModule);
      return this;
    }

    public Builder gSONModule(GSONModule gSONModule) {
      this.gSONModule = Preconditions.checkNotNull(gSONModule);
      return this;
    }
  }
}
