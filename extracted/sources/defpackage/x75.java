package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class x75 extends a79 {
    public static final /* synthetic */ int z = 0;
    public final LinearLayout v;
    public final MyketTextView w;
    public final MyketTextView x;
    public long y;

    public x75(ea1 ea1Var, View view, LinearLayout linearLayout, MyketTextView myketTextView, MyketTextView myketTextView2) {
        super(0, view, ea1Var);
        this.v = linearLayout;
        this.w = myketTextView;
        this.x = myketTextView2;
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        synchronized (this) {
            j = this.y;
            this.y = 0L;
        }
        long j2 = j & 1;
        int i = j2 != 0 ? sj8.d(sj8.f).l : 0;
        if (j2 != 0) {
            this.w.setTextColor(i);
            this.x.setTextColor(i);
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.y != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.y = 1L;
        }
        k0();
    }
}
