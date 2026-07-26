package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes3.dex */
public final class l63 extends a79 {
    public final /* synthetic */ int v;
    public long w;
    public final ViewGroup x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l63(ea1 ea1Var, View view, ViewGroup viewGroup, int i) {
        super(0, view, ea1Var);
        this.v = i;
        this.x = viewGroup;
    }

    private final void n0() {
        synchronized (this) {
            this.w = 0L;
        }
    }

    private final boolean o0() {
        synchronized (this) {
            try {
                return this.w != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private final void p0() {
        synchronized (this) {
            this.w = 1L;
        }
        k0();
    }

    @Override // defpackage.a79
    public final void b0() {
        switch (this.v) {
            case 0:
                n0();
                return;
            default:
                synchronized (this) {
                    this.w = 0L;
                    break;
                }
                return;
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        switch (this.v) {
            case 0:
                return o0();
            default:
                synchronized (this) {
                    try {
                        return this.w != 0;
                    } finally {
                    }
                }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        switch (this.v) {
            case 0:
                p0();
                return;
            default:
                synchronized (this) {
                    this.w = 1L;
                    break;
                }
                k0();
                return;
        }
    }
}
