package defpackage;

import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.airbnb.lottie.b;
import com.airbnb.lottie.model.content.GradientType;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class vu2 implements lw1, o70, ly3 {
    public final String a;
    public final boolean b;
    public final t70 c;
    public final ue4 d = new ue4((Object) null);
    public final ue4 e = new ue4((Object) null);
    public final Path f;
    public final uz3 g;
    public final RectF h;
    public final ArrayList i;
    public final GradientType j;
    public final su2 k;
    public final dv0 l;
    public final su2 m;
    public final su2 n;
    public x29 o;
    public x29 p;
    public final b q;
    public final int r;
    public s70 s;
    public float t;

    public vu2(b bVar, gf4 gf4Var, t70 t70Var, uu2 uu2Var) {
        Path path = new Path();
        this.f = path;
        this.g = new uz3(1, 0);
        this.h = new RectF();
        this.i = new ArrayList();
        this.t = 0.0f;
        this.c = t70Var;
        this.a = uu2Var.g;
        this.b = uu2Var.h;
        this.q = bVar;
        this.j = uu2Var.a;
        path.setFillType(uu2Var.b);
        this.r = (int) (gf4Var.b() / 32.0f);
        s70 s70VarA = uu2Var.c.a();
        this.k = (su2) s70VarA;
        s70VarA.a(this);
        t70Var.e(s70VarA);
        s70 s70VarA2 = uu2Var.d.a();
        this.l = (dv0) s70VarA2;
        s70VarA2.a(this);
        t70Var.e(s70VarA2);
        s70 s70VarA3 = uu2Var.e.a();
        this.m = (su2) s70VarA3;
        s70VarA3.a(this);
        t70Var.e(s70VarA3);
        s70 s70VarA4 = uu2Var.f.a();
        this.n = (su2) s70VarA4;
        s70VarA4.a(this);
        t70Var.e(s70VarA4);
        if (t70Var.k() != null) {
            he2 he2VarA = ((cj) t70Var.k().b).a();
            this.s = he2VarA;
            he2VarA.a(this);
            t70Var.e(this.s);
        }
    }

    @Override // defpackage.o70
    public final void a() {
        this.q.invalidateSelf();
    }

    @Override // defpackage.r31
    public final void b(List list, List list2) {
        for (int i = 0; i < list2.size(); i++) {
            r31 r31Var = (r31) list2.get(i);
            if (r31Var instanceof v26) {
                this.i.add((v26) r31Var);
            }
        }
    }

    @Override // defpackage.ky3
    public final void c(jy3 jy3Var, int i, ArrayList arrayList, jy3 jy3Var2) {
        aw4.g(jy3Var, i, arrayList, jy3Var2, this);
    }

    @Override // defpackage.lw1
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        Path path = this.f;
        path.reset();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i >= arrayList.size()) {
                path.computeBounds(rectF, false);
                rectF.set(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f);
                return;
            } else {
                path.addPath(((v26) arrayList.get(i)).m(), matrix);
                i++;
            }
        }
    }

    public final int[] e(int[] iArr) {
        x29 x29Var = this.p;
        if (x29Var != null) {
            Integer[] numArr = (Integer[]) x29Var.e();
            int i = 0;
            if (iArr.length == numArr.length) {
                while (i < iArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            } else {
                iArr = new int[numArr.length];
                while (i < numArr.length) {
                    iArr[i] = numArr[i].intValue();
                    i++;
                }
            }
        }
        return iArr;
    }

    @Override // defpackage.ky3
    public final void f(hh2 hh2Var, Object obj) {
        PointF pointF = ag4.a;
        if (obj == 4) {
            this.l.j(hh2Var);
            return;
        }
        ColorFilter colorFilter = ag4.I;
        t70 t70Var = this.c;
        if (obj == colorFilter) {
            x29 x29Var = this.o;
            if (x29Var != null) {
                t70Var.o(x29Var);
            }
            x29 x29Var2 = new x29(hh2Var, null);
            this.o = x29Var2;
            x29Var2.a(this);
            t70Var.e(this.o);
            return;
        }
        if (obj == ag4.J) {
            x29 x29Var3 = this.p;
            if (x29Var3 != null) {
                t70Var.o(x29Var3);
            }
            this.d.b();
            this.e.b();
            x29 x29Var4 = new x29(hh2Var, null);
            this.p = x29Var4;
            x29Var4.a(this);
            t70Var.e(this.p);
            return;
        }
        if (obj == ag4.e) {
            s70 s70Var = this.s;
            if (s70Var != null) {
                s70Var.j(hh2Var);
                return;
            }
            x29 x29Var5 = new x29(hh2Var, null);
            this.s = x29Var5;
            x29Var5.a(this);
            t70Var.e(this.s);
        }
    }

    @Override // defpackage.lw1
    public final void g(Canvas canvas, Matrix matrix, int i, ex1 ex1Var) {
        float[] fArr;
        int[] iArr;
        Shader linearGradient;
        int[] iArr2;
        if (this.b) {
            return;
        }
        Path path = this.f;
        path.reset();
        int i2 = 0;
        while (true) {
            ArrayList arrayList = this.i;
            if (i2 >= arrayList.size()) {
                break;
            }
            path.addPath(((v26) arrayList.get(i2)).m(), matrix);
            i2++;
        }
        path.computeBounds(this.h, false);
        GradientType gradientType = this.j;
        GradientType gradientType2 = GradientType.a;
        su2 su2Var = this.k;
        su2 su2Var2 = this.n;
        su2 su2Var3 = this.m;
        if (gradientType == gradientType2) {
            long jH = h();
            ue4 ue4Var = this.d;
            linearGradient = (LinearGradient) ue4Var.d(jH);
            if (linearGradient == null) {
                PointF pointF = (PointF) su2Var3.e();
                PointF pointF2 = (PointF) su2Var2.e();
                ru2 ru2Var = (ru2) su2Var.e();
                int[] iArrE = e(ru2Var.b);
                float[] fArr2 = ru2Var.a;
                if (iArrE.length < 2) {
                    fArr2 = new float[]{0.0f, 1.0f};
                    iArr2 = new int[]{iArrE[0], iArrE[0]};
                } else {
                    iArr2 = iArrE;
                }
                linearGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, iArr2, fArr2, Shader.TileMode.CLAMP);
                ue4Var.i(jH, linearGradient);
            }
        } else {
            long jH2 = h();
            ue4 ue4Var2 = this.e;
            RadialGradient radialGradient = (RadialGradient) ue4Var2.d(jH2);
            if (radialGradient != null) {
                linearGradient = radialGradient;
            } else {
                PointF pointF3 = (PointF) su2Var3.e();
                PointF pointF4 = (PointF) su2Var2.e();
                ru2 ru2Var2 = (ru2) su2Var.e();
                int[] iArrE2 = e(ru2Var2.b);
                float[] fArr3 = ru2Var2.a;
                if (iArrE2.length < 2) {
                    iArr = new int[]{iArrE2[0], iArrE2[0]};
                    fArr = new float[]{0.0f, 1.0f};
                } else {
                    fArr = fArr3;
                    iArr = iArrE2;
                }
                float f = pointF3.x;
                float f2 = pointF3.y;
                float fHypot = (float) Math.hypot(pointF4.x - f, pointF4.y - f2);
                if (fHypot <= 0.0f) {
                    fHypot = 0.001f;
                }
                RadialGradient radialGradient2 = new RadialGradient(f, f2, fHypot, iArr, fArr, Shader.TileMode.CLAMP);
                ue4Var2.i(jH2, radialGradient2);
                linearGradient = radialGradient2;
            }
        }
        linearGradient.setLocalMatrix(matrix);
        uz3 uz3Var = this.g;
        uz3Var.setShader(linearGradient);
        x29 x29Var = this.o;
        if (x29Var != null) {
            uz3Var.setColorFilter((ColorFilter) x29Var.e());
        }
        s70 s70Var = this.s;
        if (s70Var != null) {
            float fFloatValue = ((Float) s70Var.e()).floatValue();
            if (fFloatValue == 0.0f) {
                uz3Var.setMaskFilter(null);
            } else if (fFloatValue != this.t) {
                uz3Var.setMaskFilter(new BlurMaskFilter(fFloatValue, BlurMaskFilter.Blur.NORMAL));
            }
            this.t = fFloatValue;
        }
        float fIntValue = ((Integer) this.l.e()).intValue() / 100.0f;
        uz3Var.setAlpha(aw4.c((int) (i * fIntValue)));
        if (ex1Var != null) {
            ex1Var.a((int) (fIntValue * 255.0f), uz3Var);
        }
        canvas.drawPath(path, uz3Var);
    }

    @Override // defpackage.r31
    public final String getName() {
        return this.a;
    }

    public final int h() {
        float f = this.m.d;
        float f2 = this.r;
        int iRound = Math.round(f * f2);
        int iRound2 = Math.round(this.n.d * f2);
        int iRound3 = Math.round(this.k.d * f2);
        int i = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }
}
