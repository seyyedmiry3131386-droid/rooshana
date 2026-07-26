package defpackage;

import android.view.View;
import android.widget.ImageView;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class ut extends a79 {
    public static final /* synthetic */ int A = 0;
    public final MyketTextView v;
    public final ImageView w;
    public final ImageView x;
    public final MyketTextView y;
    public long z;

    /* JADX WARN: Illegal instructions before constructor call */
    public ut(View[] viewArr) {
        Object[] objArrJ0 = a79.j0(viewArr, 4, null);
        View view = viewArr[0];
        MyketTextView myketTextView = (MyketTextView) objArrJ0[3];
        ImageView imageView = (ImageView) objArrJ0[1];
        ImageView imageView2 = (ImageView) objArrJ0[0];
        MyketTextView myketTextView2 = (MyketTextView) objArrJ0[2];
        super(0, view, null);
        this.v = myketTextView;
        this.w = imageView;
        this.x = imageView2;
        this.y = myketTextView2;
        this.z = -1L;
        this.v.setTag(null);
        this.w.setTag(null);
        this.x.setTag(null);
        this.y.setTag(null);
        m0(viewArr);
        g0();
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        int i;
        int i2;
        synchronized (this) {
            j = this.z;
            this.z = 0L;
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
            this.y.setTextColor(i2);
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.z != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.z = 1L;
        }
        k0();
    }
}
