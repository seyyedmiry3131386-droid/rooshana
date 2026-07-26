package com.google.common.cache;

import defpackage.ry7;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
final class LongAdder extends Striped64 implements Serializable {
    private static final long serialVersionUID = 7249069246863182397L;

    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        this.c = 0;
        this.a = null;
        this.b = objectInputStream.readLong();
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeLong(b());
    }

    public final long b() {
        long j = this.b;
        ry7[] ry7VarArr = this.a;
        if (ry7VarArr != null) {
            for (ry7 ry7Var : ry7VarArr) {
                if (ry7Var != null) {
                    j += 0;
                }
            }
        }
        return j;
    }

    @Override // java.lang.Number
    public final double doubleValue() {
        return b();
    }

    @Override // java.lang.Number
    public final float floatValue() {
        return b();
    }

    @Override // java.lang.Number
    public final int intValue() {
        return (int) b();
    }

    @Override // java.lang.Number
    public final long longValue() {
        return b();
    }

    public final String toString() {
        return Long.toString(b());
    }
}
