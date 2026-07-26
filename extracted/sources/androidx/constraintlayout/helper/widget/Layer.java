package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import defpackage.eu6;
import defpackage.f31;

/* JADX INFO: loaded from: classes.dex */
public class Layer extends ConstraintHelper {
    public boolean A;
    public float j;
    public float k;
    public float l;
    public ConstraintLayout m;
    public float n;
    public float o;
    public float p;
    public float q;
    public float r;
    public float s;
    public float t;
    public float u;
    public final boolean v;
    public View[] w;
    public float x;
    public float y;
    public boolean z;

    public Layer(Context context) {
        super(context);
        this.j = Float.NaN;
        this.k = Float.NaN;
        this.l = Float.NaN;
        this.n = 1.0f;
        this.o = 1.0f;
        this.p = Float.NaN;
        this.q = Float.NaN;
        this.r = Float.NaN;
        this.s = Float.NaN;
        this.t = Float.NaN;
        this.u = Float.NaN;
        this.v = true;
        this.w = null;
        this.x = 0.0f;
        this.y = 0.0f;
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void g(ConstraintLayout constraintLayout) {
        f(constraintLayout);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void k(AttributeSet attributeSet) {
        super.k(attributeSet);
        this.e = false;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, eu6.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == eu6.ConstraintLayout_Layout_android_visibility) {
                    this.z = true;
                } else if (index == eu6.ConstraintLayout_Layout_android_elevation) {
                    this.A = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void n() {
        s();
        this.p = Float.NaN;
        this.q = Float.NaN;
        f31 f31Var = ((ConstraintLayout.LayoutParams) getLayoutParams()).q0;
        f31Var.P(0);
        f31Var.M(0);
        r();
        layout(((int) this.t) - getPaddingLeft(), ((int) this.u) - getPaddingTop(), getPaddingRight() + ((int) this.r), getPaddingBottom() + ((int) this.s));
        t();
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void o(ConstraintLayout constraintLayout) {
        this.m = constraintLayout;
        float rotation = getRotation();
        if (rotation != 0.0f) {
            this.l = rotation;
        } else {
            if (Float.isNaN(this.l)) {
                return;
            }
            this.l = rotation;
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.m = (ConstraintLayout) getParent();
        if (this.z || this.A) {
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i = 0; i < this.b; i++) {
                View viewK = this.m.k(this.a[i]);
                if (viewK != null) {
                    if (this.z) {
                        viewK.setVisibility(visibility);
                    }
                    if (this.A && elevation > 0.0f) {
                        viewK.setTranslationZ(viewK.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    public final void r() {
        if (this.m == null) {
            return;
        }
        if (this.v || Float.isNaN(this.p) || Float.isNaN(this.q)) {
            if (!Float.isNaN(this.j) && !Float.isNaN(this.k)) {
                this.q = this.k;
                this.p = this.j;
                return;
            }
            View[] viewArrJ = j(this.m);
            int left = viewArrJ[0].getLeft();
            int top = viewArrJ[0].getTop();
            int right = viewArrJ[0].getRight();
            int bottom = viewArrJ[0].getBottom();
            for (int i = 0; i < this.b; i++) {
                View view = viewArrJ[i];
                left = Math.min(left, view.getLeft());
                top = Math.min(top, view.getTop());
                right = Math.max(right, view.getRight());
                bottom = Math.max(bottom, view.getBottom());
            }
            this.r = right;
            this.s = bottom;
            this.t = left;
            this.u = top;
            if (Float.isNaN(this.j)) {
                this.p = (left + right) / 2;
            } else {
                this.p = this.j;
            }
            if (Float.isNaN(this.k)) {
                this.q = (top + bottom) / 2;
            } else {
                this.q = this.k;
            }
        }
    }

    public final void s() {
        int i;
        if (this.m == null || (i = this.b) == 0) {
            return;
        }
        View[] viewArr = this.w;
        if (viewArr == null || viewArr.length != i) {
            this.w = new View[i];
        }
        for (int i2 = 0; i2 < this.b; i2++) {
            this.w[i2] = this.m.k(this.a[i2]);
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        e();
    }

    @Override // android.view.View
    public void setPivotX(float f) {
        this.j = f;
        t();
    }

    @Override // android.view.View
    public void setPivotY(float f) {
        this.k = f;
        t();
    }

    @Override // android.view.View
    public void setRotation(float f) {
        this.l = f;
        t();
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        this.n = f;
        t();
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        this.o = f;
        t();
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        this.x = f;
        t();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        this.y = f;
        t();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        e();
    }

    public final void t() {
        if (this.m == null) {
            return;
        }
        if (this.w == null) {
            s();
        }
        r();
        double radians = Float.isNaN(this.l) ? 0.0d : Math.toRadians(this.l);
        float fSin = (float) Math.sin(radians);
        float fCos = (float) Math.cos(radians);
        float f = this.n;
        float f2 = f * fCos;
        float f3 = this.o;
        float f4 = (-f3) * fSin;
        float f5 = f * fSin;
        float f6 = f3 * fCos;
        for (int i = 0; i < this.b; i++) {
            View view = this.w[i];
            int right = (view.getRight() + view.getLeft()) / 2;
            int bottom = (view.getBottom() + view.getTop()) / 2;
            float f7 = right - this.p;
            float f8 = bottom - this.q;
            float f9 = (((f4 * f8) + (f2 * f7)) - f7) + this.x;
            float f10 = (((f6 * f8) + (f7 * f5)) - f8) + this.y;
            view.setTranslationX(f9);
            view.setTranslationY(f10);
            view.setScaleY(this.o);
            view.setScaleX(this.n);
            if (!Float.isNaN(this.l)) {
                view.setRotation(this.l);
            }
        }
    }

    public Layer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.j = Float.NaN;
        this.k = Float.NaN;
        this.l = Float.NaN;
        this.n = 1.0f;
        this.o = 1.0f;
        this.p = Float.NaN;
        this.q = Float.NaN;
        this.r = Float.NaN;
        this.s = Float.NaN;
        this.t = Float.NaN;
        this.u = Float.NaN;
        this.v = true;
        this.w = null;
        this.x = 0.0f;
        this.y = 0.0f;
    }

    public Layer(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.j = Float.NaN;
        this.k = Float.NaN;
        this.l = Float.NaN;
        this.n = 1.0f;
        this.o = 1.0f;
        this.p = Float.NaN;
        this.q = Float.NaN;
        this.r = Float.NaN;
        this.s = Float.NaN;
        this.t = Float.NaN;
        this.u = Float.NaN;
        this.v = true;
        this.w = null;
        this.x = 0.0f;
        this.y = 0.0f;
    }
}
