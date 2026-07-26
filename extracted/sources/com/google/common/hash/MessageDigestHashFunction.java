package com.google.common.hash;

import defpackage.ct2;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
final class MessageDigestHashFunction extends ct2 implements Serializable {

    public static final class SerializedForm implements Serializable {
        private static final long serialVersionUID = 0;

        private Object readResolve() {
            throw null;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public final String toString() {
        throw null;
    }

    public Object writeReplace() {
        throw null;
    }
}
