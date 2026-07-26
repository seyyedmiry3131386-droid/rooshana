package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import com.airbnb.lottie.b;
import com.airbnb.lottie.model.content.PolystarShape$Type;
import com.airbnb.lottie.model.content.ShapeTrimPath$Type;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class rh6 implements v26, o70, ly3 {
    public final String e;
    public final b f;
    public final PolystarShape$Type g;
    public final boolean h;
    public final boolean i;
    public final he2 j;
    public final s70 k;
    public final he2 l;
    public final he2 m;
    public final he2 n;
    public final he2 o;
    public final he2 p;
    public boolean r;
    public final Path a = new Path();
    public final Path b = new Path();
    public final PathMeasure c = new PathMeasure();
    public final float[] d = new float[2];
    public final r01 q = new r01();

    public rh6(b bVar, t70 t70Var, sh6 sh6Var) {
        this.f = bVar;
        this.e = sh6Var.a;
        PolystarShape$Type polystarShape$Type = sh6Var.b;
        this.g = polystarShape$Type;
        this.h = sh6Var.j;
        this.i = sh6Var.k;
        he2 he2VarA = sh6Var.c.a();
        this.j = he2VarA;
        s70 s70VarA = sh6Var.d.a();
        this.k = s70VarA;
        he2 he2VarA2 = sh6Var.e.a();
        this.l = he2VarA2;
        he2 he2VarA3 = sh6Var.g.a();
        this.n = he2VarA3;
        he2 he2VarA4 = sh6Var.i.a();
        this.p = he2VarA4;
        PolystarShape$Type polystarShape$Type2 = PolystarShape$Type.STAR;
        if (polystarShape$Type == polystarShape$Type2) {
            this.m = sh6Var.f.a();
            this.o = sh6Var.h.a();
        } else {
            this.m = null;
            this.o = null;
        }
        t70Var.e(he2VarA);
        t70Var.e(s70VarA);
        t70Var.e(he2VarA2);
        t70Var.e(he2VarA3);
        t70Var.e(he2VarA4);
        if (polystarShape$Type == polystarShape$Type2) {
            t70Var.e(this.m);
            t70Var.e(this.o);
        }
        he2VarA.a(this);
        s70VarA.a(this);
        he2VarA2.a(this);
        he2VarA3.a(this);
        he2VarA4.a(this);
        if (polystarShape$Type == polystarShape$Type2) {
            this.m.a(this);
            this.o.a(this);
        }
    }

    @Override // defpackage.o70
    public final void a() {
        this.r = false;
        this.f.invalidateSelf();
    }

    @Override // defpackage.r31
    public final void b(List list, List list2) {
        int i = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) list;
            if (i >= arrayList.size()) {
                return;
            }
            r31 r31Var = (r31) arrayList.get(i);
            if (r31Var instanceof ws8) {
                ws8 ws8Var = (ws8) r31Var;
                if (ws8Var.c == ShapeTrimPath$Type.a) {
                    this.q.a.add(ws8Var);
                    ws8Var.c(this);
                }
            }
            i++;
        }
    }

    @Override // defpackage.ky3
    public final void c(jy3 jy3Var, int i, ArrayList arrayList, jy3 jy3Var2) {
        aw4.g(jy3Var, i, arrayList, jy3Var2, this);
    }

    @Override // defpackage.ky3
    public final void f(hh2 hh2Var, Object obj) {
        he2 he2Var;
        he2 he2Var2;
        if (obj == ag4.u) {
            this.j.j(hh2Var);
            return;
        }
        if (obj == ag4.v) {
            this.l.j(hh2Var);
            return;
        }
        if (obj == ag4.i) {
            this.k.j(hh2Var);
            return;
        }
        if (obj == ag4.w && (he2Var2 = this.m) != null) {
            he2Var2.j(hh2Var);
            return;
        }
        if (obj == ag4.x) {
            this.n.j(hh2Var);
            return;
        }
        if (obj == ag4.y && (he2Var = this.o) != null) {
            he2Var.j(hh2Var);
        } else if (obj == ag4.z) {
            this.p.j(hh2Var);
        }
    }

    @Override // defpackage.r31
    public final String getName() {
        return this.e;
    }

    @Override // defpackage.v26
    public final Path m() {
        boolean z;
        float f;
        double d;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        int i;
        double d2;
        boolean z2 = this.r;
        Path path = this.a;
        if (z2) {
            return path;
        }
        path.reset();
        if (this.h) {
            this.r = true;
            return path;
        }
        int iOrdinal = this.g.ordinal();
        s70 s70Var = this.k;
        he2 he2Var = this.n;
        he2 he2Var2 = this.p;
        he2 he2Var3 = this.l;
        he2 he2Var4 = this.j;
        if (iOrdinal == 0) {
            z = true;
            float fFloatValue = ((Float) he2Var4.e()).floatValue();
            double radians = Math.toRadians((he2Var3 != null ? ((Float) he2Var3.e()).floatValue() : 0.0d) - 90.0d);
            double d3 = fFloatValue;
            float f7 = (float) (6.283185307179586d / d3);
            if (this.i) {
                f7 *= -1.0f;
            }
            float f8 = f7;
            float f9 = f8 / 2.0f;
            float f10 = fFloatValue - ((int) fFloatValue);
            if (f10 != 0.0f) {
                f = 2.0f;
                radians += (double) ((1.0f - f10) * f9);
            } else {
                f = 2.0f;
            }
            float fFloatValue2 = ((Float) he2Var.e()).floatValue();
            float fFloatValue3 = ((Float) this.m.e()).floatValue();
            he2 he2Var5 = this.o;
            float fFloatValue4 = he2Var5 != null ? ((Float) he2Var5.e()).floatValue() / 100.0f : 0.0f;
            float fFloatValue5 = he2Var2 != null ? ((Float) he2Var2.e()).floatValue() / 100.0f : 0.0f;
            if (f10 != 0.0f) {
                float f11 = dw1.f(fFloatValue2, fFloatValue3, f10, fFloatValue3);
                double d4 = f11;
                f4 = f11;
                float fCos = (float) (Math.cos(radians) * d4);
                float fSin = (float) (Math.sin(radians) * d4);
                path.moveTo(fCos, fSin);
                d = radians + ((double) ((f8 * f10) / f));
                f2 = fCos;
                f3 = fSin;
            } else {
                double d5 = fFloatValue2;
                float fCos2 = (float) (Math.cos(radians) * d5);
                float fSin2 = (float) (Math.sin(radians) * d5);
                path.moveTo(fCos2, fSin2);
                d = radians + ((double) f9);
                f2 = fCos2;
                f3 = fSin2;
                f4 = 0.0f;
            }
            double dCeil = Math.ceil(d3) * 2.0d;
            double d6 = d;
            int i2 = 0;
            boolean z3 = false;
            while (true) {
                double d7 = i2;
                if (d7 >= dCeil) {
                    break;
                }
                float f12 = z3 ? fFloatValue2 : fFloatValue3;
                float f13 = (f4 == 0.0f || d7 != dCeil - 2.0d) ? f9 : (f8 * f10) / f;
                if (f4 != 0.0f && d7 == dCeil - 1.0d) {
                    f12 = f4;
                }
                double d8 = f12;
                float fCos3 = (float) (Math.cos(d6) * d8);
                float fSin3 = (float) (Math.sin(d6) * d8);
                if (fFloatValue4 == 0.0f && fFloatValue5 == 0.0f) {
                    path.lineTo(fCos3, fSin3);
                    f5 = f10;
                    f6 = fCos3;
                } else {
                    f5 = f10;
                    Path path2 = path;
                    double dAtan2 = (float) (Math.atan2(f3, f2) - 1.5707963267948966d);
                    float fCos4 = (float) Math.cos(dAtan2);
                    float fSin4 = (float) Math.sin(dAtan2);
                    float f14 = f2;
                    float f15 = f3;
                    double dAtan22 = (float) (Math.atan2(fSin3, fCos3) - 1.5707963267948966d);
                    float fCos5 = (float) Math.cos(dAtan22);
                    float fSin5 = (float) Math.sin(dAtan22);
                    float f16 = z3 ? fFloatValue4 : fFloatValue5;
                    float f17 = z3 ? fFloatValue5 : fFloatValue4;
                    float f18 = (z3 ? fFloatValue3 : fFloatValue2) * f16 * 0.47829f;
                    float f19 = fCos4 * f18;
                    float f20 = f18 * fSin4;
                    float f21 = (z3 ? fFloatValue2 : fFloatValue3) * f17 * 0.47829f;
                    float f22 = fCos5 * f21;
                    float f23 = f21 * fSin5;
                    if (f10 != 0.0f) {
                        if (i2 == 0) {
                            f19 *= f5;
                            f20 *= f5;
                        } else if (d7 == dCeil - 1.0d) {
                            f22 *= f5;
                            f23 *= f5;
                        }
                    }
                    f6 = fCos3;
                    path = path2;
                    path.cubicTo(f14 - f19, f15 - f20, f22 + fCos3, fSin3 + f23, f6, fSin3);
                }
                d6 += (double) f13;
                z3 = !z3;
                i2++;
                f2 = f6;
                f3 = fSin3;
                f10 = f5;
                f = 2.0f;
            }
            PointF pointF = (PointF) s70Var.e();
            path.offset(pointF.x, pointF.y);
            path.close();
        } else if (iOrdinal != 1) {
            z = true;
        } else {
            int iFloor = (int) Math.floor(((Float) he2Var4.e()).floatValue());
            double radians2 = Math.toRadians((he2Var3 != null ? ((Float) he2Var3.e()).floatValue() : 0.0d) - 90.0d);
            double d9 = iFloor;
            float fFloatValue6 = ((Float) he2Var2.e()).floatValue() / 100.0f;
            float fFloatValue7 = ((Float) he2Var.e()).floatValue();
            double d10 = fFloatValue7;
            z = true;
            float fCos6 = (float) (Math.cos(radians2) * d10);
            float fSin6 = (float) (Math.sin(radians2) * d10);
            path.moveTo(fCos6, fSin6);
            double d11 = (float) (6.283185307179586d / d9);
            double dCeil2 = Math.ceil(d9);
            double d12 = radians2 + d11;
            int i3 = 0;
            while (true) {
                double d13 = i3;
                if (d13 >= dCeil2) {
                    break;
                }
                double d14 = dCeil2;
                float fCos7 = (float) (Math.cos(d12) * d10);
                float fSin7 = (float) (Math.sin(d12) * d10);
                if (fFloatValue6 != 0.0f) {
                    i = i3;
                    Path path3 = path;
                    d2 = d10;
                    double dAtan23 = (float) (Math.atan2(fSin6, fCos6) - 1.5707963267948966d);
                    float fCos8 = (float) Math.cos(dAtan23);
                    float fSin8 = (float) Math.sin(dAtan23);
                    double dAtan24 = (float) (Math.atan2(fSin7, fCos7) - 1.5707963267948966d);
                    float f24 = fFloatValue7 * fFloatValue6 * 0.25f;
                    float f25 = f24 * fCos8;
                    float f26 = f24 * fSin8;
                    float fCos9 = ((float) Math.cos(dAtan24)) * f24;
                    float fSin9 = f24 * ((float) Math.sin(dAtan24));
                    if (d13 == d14 - 1.0d) {
                        Path path4 = this.b;
                        path4.reset();
                        path4.moveTo(fCos6, fSin6);
                        float f27 = fCos6 - f25;
                        float f28 = fSin6 - f26;
                        float f29 = fCos7 + fCos9;
                        float f30 = fSin7 + fSin9;
                        path4.cubicTo(f27, f28, f29, f30, fCos7, fSin7);
                        PathMeasure pathMeasure = this.c;
                        pathMeasure.setPath(path4, false);
                        float length = pathMeasure.getLength() * 0.9999f;
                        float[] fArr = this.d;
                        pathMeasure.getPosTan(length, fArr, null);
                        path = path3;
                        path.cubicTo(f27, f28, f29, f30, fArr[0], fArr[1]);
                        fCos6 = fCos7;
                        fSin6 = fSin7;
                    } else {
                        float f31 = fSin7 + fSin9;
                        path = path3;
                        fSin6 = fSin7;
                        path.cubicTo(fCos6 - f25, fSin6 - f26, fCos7 + fCos9, f31, fCos7, fSin6);
                        fCos6 = fCos7;
                    }
                } else {
                    i = i3;
                    d2 = d10;
                    fCos6 = fCos7;
                    fSin6 = fSin7;
                    if (d13 == d14 - 1.0d) {
                        i3 = i + 1;
                        dCeil2 = d14;
                        d10 = d2;
                    } else {
                        path.lineTo(fCos6, fSin6);
                    }
                }
                d12 += d11;
                i3 = i + 1;
                dCeil2 = d14;
                d10 = d2;
            }
            PointF pointF2 = (PointF) s70Var.e();
            path.offset(pointF2.x, pointF2.y);
            path.close();
        }
        path.close();
        this.q.c(path);
        this.r = z;
        return path;
    }
}
