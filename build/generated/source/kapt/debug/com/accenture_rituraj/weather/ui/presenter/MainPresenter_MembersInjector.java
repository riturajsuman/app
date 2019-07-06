package com.accenture_rituraj.weather.ui.presenter;

import com.accenture_rituraj.weather.api.WorldWeatherAPI;
import dagger.MembersInjector;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class MainPresenter_MembersInjector implements MembersInjector<MainPresenter> {
  private final Provider<WorldWeatherAPI> apiProvider;

  public MainPresenter_MembersInjector(Provider<WorldWeatherAPI> apiProvider) {
    assert apiProvider != null;
    this.apiProvider = apiProvider;
  }

  public static MembersInjector<MainPresenter> create(Provider<WorldWeatherAPI> apiProvider) {
    return new MainPresenter_MembersInjector(apiProvider);
  }

  @Override
  public void injectMembers(MainPresenter instance) {
    if (instance == null) {
      throw new NullPointerException("Cannot inject members into a null reference");
    }
    instance.api = apiProvider.get();
  }
}
