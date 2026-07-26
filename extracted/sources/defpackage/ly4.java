package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.constraintlayout.utils.widget.MotionLabel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ly4 {
    public ry3[] A;
    public final View b;
    public final int c;
    public c26[] j;
    public wu k;
    public int[] o;
    public double[] p;
    public double[] q;
    public String[] r;
    public int[] s;
    public HashMap x;
    public HashMap y;
    public HashMap z;
    public final Rect a = new Rect();
    public boolean d = false;
    public int e = -1;
    public final wy4 f = new wy4();
    public final wy4 g = new wy4();
    public final jy4 h = new jy4();
    public final jy4 i = new jy4();
    public float l = Float.NaN;
    public float m = 0.0f;
    public float n = 1.0f;
    public final float[] t = new float[4];
    public final ArrayList u = new ArrayList();
    public final float[] v = new float[1];
    public final ArrayList w = new ArrayList();
    public int B = -1;
    public int C = -1;
    public View D = null;
    public int E = -1;
    public float F = Float.NaN;
    public Interpolator G = null;
    public boolean H = false;

    public ly4(View view) {
        this.b = view;
        this.c = view.getId();
        view.getLayoutParams();
    }

    public static void h(Rect rect, Rect rect2, int i, int i2, int i3) {
        if (i == 1) {
            int i4 = rect.left + rect.right;
            rect2.left = ((rect.top + rect.bottom) - rect.width()) / 2;
            rect2.top = i3 - ((rect.height() + i4) / 2);
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i == 2) {
            int i5 = rect.left + rect.right;
            rect2.left = i2 - ((rect.width() + (rect.top + rect.bottom)) / 2);
            rect2.top = (i5 - rect.height()) / 2;
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i == 3) {
            int i6 = rect.left + rect.right;
            rect2.left = ((rect.height() / 2) + rect.top) - (i6 / 2);
            rect2.top = i3 - ((rect.height() + i6) / 2);
            rect2.right = rect.width() + rect2.left;
            rect2.bottom = rect.height() + rect2.top;
            return;
        }
        if (i != 4) {
            return;
        }
        int i7 = rect.left + rect.right;
        rect2.left = i2 - ((rect.width() + (rect.bottom + rect.top)) / 2);
        rect2.top = (i7 - rect.height()) / 2;
        rect2.right = rect.width() + rect2.left;
        rect2.bottom = rect.height() + rect2.top;
    }

    public final void a(rx3 rx3Var) {
        this.w.add(rx3Var);
    }

    public final float b(float f, float[] fArr) {
        float f2 = 0.0f;
        if (fArr != null) {
            fArr[0] = 1.0f;
        } else {
            float f3 = this.n;
            if (f3 != 1.0d) {
                float f4 = this.m;
                if (f < f4) {
                    f = 0.0f;
                }
                if (f > f4 && f < 1.0d) {
                    f = Math.min((f - f4) * f3, 1.0f);
                }
            }
        }
        yy1 yy1Var = this.f.a;
        float f5 = Float.NaN;
        for (wy4 wy4Var : this.u) {
            yy1 yy1Var2 = wy4Var.a;
            if (yy1Var2 != null) {
                float f6 = wy4Var.c;
                if (f6 < f) {
                    yy1Var = yy1Var2;
                    f2 = f6;
                } else if (Float.isNaN(f5)) {
                    f5 = wy4Var.c;
                }
            }
        }
        if (yy1Var != null) {
            float f7 = (Float.isNaN(f5) ? 1.0f : f5) - f2;
            double d = (f - f2) / f7;
            f = (((float) yy1Var.a(d)) * f7) + f2;
            if (fArr != null) {
                fArr[0] = (float) yy1Var.b(d);
            }
        }
        return f;
    }

    public final void c(double d, float[] fArr, float[] fArr2) {
        float f;
        double[] dArr = new double[4];
        double[] dArr2 = new double[4];
        this.j[0].x(d, dArr);
        this.j[0].C(d, dArr2);
        float f2 = 0.0f;
        Arrays.fill(fArr2, 0.0f);
        int[] iArr = this.o;
        wy4 wy4Var = this.f;
        float f3 = wy4Var.e;
        float f4 = wy4Var.f;
        float f5 = wy4Var.g;
        float f6 = wy4Var.h;
        float f7 = 0.0f;
        float f8 = 0.0f;
        float f9 = 0.0f;
        for (int i = 0; i < iArr.length; i++) {
            float f10 = (float) dArr[i];
            float f11 = (float) dArr2[i];
            int i2 = iArr[i];
            if (i2 == 1) {
                f3 = f10;
                f2 = f11;
            } else if (i2 == 2) {
                f4 = f10;
                f9 = f11;
            } else if (i2 == 3) {
                f5 = f10;
                f7 = f11;
            } else if (i2 == 4) {
                f6 = f10;
                f8 = f11;
            }
        }
        float fCos = (f7 / 2.0f) + f2;
        float fSin = (f8 / 2.0f) + f9;
        ly4 ly4Var = wy4Var.m;
        if (ly4Var != null) {
            float[] fArr3 = new float[2];
            float[] fArr4 = new float[2];
            ly4Var.c(d, fArr3, fArr4);
            float f12 = fArr3[0];
            float f13 = fArr3[1];
            float f14 = fArr4[0];
            float f15 = fArr4[1];
            double d2 = f3;
            double d3 = f4;
            float fSin2 = (float) (((Math.sin(d3) * d2) + ((double) f12)) - ((double) (f5 / 2.0f)));
            float fCos2 = (float) ((((double) f13) - (Math.cos(d3) * d2)) - ((double) (f6 / 2.0f)));
            double d4 = f2;
            double d5 = f9;
            f = 2.0f;
            f4 = fCos2;
            fCos = (float) ((Math.cos(d3) * d5) + (Math.sin(d3) * d4) + ((double) f14));
            fSin = (float) ((Math.sin(d3) * d5) + (((double) f15) - (Math.cos(d3) * d4)));
            f3 = fSin2;
        } else {
            f = 2.0f;
        }
        fArr[0] = (f5 / f) + f3 + 0.0f;
        fArr[1] = (f6 / f) + f4 + 0.0f;
        fArr2[0] = fCos;
        fArr2[1] = fSin;
    }

    public final void d(float f, float f2, float f3, float[] fArr) {
        double[] dArr;
        float[] fArr2 = this.v;
        float fB = b(f, fArr2);
        c26[] c26VarArr = this.j;
        wy4 wy4Var = this.f;
        int i = 0;
        if (c26VarArr == null) {
            wy4 wy4Var2 = this.g;
            float f4 = wy4Var2.e - wy4Var.e;
            float f5 = wy4Var2.f - wy4Var.f;
            float f6 = wy4Var2.g - wy4Var.g;
            float f7 = (wy4Var2.h - wy4Var.h) + f5;
            fArr[0] = ((f6 + f4) * f2) + ((1.0f - f2) * f4);
            fArr[1] = (f7 * f3) + ((1.0f - f3) * f5);
            return;
        }
        double d = fB;
        c26VarArr[0].C(d, this.q);
        this.j[0].x(d, this.p);
        float f8 = fArr2[0];
        while (true) {
            dArr = this.q;
            if (i >= dArr.length) {
                break;
            }
            dArr[i] = dArr[i] * ((double) f8);
            i++;
        }
        wu wuVar = this.k;
        if (wuVar == null) {
            int[] iArr = this.o;
            double[] dArr2 = this.p;
            wy4Var.getClass();
            wy4.e(f2, f3, fArr, iArr, dArr, dArr2);
            return;
        }
        double[] dArr3 = this.p;
        if (dArr3.length > 0) {
            wuVar.x(d, dArr3);
            this.k.C(d, this.q);
            int[] iArr2 = this.o;
            double[] dArr4 = this.q;
            double[] dArr5 = this.p;
            wy4Var.getClass();
            wy4.e(f2, f3, fArr, iArr2, dArr4, dArr5);
        }
    }

    public final float e() {
        float[] fArr = new float[2];
        float f = 1.0f / 99;
        double d = 0.0d;
        double d2 = 0.0d;
        int i = 0;
        float fHypot = 0.0f;
        while (i < 100) {
            float f2 = i * f;
            double dA = f2;
            yy1 yy1Var = this.f.a;
            float f3 = Float.NaN;
            float f4 = 0.0f;
            for (wy4 wy4Var : this.u) {
                yy1 yy1Var2 = wy4Var.a;
                if (yy1Var2 != null) {
                    float f5 = wy4Var.c;
                    if (f5 < f2) {
                        yy1Var = yy1Var2;
                        f4 = f5;
                    } else if (Float.isNaN(f3)) {
                        f3 = wy4Var.c;
                    }
                }
            }
            if (yy1Var != null) {
                if (Float.isNaN(f3)) {
                    f3 = 1.0f;
                }
                dA = (((float) yy1Var.a((f2 - f4) / r17)) * (f3 - f4)) + f4;
            }
            double d3 = dA;
            this.j[0].x(d3, this.p);
            int i2 = i;
            this.f.c(d3, this.o, this.p, fArr, 0);
            if (i2 > 0) {
                fHypot += (float) Math.hypot(d2 - ((double) fArr[1]), d - ((double) fArr[0]));
            }
            d = fArr[0];
            d2 = fArr[1];
            i = i2 + 1;
        }
        return fHypot;
    }

    public final boolean f(float f, long j, wx3 wx3Var, View view) {
        boolean zD;
        View view2;
        boolean z;
        float f2;
        s99 s99Var;
        float f3;
        boolean z2;
        float f4;
        float f5;
        float f6;
        boolean z3;
        View view3 = view;
        s99 s99Var2 = null;
        float fB = b(f, null);
        int i = this.E;
        if (i != -1) {
            float f7 = 1.0f / i;
            float fFloor = ((float) Math.floor(fB / f7)) * f7;
            float f8 = (fB % f7) / f7;
            if (!Float.isNaN(this.F)) {
                f8 = (f8 + this.F) % 1.0f;
            }
            Interpolator interpolator = this.G;
            fB = ((interpolator != null ? interpolator.getInterpolation(f8) : ((double) f8) > 0.5d ? 1.0f : 0.0f) * f7) + fFloor;
        }
        HashMap map = this.y;
        if (map != null) {
            Iterator it = map.values().iterator();
            while (it.hasNext()) {
                ((f99) it.next()).c(view3, fB);
            }
        }
        HashMap map2 = this.x;
        if (map2 != null) {
            s99 s99Var3 = null;
            zD = false;
            for (u99 u99Var : map2.values()) {
                if (u99Var instanceof s99) {
                    s99Var3 = (s99) u99Var;
                } else {
                    zD |= u99Var.d(fB, j, wx3Var, view3);
                    view3 = view;
                }
            }
            s99Var2 = s99Var3;
        } else {
            zD = false;
        }
        c26[] c26VarArr = this.j;
        wy4 wy4Var = this.f;
        if (c26VarArr != null) {
            double d = fB;
            c26VarArr[0].x(d, this.p);
            this.j[0].C(d, this.q);
            wu wuVar = this.k;
            if (wuVar != null) {
                double[] dArr = this.p;
                f2 = 0.0f;
                if (dArr.length > 0) {
                    wuVar.x(d, dArr);
                    this.k.C(d, this.q);
                }
            } else {
                f2 = 0.0f;
            }
            if (this.H) {
                view2 = view;
                s99Var = s99Var2;
                f3 = 1.0f;
                z2 = zD;
                f4 = 2.0f;
            } else {
                int[] iArr = this.o;
                double[] dArr2 = this.p;
                f4 = 2.0f;
                double[] dArr3 = this.q;
                f3 = 1.0f;
                boolean z4 = this.d;
                float f9 = wy4Var.e;
                float f10 = wy4Var.f;
                float f11 = wy4Var.g;
                int i2 = 1;
                float f12 = wy4Var.h;
                s99Var = s99Var2;
                if (iArr.length != 0) {
                    f5 = f11;
                    if (wy4Var.p.length <= iArr[iArr.length - 1]) {
                        int i3 = iArr[iArr.length - 1] + 1;
                        wy4Var.p = new double[i3];
                        wy4Var.q = new double[i3];
                    }
                } else {
                    f5 = f11;
                }
                Arrays.fill(wy4Var.p, Double.NaN);
                for (int i4 = 0; i4 < iArr.length; i4++) {
                    double[] dArr4 = wy4Var.p;
                    int i5 = iArr[i4];
                    dArr4[i5] = dArr2[i4];
                    wy4Var.q[i5] = dArr3[i4];
                }
                float f13 = Float.NaN;
                float f14 = f2;
                float f15 = f14;
                float f16 = f15;
                int i6 = 0;
                float f17 = f5;
                float f18 = f16;
                while (true) {
                    double[] dArr5 = wy4Var.p;
                    f6 = f12;
                    if (i6 >= dArr5.length) {
                        break;
                    }
                    if (Double.isNaN(dArr5[i6])) {
                        z3 = zD;
                    } else {
                        float f19 = (float) (Double.isNaN(wy4Var.p[i6]) ? 0.0d : wy4Var.p[i6] + 0.0d);
                        z3 = zD;
                        float f20 = (float) wy4Var.q[i6];
                        if (i6 == i2) {
                            f9 = f19;
                            f14 = f20;
                        } else if (i6 == 2) {
                            f10 = f19;
                            f15 = f20;
                        } else if (i6 == 3) {
                            f17 = f19;
                            f18 = f20;
                        } else if (i6 == 4) {
                            f12 = f19;
                            f16 = f20;
                            i6++;
                            zD = z3;
                            i2 = 1;
                        } else if (i6 == 5) {
                            f13 = f19;
                        }
                    }
                    f12 = f6;
                    i6++;
                    zD = z3;
                    i2 = 1;
                }
                z2 = zD;
                ly4 ly4Var = wy4Var.m;
                if (ly4Var != null) {
                    float[] fArr = new float[2];
                    float[] fArr2 = new float[2];
                    ly4Var.c(d, fArr, fArr2);
                    float f21 = fArr[0];
                    float f22 = fArr[1];
                    float f23 = fArr2[0];
                    float f24 = fArr2[1];
                    double d2 = f9;
                    double d3 = f10;
                    float fSin = (float) (((Math.sin(d3) * d2) + ((double) f21)) - ((double) (f17 / 2.0f)));
                    float fCos = (float) ((((double) f22) - (Math.cos(d3) * d2)) - ((double) (f6 / 2.0f)));
                    double d4 = f14;
                    double d5 = f15;
                    float fCos2 = (float) ((Math.cos(d3) * d2 * d5) + (Math.sin(d3) * d4) + ((double) f23));
                    float fSin2 = (float) ((Math.sin(d3) * d2 * d5) + (((double) f24) - (Math.cos(d3) * d4)));
                    if (dArr3.length >= 2) {
                        dArr3[0] = fCos2;
                        dArr3[1] = fSin2;
                    }
                    if (Float.isNaN(f13)) {
                        view2 = view;
                    } else {
                        double degrees = Math.toDegrees(Math.atan2(fSin2, fCos2));
                        view2 = view;
                        view2.setRotation((float) (degrees + ((double) f13)));
                    }
                    f9 = fSin;
                    f10 = fCos;
                } else {
                    view2 = view;
                    if (!Float.isNaN(f13)) {
                        view2.setRotation(f13 + ((float) Math.toDegrees(Math.atan2((f16 / 2.0f) + f15, (f18 / 2.0f) + f14))) + f2);
                    }
                }
                if (view2 instanceof ie2) {
                    ((MotionLabel) ((ie2) view2)).c(f9, f10, f9 + f17, f10 + f6);
                } else {
                    float f25 = f9 + 0.5f;
                    int i7 = (int) f25;
                    float f26 = f10 + 0.5f;
                    int i8 = (int) f26;
                    int i9 = (int) (f25 + f17);
                    int i10 = (int) (f26 + f6);
                    int i11 = i9 - i7;
                    int i12 = i10 - i8;
                    if (i11 != view2.getMeasuredWidth() || i12 != view2.getMeasuredHeight() || z4) {
                        view2.measure(View.MeasureSpec.makeMeasureSpec(i11, 1073741824), View.MeasureSpec.makeMeasureSpec(i12, 1073741824));
                    }
                    view2.layout(i7, i8, i9, i10);
                }
                this.d = false;
            }
            if (this.C != -1) {
                if (this.D == null) {
                    this.D = ((View) view2.getParent()).findViewById(this.C);
                }
                if (this.D != null) {
                    float bottom = (this.D.getBottom() + r1.getTop()) / f4;
                    float right = (this.D.getRight() + this.D.getLeft()) / f4;
                    if (view2.getRight() - view2.getLeft() > 0 && view2.getBottom() - view2.getTop() > 0) {
                        view2.setPivotX(right - view2.getLeft());
                        view2.setPivotY(bottom - view2.getTop());
                    }
                }
            }
            HashMap map3 = this.y;
            if (map3 != null) {
                for (f99 f99Var : map3.values()) {
                    if (f99Var instanceof d99) {
                        double[] dArr6 = this.q;
                        if (dArr6.length > 1) {
                            view2.setRotation(((d99) f99Var).a(fB) + ((float) Math.toDegrees(Math.atan2(dArr6[1], dArr6[0]))));
                        }
                    }
                }
            }
            if (s99Var != null) {
                double[] dArr7 = this.q;
                double d6 = dArr7[0];
                double d7 = dArr7[1];
                s99 s99Var4 = s99Var;
                view2.setRotation(s99Var4.b(fB, j, wx3Var, view2) + ((float) Math.toDegrees(Math.atan2(d7, d6))));
                z = z2 | s99Var4.h;
            } else {
                z = z2;
            }
            int i13 = 1;
            while (true) {
                c26[] c26VarArr2 = this.j;
                if (i13 >= c26VarArr2.length) {
                    break;
                }
                c26 c26Var = c26VarArr2[i13];
                float[] fArr3 = this.t;
                c26Var.y(d, fArr3);
                zk8.j0((w21) wy4Var.n.get(this.r[i13 - 1]), view2, fArr3);
                i13++;
            }
            jy4 jy4Var = this.h;
            if (jy4Var.b == 0) {
                if (fB <= f2) {
                    view2.setVisibility(jy4Var.c);
                } else {
                    jy4 jy4Var2 = this.i;
                    if (fB >= f3) {
                        view2.setVisibility(jy4Var2.c);
                    } else if (jy4Var2.c != jy4Var.c) {
                        view2.setVisibility(0);
                    }
                }
            }
            if (this.A != null) {
                int i14 = 0;
                while (true) {
                    ry3[] ry3VarArr = this.A;
                    if (i14 >= ry3VarArr.length) {
                        break;
                    }
                    ry3VarArr[i14].h(view2, fB);
                    i14++;
                }
            }
        } else {
            view2 = view;
            boolean z5 = zD;
            float f27 = wy4Var.e;
            wy4 wy4Var2 = this.g;
            float f28 = dw1.f(wy4Var2.e, f27, fB, f27);
            float f29 = wy4Var.f;
            float f30 = dw1.f(wy4Var2.f, f29, fB, f29);
            float f31 = wy4Var.g;
            float f32 = wy4Var2.g;
            float f33 = dw1.f(f32, f31, fB, f31);
            float f34 = wy4Var.h;
            float f35 = wy4Var2.h;
            float f36 = f28 + 0.5f;
            int i15 = (int) f36;
            float f37 = f30 + 0.5f;
            int i16 = (int) f37;
            int i17 = (int) (f36 + f33);
            int iF = (int) (f37 + dw1.f(f35, f34, fB, f34));
            int i18 = i17 - i15;
            int i19 = iF - i16;
            if (f32 != f31 || f35 != f34 || this.d) {
                view2.measure(View.MeasureSpec.makeMeasureSpec(i18, 1073741824), View.MeasureSpec.makeMeasureSpec(i19, 1073741824));
                this.d = false;
            }
            view2.layout(i15, i16, i17, iF);
            z = z5;
        }
        HashMap map4 = this.z;
        if (map4 != null) {
            for (e89 e89Var : map4.values()) {
                if (e89Var instanceof c89) {
                    double[] dArr8 = this.q;
                    view2.setRotation(((c89) e89Var).a(fB) + ((float) Math.toDegrees(Math.atan2(dArr8[1], dArr8[0]))));
                } else {
                    e89Var.e(view2, fB);
                }
            }
        }
        return z;
    }

    public final void g(wy4 wy4Var) {
        wy4Var.d((int) this.b.getX(), (int) this.b.getY(), this.b.getWidth(), this.b.getHeight());
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to find 'out' block for switch in B:441:0x0cb0. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:203:0x05de  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0605  */
    /* JADX WARN: Removed duplicated region for block: B:459:0x0d2d  */
    /* JADX WARN: Removed duplicated region for block: B:607:0x063f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void i(int r50, int r51, long r52) {
        /*
            Method dump skipped, instruction units count: 4564
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ly4.i(int, int, long):void");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(" start: x: ");
        wy4 wy4Var = this.f;
        sb.append(wy4Var.e);
        sb.append(" y: ");
        sb.append(wy4Var.f);
        sb.append(" end: x: ");
        wy4 wy4Var2 = this.g;
        sb.append(wy4Var2.e);
        sb.append(" y: ");
        sb.append(wy4Var2.f);
        return sb.toString();
    }
}
