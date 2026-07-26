package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class xv4 extends a79 {
    public static final /* synthetic */ int C = 0;
    public final MyketTextView A;
    public long B;
    public final MyketTextView v;
    public final ImageView w;
    public final ImageView x;
    public final ImageView y;
    public final ProgressBar z;

    /* JADX WARN: Illegal instructions before constructor call */
    public xv4(View[] viewArr) {
        Object[] objArrJ0 = a79.j0(viewArr, 6, null);
        View view = viewArr[0];
        MyketTextView myketTextView = (MyketTextView) objArrJ0[2];
        ImageView imageView = (ImageView) objArrJ0[4];
        ImageView imageView2 = (ImageView) objArrJ0[3];
        ImageView imageView3 = (ImageView) objArrJ0[0];
        ProgressBar progressBar = (ProgressBar) objArrJ0[5];
        MyketTextView myketTextView2 = (MyketTextView) objArrJ0[1];
        super(0, view, null);
        this.v = myketTextView;
        this.w = imageView;
        this.x = imageView2;
        this.y = imageView3;
        this.z = progressBar;
        this.A = myketTextView2;
        this.B = -1L;
        this.v.setTag(null);
        this.w.setTag(null);
        this.x.setTag(null);
        this.y.setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        m0(viewArr);
        g0();
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        synchronized (this) {
            j = this.B;
            this.B = 0L;
        }
        long j2 = j & 1;
        int i = j2 != 0 ? sj8.b().O.c : 0;
        if (j2 != 0) {
            uy6.n(i, this.w);
            uy6.n(i, this.x);
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
