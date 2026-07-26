package com.google.android.material.carousel;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
final class CarouselStrategy$StrategyType {
    public static final /* synthetic */ CarouselStrategy$StrategyType[] a = {new CarouselStrategy$StrategyType("CONTAINED", 0), new CarouselStrategy$StrategyType("UNCONTAINED", 1)};

    /* JADX INFO: Fake field, exist only in values array */
    CarouselStrategy$StrategyType EF5;

    public static CarouselStrategy$StrategyType valueOf(String str) {
        return (CarouselStrategy$StrategyType) Enum.valueOf(CarouselStrategy$StrategyType.class, str);
    }

    public static CarouselStrategy$StrategyType[] values() {
        return (CarouselStrategy$StrategyType[]) a.clone();
    }
}
