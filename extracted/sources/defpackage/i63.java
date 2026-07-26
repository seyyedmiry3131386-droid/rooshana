package defpackage;

import android.view.View;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class i63 extends a79 {
    public final MyketTextView v;
    public final /* synthetic */ int w;
    public long x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i63(ea1 ea1Var, View view, MyketTextView myketTextView, int i) {
        super(0, view, ea1Var);
        this.w = i;
        this.v = myketTextView;
    }

    private final void n0() {
        long j;
        synchronized (this) {
            j = this.x;
            this.x = 0L;
        }
        long j2 = j & 1;
        int i = j2 != 0 ? sj8.b().n : 0;
        if (j2 != 0) {
            this.v.setTextColor(i);
        }
    }

    private final boolean o0() {
        synchronized (this) {
            try {
                return this.x != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void p0() {
        synchronized (this) {
            this.x = 1L;
        }
        k0();
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        switch (this.w) {
            case 0:
                n0();
                return;
            default:
                synchronized (this) {
                    j = this.x;
                    this.x = 0L;
                    break;
                }
                long j2 = j & 1;
                int i = j2 != 0 ? sj8.b().n : 0;
                if (j2 != 0) {
                    this.v.setTextColor(i);
                    return;
                }
                return;
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        switch (this.w) {
            case 0:
                return o0();
            default:
                synchronized (this) {
                    try {
                        return this.x != 0;
                    } finally {
                    }
                }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        switch (this.w) {
            case 0:
                p0();
                return;
            default:
                synchronized (this) {
                    this.x = 1L;
                    break;
                }
                k0();
                return;
        }
    }
}
