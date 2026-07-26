package com.google.android.material.transformation;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.View;
import androidx.coordinatorlayout.widget.c;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import defpackage.do3;
import defpackage.ez4;
import defpackage.fz4;
import defpackage.sl3;
import defpackage.yk;

/* JADX INFO: loaded from: classes.dex */
@Deprecated
public abstract class FabTransformationBehavior extends ExpandableTransformationBehavior {
    public final Rect c;
    public final RectF d;
    public final RectF e;
    public final int[] f;
    public float g;
    public float h;

    public FabTransformationBehavior() {
        this.c = new Rect();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new int[2];
    }

    public static Pair A(float f, float f2, boolean z, do3 do3Var) {
        fz4 fz4VarF;
        fz4 fz4VarF2;
        if (f == 0.0f || f2 == 0.0f) {
            fz4VarF = ((ez4) do3Var.a).f("translationXLinear");
            fz4VarF2 = ((ez4) do3Var.a).f("translationYLinear");
        } else if ((!z || f2 >= 0.0f) && (z || f2 <= 0.0f)) {
            fz4VarF = ((ez4) do3Var.a).f("translationXCurveDownwards");
            fz4VarF2 = ((ez4) do3Var.a).f("translationYCurveDownwards");
        } else {
            fz4VarF = ((ez4) do3Var.a).f("translationXCurveUpwards");
            fz4VarF2 = ((ez4) do3Var.a).f("translationYCurveUpwards");
        }
        return new Pair(fz4VarF, fz4VarF2);
    }

    public static float D(do3 do3Var, fz4 fz4Var, float f) {
        long j = fz4Var.a;
        long j2 = fz4Var.b;
        fz4 fz4VarF = ((ez4) do3Var.a).f("expansion");
        return yk.a(f, 0.0f, fz4Var.b().getInterpolation((((fz4VarF.a + fz4VarF.b) + 17) - j) / j2));
    }

    public final float B(View view, View view2, sl3 sl3Var) {
        RectF rectF = this.d;
        E(view, rectF);
        rectF.offset(this.g, this.h);
        RectF rectF2 = this.e;
        E(view2, rectF2);
        sl3Var.getClass();
        return (rectF2.centerX() - rectF.centerX()) + 0.0f;
    }

    public final float C(View view, View view2, sl3 sl3Var) {
        RectF rectF = this.d;
        E(view, rectF);
        rectF.offset(this.g, this.h);
        RectF rectF2 = this.e;
        E(view2, rectF2);
        sl3Var.getClass();
        return (rectF2.centerY() - rectF.centerY()) + 0.0f;
    }

    public final void E(View view, RectF rectF) {
        rectF.set(0.0f, 0.0f, view.getWidth(), view.getHeight());
        view.getLocationInWindow(this.f);
        rectF.offsetTo(r0[0], r0[1]);
        rectF.offset((int) (-view.getTranslationX()), (int) (-view.getTranslationY()));
    }

    public abstract do3 F(Context context, boolean z);

    @Override // com.google.android.material.transformation.ExpandableBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final boolean f(View view, View view2) {
        if (view.getVisibility() == 8) {
            throw new IllegalStateException("This behavior cannot be attached to a GONE view. Set the view to INVISIBLE instead.");
        }
        if (!(view2 instanceof FloatingActionButton)) {
            return false;
        }
        int expandedComponentIdHint = ((FloatingActionButton) view2).getExpandedComponentIdHint();
        return expandedComponentIdHint == 0 || expandedComponentIdHint == view.getId();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.Behavior
    public final void g(c cVar) {
        if (cVar.h == 0) {
            cVar.h = 80;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x034a  */
    @Override // com.google.android.material.transformation.ExpandableTransformationBehavior
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final android.animation.AnimatorSet z(android.view.View r28, android.view.View r29, boolean r30, boolean r31) {
        /*
            Method dump skipped, instruction units count: 948
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.transformation.FabTransformationBehavior.z(android.view.View, android.view.View, boolean, boolean):android.animation.AnimatorSet");
    }

    public FabTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.c = new Rect();
        this.d = new RectF();
        this.e = new RectF();
        this.f = new int[2];
    }
}
