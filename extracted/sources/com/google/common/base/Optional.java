package com.google.common.base;

import com.google.common.collect.e0;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public abstract class Optional<T> implements Serializable {
    private static final long serialVersionUID = 0;

    public static Optional a() {
        return Absent.a;
    }

    public static Optional e(Object obj) {
        obj.getClass();
        return new Present(obj);
    }

    public abstract Object b();

    public abstract boolean c();

    public abstract Object f(e0 e0Var);
}
