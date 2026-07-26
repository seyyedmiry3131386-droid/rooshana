package io.sentry;

import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public enum MeasurementUnit$Information implements j2 {
    BIT,
    BYTE,
    KILOBYTE,
    KIBIBYTE,
    MEGABYTE,
    MEBIBYTE,
    GIGABYTE,
    GIBIBYTE,
    TERABYTE,
    TEBIBYTE,
    PETABYTE,
    PEBIBYTE,
    EXABYTE,
    EXBIBYTE;

    @Override // io.sentry.j2
    public String apiName() {
        return name().toLowerCase(Locale.ROOT);
    }
}
