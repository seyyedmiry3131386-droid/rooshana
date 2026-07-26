package defpackage;

import kotlinx.coroutines.channels.BufferOverflow;

/* JADX INFO: loaded from: classes3.dex */
public final class rv6 implements v48, xe2, cq2 {
    public final /* synthetic */ v48 a;

    public rv6(xb5 xb5Var) {
        this.a = xb5Var;
    }

    @Override // defpackage.xe2
    public final Object a(ze2 ze2Var, g51 g51Var) {
        return this.a.a(ze2Var, g51Var);
    }

    @Override // defpackage.cq2
    public final xe2 c(w61 w61Var, int i, BufferOverflow bufferOverflow) {
        return (((i < 0 || i >= 2) && i != -2) || bufferOverflow != BufferOverflow.b) ? vy2.A(this, w61Var, i, bufferOverflow) : this;
    }

    @Override // defpackage.v48
    public final Object getValue() {
        return this.a.getValue();
    }
}
