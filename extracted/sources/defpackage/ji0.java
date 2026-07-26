package defpackage;

import android.view.View;
import ir.mservices.market.views.BigTextButton;

/* JADX INFO: loaded from: classes3.dex */
public final class ji0 extends ii0 {
    public final /* synthetic */ int x;
    public long y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ji0(ea1 ea1Var, View view, BigTextButton bigTextButton, int i) {
        super(ea1Var, view, bigTextButton);
        this.x = i;
    }

    private final void n0() {
        long j;
        synchronized (this) {
            j = this.y;
            this.y = 0L;
        }
        long j2 = j & 1;
        int i = j2 != 0 ? sj8.b().O.c : 0;
        if (j2 != 0) {
            uy6.m(i, this.v);
        }
    }

    private final boolean o0() {
        synchronized (this) {
            try {
                return this.y != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void p0() {
        synchronized (this) {
            this.y = 1L;
        }
        k0();
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        switch (this.x) {
            case 0:
                n0();
                return;
            default:
                synchronized (this) {
                    j = this.y;
                    this.y = 0L;
                    break;
                }
                long j2 = j & 1;
                int i = j2 != 0 ? sj8.b().O.c : 0;
                if (j2 != 0) {
                    uy6.m(i, this.v);
                    return;
                }
                return;
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        switch (this.x) {
            case 0:
                return o0();
            default:
                synchronized (this) {
                    try {
                        return this.y != 0;
                    } finally {
                    }
                }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        switch (this.x) {
            case 0:
                p0();
                return;
            default:
                synchronized (this) {
                    this.y = 1L;
                    break;
                }
                k0();
                return;
        }
    }
}
