package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.b;
import com.airbnb.lottie.model.content.TextRangeUnits;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class oi8 extends t70 {
    public final StringBuilder D;
    public final StringBuilder E;
    public final StringBuilder F;
    public final StringBuilder G;
    public final RectF H;
    public final Matrix I;
    public final uz3 J;
    public final uz3 K;
    public final HashMap L;
    public final ue4 M;
    public final ArrayList N;
    public final ArrayList O;
    public final dv0 P;
    public final b Q;
    public final gf4 R;
    public final TextRangeUnits S;
    public final dv0 T;
    public x29 U;
    public final dv0 V;
    public x29 W;
    public final he2 X;
    public x29 Y;
    public final he2 Z;
    public x29 a0;
    public final dv0 b0;
    public x29 c0;
    public x29 d0;
    public final dv0 e0;
    public final dv0 f0;
    public final dv0 g0;

    public oi8(b bVar, q04 q04Var) {
        vp7 vp7Var;
        vp7 vp7Var2;
        bj bjVar;
        vp7 vp7Var3;
        bj bjVar2;
        vp7 vp7Var4;
        bj bjVar3;
        rb4 rb4Var;
        bj bjVar4;
        rb4 rb4Var2;
        cj cjVar;
        rb4 rb4Var3;
        cj cjVar2;
        rb4 rb4Var4;
        bj bjVar5;
        rb4 rb4Var5;
        bj bjVar6;
        super(bVar, q04Var);
        this.D = new StringBuilder(2);
        this.E = new StringBuilder(0);
        this.F = new StringBuilder(0);
        this.G = new StringBuilder(0);
        this.H = new RectF();
        this.I = new Matrix();
        uz3 uz3Var = new uz3(1, 1);
        uz3Var.setStyle(Paint.Style.FILL);
        this.J = uz3Var;
        uz3 uz3Var2 = new uz3(1, 2);
        uz3Var2.setStyle(Paint.Style.STROKE);
        this.K = uz3Var2;
        this.L = new HashMap();
        this.M = new ue4((Object) null);
        this.N = new ArrayList();
        this.O = new ArrayList();
        this.S = TextRangeUnits.b;
        this.Q = bVar;
        this.R = q04Var.b;
        dv0 dv0Var = new dv0((List) q04Var.q.b, 2);
        this.P = dv0Var;
        dv0Var.a(this);
        e(dv0Var);
        qq4 qq4Var = q04Var.r;
        if (qq4Var != null && (rb4Var5 = (rb4) qq4Var.a) != null && (bjVar6 = (bj) rb4Var5.b) != null) {
            s70 s70VarA = bjVar6.a();
            this.T = (dv0) s70VarA;
            s70VarA.a(this);
            e(s70VarA);
        }
        if (qq4Var != null && (rb4Var4 = (rb4) qq4Var.a) != null && (bjVar5 = (bj) rb4Var4.c) != null) {
            s70 s70VarA2 = bjVar5.a();
            this.V = (dv0) s70VarA2;
            s70VarA2.a(this);
            e(s70VarA2);
        }
        if (qq4Var != null && (rb4Var3 = (rb4) qq4Var.a) != null && (cjVar2 = (cj) rb4Var3.d) != null) {
            he2 he2VarA = cjVar2.a();
            this.X = he2VarA;
            he2VarA.a(this);
            e(he2VarA);
        }
        if (qq4Var != null && (rb4Var2 = (rb4) qq4Var.a) != null && (cjVar = (cj) rb4Var2.e) != null) {
            he2 he2VarA2 = cjVar.a();
            this.Z = he2VarA2;
            he2VarA2.a(this);
            e(he2VarA2);
        }
        if (qq4Var != null && (rb4Var = (rb4) qq4Var.a) != null && (bjVar4 = (bj) rb4Var.f) != null) {
            s70 s70VarA3 = bjVar4.a();
            this.b0 = (dv0) s70VarA3;
            s70VarA3.a(this);
            e(s70VarA3);
        }
        if (qq4Var != null && (vp7Var4 = (vp7) qq4Var.b) != null && (bjVar3 = (bj) vp7Var4.b) != null) {
            s70 s70VarA4 = bjVar3.a();
            this.e0 = (dv0) s70VarA4;
            s70VarA4.a(this);
            e(s70VarA4);
        }
        if (qq4Var != null && (vp7Var3 = (vp7) qq4Var.b) != null && (bjVar2 = (bj) vp7Var3.c) != null) {
            s70 s70VarA5 = bjVar2.a();
            this.f0 = (dv0) s70VarA5;
            s70VarA5.a(this);
            e(s70VarA5);
        }
        if (qq4Var != null && (vp7Var2 = (vp7) qq4Var.b) != null && (bjVar = (bj) vp7Var2.d) != null) {
            s70 s70VarA6 = bjVar.a();
            this.g0 = (dv0) s70VarA6;
            s70VarA6.a(this);
            e(s70VarA6);
        }
        if (qq4Var == null || (vp7Var = (vp7) qq4Var.b) == null) {
            return;
        }
        this.S = (TextRangeUnits) vp7Var.e;
    }

    public static void u(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    public static void v(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    @Override // defpackage.t70, defpackage.lw1
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        super.d(rectF, matrix, z);
        gf4 gf4Var = this.R;
        rectF.set(0.0f, 0.0f, gf4Var.k.width(), gf4Var.k.height());
    }

    @Override // defpackage.t70, defpackage.ky3
    public final void f(hh2 hh2Var, Object obj) {
        super.f(hh2Var, obj);
        PointF pointF = ag4.a;
        if (obj == 1) {
            x29 x29Var = this.U;
            if (x29Var != null) {
                o(x29Var);
            }
            x29 x29Var2 = new x29(hh2Var, null);
            this.U = x29Var2;
            x29Var2.a(this);
            e(this.U);
            return;
        }
        if (obj == 2) {
            x29 x29Var3 = this.W;
            if (x29Var3 != null) {
                o(x29Var3);
            }
            x29 x29Var4 = new x29(hh2Var, null);
            this.W = x29Var4;
            x29Var4.a(this);
            e(this.W);
            return;
        }
        if (obj == ag4.q) {
            x29 x29Var5 = this.Y;
            if (x29Var5 != null) {
                o(x29Var5);
            }
            x29 x29Var6 = new x29(hh2Var, null);
            this.Y = x29Var6;
            x29Var6.a(this);
            e(this.Y);
            return;
        }
        if (obj == ag4.r) {
            x29 x29Var7 = this.a0;
            if (x29Var7 != null) {
                o(x29Var7);
            }
            x29 x29Var8 = new x29(hh2Var, null);
            this.a0 = x29Var8;
            x29Var8.a(this);
            e(this.a0);
            return;
        }
        if (obj == ag4.D) {
            x29 x29Var9 = this.c0;
            if (x29Var9 != null) {
                o(x29Var9);
            }
            x29 x29Var10 = new x29(hh2Var, null);
            this.c0 = x29Var10;
            x29Var10.a(this);
            e(this.c0);
            return;
        }
        if (obj != ag4.K) {
            if (obj == ag4.M) {
                dv0 dv0Var = this.P;
                dv0Var.getClass();
                dv0Var.j(new ki8(new xf4(), hh2Var, new vq1()));
                return;
            }
            return;
        }
        x29 x29Var11 = this.d0;
        if (x29Var11 != null) {
            o(x29Var11);
        }
        x29 x29Var12 = new x29(hh2Var, null);
        this.d0 = x29Var12;
        x29Var12.a(this);
        e(this.d0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:164:0x0517, code lost:
    
        r3.insert(0, r6);
        r5 = r5 + 1;
        r1 = r23;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03e5  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x02dd  */
    @Override // defpackage.t70
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(android.graphics.Canvas r31, android.graphics.Matrix r32, int r33, defpackage.ex1 r34) {
        /*
            Method dump skipped, instruction units count: 1438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oi8.j(android.graphics.Canvas, android.graphics.Matrix, int, ex1):void");
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final String s(int i, String str) {
        int iCodePointAt = str.codePointAt(i);
        int iCharCount = Character.charCount(iCodePointAt) + i;
        while (iCharCount < str.length()) {
            int iCodePointAt2 = str.codePointAt(iCharCount);
            if (Character.getType(iCodePointAt2) != 16 && Character.getType(iCodePointAt2) != 27 && Character.getType(iCodePointAt2) != 6 && Character.getType(iCodePointAt2) != 28 && Character.getType(iCodePointAt2) != 8 && Character.getType(iCodePointAt2) != 19) {
                break;
            }
            iCharCount += Character.charCount(iCodePointAt2);
            iCodePointAt = (iCodePointAt * 31) + iCodePointAt2;
        }
        long j = iCodePointAt;
        ue4 ue4Var = this.M;
        if (ue4Var.f(j) >= 0) {
            return (String) ue4Var.d(j);
        }
        StringBuilder sb = this.D;
        sb.setLength(0);
        while (i < iCharCount) {
            int iCodePointAt3 = str.codePointAt(i);
            sb.appendCodePoint(iCodePointAt3);
            i += Character.charCount(iCodePointAt3);
        }
        String string = sb.toString();
        ue4Var.i(j, string);
        return string;
    }

    public final void t(vq1 vq1Var, int i, int i2) {
        x29 x29Var = this.U;
        uz3 uz3Var = this.J;
        if (x29Var != null) {
            uz3Var.setColor(((Integer) x29Var.e()).intValue());
        } else {
            dv0 dv0Var = this.T;
            if (dv0Var == null || !x(i2)) {
                uz3Var.setColor(vq1Var.h);
            } else {
                uz3Var.setColor(((Integer) dv0Var.e()).intValue());
            }
        }
        x29 x29Var2 = this.W;
        uz3 uz3Var2 = this.K;
        if (x29Var2 != null) {
            uz3Var2.setColor(((Integer) x29Var2.e()).intValue());
        } else {
            dv0 dv0Var2 = this.V;
            if (dv0Var2 == null || !x(i2)) {
                uz3Var2.setColor(vq1Var.i);
            } else {
                uz3Var2.setColor(((Integer) dv0Var2.e()).intValue());
            }
        }
        s70 s70Var = this.w.p;
        int iIntValue = 100;
        int iIntValue2 = s70Var == null ? 100 : ((Integer) s70Var.e()).intValue();
        dv0 dv0Var3 = this.b0;
        if (dv0Var3 != null && x(i2)) {
            iIntValue = ((Integer) dv0Var3.e()).intValue();
        }
        int iRound = Math.round((((iIntValue / 100.0f) * ((iIntValue2 * 255.0f) / 100.0f)) * i) / 255.0f);
        uz3Var.setAlpha(iRound);
        uz3Var2.setAlpha(iRound);
        x29 x29Var3 = this.Y;
        if (x29Var3 != null) {
            uz3Var2.setStrokeWidth(((Float) x29Var3.e()).floatValue());
            return;
        }
        he2 he2Var = this.X;
        if (he2Var == null || !x(i2)) {
            uz3Var2.setStrokeWidth(n29.c() * vq1Var.j);
        } else {
            uz3Var2.setStrokeWidth(((Float) he2Var.e()).floatValue());
        }
    }

    public final ni8 w(int i) {
        ArrayList arrayList = this.O;
        for (int size = arrayList.size(); size < i; size++) {
            ni8 ni8Var = new ni8();
            ni8Var.a = "";
            ni8Var.b = 0.0f;
            arrayList.add(ni8Var);
        }
        return (ni8) arrayList.get(i - 1);
    }

    public final boolean x(int i) {
        dv0 dv0Var;
        int length = ((vq1) this.P.e()).a.length();
        dv0 dv0Var2 = this.e0;
        if (dv0Var2 == null || (dv0Var = this.f0) == null) {
            return true;
        }
        int iMin = Math.min(((Integer) dv0Var2.e()).intValue(), ((Integer) dv0Var.e()).intValue());
        int iMax = Math.max(((Integer) dv0Var2.e()).intValue(), ((Integer) dv0Var.e()).intValue());
        dv0 dv0Var3 = this.g0;
        if (dv0Var3 != null) {
            int iIntValue = ((Integer) dv0Var3.e()).intValue();
            iMin += iIntValue;
            iMax += iIntValue;
        }
        if (this.S == TextRangeUnits.b) {
            return i >= iMin && i < iMax;
        }
        float f = (i / length) * 100.0f;
        return f >= ((float) iMin) && f < ((float) iMax);
    }

    public final boolean y(Canvas canvas, vq1 vq1Var, int i, float f) {
        PointF pointF = vq1Var.l;
        PointF pointF2 = vq1Var.m;
        float fC = n29.c();
        float f2 = (i * vq1Var.f * fC) + (pointF == null ? 0.0f : (vq1Var.f * fC) + pointF.y);
        if (this.Q.v && pointF2 != null && pointF != null && f2 >= pointF.y + pointF2.y + vq1Var.c) {
            return false;
        }
        float f3 = pointF == null ? 0.0f : pointF.x;
        float f4 = pointF2 != null ? pointF2.x : 0.0f;
        int iOrdinal = vq1Var.d.ordinal();
        if (iOrdinal == 0) {
            canvas.translate(f3, f2);
            return true;
        }
        if (iOrdinal == 1) {
            canvas.translate((f3 + f4) - f, f2);
            return true;
        }
        if (iOrdinal != 2) {
            return true;
        }
        canvas.translate(((f4 / 2.0f) + f3) - (f / 2.0f), f2);
        return true;
    }

    public final List z(String str, float f, jh2 jh2Var, float f2, float f3, boolean z) {
        float fMeasureText;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i4 = 0; i4 < str.length(); i4++) {
            char cCharAt = str.charAt(i4);
            if (z) {
                mh2 mh2Var = (mh2) this.R.h.c(mh2.a(cCharAt, jh2Var.a, jh2Var.c));
                if (mh2Var != null) {
                    fMeasureText = (n29.c() * ((float) mh2Var.c) * f2) + f3;
                }
            } else {
                fMeasureText = this.J.measureText(str.substring(i4, i4 + 1)) + f3;
            }
            if (cCharAt == ' ') {
                z2 = true;
                f6 = fMeasureText;
            } else if (z2) {
                z2 = false;
                i3 = i4;
                f5 = fMeasureText;
            } else {
                f5 += fMeasureText;
            }
            f4 += fMeasureText;
            if (f > 0.0f && f4 >= f && cCharAt != ' ') {
                i++;
                ni8 ni8VarW = w(i);
                if (i3 == i2) {
                    ni8VarW.a = str.substring(i2, i4).trim();
                    ni8VarW.b = (f4 - fMeasureText) - ((r10.length() - r8.length()) * f6);
                    i2 = i4;
                    i3 = i2;
                    f4 = fMeasureText;
                    f5 = f4;
                } else {
                    ni8VarW.a = str.substring(i2, i3 - 1).trim();
                    ni8VarW.b = ((f4 - f5) - ((r8.length() - r14.length()) * f6)) - f6;
                    f4 = f5;
                    i2 = i3;
                }
            }
        }
        if (f4 > 0.0f) {
            i++;
            ni8 ni8VarW2 = w(i);
            ni8VarW2.a = str.substring(i2);
            ni8VarW2.b = f4;
        }
        return this.O.subList(0, i);
    }
}
