package defpackage;

import android.content.res.ColorStateList;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.views.MyketRadioButton;

/* JADX INFO: loaded from: classes3.dex */
public final class c13 extends a79 {
    public final ConstraintLayout v;
    public final MyketRadioButton w;
    public long x;

    public c13(ea1 ea1Var, View view, ConstraintLayout constraintLayout, MyketRadioButton myketRadioButton) {
        super(0, view, ea1Var);
        this.v = constraintLayout;
        this.w = myketRadioButton;
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
            i = sj8.b().v;
            i2 = sj8.b().m;
        } else {
            i = 0;
            i2 = 0;
        }
        if (j2 != 0) {
            if (a79.r >= 21) {
                this.w.setButtonTintList(ColorStateList.valueOf(i));
            }
            this.w.setTextColor(i2);
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
