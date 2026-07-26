package defpackage;

import android.util.SparseIntArray;
import android.view.View;
import android.widget.LinearLayout;
import ir.mservices.market.views.DialogButtonComponent;
import ir.mservices.market.views.MyketEditText;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class kz3 extends jz3 {
    public static final SparseIntArray E;
    public long D;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        E = sparseIntArray;
        sparseIntArray.put(rr6.message, 2);
        sparseIntArray.put(rr6.function, 3);
        sparseIntArray.put(rr6.second_edit_txt, 4);
        sparseIntArray.put(rr6.first_edit_txt, 5);
        sparseIntArray.put(rr6.button, 6);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public kz3(View view) {
        Object[] objArrI0 = a79.i0(view, 7, null, E);
        super(null, view, (DialogButtonComponent) objArrI0[6], (MyketTextView) objArrI0[1], (MyketEditText) objArrI0[5], (MyketTextView) objArrI0[3], (LinearLayout) objArrI0[0], (MyketTextView) objArrI0[2], (MyketEditText) objArrI0[4]);
        this.D = -1L;
        this.w.setTag(null);
        this.z.setTag(null);
        l0(view);
        g0();
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        synchronized (this) {
            j = this.D;
            this.D = 0L;
        }
        long j2 = j & 1;
        int i = j2 != 0 ? sj8.b().A : 0;
        if (j2 != 0) {
            this.w.setTextColor(i);
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.D != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.D = 1L;
        }
        k0();
    }
}
