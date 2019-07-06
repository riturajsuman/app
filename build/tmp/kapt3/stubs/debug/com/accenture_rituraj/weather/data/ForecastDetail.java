package com.accenture_rituraj.weather.data;

import java.lang.System;

/**
 * Created by Rituraj on 7/5/2019.
 */
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0002\u0010\fJ\t\u0010\u001f\u001a\u00020\u0003H\u00c6\u0003J\t\u0010 \u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003J\t\u0010\"\u001a\u00020\nH\u00c6\u0003J\t\u0010#\u001a\u00020\nH\u00c6\u0003JA\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\nH\u00c6\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010(\u001a\u00020)H\u00d6\u0001J\t\u0010*\u001a\u00020+H\u00d6\u0001R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R$\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u000b\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001e\u0010\t\u001a\u00020\n8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0016\"\u0004\b\u001a\u0010\u0018R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u00a8\u0006,"}, d2 = {"Lcom/accenture_rituraj/weather/data/ForecastDetail;", "", "date", "", "temperature", "Lcom/accenture_rituraj/weather/data/Temperature;", "description", "", "Lcom/accenture_rituraj/weather/data/WeatherDescription;", "pressure", "", "humidity", "(JLcom/accenture_rituraj/weather/data/Temperature;Ljava/util/List;DD)V", "getDate", "()J", "setDate", "(J)V", "getDescription", "()Ljava/util/List;", "setDescription", "(Ljava/util/List;)V", "getHumidity", "()D", "setHumidity", "(D)V", "getPressure", "setPressure", "getTemperature", "()Lcom/accenture_rituraj/weather/data/Temperature;", "setTemperature", "(Lcom/accenture_rituraj/weather/data/Temperature;)V", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "app_debug"})
public final class ForecastDetail {
    @com.google.gson.annotations.SerializedName(value = "dt")
    private long date;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "main")
    private com.accenture_rituraj.weather.data.Temperature temperature;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "weather")
    private java.util.List<com.accenture_rituraj.weather.data.WeatherDescription> description;
    @com.google.gson.annotations.SerializedName(value = "pressure")
    private double pressure;
    @com.google.gson.annotations.SerializedName(value = "humidity")
    private double humidity;
    
    public final long getDate() {
        return 0L;
    }
    
    public final void setDate(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.accenture_rituraj.weather.data.Temperature getTemperature() {
        return null;
    }
    
    public final void setTemperature(@org.jetbrains.annotations.NotNull()
    com.accenture_rituraj.weather.data.Temperature p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.accenture_rituraj.weather.data.WeatherDescription> getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.NotNull()
    java.util.List<com.accenture_rituraj.weather.data.WeatherDescription> p0) {
    }
    
    public final double getPressure() {
        return 0.0;
    }
    
    public final void setPressure(double p0) {
    }
    
    public final double getHumidity() {
        return 0.0;
    }
    
    public final void setHumidity(double p0) {
    }
    
    public ForecastDetail(long date, @org.jetbrains.annotations.NotNull()
    com.accenture_rituraj.weather.data.Temperature temperature, @org.jetbrains.annotations.NotNull()
    java.util.List<com.accenture_rituraj.weather.data.WeatherDescription> description, double pressure, double humidity) {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.accenture_rituraj.weather.data.Temperature component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.accenture_rituraj.weather.data.WeatherDescription> component3() {
        return null;
    }
    
    public final double component4() {
        return 0.0;
    }
    
    public final double component5() {
        return 0.0;
    }
    
    /**
     * Created by Rituraj on 7/5/2019.
     */
    @org.jetbrains.annotations.NotNull()
    public final com.accenture_rituraj.weather.data.ForecastDetail copy(long date, @org.jetbrains.annotations.NotNull()
    com.accenture_rituraj.weather.data.Temperature temperature, @org.jetbrains.annotations.NotNull()
    java.util.List<com.accenture_rituraj.weather.data.WeatherDescription> description, double pressure, double humidity) {
        return null;
    }
    
    /**
     * Created by Rituraj on 7/5/2019.
     */
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    /**
     * Created by Rituraj on 7/5/2019.
     */
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    /**
     * Created by Rituraj on 7/5/2019.
     */
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
}