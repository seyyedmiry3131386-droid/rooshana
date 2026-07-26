package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.theme.Ripple;
import ir.mservices.market.views.AvatarImageView;
import ir.mservices.market.views.BuzzProgressImageView;
import ir.mservices.market.views.MyketImageButton;
import ir.mservices.market.views.MyketRatingBar;
import ir.mservices.market.views.MyketTextView;
import ir.mservices.market.views.SmallRegularTextButton;

/* JADX INFO: loaded from: classes3.dex */
public final class y87 extends x87 {
    public static final SparseIntArray T;
    public long S;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        T = sparseIntArray;
        sparseIntArray.put(rr6.layout, 15);
        sparseIntArray.put(rr6.verify_icon, 16);
        sparseIntArray.put(rr6.rate, 17);
        sparseIntArray.put(rr6.avatar, 18);
        sparseIntArray.put(rr6.like, 19);
        sparseIntArray.put(rr6.dislike, 20);
        sparseIntArray.put(rr6.developer_layout, 21);
        sparseIntArray.put(rr6.developer_like, 22);
        sparseIntArray.put(rr6.developer_dislike, 23);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public y87(View view) {
        Object[] objArrI0 = a79.i0(view, 24, null, T);
        AvatarImageView avatarImageView = (AvatarImageView) objArrI0[18];
        MyketTextView myketTextView = (MyketTextView) objArrI0[4];
        MyketTextView myketTextView2 = (MyketTextView) objArrI0[5];
        FrameLayout frameLayout = (FrameLayout) objArrI0[0];
        MyketTextView myketTextView3 = (MyketTextView) objArrI0[6];
        MyketTextView myketTextView4 = (MyketTextView) objArrI0[12];
        MyketTextView myketTextView5 = (MyketTextView) objArrI0[11];
        BuzzProgressImageView buzzProgressImageView = (BuzzProgressImageView) objArrI0[23];
        MyketTextView myketTextView6 = (MyketTextView) objArrI0[14];
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrI0[21];
        BuzzProgressImageView buzzProgressImageView2 = (BuzzProgressImageView) objArrI0[22];
        MyketTextView myketTextView7 = (MyketTextView) objArrI0[13];
        MyketTextView myketTextView8 = (MyketTextView) objArrI0[10];
        BuzzProgressImageView buzzProgressImageView3 = (BuzzProgressImageView) objArrI0[20];
        MyketTextView myketTextView9 = (MyketTextView) objArrI0[9];
        super(null, view, avatarImageView, myketTextView, myketTextView2, frameLayout, myketTextView3, myketTextView4, myketTextView5, buzzProgressImageView, myketTextView6, constraintLayout, buzzProgressImageView2, myketTextView7, myketTextView8, buzzProgressImageView3, myketTextView9, (BuzzProgressImageView) objArrI0[19], (MyketTextView) objArrI0[8], (MyketImageButton) objArrI0[1], (MyketTextView) objArrI0[3], (MyketRatingBar) objArrI0[17], (SmallRegularTextButton) objArrI0[2], (SmallRegularTextButton) objArrI0[7], (ImageView) objArrI0[16]);
        this.S = -1L;
        this.w.setTag(null);
        this.x.setTag(null);
        this.y.setTag(null);
        this.z.setTag(null);
        this.A.setTag(null);
        this.B.setTag(null);
        this.D.setTag(null);
        this.G.setTag(null);
        this.H.setTag(null);
        this.J.setTag(null);
        this.L.setTag(null);
        this.M.setTag(null);
        this.N.setTag(null);
        this.P.setTag(null);
        this.Q.setTag(null);
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
            j = this.S;
            this.S = 0L;
        }
        long j2 = j & 1;
        if (j2 != 0) {
            Ripple ripple = sj8.b().O;
            i = sj8.b().n;
            i3 = sj8.b().m;
            i2 = ripple.c;
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
        }
        if (j2 != 0) {
            this.w.setTextColor(i3);
            this.x.setTextColor(i);
            uy6.p(this.y, i2, null);
            this.z.setTextColor(i);
            this.A.setTextColor(i3);
            this.B.setTextColor(i);
            this.D.setTextColor(i3);
            this.G.setTextColor(i3);
            this.H.setTextColor(i3);
            this.J.setTextColor(i3);
            this.L.setTextColor(i3);
            uy6.n(i2, this.M);
            this.N.setTextColor(i);
            uy6.m(i2, this.P);
            uy6.m(i2, this.Q);
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.S != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.S = 1L;
        }
        k0();
    }
}
