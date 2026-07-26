package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import com.airbnb.lottie.b;
import com.airbnb.lottie.model.content.GradientType;

/* JADX INFO: loaded from: classes.dex */
public final class yu2 extends f90 {
    public x29 A;
    public final String q;
    public final boolean r;
    public final ue4 s;
    public final ue4 t;
    public final RectF u;
    public final GradientType v;
    public final int w;
    public final su2 x;
    public final su2 y;
    public final su2 z;

    /* JADX WARN: Illegal instructions before constructor call */
    public yu2(b bVar, t70 t70Var, xu2 xu2Var) {
        Paint.Join join;
        Paint.Join join2;
        int iOrdinal = xu2Var.h.ordinal();
        Paint.Cap cap = iOrdinal != 0 ? iOrdinal != 1 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        int iOrdinal2 = xu2Var.i.ordinal();
        if (iOrdinal2 == 0) {
            join = Paint.Join.MITER;
        } else if (iOrdinal2 == 1) {
            join = Paint.Join.ROUND;
        } else {
            if (iOrdinal2 != 2) {
                join2 = null;
                super(bVar, t70Var, cap, join2, xu2Var.j, xu2Var.d, xu2Var.g, xu2Var.k, xu2Var.l);
                this.s = new ue4((Object) null);
                this.t = new ue4((Object) null);
                this.u = new RectF();
                this.q = xu2Var.a;
                this.v = xu2Var.b;
                this.r = xu2Var.m;
                this.w = (int) (bVar.a.b() / 32.0f);
                s70 s70VarA = xu2Var.c.a();
                this.x = (su2) s70VarA;
                s70VarA.a(this);
                t70Var.e(s70VarA);
                s70 s70VarA2 = xu2Var.e.a();
                this.y = (su2) s70VarA2;
                s70VarA2.a(this);
                t70Var.e(s70VarA2);
                s70 s70VarA3 = xu2Var.f.a();
                this.z = (su2) s70VarA3;
                s70VarA3.a(this);
                t70Var.e(s70VarA3);
            }
            join = Paint.Join.BEVEL;
        }
        join2 = join;
        super(bVar, t70Var, cap, join2, xu2Var.j, xu2Var.d, xu2Var.g, xu2Var.k, xu2Var.l);
        this.s = new ue4((Object) null);
        this.t = new ue4((Object) null);
        this.u = new RectF();
        this.q = xu2Var.a;
        this.v = xu2Var.b;
        this.r = xu2Var.m;
        this.w = (int) (bVar.a.b() / 32.0f);
        s70 s70VarA4 = xu2Var.c.a();
        this.x = (su2) s70VarA4;
        s70VarA4.a(this);
        t70Var.e(s70VarA4);
        s70 s70VarA22 = xu2Var.e.a();
        this.y = (su2) s70VarA22;
        s70VarA22.a(this);
        t70Var.e(s70VarA22);
        s70 s70VarA32 = xu2Var.f.a();
        this.z = (su2) s70VarA32;
        s70VarA32.a(this);
        t70Var.e(s70VarA32);
    }

    public final int[] e(int[] iArr) {
        x29 x29Var = this.A;
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

    @Override // defpackage.f90, defpackage.ky3
    public final void f(hh2 hh2Var, Object obj) {
        super.f(hh2Var, obj);
        if (obj == ag4.J) {
            x29 x29Var = this.A;
            t70 t70Var = this.f;
            if (x29Var != null) {
                t70Var.o(x29Var);
            }
            x29 x29Var2 = new x29(hh2Var, null);
            this.A = x29Var2;
            x29Var2.a(this);
            t70Var.e(this.A);
        }
    }

    @Override // defpackage.f90, defpackage.lw1
    public final void g(Canvas canvas, Matrix matrix, int i, ex1 ex1Var) {
        Shader shader;
        Shader radialGradient;
        if (this.r) {
            return;
        }
        d(this.u, matrix, false);
        GradientType gradientType = this.v;
        GradientType gradientType2 = GradientType.a;
        su2 su2Var = this.x;
        su2 su2Var2 = this.z;
        su2 su2Var3 = this.y;
        if (gradientType == gradientType2) {
            long jH = h();
            ue4 ue4Var = this.s;
            shader = (LinearGradient) ue4Var.d(jH);
            if (shader == null) {
                PointF pointF = (PointF) su2Var3.e();
                PointF pointF2 = (PointF) su2Var2.e();
                ru2 ru2Var = (ru2) su2Var.e();
                radialGradient = new LinearGradient(pointF.x, pointF.y, pointF2.x, pointF2.y, e(ru2Var.b), ru2Var.a, Shader.TileMode.CLAMP);
                ue4Var.i(jH, radialGradient);
                shader = radialGradient;
            }
        } else {
            long jH2 = h();
            ue4 ue4Var2 = this.t;
            shader = (RadialGradient) ue4Var2.d(jH2);
            if (shader == null) {
                PointF pointF3 = (PointF) su2Var3.e();
                PointF pointF4 = (PointF) su2Var2.e();
                ru2 ru2Var2 = (ru2) su2Var.e();
                int[] iArrE = e(ru2Var2.b);
                float[] fArr = ru2Var2.a;
                radialGradient = new RadialGradient(pointF3.x, pointF3.y, (float) Math.hypot(pointF4.x - r10, pointF4.y - r11), iArrE, fArr, Shader.TileMode.CLAMP);
                ue4Var2.i(jH2, radialGradient);
                shader = radialGradient;
            }
        }
        this.i.setShader(shader);
        super.g(canvas, matrix, i, ex1Var);
    }

    @Override // defpackage.r31
    public final String getName() {
        return this.q;
    }

    public final int h() {
        float f = this.y.d;
        float f2 = this.w;
        int iRound = Math.round(f * f2);
        int iRound2 = Math.round(this.z.d * f2);
        int iRound3 = Math.round(this.x.d * f2);
        int i = iRound != 0 ? 527 * iRound : 17;
        if (iRound2 != 0) {
            i = i * 31 * iRound2;
        }
        return iRound3 != 0 ? i * 31 * iRound3 : i;
    }
}
