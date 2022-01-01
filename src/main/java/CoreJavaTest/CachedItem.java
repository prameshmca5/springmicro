package CoreJavaTest;

import jdk.nashorn.internal.objects.annotations.Constructor;


import java.time.Duration;

public class CachedItem {
    private String stock;
    private Duration duration;


    public CachedItem(String stock, Duration duration) {
        this.stock = stock;
        this.duration = duration;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public Duration getDuration() {
        return duration;
    }

    public void setDuration(Duration duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "CachedItem{" +
                "stock='" + stock + '\'' +
                ", duration=" + duration +
                '}';
    }

}
