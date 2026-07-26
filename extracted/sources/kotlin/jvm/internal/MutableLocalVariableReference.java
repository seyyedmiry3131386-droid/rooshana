package kotlin.jvm.internal;

import defpackage.bx3;

/* JADX INFO: loaded from: classes3.dex */
public class MutableLocalVariableReference extends MutablePropertyReference0 {
    @Override // defpackage.lx3
    public final Object get() {
        throw new UnsupportedOperationException("Not supported for local property reference.");
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final bx3 getOwner() {
        throw new UnsupportedOperationException("Not supported for local property reference.");
    }
}
