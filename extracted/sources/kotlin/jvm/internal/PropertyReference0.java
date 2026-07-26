package kotlin.jvm.internal;

import defpackage.g27;
import defpackage.lx3;
import defpackage.yw3;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PropertyReference0 extends PropertyReference implements lx3 {
    @Override // defpackage.lx3
    public final void c() {
        ((lx3) getReflected()).c();
    }

    @Override // kotlin.jvm.internal.CallableReference
    public final yw3 computeReflected() {
        g27.a.getClass();
        return this;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        return get();
    }
}
