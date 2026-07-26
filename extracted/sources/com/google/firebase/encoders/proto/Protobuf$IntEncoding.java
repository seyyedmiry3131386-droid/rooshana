package com.google.firebase.encoders.proto;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
public final class Protobuf$IntEncoding {
    public static final Protobuf$IntEncoding a;
    public static final /* synthetic */ Protobuf$IntEncoding[] b;

    static {
        Protobuf$IntEncoding protobuf$IntEncoding = new Protobuf$IntEncoding("DEFAULT", 0);
        a = protobuf$IntEncoding;
        b = new Protobuf$IntEncoding[]{protobuf$IntEncoding, new Protobuf$IntEncoding("SIGNED", 1), new Protobuf$IntEncoding("FIXED", 2)};
    }

    public static Protobuf$IntEncoding valueOf(String str) {
        return (Protobuf$IntEncoding) Enum.valueOf(Protobuf$IntEncoding.class, str);
    }

    public static Protobuf$IntEncoding[] values() {
        return (Protobuf$IntEncoding[]) b.clone();
    }
}
