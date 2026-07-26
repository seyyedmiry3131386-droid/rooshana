package com.google.common.base;

import defpackage.yp2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
final class Functions$ToStringFunction implements yp2 {
    public static final /* synthetic */ Functions$ToStringFunction[] a = {new Functions$ToStringFunction("INSTANCE", 0)};

    /* JADX INFO: Fake field, exist only in values array */
    Functions$ToStringFunction EF5;

    public static Functions$ToStringFunction valueOf(String str) {
        return (Functions$ToStringFunction) Enum.valueOf(Functions$ToStringFunction.class, str);
    }

    public static Functions$ToStringFunction[] values() {
        return (Functions$ToStringFunction[]) a.clone();
    }

    @Override // defpackage.yp2
    public final Object apply(Object obj) {
        obj.getClass();
        return obj.toString();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "Functions.toStringFunction()";
    }
}
