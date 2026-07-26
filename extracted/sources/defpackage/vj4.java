package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.material.card.MaterialCardView;

/* JADX INFO: loaded from: classes.dex */
public final class vj4 {
    public static final double y = Math.cos(Math.toRadians(45.0d));
    public static final ColorDrawable z;
    public final MaterialCardView a;
    public final Rect b;
    public final fk4 c;
    public final fk4 d;
    public int e;
    public int f;
    public int g;
    public int h;
    public Drawable i;
    public Drawable j;
    public ColorStateList k;
    public ColorStateList l;
    public as7 m;
    public ColorStateList n;
    public RippleDrawable o;
    public LayerDrawable p;
    public fk4 q;
    public boolean r;
    public boolean s;
    public ValueAnimator t;
    public final TimeInterpolator u;
    public final int v;
    public final int w;
    public float x;

    static {
        z = Build.VERSION.SDK_INT <= 28 ? new ColorDrawable() : null;
    }

    public vj4(MaterialCardView materialCardView, AttributeSet attributeSet, int i) {
        int i2 = MaterialCardView.o;
        this.b = new Rect();
        this.r = false;
        this.x = 0.0f;
        this.a = materialCardView;
        fk4 fk4Var = new fk4(materialCardView.getContext(), attributeSet, i, i2);
        this.c = fk4Var;
        fk4Var.o(materialCardView.getContext());
        fk4Var.v();
        yr7 yr7VarH = fk4Var.b.a.h();
        TypedArray typedArrayObtainStyledAttributes = materialCardView.getContext().obtainStyledAttributes(attributeSet, du6.CardView, i, ht6.CardView);
        if (typedArrayObtainStyledAttributes.hasValue(du6.CardView_cardCornerRadius)) {
            yr7VarH.b(typedArrayObtainStyledAttributes.getDimension(du6.CardView_cardCornerRadius, 0.0f));
        }
        this.d = new fk4();
        h(yr7VarH.a());
        this.u = ub1.H(materialCardView.getContext(), vp6.motionEasingLinearInterpolator, yk.a);
        this.v = ub1.G(materialCardView.getContext(), vp6.motionDurationShort2, 300);
        this.w = ub1.G(materialCardView.getContext(), vp6.motionDurationShort1, 300);
        typedArrayObtainStyledAttributes.recycle();
    }

    public static float b(at2 at2Var, float f) {
        if (at2Var instanceof ma7) {
            return (float) ((1.0d - y) * ((double) f));
        }
        if (at2Var instanceof h91) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    public final float a() {
        at2 at2Var = this.m.a;
        fk4 fk4Var = this.c;
        float fMax = Math.max(b(at2Var, fk4Var.l()), b(this.m.b, fk4Var.m()));
        at2 at2Var2 = this.m.c;
        float[] fArr = fk4Var.C;
        float fB = b(at2Var2, fArr != null ? fArr[1] : fk4Var.b.a.g.a(fk4Var.h()));
        at2 at2Var3 = this.m.d;
        float[] fArr2 = fk4Var.C;
        return Math.max(fMax, Math.max(fB, b(at2Var3, fArr2 != null ? fArr2[2] : fk4Var.b.a.h.a(fk4Var.h()))));
    }

    public final LayerDrawable c() {
        if (this.o == null) {
            this.q = new fk4(this.m);
            this.o = new RippleDrawable(this.k, null, this.q);
        }
        if (this.p == null) {
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{this.o, this.d, this.j});
            this.p = layerDrawable;
            layerDrawable.setId(2, qr6.mtrl_card_checked_layer_id);
        }
        return this.p;
    }

    public final uj4 d(Drawable drawable) {
        int iCeil;
        int i;
        if (this.a.getUseCompatPadding()) {
            int iCeil2 = (int) Math.ceil((r0.getMaxCardElevation() * 1.5f) + (i() ? a() : 0.0f));
            iCeil = (int) Math.ceil(r0.getMaxCardElevation() + (i() ? a() : 0.0f));
            i = iCeil2;
        } else {
            iCeil = 0;
            i = 0;
        }
        return new uj4(drawable, iCeil, i, iCeil, i);
    }

    public final void e(int i, int i2) {
        int iCeil;
        int iCeil2;
        int i3;
        int i4;
        if (this.p != null) {
            MaterialCardView materialCardView = this.a;
            if (materialCardView.getUseCompatPadding()) {
                iCeil = (int) Math.ceil(((materialCardView.getMaxCardElevation() * 1.5f) + (i() ? a() : 0.0f)) * 2.0f);
                iCeil2 = (int) Math.ceil((materialCardView.getMaxCardElevation() + (i() ? a() : 0.0f)) * 2.0f);
            } else {
                iCeil = 0;
                iCeil2 = 0;
            }
            int i5 = this.g;
            int i6 = (i5 & 8388613) == 8388613 ? ((i - this.e) - this.f) - iCeil2 : this.e;
            int i7 = (i5 & 80) == 80 ? this.e : ((i2 - this.e) - this.f) - iCeil;
            int i8 = (i5 & 8388613) == 8388613 ? this.e : ((i - this.e) - this.f) - iCeil2;
            int i9 = (i5 & 80) == 80 ? ((i2 - this.e) - this.f) - iCeil : this.e;
            if (materialCardView.getLayoutDirection() == 1) {
                i4 = i8;
                i3 = i6;
            } else {
                i3 = i8;
                i4 = i6;
            }
            this.p.setLayerInset(2, i4, i9, i3, i7);
        }
    }

    public final void f(boolean z2, boolean z3) {
        Drawable drawable = this.j;
        if (drawable != null) {
            if (!z3) {
                drawable.setAlpha(z2 ? 255 : 0);
                this.x = z2 ? 1.0f : 0.0f;
                return;
            }
            float f = z2 ? 1.0f : 0.0f;
            float f2 = z2 ? 1.0f - this.x : this.x;
            ValueAnimator valueAnimator = this.t;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.t = null;
            }
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.x, f);
            this.t = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new qj(10, this));
            this.t.setInterpolator(this.u);
            this.t.setDuration((long) ((z2 ? this.v : this.w) * f2));
            this.t.start();
        }
    }

    public final void g(Drawable drawable) {
        if (drawable != null) {
            Drawable drawableMutate = drawable.mutate();
            this.j = drawableMutate;
            drawableMutate.setTintList(this.l);
            f(this.a.j, false);
        } else {
            this.j = z;
        }
        LayerDrawable layerDrawable = this.p;
        if (layerDrawable != null) {
            layerDrawable.setDrawableByLayerId(qr6.mtrl_card_checked_layer_id, this.j);
        }
    }

    public final void h(as7 as7Var) {
        this.m = as7Var;
        fk4 fk4Var = this.c;
        fk4Var.setShapeAppearanceModel(as7Var);
        fk4Var.x = !fk4Var.p();
        fk4 fk4Var2 = this.d;
        if (fk4Var2 != null) {
            fk4Var2.setShapeAppearanceModel(as7Var);
        }
        fk4 fk4Var3 = this.q;
        if (fk4Var3 != null) {
            fk4Var3.setShapeAppearanceModel(as7Var);
        }
    }

    public final boolean i() {
        MaterialCardView materialCardView = this.a;
        return materialCardView.getPreventCornerOverlap() && this.c.p() && materialCardView.getUseCompatPadding();
    }

    public final boolean j() {
        View view = this.a;
        if (view.isClickable()) {
            return true;
        }
        while (view.isDuplicateParentStateEnabled() && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        return view.isClickable();
    }

    public final void k() {
        Drawable drawable = this.i;
        Drawable drawableC = j() ? c() : this.d;
        this.i = drawableC;
        if (drawable != drawableC) {
            MaterialCardView materialCardView = this.a;
            if (materialCardView.getForeground() instanceof InsetDrawable) {
                ((InsetDrawable) materialCardView.getForeground()).setDrawable(drawableC);
            } else {
                materialCardView.setForeground(d(drawableC));
            }
        }
    }

    public final void l() {
        MaterialCardView materialCardView = this.a;
        float cardViewRadius = 0.0f;
        float fA = ((!materialCardView.getPreventCornerOverlap() || this.c.p()) && !i()) ? 0.0f : a();
        if (materialCardView.getPreventCornerOverlap() && materialCardView.getUseCompatPadding()) {
            cardViewRadius = (float) ((1.0d - y) * ((double) materialCardView.getCardViewRadius()));
        }
        int i = (int) (fA - cardViewRadius);
        Rect rect = this.b;
        materialCardView.g(rect.left + i, rect.top + i, rect.right + i, rect.bottom + i);
    }

    public final void m() {
        boolean z2 = this.r;
        MaterialCardView materialCardView = this.a;
        if (!z2) {
            materialCardView.setBackgroundInternal(d(this.c));
        }
        materialCardView.setForeground(d(this.i));
    }
}
