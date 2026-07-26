package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.DecodeFormat;

/* JADX INFO: loaded from: classes.dex */
public abstract class x80 implements Cloneable {
    public int a;
    public Drawable d;
    public int e;
    public Drawable f;
    public boolean k;
    public boolean p;
    public boolean q;
    public boolean s;
    public zo1 b = zo1.d;
    public Priority c = Priority.c;
    public boolean g = true;
    public int h = -1;
    public int i = -1;
    public sx3 j = i12.b;
    public boolean l = true;
    public sv5 m = new sv5();
    public xk0 n = new xk0(0);
    public Class o = Object.class;
    public boolean r = true;

    public static boolean p(int i, int i2) {
        return (i & i2) != 0;
    }

    public final void A() {
        if (this.p) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
    }

    public x80 B(pv5 pv5Var, Object obj) {
        if (this.q) {
            return clone().B(pv5Var, obj);
        }
        ok4.o(pv5Var);
        this.m.b.put(pv5Var, obj);
        A();
        return this;
    }

    public x80 C(yq5 yq5Var) {
        if (this.q) {
            return clone().C(yq5Var);
        }
        this.j = yq5Var;
        this.a |= 1024;
        A();
        return this;
    }

    public x80 D() {
        if (this.q) {
            return clone().D();
        }
        this.g = false;
        this.a |= 256;
        A();
        return this;
    }

    public x80 E(int i) {
        return B(le3.b, Integer.valueOf(i));
    }

    public final x80 F(wt1 wt1Var, rc0 rc0Var) {
        if (this.q) {
            return clone().F(wt1Var, rc0Var);
        }
        j(wt1Var);
        return G(rc0Var);
    }

    public x80 G(nq8 nq8Var) {
        return H(nq8Var, true);
    }

    public final x80 H(nq8 nq8Var, boolean z) {
        if (this.q) {
            return clone().H(nq8Var, z);
        }
        tv1 tv1Var = new tv1(nq8Var, z);
        I(Bitmap.class, nq8Var, z);
        I(Drawable.class, tv1Var, z);
        I(BitmapDrawable.class, tv1Var, z);
        I(ns2.class, new ps2(nq8Var), z);
        A();
        return this;
    }

    public final x80 I(Class cls, nq8 nq8Var, boolean z) {
        if (this.q) {
            return clone().I(cls, nq8Var, z);
        }
        ok4.o(nq8Var);
        this.n.put(cls, nq8Var);
        int i = this.a;
        this.l = true;
        this.a = 67584 | i;
        this.r = false;
        if (z) {
            this.a = i | 198656;
            this.k = true;
        }
        A();
        return this;
    }

    public x80 J(nq8... nq8VarArr) {
        if (nq8VarArr.length > 1) {
            return H(new aa5(nq8VarArr), true);
        }
        if (nq8VarArr.length == 1) {
            return G(nq8VarArr[0]);
        }
        A();
        return this;
    }

    public x80 K() {
        if (this.q) {
            return clone().K();
        }
        this.s = true;
        this.a |= 1048576;
        A();
        return this;
    }

    public x80 a(x80 x80Var) {
        if (this.q) {
            return clone().a(x80Var);
        }
        int i = x80Var.a;
        if (p(x80Var.a, 1048576)) {
            this.s = x80Var.s;
        }
        if (p(x80Var.a, 4)) {
            this.b = x80Var.b;
        }
        if (p(x80Var.a, 8)) {
            this.c = x80Var.c;
        }
        if (p(x80Var.a, 16)) {
            this.d = x80Var.d;
            this.e = 0;
            this.a &= -33;
        }
        if (p(x80Var.a, 32)) {
            this.e = x80Var.e;
            this.d = null;
            this.a &= -17;
        }
        if (p(x80Var.a, 64)) {
            this.f = x80Var.f;
            this.a &= -129;
        }
        if (p(x80Var.a, 128)) {
            this.f = null;
            this.a &= -65;
        }
        if (p(x80Var.a, 256)) {
            this.g = x80Var.g;
        }
        if (p(x80Var.a, 512)) {
            this.i = x80Var.i;
            this.h = x80Var.h;
        }
        if (p(x80Var.a, 1024)) {
            this.j = x80Var.j;
        }
        if (p(x80Var.a, 4096)) {
            this.o = x80Var.o;
        }
        if (p(x80Var.a, 8192)) {
            this.a &= -16385;
        }
        if (p(x80Var.a, 16384)) {
            this.a &= -8193;
        }
        if (p(x80Var.a, 65536)) {
            this.l = x80Var.l;
        }
        if (p(x80Var.a, 131072)) {
            this.k = x80Var.k;
        }
        if (p(x80Var.a, 2048)) {
            this.n.putAll(x80Var.n);
            this.r = x80Var.r;
        }
        if (!this.l) {
            this.n.clear();
            int i2 = this.a;
            this.k = false;
            this.a = i2 & (-133121);
            this.r = true;
        }
        this.a |= x80Var.a;
        this.m.b.g(x80Var.m.b);
        A();
        return this;
    }

    public x80 b() {
        if (this.p && !this.q) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.q = true;
        return q();
    }

    public x80 c() {
        return z(wt1.c, new go0(), true);
    }

    public x80 d() {
        return F(wt1.c, new hr0());
    }

    @Override // 
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public x80 clone() {
        try {
            x80 x80Var = (x80) super.clone();
            sv5 sv5Var = new sv5();
            x80Var.m = sv5Var;
            sv5Var.b.g(this.m.b);
            xk0 xk0Var = new xk0(0);
            x80Var.n = xk0Var;
            xk0Var.putAll(this.n);
            x80Var.p = false;
            x80Var.q = false;
            return x80Var;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof x80) {
            return o((x80) obj);
        }
        return false;
    }

    public x80 f(Class cls) {
        if (this.q) {
            return clone().f(cls);
        }
        this.o = cls;
        this.a |= 4096;
        A();
        return this;
    }

    public x80 g(zo1 zo1Var) {
        if (this.q) {
            return clone().g(zo1Var);
        }
        this.b = zo1Var;
        this.a |= 4;
        A();
        return this;
    }

    public x80 h() {
        return B(xs2.b, Boolean.TRUE);
    }

    public int hashCode() {
        return i29.i(i29.i(i29.i(i29.i(i29.i(i29.i(i29.i(i29.h(0, i29.h(0, i29.h(this.l ? 1 : 0, i29.h(this.k ? 1 : 0, i29.h(this.i, i29.h(this.h, i29.h(this.g ? 1 : 0, i29.i(i29.h(0, i29.i(i29.h(0, i29.i(i29.h(this.e, i29.g(17, 1.0f)), this.d)), this.f)), null)))))))), this.b), this.c), this.m), this.n), this.o), this.j), null);
    }

    public x80 i() {
        if (this.q) {
            return clone().i();
        }
        this.n.clear();
        int i = this.a;
        this.k = false;
        this.l = false;
        this.a = (i & (-133121)) | 65536;
        this.r = true;
        A();
        return this;
    }

    public x80 j(wt1 wt1Var) {
        return B(wt1.g, wt1Var);
    }

    public x80 k(int i) {
        if (this.q) {
            return clone().k(i);
        }
        this.e = i;
        int i2 = this.a | 32;
        this.d = null;
        this.a = i2 & (-17);
        A();
        return this;
    }

    public x80 l(Drawable drawable) {
        if (this.q) {
            return clone().l(drawable);
        }
        this.d = drawable;
        int i = this.a | 16;
        this.e = 0;
        this.a = i & (-33);
        A();
        return this;
    }

    public x80 m() {
        return z(wt1.b, new gd2(), true);
    }

    public x80 n() {
        pv5 pv5Var = yt1.f;
        DecodeFormat decodeFormat = DecodeFormat.a;
        return B(pv5Var, decodeFormat).B(xs2.a, decodeFormat);
    }

    public final boolean o(x80 x80Var) {
        x80Var.getClass();
        return Float.compare(1.0f, 1.0f) == 0 && this.e == x80Var.e && i29.b(this.d, x80Var.d) && i29.b(this.f, x80Var.f) && this.g == x80Var.g && this.h == x80Var.h && this.i == x80Var.i && this.k == x80Var.k && this.l == x80Var.l && this.b.equals(x80Var.b) && this.c == x80Var.c && this.m.equals(x80Var.m) && this.n.equals(x80Var.n) && this.o.equals(x80Var.o) && this.j.equals(x80Var.j);
    }

    public x80 q() {
        this.p = true;
        return this;
    }

    public x80 r() {
        return u(wt1.d, new fo0());
    }

    public x80 s() {
        return z(wt1.c, new go0(), false);
    }

    public x80 t() {
        return z(wt1.b, new gd2(), false);
    }

    public final x80 u(wt1 wt1Var, rc0 rc0Var) {
        if (this.q) {
            return clone().u(wt1Var, rc0Var);
        }
        j(wt1Var);
        return H(rc0Var, false);
    }

    public x80 v(int i, int i2) {
        if (this.q) {
            return clone().v(i, i2);
        }
        this.i = i;
        this.h = i2;
        this.a |= 512;
        A();
        return this;
    }

    public x80 w() {
        if (this.q) {
            return clone().w();
        }
        int i = this.a | 128;
        this.f = null;
        this.a = i & (-65);
        A();
        return this;
    }

    public x80 x(Drawable drawable) {
        if (this.q) {
            return clone().x(drawable);
        }
        this.f = drawable;
        this.a = (this.a | 64) & (-129);
        A();
        return this;
    }

    public x80 y() {
        if (this.q) {
            return clone().y();
        }
        this.c = Priority.d;
        this.a |= 8;
        A();
        return this;
    }

    public final x80 z(wt1 wt1Var, rc0 rc0Var, boolean z) {
        x80 x80VarF = z ? F(wt1Var, rc0Var) : u(wt1Var, rc0Var);
        x80VarF.r = true;
        return x80VarF;
    }
}
