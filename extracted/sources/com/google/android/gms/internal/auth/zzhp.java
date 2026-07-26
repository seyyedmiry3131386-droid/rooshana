package com.google.android.gms.internal.auth;

import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public enum zzhp {
    /* JADX INFO: Fake field, exist only in values array */
    INT(0),
    /* JADX INFO: Fake field, exist only in values array */
    LONG(0L),
    /* JADX INFO: Fake field, exist only in values array */
    FLOAT(Float.valueOf(0.0f)),
    /* JADX INFO: Fake field, exist only in values array */
    DOUBLE(Double.valueOf(0.0d)),
    /* JADX INFO: Fake field, exist only in values array */
    BOOLEAN(Boolean.FALSE),
    /* JADX INFO: Fake field, exist only in values array */
    STRING(""),
    /* JADX INFO: Fake field, exist only in values array */
    BYTE_STRING(zzef.b),
    /* JADX INFO: Fake field, exist only in values array */
    ENUM(null),
    /* JADX INFO: Fake field, exist only in values array */
    MESSAGE(null);

    public final Object a;

    zzhp(Serializable serializable) {
        this.a = serializable;
    }
}
