package defpackage;

import android.view.View;
import ir.mservices.market.views.MyketEditText;

/* JADX INFO: loaded from: classes3.dex */
public final class v92 extends a79 {
    public final MyketEditText v;
    public long w;

    public v92(ea1 ea1Var, View view, MyketEditText myketEditText) {
        super(0, view, ea1Var);
        this.v = myketEditText;
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        int i;
        int i2;
        synchronized (this) {
            j = this.w;
            this.w = 0L;
        }
        long j2 = j & 1;
        if (j2 != 0) {
            i = sj8.b().n;
            i2 = sj8.b().m;
        } else {
            i = 0;
            i2 = 0;
        }
        if (j2 != 0) {
            this.v.setTextColor(i2);
            this.v.setHintTextColor(i);
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
