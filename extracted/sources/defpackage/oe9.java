package defpackage;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import j$.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class oe9 implements View.OnApplyWindowInsetsListener {
    public final mu0 a;
    public lf9 b;

    public oe9(View view, mu0 mu0Var) {
        lf9 lf9VarB;
        this.a = mu0Var;
        WeakHashMap weakHashMap = q69.a;
        lf9 lf9VarA = i69.a(view);
        if (lf9VarA != null) {
            int i = Build.VERSION.SDK_INT;
            lf9VarB = (i >= 34 ? new ze9(lf9VarA) : i >= 31 ? new ye9(lf9VarA) : i >= 30 ? new xe9(lf9VarA) : i >= 29 ? new we9(lf9VarA) : new ve9(lf9VarA)).b();
        } else {
            lf9VarB = null;
        }
        this.b = lf9VarB;
    }

    @Override // android.view.View.OnApplyWindowInsetsListener
    public final WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
        int[] iArr;
        boolean z;
        if (!view.isLaidOut()) {
            this.b = lf9.h(view, windowInsets);
            return pe9.j(view, windowInsets);
        }
        lf9 lf9VarH = lf9.h(view, windowInsets);
        if9 if9Var = lf9VarH.a;
        if (this.b == null) {
            WeakHashMap weakHashMap = q69.a;
            this.b = i69.a(view);
        }
        if (this.b == null) {
            this.b = lf9VarH;
            return pe9.j(view, windowInsets);
        }
        mu0 mu0VarK = pe9.k(view);
        if (mu0VarK != null && Objects.equals((lf9) mu0VarK.b, lf9VarH)) {
            return pe9.j(view, windowInsets);
        }
        int[] iArr2 = new int[1];
        int[] iArr3 = new int[1];
        lf9 lf9Var = this.b;
        int i = 1;
        while (i <= 512) {
            no3 no3VarG = if9Var.g(i);
            no3 no3VarG2 = lf9Var.a.g(i);
            int i2 = no3VarG.a;
            int i3 = no3VarG.d;
            int i4 = no3VarG.c;
            int i5 = no3VarG.b;
            int i6 = no3VarG2.a;
            int i7 = no3VarG2.d;
            int i8 = no3VarG2.c;
            int i9 = no3VarG2.b;
            if (i2 > i6 || i5 > i9 || i4 > i8 || i3 > i7) {
                iArr = iArr2;
                z = true;
            } else {
                iArr = iArr2;
                z = false;
            }
            if (z != (i2 < i6 || i5 < i9 || i4 < i8 || i3 < i7)) {
                if (z) {
                    iArr[0] = iArr[0] | i;
                } else {
                    iArr3[0] = iArr3[0] | i;
                }
            }
            i <<= 1;
            iArr2 = iArr;
        }
        int i10 = iArr2[0];
        int i11 = iArr3[0];
        int i12 = i10 | i11;
        if (i12 == 0) {
            this.b = lf9VarH;
            return pe9.j(view, windowInsets);
        }
        lf9 lf9Var2 = this.b;
        ue9 ue9Var = new ue9(i12, (i10 & 8) != 0 ? pe9.e : (i11 & 8) != 0 ? pe9.f : (i10 & 519) != 0 ? pe9.g : (i11 & 519) != 0 ? pe9.h : null, (i12 & 8) != 0 ? 160L : 250L);
        ue9Var.a.e(0.0f);
        ValueAnimator duration = ValueAnimator.ofFloat(0.0f, 1.0f).setDuration(ue9Var.a.b());
        no3 no3VarG3 = if9Var.g(i12);
        no3 no3VarG4 = lf9Var2.a.g(i12);
        int iMin = Math.min(no3VarG3.a, no3VarG4.a);
        int i13 = no3VarG3.b;
        int i14 = no3VarG4.b;
        int iMin2 = Math.min(i13, i14);
        int i15 = no3VarG3.c;
        int i16 = no3VarG4.c;
        int iMin3 = Math.min(i15, i16);
        int i17 = no3VarG3.d;
        int i18 = no3VarG4.d;
        rn6 rn6Var = new rn6(no3.c(iMin, iMin2, iMin3, Math.min(i17, i18)), no3.c(Math.max(no3VarG3.a, no3VarG4.a), Math.max(i13, i14), Math.max(i15, i16), Math.max(i17, i18)), 16);
        pe9.g(view, ue9Var, lf9VarH, false);
        duration.addUpdateListener(new ne9(ue9Var, lf9VarH, lf9Var2, i12, view));
        duration.addListener(new jw1(ue9Var, view, 5));
        xt5.a(view, new mn0(view, ue9Var, rn6Var, duration));
        this.b = lf9VarH;
        return pe9.j(view, windowInsets);
    }
}
