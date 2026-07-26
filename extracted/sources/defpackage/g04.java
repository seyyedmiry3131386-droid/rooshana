package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import androidx.core.view.insets.ProtectionLayout;
import com.google.android.material.circularreveal.CircularRevealFrameLayout;

/* JADX INFO: loaded from: classes3.dex */
public final class g04 extends f04 {
    public static final sk6 F;
    public static final SparseIntArray G;
    public final ve5 D;
    public long E;

    static {
        sk6 sk6Var = new sk6(10);
        F = sk6Var;
        sk6Var.J(1, new String[]{"myket_navigation_menu"}, new int[]{8}, new int[]{js6.myket_navigation_menu});
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(rr6.theme_reveal, 9);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public g04(View view) {
        Object[] objArrI0 = a79.i0(view, 10, F, G);
        FrameLayout frameLayout = (FrameLayout) objArrI0[5];
        FrameLayout frameLayout2 = (FrameLayout) objArrI0[6];
        FrameLayout frameLayout3 = (FrameLayout) objArrI0[4];
        ProtectionLayout protectionLayout = (ProtectionLayout) objArrI0[0];
        CircularRevealFrameLayout circularRevealFrameLayout = (CircularRevealFrameLayout) objArrI0[1];
        FrameLayout frameLayout4 = (FrameLayout) objArrI0[3];
        super(null, view, frameLayout, frameLayout2, frameLayout3, protectionLayout, circularRevealFrameLayout, frameLayout4, (RelativeLayout) objArrI0[2], (FrameLayout) objArrI0[7]);
        this.E = -1L;
        this.v.setTag(null);
        this.w.setTag(null);
        this.x.setTag(null);
        this.y.setTag(null);
        ve5 ve5Var = (ve5) objArrI0[8];
        this.D = ve5Var;
        if (ve5Var != null) {
            ve5Var.q = this;
        }
        this.z.setTag(null);
        this.A.setTag(null);
        this.B.setTag(null);
        this.C.setTag(null);
        l0(view);
        g0();
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        int i;
        int i2;
        synchronized (this) {
            j = this.E;
            this.E = 0L;
        }
        long j2 = j & 1;
        if (j2 != 0) {
            i = sj8.b().l;
            i2 = sj8.b().N;
        } else {
            i = 0;
            i2 = 0;
        }
        if (j2 != 0) {
            this.v.setBackground(new ColorDrawable(i2));
            this.w.setBackground(new ColorDrawable(i));
            this.x.setBackground(new ColorDrawable(i2));
            this.A.setBackground(new ColorDrawable(i2));
            this.B.setBackground(new ColorDrawable(i2));
            this.C.setBackground(new ColorDrawable(i2));
        }
        this.D.c0();
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                if (this.E != 0) {
                    return true;
                }
                return this.D.e0();
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
        this.D.g0();
        k0();
    }
}
