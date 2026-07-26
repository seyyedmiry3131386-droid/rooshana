package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import ir.mservices.market.theme.AlphaColor;
import ir.mservices.market.theme.Ripple;
import ir.mservices.market.views.LoadingView;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class x90 extends w90 {
    public static final SparseIntArray L;
    public final MyketTextView J;
    public long K;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        L = sparseIntArray;
        sparseIntArray.put(rr6.content, 5);
        sparseIntArray.put(rr6.progress_group, 6);
        sparseIntArray.put(rr6.progress_background, 7);
        sparseIntArray.put(rr6.progressLayout, 8);
        sparseIntArray.put(rr6.loading, 9);
        sparseIntArray.put(rr6.activity_back, 10);
        sparseIntArray.put(rr6.unlock_group, 11);
        sparseIntArray.put(rr6.unlock_shadow, 12);
        sparseIntArray.put(rr6.unlock, 13);
        sparseIntArray.put(rr6.skip_credit, 14);
        sparseIntArray.put(rr6.replay, 15);
        sparseIntArray.put(rr6.bottom_shadow, 16);
        sparseIntArray.put(rr6.top_shadow, 17);
        sparseIntArray.put(rr6.headerGroup, 18);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public x90(View view) {
        Object[] objArrI0 = a79.i0(view, 19, null, L);
        ImageView imageView = (ImageView) objArrI0[10];
        FrameLayout frameLayout = (FrameLayout) objArrI0[2];
        View view2 = (View) objArrI0[16];
        FrameLayout frameLayout2 = (FrameLayout) objArrI0[5];
        Group group = (Group) objArrI0[18];
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrI0[0];
        LoadingView loadingView = (LoadingView) objArrI0[9];
        View view3 = (View) objArrI0[7];
        Group group2 = (Group) objArrI0[6];
        MyketTextView myketTextView = (MyketTextView) objArrI0[4];
        MyketTextView myketTextView2 = (MyketTextView) objArrI0[3];
        View view4 = (View) objArrI0[17];
        super(null, view, imageView, frameLayout, view2, frameLayout2, group, constraintLayout, loadingView, view3, group2, myketTextView, myketTextView2, view4, (View) objArrI0[12]);
        this.K = -1L;
        this.w.setTag(null);
        this.A.setTag(null);
        MyketTextView myketTextView3 = (MyketTextView) objArrI0[1];
        this.J = myketTextView3;
        myketTextView3.setTag(null);
        this.E.setTag(null);
        this.F.setTag(null);
        l0(view);
        g0();
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        int i;
        int i2;
        synchronized (this) {
            j = this.K;
            this.K = 0L;
        }
        long j2 = j & 1;
        if (j2 != 0) {
            Ripple ripple = sj8.c(sj8.f).O;
            AlphaColor alphaColor = sj8.b().J;
            AlphaColor alphaColor2 = sj8.b().I;
            int i3 = ripple.c;
            i2 = alphaColor != null ? alphaColor.a : 0;
            i = alphaColor2 != null ? alphaColor2.a : 0;
            i = i3;
        } else {
            i = 0;
            i2 = 0;
        }
        if (j2 != 0) {
            uy6.o(i, this.w);
            o40.D(i2, this.A);
            this.J.setTextColor(i);
            this.E.setTextColor(i);
            this.F.setTextColor(i);
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.K != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.K = 1L;
        }
        k0();
    }
}
