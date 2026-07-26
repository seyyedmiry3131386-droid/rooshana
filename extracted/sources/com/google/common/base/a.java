package com.google.common.base;

/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static a c() {
        return Equivalence$Equals.a;
    }

    public static a f() {
        return Equivalence$Identity.a;
    }

    public abstract boolean a(Object obj, Object obj2);

    public abstract int b(Object obj);

    public final boolean e(Object obj, Object obj2) {
        if (obj == obj2) {
            return true;
        }
        if (obj == null || obj2 == null) {
            return false;
        }
        return a(obj, obj2);
    }
}
