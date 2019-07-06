package com.accenture_rituraj.weather.dagger.module;

import com.google.gson.Gson;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.annotation.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GSONModule_ProvideGsonFactory implements Factory<Gson> {
  private final GSONModule module;

  public GSONModule_ProvideGsonFactory(GSONModule module) {
    assert module != null;
    this.module = module;
  }

  @Override
  public Gson get() {
    return Preconditions.checkNotNull(
        module.provideGson(), "Cannot return null from a non-@Nullable @Provides method");
  }

  public static Factory<Gson> create(GSONModule module) {
    return new GSONModule_ProvideGsonFactory(module);
  }
}
