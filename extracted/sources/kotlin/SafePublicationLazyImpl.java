package kotlin;

import defpackage.bp2;
import defpackage.c24;
import defpackage.eq;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: loaded from: classes3.dex */
final class SafePublicationLazyImpl<T> implements c24, Serializable {
    public static final AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(SafePublicationLazyImpl.class, Object.class, "b");
    public volatile bp2 a;
    public volatile Object b;

    private final void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Deserialization is supported via proxy only");
    }

    private final Object writeReplace() {
        return new InitializedLazyImpl(getValue());
    }

    @Override // defpackage.c24
    public final Object getValue() {
        Object obj = this.b;
        eq eqVar = eq.L;
        if (obj != eqVar) {
            return obj;
        }
        bp2 bp2Var = this.a;
        if (bp2Var != null) {
            Object objInvoke = bp2Var.invoke();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = c;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, eqVar, objInvoke)) {
                if (atomicReferenceFieldUpdater.get(this) != eqVar) {
                }
            }
            this.a = null;
            return objInvoke;
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
