package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.core.widget.NestedScrollView;
import ir.mservices.market.views.DialogHeaderComponent;
import ir.mservices.market.views.LoginInfoView;
import ir.mservices.market.virtualKeyboard.VirtualKeyboardView;

/* JADX INFO: loaded from: classes3.dex */
public final class nn1 extends ln1 {
    public static final SparseIntArray F;
    public long E;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        F = sparseIntArray;
        sparseIntArray.put(rr6.header, 3);
        sparseIntArray.put(rr6.logo_icon, 4);
        sparseIntArray.put(rr6.logo_text, 5);
        sparseIntArray.put(rr6.info, 6);
        sparseIntArray.put(rr6.keyboard, 7);
        sparseIntArray.put(rr6.content, 8);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public nn1(View view) {
        Object[] objArrI0 = a79.i0(view, 9, null, F);
        super(null, view, (FrameLayout) objArrI0[8], (View) objArrI0[1], (View) objArrI0[2], (DialogHeaderComponent) objArrI0[3], (LoginInfoView) objArrI0[6], (VirtualKeyboardView) objArrI0[7], (ImageView) objArrI0[4], (ImageView) objArrI0[5]);
        this.E = -1L;
        this.w.setTag(null);
        this.x.setTag(null);
        ((NestedScrollView) objArrI0[0]).setTag(null);
        l0(view);
        g0();
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        synchronized (this) {
            j = this.E;
            this.E = 0L;
        }
        long j2 = j & 1;
        int i = j2 != 0 ? sj8.b().v : 0;
        if (j2 != 0) {
            t61.s(i, this.w);
            t61.s(i, this.x);
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
