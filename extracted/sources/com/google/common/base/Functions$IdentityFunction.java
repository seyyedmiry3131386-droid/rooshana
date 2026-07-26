package com.google.common.base;

import defpackage.yp2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
final class Functions$IdentityFunction implements yp2 {
    public static final /* synthetic */ Functions$IdentityFunction[] a = {new Functions$IdentityFunction("INSTANCE", 0)};

    /* JADX INFO: Fake field, exist only in values array */
    Functions$IdentityFunction EF5;

    public static Functions$IdentityFunction valueOf(String str) {
        return (Functions$IdentityFunction) Enum.valueOf(Functions$IdentityFunction.class, str);
    }

    public static Functions$IdentityFunction[] values() {
        return (Functions$IdentityFunction[]) a.clone();
    }

    @Override // defpackage.yp2
    public final Object apply(Object obj) {
        return obj;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "Functions.identity()";
    }
}
