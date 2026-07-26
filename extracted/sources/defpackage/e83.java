package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class e83 extends a79 {
    public final MyketTextView A;
    public long B;
    public final MyketTextView v;
    public final MyketTextView w;
    public final FrameLayout x;
    public final MyketTextView y;
    public final MyketTextView z;

    public e83(ea1 ea1Var, View view, MyketTextView myketTextView, MyketTextView myketTextView2, FrameLayout frameLayout, MyketTextView myketTextView3, MyketTextView myketTextView4, MyketTextView myketTextView5) {
        super(0, view, ea1Var);
        this.v = myketTextView;
        this.w = myketTextView2;
        this.x = frameLayout;
        this.y = myketTextView3;
        this.z = myketTextView4;
        this.A = myketTextView5;
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        int i;
        int i2;
        synchronized (this) {
            j = this.B;
            this.B = 0L;
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
            this.v.setTextColor(i);
            this.w.setTextColor(i);
            this.y.setTextColor(i);
            this.z.setTextColor(i2);
            this.A.setTextColor(i);
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.B != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.B = 1L;
        }
        k0();
    }
}
