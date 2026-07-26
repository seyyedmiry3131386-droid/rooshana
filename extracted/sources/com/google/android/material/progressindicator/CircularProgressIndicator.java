package com.google.android.material.progressindicator;

import android.content.Context;
import android.util.AttributeSet;
import defpackage.mm3;
import defpackage.mt6;
import defpackage.nr0;
import defpackage.pr0;
import defpackage.q39;
import defpackage.qk1;
import defpackage.rr0;
import defpackage.t80;
import defpackage.vp6;
import defpackage.xq6;
import defpackage.y;

/* JADX INFO: loaded from: classes.dex */
public class CircularProgressIndicator extends BaseProgressIndicator<CircularProgressIndicatorSpec> {
    public static final int q = mt6.Widget_MaterialComponents_CircularProgressIndicator;

    public CircularProgressIndicator(Context context) {
        this(context, null);
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public final t80 a(Context context, AttributeSet attributeSet) {
        return new CircularProgressIndicatorSpec(context, attributeSet);
    }

    public int getIndeterminateAnimationType() {
        return ((CircularProgressIndicatorSpec) this.a).o;
    }

    public int getIndicatorDirection() {
        return ((CircularProgressIndicatorSpec) this.a).r;
    }

    public int getIndicatorInset() {
        return ((CircularProgressIndicatorSpec) this.a).q;
    }

    public int getIndicatorSize() {
        return ((CircularProgressIndicatorSpec) this.a).p;
    }

    public void setIndeterminateAnimationType(int i) {
        t80 t80Var = this.a;
        if (((CircularProgressIndicatorSpec) t80Var).o == i) {
            return;
        }
        if (c() && isIndeterminate()) {
            throw new IllegalStateException("Cannot change indeterminate animation type while the progress indicator is show in indeterminate mode.");
        }
        ((CircularProgressIndicatorSpec) t80Var).o = i;
        ((CircularProgressIndicatorSpec) t80Var).d();
        y rr0Var = i == 1 ? new rr0(getContext(), (CircularProgressIndicatorSpec) t80Var) : new pr0((CircularProgressIndicatorSpec) t80Var);
        mm3 indeterminateDrawable = getIndeterminateDrawable();
        indeterminateDrawable.o = rr0Var;
        rr0Var.a = indeterminateDrawable;
        b();
        invalidate();
    }

    public void setIndicatorDirection(int i) {
        ((CircularProgressIndicatorSpec) this.a).r = i;
        invalidate();
    }

    public void setIndicatorInset(int i) {
        t80 t80Var = this.a;
        if (((CircularProgressIndicatorSpec) t80Var).q != i) {
            ((CircularProgressIndicatorSpec) t80Var).q = i;
            invalidate();
        }
    }

    public void setIndicatorSize(int i) {
        int iMax = Math.max(i, getTrackThickness() * 2);
        t80 t80Var = this.a;
        if (((CircularProgressIndicatorSpec) t80Var).p != iMax) {
            ((CircularProgressIndicatorSpec) t80Var).p = iMax;
            ((CircularProgressIndicatorSpec) t80Var).d();
            requestLayout();
            invalidate();
        }
    }

    @Override // com.google.android.material.progressindicator.BaseProgressIndicator
    public void setTrackThickness(int i) {
        super.setTrackThickness(i);
        ((CircularProgressIndicatorSpec) this.a).d();
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, vp6.circularProgressIndicatorStyle);
    }

    public CircularProgressIndicator(Context context, AttributeSet attributeSet, int i) {
        y pr0Var;
        super(context, attributeSet, i, q);
        CircularProgressIndicatorSpec circularProgressIndicatorSpec = (CircularProgressIndicatorSpec) this.a;
        nr0 nr0Var = new nr0(circularProgressIndicatorSpec);
        Context context2 = getContext();
        if (circularProgressIndicatorSpec.o == 1) {
            pr0Var = new rr0(context2, circularProgressIndicatorSpec);
        } else {
            pr0Var = new pr0(circularProgressIndicatorSpec);
        }
        mm3 mm3Var = new mm3(context2, circularProgressIndicatorSpec, nr0Var, pr0Var);
        mm3Var.p = q39.a(context2.getResources(), xq6.ic_mtrl_arrow_circle, null);
        setIndeterminateDrawable(mm3Var);
        setProgressDrawable(new qk1(getContext(), circularProgressIndicatorSpec, nr0Var));
        this.k = true;
    }
}
