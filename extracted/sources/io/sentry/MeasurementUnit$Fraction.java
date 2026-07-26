package io.sentry;

import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public enum MeasurementUnit$Fraction implements j2 {
    RATIO,
    PERCENT;

    @Override // io.sentry.j2
    public String apiName() {
        return name().toLowerCase(Locale.ROOT);
    }
}
