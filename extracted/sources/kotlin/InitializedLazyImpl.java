package kotlin;

import defpackage.c24;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class InitializedLazyImpl<T> implements c24, Serializable {
    public final Object a;

    public InitializedLazyImpl(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.c24
    public final Object getValue() {
        return this.a;
    }

    @Override // defpackage.c24
    public final boolean isInitialized() {
        return true;
    }

    public final String toString() {
        return String.valueOf(this.a);
    }
}
