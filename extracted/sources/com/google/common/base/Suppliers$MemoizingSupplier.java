package com.google.common.base;

import com.j256.ormlite.stmt.query.SimpleComparison;
import defpackage.vb8;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
class Suppliers$MemoizingSupplier<T> implements vb8, Serializable {
    private static final long serialVersionUID = 0;
    public transient Object a = new Object();
    public final vb8 b;
    public volatile transient boolean c;
    public transient Object d;

    public Suppliers$MemoizingSupplier(vb8 vb8Var) {
        this.b = vb8Var;
    }

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.a = new Object();
    }

    @Override // defpackage.vb8
    public final Object get() {
        if (!this.c) {
            synchronized (this.a) {
                try {
                    if (!this.c) {
                        Object obj = this.b.get();
                        this.d = obj;
                        this.c = true;
                        return obj;
                    }
                } finally {
                }
            }
        }
        return this.d;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Suppliers.memoize(");
        if (this.c) {
            obj = "<supplier that returned " + this.d + SimpleComparison.GREATER_THAN_OPERATION;
        } else {
            obj = this.b;
        }
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
