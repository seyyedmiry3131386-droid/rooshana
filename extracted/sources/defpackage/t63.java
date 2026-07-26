package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.social.mynet.view.HeaderInfoItemView;
import ir.mservices.market.views.AvatarImageView;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class t63 extends r63 {
    public static final SparseIntArray F;
    public final View C;
    public final View D;
    public long E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        F = sparseIntArray;
        sparseIntArray.put(rr6.avatar, 5);
        sparseIntArray.put(rr6.follower, 6);
        sparseIntArray.put(rr6.following, 7);
        sparseIntArray.put(rr6.level, 8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public t63(View view) {
        Object[] objArrI0 = a79.i0(view, 9, null, F);
        super(null, view, (AvatarImageView) objArrI0[5], (MyketTextView) objArrI0[2], (HeaderInfoItemView) objArrI0[6], (HeaderInfoItemView) objArrI0[7], (HeaderInfoItemView) objArrI0[8], (MyketTextView) objArrI0[1], (ConstraintLayout) objArrI0[0]);
        this.E = -1L;
        this.w.setTag(null);
        View view2 = (View) objArrI0[3];
        this.C = view2;
        view2.setTag(null);
        View view3 = (View) objArrI0[4];
        this.D = view3;
        view3.setTag(null);
        this.A.setTag(null);
        this.B.setTag(null);
        l0(view);
        g0();
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        int i;
        int i2;
        int i3;
        synchronized (this) {
            j = this.E;
            this.E = 0L;
        }
        long j2 = j & 1;
        if (j2 != 0) {
            i = sj8.b().v;
            i2 = sj8.b().n;
            i3 = sj8.b().m;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        if (j2 != 0) {
            this.w.setTextColor(i2);
            t61.s(i, this.C);
            t61.s(i, this.D);
            this.A.setTextColor(i3);
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.E != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.E = 1L;
        }
        k0();
    }
}
