package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes3.dex */
public final class w49 extends a79 {
    public final View v;
    public long w;

    public w49(ea1 ea1Var, View view, View view2) {
        super(0, view, ea1Var);
        this.v = view2;
    }

    @Override // defpackage.a79
    public final void b0() {
        synchronized (this) {
            this.w = 0L;
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.w != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.w = 1L;
        }
        k0();
    }
}
