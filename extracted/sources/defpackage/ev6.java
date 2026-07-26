package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.LinearLayout;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class ev6 extends a79 {
    public final MyketTextView v;
    public final LinearLayout w;
    public long x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ev6(View view) {
        super(0, view, null);
        Object[] objArrI0 = a79.i0(view, 2, null, null);
        MyketTextView myketTextView = (MyketTextView) objArrI0[1];
        this.v = myketTextView;
        this.x = -1L;
        LinearLayout linearLayout = (LinearLayout) objArrI0[0];
        this.w = linearLayout;
        linearLayout.setTag(null);
        this.v.setTag(null);
        l0(view);
        g0();
    }

    @Override // defpackage.a79
    public final void b0() {
        long j;
        int i;
        int i2;
        synchronized (this) {
            j = this.x;
            this.x = 0L;
        }
        long j2 = j & 1;
        if (j2 != 0) {
            i = sj8.b().q;
            i2 = sj8.b().n;
        } else {
            i = 0;
            i2 = 0;
        }
        if (j2 != 0) {
            this.w.setBackground(new ColorDrawable(i));
            this.v.setTextColor(i2);
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
