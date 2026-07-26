package kotlin.jvm.internal;

import defpackage.g27;
import defpackage.mx3;
import defpackage.yw3;

/* JADX INFO: loaded from: classes3.dex */
public abstract class PropertyReference1 extends PropertyReference implements mx3 {
    @Override // kotlin.jvm.internal.CallableReference
    public final yw3 computeReflected() {
        g27.a.getClass();
        return this;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return get(obj);
    }

    @Override // defpackage.mx3
    public final void m() {
        ((mx3) getReflected()).m();
    }
}
