package defpackage;

import android.view.View;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class v93 extends a79 {
    public final MyketTextView v;
    public long w;

    public v93(ea1 ea1Var, View view, MyketTextView myketTextView) {
        super(0, view, ea1Var);
        this.v = myketTextView;
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        synchronized (this) {
            j = this.w;
            this.w = 0L;
        }
        long j2 = j & 1;
        int i = j2 != 0 ? sj8.b().m : 0;
        if (j2 != 0) {
            this.v.setTextColor(i);
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
