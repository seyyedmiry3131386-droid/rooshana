package defpackage;

import android.view.View;
import android.widget.ImageView;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class e19 extends a79 {
    public static final /* synthetic */ int y = 0;
    public final ImageView v;
    public final MyketTextView w;
    public long x;

    /* JADX WARN: Illegal instructions before constructor call */
    public e19(View[] viewArr) {
        Object[] objArrJ0 = a79.j0(viewArr, 2, null);
        View view = viewArr[0];
        ImageView imageView = (ImageView) objArrJ0[0];
        MyketTextView myketTextView = (MyketTextView) objArrJ0[1];
        super(0, view, null);
        this.v = imageView;
        this.w = myketTextView;
        this.x = -1L;
        this.v.setTag(null);
        this.w.setTag(null);
        m0(viewArr);
        g0();
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        synchronized (this) {
            j = this.x;
            this.x = 0L;
        }
        long j2 = j & 1;
        int i = j2 != 0 ? sj8.b().n : 0;
        if (j2 != 0) {
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
