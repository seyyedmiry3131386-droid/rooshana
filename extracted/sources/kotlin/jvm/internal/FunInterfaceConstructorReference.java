package kotlin.jvm.internal;

import defpackage.cx3;
import defpackage.yw3;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public class FunInterfaceConstructorReference extends FunctionReference implements Serializable {
    @Override // kotlin.jvm.internal.FunctionReference
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FunInterfaceConstructorReference) {
            throw null;
        }
        return false;
    }

    @Override // kotlin.jvm.internal.FunctionReference, kotlin.jvm.internal.CallableReference
    public final /* bridge */ /* synthetic */ yw3 getReflected() {
        getReflected();
        throw null;
    }

    @Override // kotlin.jvm.internal.FunctionReference
    public final int hashCode() {
        throw null;
    }

    @Override // kotlin.jvm.internal.FunctionReference
    public final String toString() {
        throw null;
    }

    @Override // kotlin.jvm.internal.FunctionReference, kotlin.jvm.internal.CallableReference
    public final cx3 getReflected() {
        throw new UnsupportedOperationException("Functional interface constructor does not support reflection");
    }
}
