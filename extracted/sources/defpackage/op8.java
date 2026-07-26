package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.ImageView;
import android.widget.ScrollView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ir.mservices.market.theme.AlphaColor;
import ir.mservices.market.views.DialogButtonComponent;
import ir.mservices.market.views.MyketEditText;
import ir.mservices.market.views.MyketTextView;

/* JADX INFO: loaded from: classes3.dex */
public final class op8 extends np8 {
    public static final SparseIntArray G;
    public final MyketTextView D;
    public final MyketTextView E;
    public long F;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        G = sparseIntArray;
        sparseIntArray.put(rr6.layout, 7);
        sparseIntArray.put(rr6.arrow, 8);
        sparseIntArray.put(rr6.icon_check, 9);
        sparseIntArray.put(rr6.input, 10);
        sparseIntArray.put(rr6.dialog_button, 11);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public op8(View view) {
        Object[] objArrI0 = a79.i0(view, 12, null, G);
        DialogButtonComponent dialogButtonComponent = (DialogButtonComponent) objArrI0[11];
        MyketEditText myketEditText = (MyketEditText) objArrI0[5];
        MyketTextView myketTextView = (MyketTextView) objArrI0[6];
        ImageView imageView = (ImageView) objArrI0[9];
        super(null, view, dialogButtonComponent, myketEditText, myketTextView, imageView, (ConstraintLayout) objArrI0[7], (MyketTextView) objArrI0[1], (MyketTextView) objArrI0[3]);
        this.F = -1L;
        this.w.setTag(null);
        this.x.setTag(null);
        ((ScrollView) objArrI0[0]).setTag(null);
        MyketTextView myketTextView2 = (MyketTextView) objArrI0[2];
        this.D = myketTextView2;
        myketTextView2.setTag(null);
        MyketTextView myketTextView3 = (MyketTextView) objArrI0[4];
        this.E = myketTextView3;
        myketTextView3.setTag(null);
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
        int i4;
        synchronized (this) {
            j = this.F;
            this.F = 0L;
        }
        long j2 = j & 1;
        int i5 = 0;
        if (j2 != 0) {
            i = sj8.b().A;
            AlphaColor alphaColor = sj8.b().J;
            i2 = sj8.b().x;
            i3 = sj8.b().N;
            i4 = sj8.b().m;
            if (alphaColor != null) {
                i5 = alphaColor.a;
            }
        } else {
            i = 0;
            i2 = 0;
            i3 = 0;
            i4 = 0;
        }
        if (j2 != 0) {
            this.w.setTextColor(i5);
            this.x.setTextColor(i);
            this.D.setTextColor(i4);
            this.E.setTextColor(i4);
            this.A.setTextColor(i2);
            this.B.setBackground(new ColorDrawable(i3));
            this.B.setTextColor(i4);
        }
    }

    @Override // defpackage.a79
    public final boolean e0() {
        synchronized (this) {
            try {
                return this.F != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.a79
    public final void g0() {
        synchronized (this) {
            this.F = 1L;
        }
        k0();
    }
}
