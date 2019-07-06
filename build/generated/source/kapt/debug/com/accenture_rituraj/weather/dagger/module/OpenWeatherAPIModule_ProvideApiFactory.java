package com.accenture_rituraj.weather.dagger.module;

import com.accenture_rituraj.weather.api.WorldWeatherAPI;
import com.google.gson.Gson;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class OpenWeatherAPIModule_ProvideApiFactory implements Factory<WorldWeatherAPI> {
  private final OpenWeatherAPIModule module;

  private final Provider<Gson> gsonProvider;

  public OpenWeatherAPIModule_ProvideApiFactory(
      OpenWeatherAPIModule module, Provider<Gson> gsonProvider) {
    assert module != null;
    this.module = module;
    assert gsonProvider != null;
    this.gsonProvider = gsonProvider;
  }

  @Override
  public WorldWeatherAPI get() {
    return Preconditions.checkNotNull(
        module.provideApi(gsonProvider.get()),
        "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<WorldWeatherAPI> create(
      OpenWeatherAPIModule module, Provider<Gson> gsonProvider) {
    return new OpenWeatherAPIModule_ProvideApiFactory(module, gsonProvider);
  }
}
