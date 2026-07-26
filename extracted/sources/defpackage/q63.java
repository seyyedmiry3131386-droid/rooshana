package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.social.profile.common.AvatarPreview;
import ir.mservices.market.theme.Ripple;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class q63 extends p63 {
    public static final SparseIntArray z;
    public final ConstraintLayout x;
    public long y;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        z = sparseIntArray;
        sparseIntArray.put(rr6.avatar_preview_holder, 2);
        sparseIntArray.put(rr6.see_follow_request, 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public q63(View view) {
        Object[] objArrI0 = a79.i0(view, 4, null, z);
        AvatarPreview avatarPreview = (AvatarPreview) objArrI0[2];
        MyketTextView myketTextView = (MyketTextView) objArrI0[1];
        super(null, view, avatarPreview, myketTextView);
        this.y = -1L;
        ConstraintLayout constraintLayout = (ConstraintLayout) objArrI0[0];
        this.x = constraintLayout;
        constraintLayout.setTag(null);
        this.w.setTag(null);
        l0(view);
        g0();
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        int i;
        int i2;
        synchronized (this) {
            j = this.y;
            this.y = 0L;
        }
        long j2 = j & 1;
        if (j2 != 0) {
            Ripple ripple = sj8.b().O;
            i = sj8.b().n;
            i2 = ripple.c;
        } else {
            i = 0;
            i2 = 0;
        }
        if (j2 != 0) {
            uy6.m(i2, this.x);
            this.w.setTextColor(i);
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
