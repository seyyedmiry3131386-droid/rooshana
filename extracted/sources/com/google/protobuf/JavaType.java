package com.google.protobuf;

import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public enum JavaType {
    VOID(Void.class, null),
    INT(Integer.class, 0),
    LONG(Long.class, 0L),
    FLOAT(Float.class, Float.valueOf(0.0f)),
    DOUBLE(Double.class, Double.valueOf(0.0d)),
    BOOLEAN(Boolean.class, Boolean.FALSE),
    STRING(String.class, ""),
    BYTE_STRING(ByteString.class, ByteString.b),
    ENUM(Integer.class, null),
    MESSAGE(Object.class, null);

    public final Object a;

    JavaType(Class cls, Serializable serializable) {
        this.a = serializable;
    }
}
