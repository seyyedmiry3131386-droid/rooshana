package kotlin.jvm.internal;

import defpackage.g27;
import defpackage.jx3;
import defpackage.yw3;

/* JADX INFO: loaded from: classes3.dex */
public abstract class MutablePropertyReference2 extends MutablePropertyReference implements jx3 {
    @Override // kotlin.jvm.internal.CallableReference
    public final yw3 computeReflected() {
        g27.a.getClass();
        return this;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        ((MutablePropertyReference2Impl) this).k();
        throw null;
    }

    @Override // defpackage.nx3
    public final void k() {
        ((MutablePropertyReference2) ((jx3) getReflected())).k();
    }
}
