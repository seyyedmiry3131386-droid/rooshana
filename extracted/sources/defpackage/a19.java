package defpackage;

import android.view.View;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class a19 extends a79 {
    public static final /* synthetic */ int y = 0;
    public final MyketTextView v;
    public final MyketTextView w;
    public long x;

    /* JADX WARN: Illegal instructions before constructor call */
    public a19(View[] viewArr) {
        Object[] objArrJ0 = a79.j0(viewArr, 2, null);
        View view = viewArr[0];
        MyketTextView myketTextView = (MyketTextView) objArrJ0[0];
        MyketTextView myketTextView2 = (MyketTextView) objArrJ0[1];
        super(0, view, null);
        this.v = myketTextView;
        this.w = myketTextView2;
        this.x = -1L;
        this.v.setTag(null);
        this.w.setTag(null);
        m0(viewArr);
        g0();
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        int i;
        int i2;
        synchronized (this) {
            j = this.x;
            this.x = 0L;
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
            this.w.setTextColor(i);
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.x != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.x = 1L;
        }
        k0();
    }
}
