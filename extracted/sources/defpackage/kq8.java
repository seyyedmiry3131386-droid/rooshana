package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class kq8 {
    public final Matrix b;
    public final Matrix c;
    public final Matrix d;
    public final float[] e;
    public s70 l;
    public s70 m;
    public s70 n;
    public s70 o;
    public s70 p;
    public he2 q;
    public he2 r;
    public he2 s;
    public he2 t;
    public he2 u;
    public s70 v;
    public s70 w;
    public final boolean x;
    public final Matrix a = new Matrix();
    public float f = Float.NaN;
    public float g = Float.NaN;
    public float h = Float.NaN;
    public float i = 1.0f;
    public float j = 1.0f;
    public boolean k = true;

    public kq8(hj hjVar) {
        dj djVar = hjVar.a;
        this.l = djVar == null ? null : djVar.a();
        jj jjVar = hjVar.b;
        this.m = jjVar == null ? null : jjVar.a();
        bj bjVar = hjVar.c;
        this.n = bjVar == null ? null : bjVar.a();
        cj cjVar = hjVar.d;
        this.o = cjVar == null ? null : cjVar.a();
        cj cjVar2 = hjVar.f;
        this.q = cjVar2 == null ? null : cjVar2.a();
        this.x = hjVar.m;
        cj cjVar3 = hjVar.h;
        this.s = cjVar3 == null ? null : cjVar3.a();
        cj cjVar4 = hjVar.i;
        this.t = cjVar4 == null ? null : cjVar4.a();
        cj cjVar5 = hjVar.j;
        this.u = cjVar5 == null ? null : cjVar5.a();
        if (this.q != null) {
            this.b = new Matrix();
            this.c = new Matrix();
            this.d = new Matrix();
            this.e = new float[9];
        } else {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
        }
        cj cjVar6 = hjVar.g;
        this.r = cjVar6 == null ? null : cjVar6.a();
        bj bjVar2 = hjVar.e;
        if (bjVar2 != null) {
            this.p = bjVar2.a();
        }
        cj cjVar7 = hjVar.k;
        if (cjVar7 != null) {
            this.v = cjVar7.a();
        } else {
            this.v = null;
        }
        cj cjVar8 = hjVar.l;
        if (cjVar8 != null) {
            this.w = cjVar8.a();
        } else {
            this.w = null;
        }
    }

    public final void a(t70 t70Var) {
        t70Var.e(this.p);
        t70Var.e(this.v);
        t70Var.e(this.w);
        t70Var.e(this.l);
        t70Var.e(this.m);
        t70Var.e(this.n);
        t70Var.e(this.o);
        t70Var.e(this.q);
        t70Var.e(this.r);
        t70Var.e(this.s);
        t70Var.e(this.t);
        t70Var.e(this.u);
    }

    public final void b(o70 o70Var) {
        s70 s70Var = this.p;
        if (s70Var != null) {
            s70Var.a(o70Var);
        }
        s70 s70Var2 = this.v;
        if (s70Var2 != null) {
            s70Var2.a(o70Var);
        }
        s70 s70Var3 = this.w;
        if (s70Var3 != null) {
            s70Var3.a(o70Var);
        }
        s70 s70Var4 = this.l;
        if (s70Var4 != null) {
            s70Var4.a(o70Var);
        }
        s70 s70Var5 = this.m;
        if (s70Var5 != null) {
            s70Var5.a(o70Var);
        }
        s70 s70Var6 = this.n;
        if (s70Var6 != null) {
            s70Var6.a(o70Var);
        }
        s70 s70Var7 = this.o;
        if (s70Var7 != null) {
            s70Var7.a(o70Var);
        }
        he2 he2Var = this.q;
        if (he2Var != null) {
            he2Var.a(o70Var);
        }
        he2 he2Var2 = this.r;
        if (he2Var2 != null) {
            he2Var2.a(o70Var);
        }
        he2 he2Var3 = this.s;
        if (he2Var3 != null) {
            he2Var3.a(o70Var);
            this.s.a(new jq8(0, this));
        }
        he2 he2Var4 = this.t;
        if (he2Var4 != null) {
            he2Var4.a(o70Var);
            this.t.a(new jq8(1, this));
        }
        he2 he2Var5 = this.u;
        if (he2Var5 != null) {
            he2Var5.a(o70Var);
            this.u.a(new jq8(2, this));
        }
    }

    public final boolean c(hh2 hh2Var, Object obj) {
        Float fValueOf = Float.valueOf(100.0f);
        Float fValueOf2 = Float.valueOf(0.0f);
        if (obj == ag4.a) {
            s70 s70Var = this.l;
            if (s70Var == null) {
                this.l = new x29(hh2Var, new PointF());
                return true;
            }
            s70Var.j(hh2Var);
            return true;
        }
        if (obj == ag4.b) {
            s70 s70Var2 = this.m;
            if (s70Var2 == null) {
                this.m = new x29(hh2Var, new PointF());
                return true;
            }
            s70Var2.j(hh2Var);
            return true;
        }
        if (obj == ag4.c) {
            s70 s70Var3 = this.m;
            if (s70Var3 instanceof k38) {
                ((k38) s70Var3).m = hh2Var;
                return true;
            }
        }
        if (obj == ag4.d) {
            s70 s70Var4 = this.m;
            if (s70Var4 instanceof k38) {
                ((k38) s70Var4).n = hh2Var;
                return true;
            }
        }
        if (obj == ag4.j) {
            s70 s70Var5 = this.n;
            if (s70Var5 == null) {
                this.n = new x29(hh2Var, new be7());
                return true;
            }
            s70Var5.j(hh2Var);
            return true;
        }
        if (obj == ag4.k) {
            s70 s70Var6 = this.o;
            if (s70Var6 == null) {
                this.o = new x29(hh2Var, fValueOf2);
                return true;
            }
            s70Var6.j(hh2Var);
            return true;
        }
        if (obj == 3) {
            s70 s70Var7 = this.p;
            if (s70Var7 == null) {
                this.p = new x29(hh2Var, 100);
                return true;
            }
            s70Var7.j(hh2Var);
            return true;
        }
        if (obj == ag4.A) {
            s70 s70Var8 = this.v;
            if (s70Var8 == null) {
                this.v = new x29(hh2Var, fValueOf);
                return true;
            }
            s70Var8.j(hh2Var);
            return true;
        }
        if (obj == ag4.B) {
            s70 s70Var9 = this.w;
            if (s70Var9 == null) {
                this.w = new x29(hh2Var, fValueOf);
                return true;
            }
            s70Var9.j(hh2Var);
            return true;
        }
        if (obj == ag4.o) {
            if (this.q == null) {
                this.q = new he2(Collections.singletonList(new uy3(fValueOf2)));
            }
            this.q.j(hh2Var);
            return true;
        }
        if (obj == ag4.p) {
            if (this.r == null) {
                this.r = new he2(Collections.singletonList(new uy3(fValueOf2)));
            }
            this.r.j(hh2Var);
            return true;
        }
        if (obj == ag4.l) {
            if (this.s == null) {
                this.s = new he2(Collections.singletonList(new uy3(fValueOf2)));
            }
            this.s.j(hh2Var);
            return true;
        }
        if (obj == ag4.m) {
            if (this.t == null) {
                this.t = new he2(Collections.singletonList(new uy3(fValueOf2)));
            }
            this.t.j(hh2Var);
            return true;
        }
        if (obj != ag4.n) {
            return false;
        }
        if (this.u == null) {
            this.u = new he2(Collections.singletonList(new uy3(fValueOf2)));
        }
        this.u.j(hh2Var);
        return true;
    }

    public final void d() {
        for (int i = 0; i < 9; i++) {
            this.e[i] = 0.0f;
        }
    }

    public final Matrix e() {
        he2 he2Var;
        he2 he2Var2;
        PointF pointF;
        be7 be7Var;
        PointF pointF2;
        Matrix matrix = this.a;
        matrix.reset();
        he2 he2Var3 = this.s;
        if ((he2Var3 == null || he2Var3.l() == 0.0f) && (((he2Var = this.t) == null || he2Var.l() == 0.0f) && ((he2Var2 = this.u) == null || he2Var2.l() == 0.0f))) {
            s70 s70Var = this.m;
            if (s70Var != null && (pointF2 = (PointF) s70Var.e()) != null) {
                float f = pointF2.x;
                if (f != 0.0f || pointF2.y != 0.0f) {
                    matrix.preTranslate(f, pointF2.y);
                }
            }
            if (!this.x) {
                s70 s70Var2 = this.o;
                if (s70Var2 != null) {
                    float fFloatValue = s70Var2 instanceof x29 ? ((Float) s70Var2.e()).floatValue() : ((he2) s70Var2).l();
                    if (fFloatValue != 0.0f) {
                        matrix.preRotate(fFloatValue);
                    }
                }
            } else if (s70Var != null) {
                float f2 = s70Var.d;
                PointF pointF3 = (PointF) s70Var.e();
                float f3 = pointF3.x;
                float f4 = pointF3.y;
                s70Var.i(1.0E-4f + f2);
                PointF pointF4 = (PointF) s70Var.e();
                s70Var.i(f2);
                matrix.preRotate((float) Math.toDegrees(Math.atan2(pointF4.y - f4, pointF4.x - f3)));
            }
            if (this.q != null) {
                float fCos = this.r == null ? 0.0f : (float) Math.cos(Math.toRadians((-r5.l()) + 90.0f));
                float fSin = this.r == null ? 1.0f : (float) Math.sin(Math.toRadians((-r7.l()) + 90.0f));
                float fTan = (float) Math.tan(Math.toRadians(r1.l()));
                d();
                float[] fArr = this.e;
                fArr[0] = fCos;
                fArr[1] = fSin;
                float f5 = -fSin;
                fArr[3] = f5;
                fArr[4] = fCos;
                fArr[8] = 1.0f;
                Matrix matrix2 = this.b;
                matrix2.setValues(fArr);
                d();
                fArr[0] = 1.0f;
                fArr[3] = fTan;
                fArr[4] = 1.0f;
                fArr[8] = 1.0f;
                Matrix matrix3 = this.c;
                matrix3.setValues(fArr);
                d();
                fArr[0] = fCos;
                fArr[1] = f5;
                fArr[3] = fSin;
                fArr[4] = fCos;
                fArr[8] = 1.0f;
                Matrix matrix4 = this.d;
                matrix4.setValues(fArr);
                matrix3.preConcat(matrix2);
                matrix4.preConcat(matrix3);
                matrix.preConcat(matrix4);
            }
            s70 s70Var3 = this.n;
            if (s70Var3 != null && (be7Var = (be7) s70Var3.e()) != null) {
                float f6 = be7Var.a;
                if (f6 != 1.0f || be7Var.b != 1.0f) {
                    matrix.preScale(f6, be7Var.b);
                }
            }
            s70 s70Var4 = this.l;
            if (s70Var4 != null && (pointF = (PointF) s70Var4.e()) != null) {
                float f7 = pointF.x;
                if (f7 != 0.0f || pointF.y != 0.0f) {
                    matrix.preTranslate(-f7, -pointF.y);
                }
            }
        } else {
            he2 he2Var4 = this.s;
            float fL = he2Var4 != null ? he2Var4.l() : 0.0f;
            he2 he2Var5 = this.t;
            float fL2 = he2Var5 != null ? he2Var5.l() : 0.0f;
            he2 he2Var6 = this.u;
            float fL3 = he2Var6 != null ? he2Var6.l() : 0.0f;
            if (this.k || fL != this.f || fL2 != this.g || fL3 != this.h) {
                this.f = fL;
                this.g = fL2;
                this.h = fL3;
                if (fL != 0.0f) {
                    this.i = (float) Math.cos(Math.toRadians(fL));
                } else {
                    this.i = 1.0f;
                }
                if (fL2 != 0.0f) {
                    this.j = (float) Math.cos(Math.toRadians(fL2));
                } else {
                    this.j = 1.0f;
                }
                this.k = false;
            }
            s70 s70Var5 = this.l;
            PointF pointF5 = s70Var5 == null ? null : (PointF) s70Var5.e();
            s70 s70Var6 = this.m;
            PointF pointF6 = s70Var6 == null ? null : (PointF) s70Var6.e();
            s70 s70Var7 = this.n;
            be7 be7Var2 = s70Var7 != null ? (be7) s70Var7.e() : null;
            float f8 = be7Var2 != null ? be7Var2.a : 1.0f;
            float f9 = be7Var2 != null ? be7Var2.b : 1.0f;
            float f10 = this.i;
            float f11 = this.j;
            matrix.reset();
            if (pointF6 != null) {
                float f12 = pointF6.x;
                if (f12 != 0.0f || pointF6.y != 0.0f) {
                    matrix.preTranslate(f12, pointF6.y);
                }
            }
            if (fL3 != 0.0f) {
                matrix.preRotate(fL3);
            }
            if (fL2 != 0.0f) {
                matrix.preScale(f11, 1.0f);
            }
            if (fL != 0.0f) {
                matrix.preScale(1.0f, f10);
            }
            if (f8 != 1.0f || f9 != 1.0f) {
                matrix.preScale(f8, f9);
            }
            if (pointF5 != null) {
                float f13 = pointF5.x;
                if (f13 != 0.0f || pointF5.y != 0.0f) {
                    matrix.preTranslate(-f13, -pointF5.y);
                    return matrix;
                }
            }
        }
        return matrix;
    }

    public final Matrix f(float f) {
        s70 s70Var = this.m;
        PointF pointF = s70Var == null ? null : (PointF) s70Var.e();
        s70 s70Var2 = this.n;
        be7 be7Var = s70Var2 == null ? null : (be7) s70Var2.e();
        s70 s70Var3 = this.l;
        PointF pointF2 = s70Var3 != null ? (PointF) s70Var3.e() : null;
        Matrix matrix = this.a;
        matrix.reset();
        if (pointF != null) {
            matrix.preTranslate(pointF.x * f, pointF.y * f);
        }
        he2 he2Var = this.s;
        float fL = he2Var != null ? he2Var.l() * f : 0.0f;
        he2 he2Var2 = this.t;
        float fL2 = he2Var2 != null ? he2Var2.l() * f : 0.0f;
        he2 he2Var3 = this.u;
        float fL3 = he2Var3 != null ? he2Var3.l() * f : 0.0f;
        if (fL == 0.0f && fL2 == 0.0f && fL3 == 0.0f) {
            s70 s70Var4 = this.o;
            if (s70Var4 != null) {
                matrix.preRotate(((Float) s70Var4.e()).floatValue() * f, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
            }
        } else {
            float fCos = fL != 0.0f ? (float) Math.cos(Math.toRadians(fL)) : 1.0f;
            float fCos2 = fL2 != 0.0f ? (float) Math.cos(Math.toRadians(fL2)) : 1.0f;
            if (fL3 != 0.0f) {
                matrix.preRotate(fL3, pointF2 == null ? 0.0f : pointF2.x, pointF2 != null ? pointF2.y : 0.0f);
            }
            if (fL2 != 0.0f) {
                matrix.preScale(fCos2, 1.0f);
            }
            if (fL != 0.0f) {
                matrix.preScale(1.0f, fCos);
            }
        }
        if (be7Var != null) {
            double d = f;
            matrix.preScale((float) Math.pow(be7Var.a, d), (float) Math.pow(be7Var.b, d));
        }
        return matrix;
    }
}
