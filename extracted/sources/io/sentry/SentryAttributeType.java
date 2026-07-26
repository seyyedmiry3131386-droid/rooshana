package io.sentry;

import java.math.BigInteger;
import java.util.Collection;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes3.dex */
public enum SentryAttributeType {
    STRING,
    BOOLEAN,
    INTEGER,
    DOUBLE,
    ARRAY;

    public static SentryAttributeType inferFrom(Object obj) {
        return obj instanceof Boolean ? BOOLEAN : ((obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof Byte) || (obj instanceof BigInteger) || (obj instanceof AtomicInteger) || (obj instanceof AtomicLong)) ? INTEGER : obj instanceof Number ? DOUBLE : ((obj instanceof Collection) || (obj != null && obj.getClass().isArray())) ? ARRAY : STRING;
    }

    public String apiName() {
        return name().toLowerCase(Locale.ROOT);
    }
}
