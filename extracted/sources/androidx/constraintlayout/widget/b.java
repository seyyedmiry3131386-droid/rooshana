package androidx.constraintlayout.widget;

import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.core.widgets.ConstraintWidget$DimensionBehaviour;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.ea0;
import defpackage.f31;
import defpackage.fa0;
import defpackage.g31;
import defpackage.qu7;
import defpackage.rf0;
import defpackage.sa9;
import defpackage.v21;

/* JADX INFO: loaded from: classes.dex */
public final class b implements fa0 {
    public final ConstraintLayout a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public final /* synthetic */ ConstraintLayout h;

    public b(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2) {
        this.h = constraintLayout;
        this.a = constraintLayout2;
    }

    public static boolean a(int i, int i2, int i3) {
        if (i == i2) {
            return true;
        }
        int mode = View.MeasureSpec.getMode(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode2 == 1073741824) {
            return (mode == Integer.MIN_VALUE || mode == 0) && i3 == size;
        }
        return false;
    }

    public final void b(f31 f31Var, ea0 ea0Var) {
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        int iMax;
        boolean z;
        int measuredWidth;
        int baseline;
        int i;
        if (f31Var == null) {
            return;
        }
        v21 v21Var = f31Var.L;
        v21 v21Var2 = f31Var.J;
        if (f31Var.i0 == 8 && !f31Var.F) {
            ea0Var.e = 0;
            ea0Var.f = 0;
            ea0Var.g = 0;
            return;
        }
        if (f31Var.V == null) {
            return;
        }
        qu7 qu7Var = ConstraintLayout.p;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour = ea0Var.a;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour2 = ea0Var.b;
        int i2 = ea0Var.c;
        int i3 = ea0Var.d;
        int i4 = this.b + this.c;
        int i5 = this.d;
        View view = f31Var.h0;
        int iOrdinal = constraintWidget$DimensionBehaviour.ordinal();
        if (iOrdinal == 0) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i2, 1073741824);
        } else if (iOrdinal == 1) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i5, -2);
        } else if (iOrdinal == 2) {
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f, i5, -2);
            boolean z2 = f31Var.r == 1;
            int i6 = ea0Var.j;
            if (i6 == 1 || i6 == 2) {
                boolean z3 = view.getMeasuredHeight() == f31Var.l();
                if (ea0Var.j == 2 || !z2 || ((z2 && z3) || (view instanceof Placeholder) || f31Var.B())) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(f31Var.r(), 1073741824);
                }
            }
        } else if (iOrdinal != 3) {
            iMakeMeasureSpec = 0;
        } else {
            int i7 = this.f;
            int i8 = v21Var2 != null ? v21Var2.g : 0;
            if (v21Var != null) {
                i8 += v21Var.g;
            }
            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(i7, i5 + i8, -1);
        }
        int iOrdinal2 = constraintWidget$DimensionBehaviour2.ordinal();
        if (iOrdinal2 == 0) {
            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i3, 1073741824);
        } else if (iOrdinal2 == 1) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i4, -2);
        } else if (iOrdinal2 == 2) {
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.g, i4, -2);
            boolean z4 = f31Var.s == 1;
            int i9 = ea0Var.j;
            if (i9 == 1 || i9 == 2) {
                boolean z5 = view.getMeasuredWidth() == f31Var.r();
                if (ea0Var.j == 2 || !z4 || ((z4 && z5) || (view instanceof Placeholder) || f31Var.C())) {
                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(f31Var.l(), 1073741824);
                }
            }
        } else if (iOrdinal2 != 3) {
            iMakeMeasureSpec2 = 0;
        } else {
            int i10 = this.g;
            int i11 = v21Var2 != null ? f31Var.K.g : 0;
            if (v21Var != null) {
                i11 += f31Var.M.g;
            }
            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(i10, i4 + i11, -1);
        }
        g31 g31Var = (g31) f31Var.V;
        ConstraintLayout constraintLayout = this.h;
        if (g31Var != null && rf0.s(constraintLayout.i, 256) && view.getMeasuredWidth() == f31Var.r() && view.getMeasuredWidth() < g31Var.r() && view.getMeasuredHeight() == f31Var.l() && view.getMeasuredHeight() < g31Var.l() && view.getBaseline() == f31Var.c0 && !f31Var.A() && a(f31Var.H, iMakeMeasureSpec, f31Var.r()) && a(f31Var.I, iMakeMeasureSpec2, f31Var.l())) {
            ea0Var.e = f31Var.r();
            ea0Var.f = f31Var.l();
            ea0Var.g = f31Var.c0;
            return;
        }
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour3 = ConstraintWidget$DimensionBehaviour.c;
        boolean z6 = constraintWidget$DimensionBehaviour == constraintWidget$DimensionBehaviour3;
        boolean z7 = constraintWidget$DimensionBehaviour2 == constraintWidget$DimensionBehaviour3;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour4 = ConstraintWidget$DimensionBehaviour.a;
        ConstraintWidget$DimensionBehaviour constraintWidget$DimensionBehaviour5 = ConstraintWidget$DimensionBehaviour.d;
        boolean z8 = constraintWidget$DimensionBehaviour2 == constraintWidget$DimensionBehaviour5 || constraintWidget$DimensionBehaviour2 == constraintWidget$DimensionBehaviour4;
        boolean z9 = constraintWidget$DimensionBehaviour == constraintWidget$DimensionBehaviour5 || constraintWidget$DimensionBehaviour == constraintWidget$DimensionBehaviour4;
        boolean z10 = z6 && f31Var.Y > 0.0f;
        boolean z11 = z7 && f31Var.Y > 0.0f;
        if (view == null) {
            return;
        }
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) view.getLayoutParams();
        int i12 = ea0Var.j;
        if (i12 != 1 && i12 != 2 && z6 && f31Var.r == 0 && z7 && f31Var.s == 0) {
            z = false;
            measuredWidth = 0;
            baseline = 0;
            i = -1;
            iMax = 0;
        } else {
            if ((view instanceof VirtualLayout) && (f31Var instanceof sa9)) {
                ((VirtualLayout) view).r((sa9) f31Var, iMakeMeasureSpec, iMakeMeasureSpec2);
            } else {
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            }
            f31Var.H = iMakeMeasureSpec;
            f31Var.I = iMakeMeasureSpec2;
            f31Var.g = false;
            int measuredWidth2 = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            int baseline2 = view.getBaseline();
            int i13 = f31Var.u;
            int iMax2 = i13 > 0 ? Math.max(i13, measuredWidth2) : measuredWidth2;
            int i14 = f31Var.v;
            if (i14 > 0) {
                iMax2 = Math.min(i14, iMax2);
            }
            int i15 = f31Var.x;
            iMax = i15 > 0 ? Math.max(i15, measuredHeight) : measuredHeight;
            int i16 = iMakeMeasureSpec2;
            int i17 = f31Var.y;
            if (i17 > 0) {
                iMax = Math.min(i17, iMax);
            }
            if (!rf0.s(constraintLayout.i, 1)) {
                if (z10 && z8) {
                    iMax2 = (int) ((iMax * f31Var.Y) + 0.5f);
                } else if (z11 && z9) {
                    iMax = (int) ((iMax2 / f31Var.Y) + 0.5f);
                }
            }
            if (measuredWidth2 == iMax2 && measuredHeight == iMax) {
                baseline = baseline2;
                measuredWidth = iMax2;
                z = false;
            } else {
                if (measuredWidth2 != iMax2) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824);
                }
                int iMakeMeasureSpec3 = measuredHeight != iMax ? View.MeasureSpec.makeMeasureSpec(iMax, 1073741824) : i16;
                view.measure(iMakeMeasureSpec, iMakeMeasureSpec3);
                f31Var.H = iMakeMeasureSpec;
                f31Var.I = iMakeMeasureSpec3;
                z = false;
                f31Var.g = false;
                measuredWidth = view.getMeasuredWidth();
                int measuredHeight2 = view.getMeasuredHeight();
                baseline = view.getBaseline();
                iMax = measuredHeight2;
            }
            i = -1;
        }
        boolean z12 = baseline != i ? true : z;
        ea0Var.i = (measuredWidth == ea0Var.c && iMax == ea0Var.d) ? z : true;
        boolean z13 = layoutParams.c0 ? true : z12;
        if (z13 && baseline != -1 && f31Var.c0 != baseline) {
            ea0Var.i = true;
        }
        ea0Var.e = measuredWidth;
        ea0Var.f = iMax;
        ea0Var.h = z13;
        ea0Var.g = baseline;
    }
}
