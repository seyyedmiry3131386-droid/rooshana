package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import com.google.android.material.button.MaterialButton;

/* JADX INFO: loaded from: classes.dex */
public final class rj4 {
    public final MaterialButton a;
    public as7 b;
    public y48 c;
    public m38 d;
    public qs3 e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public int k;
    public PorterDuff.Mode l;
    public ColorStateList m;
    public ColorStateList n;
    public ColorStateList o;
    public fk4 p;
    public boolean t;
    public RippleDrawable v;
    public int w;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public boolean u = true;

    public rj4(MaterialButton materialButton, as7 as7Var) {
        this.a = materialButton;
        this.b = as7Var;
    }

    public final fk4 a(boolean z) {
        RippleDrawable rippleDrawable = this.v;
        if (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 0) {
            return null;
        }
        return (fk4) ((LayerDrawable) ((InsetDrawable) this.v.getDrawable(0)).getDrawable()).getDrawable(!z ? 1 : 0);
    }

    public final void b(int i, int i2) {
        MaterialButton materialButton = this.a;
        int paddingStart = materialButton.getPaddingStart();
        int paddingTop = materialButton.getPaddingTop();
        int paddingEnd = materialButton.getPaddingEnd();
        int paddingBottom = materialButton.getPaddingBottom();
        int i3 = this.h;
        int i4 = this.i;
        this.i = i2;
        this.h = i;
        if (!this.r) {
            c();
        }
        materialButton.setPaddingRelative(paddingStart, (paddingTop + i) - i3, paddingEnd, (paddingBottom + i2) - i4);
    }

    public final void c() {
        fk4 fk4Var = new fk4(this.b);
        y48 y48Var = this.c;
        if (y48Var != null) {
            fk4Var.x(y48Var);
        }
        m38 m38Var = this.d;
        if (m38Var != null) {
            fk4Var.q(m38Var);
        }
        qs3 qs3Var = this.e;
        if (qs3Var != null) {
            fk4Var.E = qs3Var;
        }
        MaterialButton materialButton = this.a;
        fk4Var.o(materialButton.getContext());
        fk4Var.setTintList(this.m);
        PorterDuff.Mode mode = this.l;
        if (mode != null) {
            fk4Var.setTintMode(mode);
        }
        float f = this.k;
        ColorStateList colorStateList = this.n;
        fk4Var.z(f);
        fk4Var.y(colorStateList);
        fk4 fk4Var2 = new fk4(this.b);
        y48 y48Var2 = this.c;
        if (y48Var2 != null) {
            fk4Var2.x(y48Var2);
        }
        m38 m38Var2 = this.d;
        if (m38Var2 != null) {
            fk4Var2.q(m38Var2);
        }
        fk4Var2.setTint(0);
        float f2 = this.k;
        int iP = this.q ? m91.p(vp6.colorSurface, materialButton) : 0;
        fk4Var2.z(f2);
        fk4Var2.y(ColorStateList.valueOf(iP));
        fk4 fk4Var3 = new fk4(this.b);
        this.p = fk4Var3;
        y48 y48Var3 = this.c;
        if (y48Var3 != null) {
            fk4Var3.x(y48Var3);
        }
        m38 m38Var3 = this.d;
        if (m38Var3 != null) {
            this.p.q(m38Var3);
        }
        this.p.setTint(-1);
        RippleDrawable rippleDrawable = new RippleDrawable(u97.c(this.o), new InsetDrawable((Drawable) new LayerDrawable(new Drawable[]{fk4Var2, fk4Var}), this.f, this.h, this.g, this.i), this.p);
        this.v = rippleDrawable;
        materialButton.setInternalBackground(rippleDrawable);
        fk4 fk4VarA = a(false);
        if (fk4VarA != null) {
            fk4VarA.r(this.w);
            fk4VarA.setState(materialButton.getDrawableState());
        }
    }

    public final void d() {
        fk4 fk4VarA = a(false);
        if (fk4VarA != null) {
            y48 y48Var = this.c;
            if (y48Var != null) {
                fk4VarA.x(y48Var);
            } else {
                fk4VarA.setShapeAppearanceModel(this.b);
            }
            m38 m38Var = this.d;
            if (m38Var != null) {
                fk4VarA.q(m38Var);
            }
        }
        fk4 fk4VarA2 = a(true);
        if (fk4VarA2 != null) {
            y48 y48Var2 = this.c;
            if (y48Var2 != null) {
                fk4VarA2.x(y48Var2);
            } else {
                fk4VarA2.setShapeAppearanceModel(this.b);
            }
            m38 m38Var2 = this.d;
            if (m38Var2 != null) {
                fk4VarA2.q(m38Var2);
            }
        }
        RippleDrawable rippleDrawable = this.v;
        bt7 bt7Var = (rippleDrawable == null || rippleDrawable.getNumberOfLayers() <= 1) ? null : this.v.getNumberOfLayers() > 2 ? (bt7) this.v.getDrawable(2) : (bt7) this.v.getDrawable(1);
        if (bt7Var != null) {
            bt7Var.setShapeAppearanceModel(this.b);
            if (bt7Var instanceof fk4) {
                fk4 fk4Var = (fk4) bt7Var;
                y48 y48Var3 = this.c;
                if (y48Var3 != null) {
                    fk4Var.x(y48Var3);
                }
                m38 m38Var3 = this.d;
                if (m38Var3 != null) {
                    fk4Var.q(m38Var3);
                }
            }
        }
    }

    public final void e() {
        int iP = 0;
        fk4 fk4VarA = a(false);
        fk4 fk4VarA2 = a(true);
        if (fk4VarA != null) {
            float f = this.k;
            ColorStateList colorStateList = this.n;
            fk4VarA.z(f);
            fk4VarA.y(colorStateList);
            if (fk4VarA2 != null) {
                float f2 = this.k;
                if (this.q) {
                    iP = m91.p(vp6.colorSurface, this.a);
                }
                fk4VarA2.z(f2);
                fk4VarA2.y(ColorStateList.valueOf(iP));
            }
        }
    }
}
