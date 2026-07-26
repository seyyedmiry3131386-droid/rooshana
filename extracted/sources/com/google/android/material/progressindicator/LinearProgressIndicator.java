package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Pair;
import defpackage.e74;
import defpackage.h74;
import defpackage.j74;
import defpackage.mm3;
import defpackage.mt6;
import defpackage.nw1;
import defpackage.qk1;
import defpackage.t80;
import defpackage.vp6;
import defpackage.y;
import j$.util.Objects;

/* JADX INFO: loaded from: classes.dex */
public class LinearProgressIndicator extends BaseProgressIndicator<LinearProgressIndicatorSpec> {
    public static final int q = mt6.Widget_MaterialComponents_LinearProgressIndicator;

    public LinearProgressIndicator(Context context) {
        this(context, null);
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public final t80 a(Context context, AttributeSet attributeSet) {
        return new LinearProgressIndicatorSpec(context, attributeSet);
    }

    public int getIndeterminateAnimationType() {
        return ((LinearProgressIndicatorSpec) this.a).o;
    }

    public int getIndicatorDirection() {
        return ((LinearProgressIndicatorSpec) this.a).p;
    }

    public int getTrackInnerCornerRadius() {
        return ((LinearProgressIndicatorSpec) this.a).t;
    }

    public Integer getTrackStopIndicatorPadding() {
        return ((LinearProgressIndicatorSpec) this.a).s;
    }

    public int getTrackStopIndicatorSize() {
        return ((LinearProgressIndicatorSpec) this.a).r;
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        t80 t80Var = this.a;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) t80Var;
        boolean z2 = true;
        if (((LinearProgressIndicatorSpec) t80Var).p != 1 && ((getLayoutDirection() != 1 || ((LinearProgressIndicatorSpec) t80Var).p != 2) && (getLayoutDirection() != 0 || ((LinearProgressIndicatorSpec) t80Var).p != 3))) {
            z2 = false;
        }
        linearProgressIndicatorSpec.q = z2;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int paddingRight = i - (getPaddingRight() + getPaddingLeft());
        int paddingBottom = i2 - (getPaddingBottom() + getPaddingTop());
        mm3 indeterminateDrawable = getIndeterminateDrawable();
        if (indeterminateDrawable != null) {
            indeterminateDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
        qk1 progressDrawable = getProgressDrawable();
        if (progressDrawable != null) {
            progressDrawable.setBounds(0, 0, paddingRight, paddingBottom);
        }
    }

    public void setIndeterminateAnimationType(int i) {
        t80 t80Var = this.a;
        if (((LinearProgressIndicatorSpec) t80Var).o == i) {
            return;
        }
        if (c() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        ((LinearProgressIndicatorSpec) t80Var).o = i;
        ((LinearProgressIndicatorSpec) t80Var).d();
        if (i == 0) {
            mm3 indeterminateDrawable = getIndeterminateDrawable();
            h74 h74Var = new h74((LinearProgressIndicatorSpec) t80Var);
            indeterminateDrawable.o = h74Var;
            h74Var.a = indeterminateDrawable;
        } else {
            mm3 indeterminateDrawable2 = getIndeterminateDrawable();
            j74 j74Var = new j74(getContext(), (LinearProgressIndicatorSpec) t80Var);
            indeterminateDrawable2.o = j74Var;
            j74Var.a = indeterminateDrawable2;
        }
        b();
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setIndicatorColor(int... iArr) {
        super.setIndicatorColor(iArr);
        ((LinearProgressIndicatorSpec) this.a).d();
    }

    public void setIndicatorDirection(int i) {
        t80 t80Var = this.a;
        ((LinearProgressIndicatorSpec) t80Var).p = i;
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) t80Var;
        boolean z = true;
        if (i != 1 && ((getLayoutDirection() != 1 || ((LinearProgressIndicatorSpec) t80Var).p != 2) && (getLayoutDirection() != 0 || i != 3))) {
            z = false;
        }
        linearProgressIndicatorSpec.q = z;
        invalidate();
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setProgressCompat(int i, boolean z) {
        t80 t80Var = this.a;
        if (t80Var != null && ((LinearProgressIndicatorSpec) t80Var).o == 0 && isIndeterminate()) {
            return;
        }
        super.setProgressCompat(i, z);
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setTrackCornerRadius(int i) {
        super.setTrackCornerRadius(i);
        ((LinearProgressIndicatorSpec) this.a).d();
        invalidate();
    }

    public void setTrackInnerCornerRadius(int i) {
        t80 t80Var = this.a;
        if (((LinearProgressIndicatorSpec) t80Var).t != i) {
            ((LinearProgressIndicatorSpec) t80Var).t = Math.round(Math.min(i, ((LinearProgressIndicatorSpec) t80Var).a / 2.0f));
            ((LinearProgressIndicatorSpec) t80Var).v = false;
            ((LinearProgressIndicatorSpec) t80Var).w = true;
            ((LinearProgressIndicatorSpec) t80Var).d();
            invalidate();
        }
    }

    public void setTrackInnerCornerRadiusFraction(float f) {
        t80 t80Var = this.a;
        if (((LinearProgressIndicatorSpec) t80Var).u != f) {
            ((LinearProgressIndicatorSpec) t80Var).u = Math.min(f, 0.5f);
            ((LinearProgressIndicatorSpec) t80Var).v = true;
            ((LinearProgressIndicatorSpec) t80Var).w = true;
            ((LinearProgressIndicatorSpec) t80Var).d();
            invalidate();
        }
    }

    public void setTrackStopIndicatorPadding(Integer num) {
        t80 t80Var = this.a;
        if (Objects.equals(((LinearProgressIndicatorSpec) t80Var).s, num)) {
            return;
        }
        ((LinearProgressIndicatorSpec) t80Var).s = num;
        invalidate();
    }

    public void setTrackStopIndicatorSize(int i) {
        t80 t80Var = this.a;
        if (((LinearProgressIndicatorSpec) t80Var).r != i) {
            ((LinearProgressIndicatorSpec) t80Var).r = Math.min(i, ((LinearProgressIndicatorSpec) t80Var).a);
            ((LinearProgressIndicatorSpec) t80Var).d();
            invalidate();
        }
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, vp6.linearProgressIndicatorStyle);
    }

    public LinearProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        y j74Var;
        super(context, attributeSet, i, q);
        LinearProgressIndicatorSpec linearProgressIndicatorSpec = (LinearProgressIndicatorSpec) this.a;
        e74 e74Var = new e74(linearProgressIndicatorSpec);
        e74Var.f = 300.0f;
        e74Var.o = new Pair(new nw1(), new nw1());
        Context context2 = getContext();
        if (linearProgressIndicatorSpec.o == 0) {
            j74Var = new h74(linearProgressIndicatorSpec);
        } else {
            j74Var = new j74(context2, linearProgressIndicatorSpec);
        }
        setIndeterminateDrawable(new mm3(context2, linearProgressIndicatorSpec, e74Var, j74Var));
        setProgressDrawable(new qk1(getContext(), linearProgressIndicatorSpec, e74Var));
        this.k = true;
    }
}
