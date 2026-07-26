package defpackage;

import android.content.res.ColorStateList;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* JADX INFO: loaded from: classes.dex */
public class dk4 extends Drawable.ConstantState {
    public as7 a;
    public y48 b;
    public pz1 c;
    public ColorStateList d;
    public ColorStateList e;
    public ColorStateList f;
    public PorterDuff.Mode g;
    public Rect h;
    public final float i;
    public float j;
    public float k;
    public int l;
    public float m;
    public float n;
    public int o;
    public int p;
    public int q;
    public Paint.Style r;

    public dk4(as7 as7Var) {
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = PorterDuff.Mode.SRC_IN;
        this.h = null;
        this.i = 1.0f;
        this.j = 1.0f;
        this.l = 255;
        this.m = 0.0f;
        this.n = 0.0f;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = Paint.Style.FILL_AND_STROKE;
        this.a = as7Var;
        this.c = null;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return 0;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable() {
        fk4 fk4Var = new fk4(this);
        fk4Var.f = true;
        fk4Var.g = true;
        return fk4Var;
    }

    public dk4(dk4 dk4Var) {
        this.d = null;
        this.e = null;
        this.f = null;
        this.g = PorterDuff.Mode.SRC_IN;
        this.h = null;
        this.i = 1.0f;
        this.j = 1.0f;
        this.l = 255;
        this.m = 0.0f;
        this.n = 0.0f;
        this.o = 0;
        this.p = 0;
        this.q = 0;
        this.r = Paint.Style.FILL_AND_STROKE;
        this.a = dk4Var.a;
        this.b = dk4Var.b;
        this.c = dk4Var.c;
        this.k = dk4Var.k;
        this.d = dk4Var.d;
        this.e = dk4Var.e;
        this.g = dk4Var.g;
        this.f = dk4Var.f;
        this.l = dk4Var.l;
        this.i = dk4Var.i;
        this.q = dk4Var.q;
        this.o = dk4Var.o;
        this.j = dk4Var.j;
        this.m = dk4Var.m;
        this.n = dk4Var.n;
        this.p = dk4Var.p;
        this.r = dk4Var.r;
        if (dk4Var.h != null) {
            this.h = new Rect(dk4Var.h);
        }
    }
}
