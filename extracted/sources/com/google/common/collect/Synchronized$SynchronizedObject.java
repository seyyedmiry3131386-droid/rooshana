package com.google.common.collect;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
class Synchronized$SynchronizedObject implements Serializable {
    private static final long serialVersionUID = 0;
    public final Object a;
    public final Object b;

    public Synchronized$SynchronizedObject(Object obj, Object obj2) {
        obj.getClass();
        this.a = obj;
        this.b = obj2 == null ? this : obj2;
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        synchronized (this.b) {
            objectOutputStream.defaultWriteObject();
        }
    }

    public final String toString() {
        String string;
        synchronized (this.b) {
            string = this.a.toString();
        }
        return string;
    }
}
