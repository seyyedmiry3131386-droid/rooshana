package kotlin.jvm.internal;

import defpackage.g27;
import defpackage.nx3;
import defpackage.yw3;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PropertyReference2 extends PropertyReference implements nx3 {
    @Override // kotlin.jvm.internal.CallableReference
    public final yw3 computeReflected() {
        g27.a.getClass();
        return this;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        ((PropertyReference2Impl) this).k();
        throw null;
    }

    @Override // defpackage.nx3
    public final void k() {
        ((nx3) getReflected()).k();
    }
}
