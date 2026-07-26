package kotlin;

import defpackage.bp2;
import defpackage.c24;
import defpackage.eq;
import defpackage.js3;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class UnsafeLazyImpl<T> implements c24, Serializable {
    public bp2 a;
    public Object b;

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // defpackage.c24
    public final Object getValue() {
        if (this.b == eq.L) {
            bp2 bp2Var = this.a;
            js3.m(bp2Var);
            this.b = bp2Var.invoke();
            this.a = null;
        }
        return this.b;
    }

    @Override // defpackage.c24
    public final boolean isInitialized() {
        return this.b != eq.L;
    }

    public final String toString() {
        return isInitialized() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }
}
