package androidx.compose.ui.graphics.colorspace;

import defpackage.dp2;
import defpackage.fr1;
import defpackage.g97;
import defpackage.gq8;
import defpackage.gu9;
import defpackage.js3;
import defpackage.nv0;
import defpackage.y45;
import defpackage.yd9;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class a extends nv0 {
    public static final y45 r = new y45(22);
    public final yd9 d;
    public final float e;
    public final float f;
    public final gq8 g;
    public final float[] h;
    public final float[] i;
    public final float[] j;
    public final fr1 k;
    public final dp2 l;
    public final g97 m;
    public final fr1 n;
    public final dp2 o;
    public final g97 p;
    public final boolean q;

    public a(String str, float[] fArr, yd9 yd9Var, final gq8 gq8Var, int i) {
        fr1 fr1Var;
        fr1 fr1Var2;
        double d = gq8Var.a;
        boolean z = d == -3.0d;
        double d2 = gq8Var.g;
        double d3 = gq8Var.f;
        if (z) {
            final int i2 = 4;
            fr1Var = new fr1() { // from class: i97
                @Override // defpackage.fr1
                public final double d(double d4) {
                    int i3 = i2;
                    gq8 gq8Var2 = gq8Var;
                    switch (i3) {
                        case 0:
                            float[] fArr2 = pv0.a;
                            return pv0.a(gq8Var2, d4);
                        case 1:
                            float[] fArr3 = pv0.a;
                            return pv0.c(gq8Var2, d4);
                        case 2:
                            double d5 = gq8Var2.b;
                            return d4 >= gq8Var2.e ? Math.pow((d5 * d4) + gq8Var2.c, gq8Var2.a) : d4 * gq8Var2.d;
                        case 3:
                            double d6 = gq8Var2.b;
                            double d7 = gq8Var2.c;
                            double d8 = gq8Var2.d;
                            return d4 >= gq8Var2.e ? Math.pow((d6 * d4) + d7, gq8Var2.a) + gq8Var2.f : (d8 * d4) + gq8Var2.g;
                        case 4:
                            float[] fArr4 = pv0.a;
                            return pv0.b(gq8Var2, d4);
                        case 5:
                            float[] fArr5 = pv0.a;
                            return pv0.d(gq8Var2, d4);
                        case 6:
                            double d9 = gq8Var2.b;
                            double d10 = gq8Var2.c;
                            double d11 = gq8Var2.d;
                            return d4 >= gq8Var2.e * d11 ? (Math.pow(d4, 1.0d / gq8Var2.a) - d10) / d9 : d4 / d11;
                        default:
                            double d12 = gq8Var2.b;
                            double d13 = gq8Var2.c;
                            double d14 = gq8Var2.d;
                            return d4 >= gq8Var2.e * d14 ? (Math.pow(d4 - gq8Var2.f, 1.0d / gq8Var2.a) - d13) / d12 : (d4 - gq8Var2.g) / d14;
                    }
                }
            };
        } else if (d == -2.0d) {
            final int i3 = 5;
            fr1Var = new fr1() { // from class: i97
                @Override // defpackage.fr1
                public final double d(double d4) {
                    int i32 = i3;
                    gq8 gq8Var2 = gq8Var;
                    switch (i32) {
                        case 0:
                            float[] fArr2 = pv0.a;
                            return pv0.a(gq8Var2, d4);
                        case 1:
                            float[] fArr3 = pv0.a;
                            return pv0.c(gq8Var2, d4);
                        case 2:
                            double d5 = gq8Var2.b;
                            return d4 >= gq8Var2.e ? Math.pow((d5 * d4) + gq8Var2.c, gq8Var2.a) : d4 * gq8Var2.d;
                        case 3:
                            double d6 = gq8Var2.b;
                            double d7 = gq8Var2.c;
                            double d8 = gq8Var2.d;
                            return d4 >= gq8Var2.e ? Math.pow((d6 * d4) + d7, gq8Var2.a) + gq8Var2.f : (d8 * d4) + gq8Var2.g;
                        case 4:
                            float[] fArr4 = pv0.a;
                            return pv0.b(gq8Var2, d4);
                        case 5:
                            float[] fArr5 = pv0.a;
                            return pv0.d(gq8Var2, d4);
                        case 6:
                            double d9 = gq8Var2.b;
                            double d10 = gq8Var2.c;
                            double d11 = gq8Var2.d;
                            return d4 >= gq8Var2.e * d11 ? (Math.pow(d4, 1.0d / gq8Var2.a) - d10) / d9 : d4 / d11;
                        default:
                            double d12 = gq8Var2.b;
                            double d13 = gq8Var2.c;
                            double d14 = gq8Var2.d;
                            return d4 >= gq8Var2.e * d14 ? (Math.pow(d4 - gq8Var2.f, 1.0d / gq8Var2.a) - d13) / d12 : (d4 - gq8Var2.g) / d14;
                    }
                }
            };
        } else if (d3 == 0.0d && d2 == 0.0d) {
            final int i4 = 6;
            fr1Var = new fr1() { // from class: i97
                @Override // defpackage.fr1
                public final double d(double d4) {
                    int i32 = i4;
                    gq8 gq8Var2 = gq8Var;
                    switch (i32) {
                        case 0:
                            float[] fArr2 = pv0.a;
                            return pv0.a(gq8Var2, d4);
                        case 1:
                            float[] fArr3 = pv0.a;
                            return pv0.c(gq8Var2, d4);
                        case 2:
                            double d5 = gq8Var2.b;
                            return d4 >= gq8Var2.e ? Math.pow((d5 * d4) + gq8Var2.c, gq8Var2.a) : d4 * gq8Var2.d;
                        case 3:
                            double d6 = gq8Var2.b;
                            double d7 = gq8Var2.c;
                            double d8 = gq8Var2.d;
                            return d4 >= gq8Var2.e ? Math.pow((d6 * d4) + d7, gq8Var2.a) + gq8Var2.f : (d8 * d4) + gq8Var2.g;
                        case 4:
                            float[] fArr4 = pv0.a;
                            return pv0.b(gq8Var2, d4);
                        case 5:
                            float[] fArr5 = pv0.a;
                            return pv0.d(gq8Var2, d4);
                        case 6:
                            double d9 = gq8Var2.b;
                            double d10 = gq8Var2.c;
                            double d11 = gq8Var2.d;
                            return d4 >= gq8Var2.e * d11 ? (Math.pow(d4, 1.0d / gq8Var2.a) - d10) / d9 : d4 / d11;
                        default:
                            double d12 = gq8Var2.b;
                            double d13 = gq8Var2.c;
                            double d14 = gq8Var2.d;
                            return d4 >= gq8Var2.e * d14 ? (Math.pow(d4 - gq8Var2.f, 1.0d / gq8Var2.a) - d13) / d12 : (d4 - gq8Var2.g) / d14;
                    }
                }
            };
        } else {
            final int i5 = 7;
            fr1Var = new fr1() { // from class: i97
                @Override // defpackage.fr1
                public final double d(double d4) {
                    int i32 = i5;
                    gq8 gq8Var2 = gq8Var;
                    switch (i32) {
                        case 0:
                            float[] fArr2 = pv0.a;
                            return pv0.a(gq8Var2, d4);
                        case 1:
                            float[] fArr3 = pv0.a;
                            return pv0.c(gq8Var2, d4);
                        case 2:
                            double d5 = gq8Var2.b;
                            return d4 >= gq8Var2.e ? Math.pow((d5 * d4) + gq8Var2.c, gq8Var2.a) : d4 * gq8Var2.d;
                        case 3:
                            double d6 = gq8Var2.b;
                            double d7 = gq8Var2.c;
                            double d8 = gq8Var2.d;
                            return d4 >= gq8Var2.e ? Math.pow((d6 * d4) + d7, gq8Var2.a) + gq8Var2.f : (d8 * d4) + gq8Var2.g;
                        case 4:
                            float[] fArr4 = pv0.a;
                            return pv0.b(gq8Var2, d4);
                        case 5:
                            float[] fArr5 = pv0.a;
                            return pv0.d(gq8Var2, d4);
                        case 6:
                            double d9 = gq8Var2.b;
                            double d10 = gq8Var2.c;
                            double d11 = gq8Var2.d;
                            return d4 >= gq8Var2.e * d11 ? (Math.pow(d4, 1.0d / gq8Var2.a) - d10) / d9 : d4 / d11;
                        default:
                            double d12 = gq8Var2.b;
                            double d13 = gq8Var2.c;
                            double d14 = gq8Var2.d;
                            return d4 >= gq8Var2.e * d14 ? (Math.pow(d4 - gq8Var2.f, 1.0d / gq8Var2.a) - d13) / d12 : (d4 - gq8Var2.g) / d14;
                    }
                }
            };
        }
        if (d == -3.0d) {
            final int i6 = 0;
            fr1Var2 = new fr1() { // from class: i97
                @Override // defpackage.fr1
                public final double d(double d4) {
                    int i32 = i6;
                    gq8 gq8Var2 = gq8Var;
                    switch (i32) {
                        case 0:
                            float[] fArr2 = pv0.a;
                            return pv0.a(gq8Var2, d4);
                        case 1:
                            float[] fArr3 = pv0.a;
                            return pv0.c(gq8Var2, d4);
                        case 2:
                            double d5 = gq8Var2.b;
                            return d4 >= gq8Var2.e ? Math.pow((d5 * d4) + gq8Var2.c, gq8Var2.a) : d4 * gq8Var2.d;
                        case 3:
                            double d6 = gq8Var2.b;
                            double d7 = gq8Var2.c;
                            double d8 = gq8Var2.d;
                            return d4 >= gq8Var2.e ? Math.pow((d6 * d4) + d7, gq8Var2.a) + gq8Var2.f : (d8 * d4) + gq8Var2.g;
                        case 4:
                            float[] fArr4 = pv0.a;
                            return pv0.b(gq8Var2, d4);
                        case 5:
                            float[] fArr5 = pv0.a;
                            return pv0.d(gq8Var2, d4);
                        case 6:
                            double d9 = gq8Var2.b;
                            double d10 = gq8Var2.c;
                            double d11 = gq8Var2.d;
                            return d4 >= gq8Var2.e * d11 ? (Math.pow(d4, 1.0d / gq8Var2.a) - d10) / d9 : d4 / d11;
                        default:
                            double d12 = gq8Var2.b;
                            double d13 = gq8Var2.c;
                            double d14 = gq8Var2.d;
                            return d4 >= gq8Var2.e * d14 ? (Math.pow(d4 - gq8Var2.f, 1.0d / gq8Var2.a) - d13) / d12 : (d4 - gq8Var2.g) / d14;
                    }
                }
            };
        } else if (d == -2.0d) {
            final int i7 = 1;
            fr1Var2 = new fr1() { // from class: i97
                @Override // defpackage.fr1
                public final double d(double d4) {
                    int i32 = i7;
                    gq8 gq8Var2 = gq8Var;
                    switch (i32) {
                        case 0:
                            float[] fArr2 = pv0.a;
                            return pv0.a(gq8Var2, d4);
                        case 1:
                            float[] fArr3 = pv0.a;
                            return pv0.c(gq8Var2, d4);
                        case 2:
                            double d5 = gq8Var2.b;
                            return d4 >= gq8Var2.e ? Math.pow((d5 * d4) + gq8Var2.c, gq8Var2.a) : d4 * gq8Var2.d;
                        case 3:
                            double d6 = gq8Var2.b;
                            double d7 = gq8Var2.c;
                            double d8 = gq8Var2.d;
                            return d4 >= gq8Var2.e ? Math.pow((d6 * d4) + d7, gq8Var2.a) + gq8Var2.f : (d8 * d4) + gq8Var2.g;
                        case 4:
                            float[] fArr4 = pv0.a;
                            return pv0.b(gq8Var2, d4);
                        case 5:
                            float[] fArr5 = pv0.a;
                            return pv0.d(gq8Var2, d4);
                        case 6:
                            double d9 = gq8Var2.b;
                            double d10 = gq8Var2.c;
                            double d11 = gq8Var2.d;
                            return d4 >= gq8Var2.e * d11 ? (Math.pow(d4, 1.0d / gq8Var2.a) - d10) / d9 : d4 / d11;
                        default:
                            double d12 = gq8Var2.b;
                            double d13 = gq8Var2.c;
                            double d14 = gq8Var2.d;
                            return d4 >= gq8Var2.e * d14 ? (Math.pow(d4 - gq8Var2.f, 1.0d / gq8Var2.a) - d13) / d12 : (d4 - gq8Var2.g) / d14;
                    }
                }
            };
        } else if (d3 == 0.0d && d2 == 0.0d) {
            final int i8 = 2;
            fr1Var2 = new fr1() { // from class: i97
                @Override // defpackage.fr1
                public final double d(double d4) {
                    int i32 = i8;
                    gq8 gq8Var2 = gq8Var;
                    switch (i32) {
                        case 0:
                            float[] fArr2 = pv0.a;
                            return pv0.a(gq8Var2, d4);
                        case 1:
                            float[] fArr3 = pv0.a;
                            return pv0.c(gq8Var2, d4);
                        case 2:
                            double d5 = gq8Var2.b;
                            return d4 >= gq8Var2.e ? Math.pow((d5 * d4) + gq8Var2.c, gq8Var2.a) : d4 * gq8Var2.d;
                        case 3:
                            double d6 = gq8Var2.b;
                            double d7 = gq8Var2.c;
                            double d8 = gq8Var2.d;
                            return d4 >= gq8Var2.e ? Math.pow((d6 * d4) + d7, gq8Var2.a) + gq8Var2.f : (d8 * d4) + gq8Var2.g;
                        case 4:
                            float[] fArr4 = pv0.a;
                            return pv0.b(gq8Var2, d4);
                        case 5:
                            float[] fArr5 = pv0.a;
                            return pv0.d(gq8Var2, d4);
                        case 6:
                            double d9 = gq8Var2.b;
                            double d10 = gq8Var2.c;
                            double d11 = gq8Var2.d;
                            return d4 >= gq8Var2.e * d11 ? (Math.pow(d4, 1.0d / gq8Var2.a) - d10) / d9 : d4 / d11;
                        default:
                            double d12 = gq8Var2.b;
                            double d13 = gq8Var2.c;
                            double d14 = gq8Var2.d;
                            return d4 >= gq8Var2.e * d14 ? (Math.pow(d4 - gq8Var2.f, 1.0d / gq8Var2.a) - d13) / d12 : (d4 - gq8Var2.g) / d14;
                    }
                }
            };
        } else {
            final int i9 = 3;
            fr1Var2 = new fr1() { // from class: i97
                @Override // defpackage.fr1
                public final double d(double d4) {
                    int i32 = i9;
                    gq8 gq8Var2 = gq8Var;
                    switch (i32) {
                        case 0:
                            float[] fArr2 = pv0.a;
                            return pv0.a(gq8Var2, d4);
                        case 1:
                            float[] fArr3 = pv0.a;
                            return pv0.c(gq8Var2, d4);
                        case 2:
                            double d5 = gq8Var2.b;
                            return d4 >= gq8Var2.e ? Math.pow((d5 * d4) + gq8Var2.c, gq8Var2.a) : d4 * gq8Var2.d;
                        case 3:
                            double d6 = gq8Var2.b;
                            double d7 = gq8Var2.c;
                            double d8 = gq8Var2.d;
                            return d4 >= gq8Var2.e ? Math.pow((d6 * d4) + d7, gq8Var2.a) + gq8Var2.f : (d8 * d4) + gq8Var2.g;
                        case 4:
                            float[] fArr4 = pv0.a;
                            return pv0.b(gq8Var2, d4);
                        case 5:
                            float[] fArr5 = pv0.a;
                            return pv0.d(gq8Var2, d4);
                        case 6:
                            double d9 = gq8Var2.b;
                            double d10 = gq8Var2.c;
                            double d11 = gq8Var2.d;
                            return d4 >= gq8Var2.e * d11 ? (Math.pow(d4, 1.0d / gq8Var2.a) - d10) / d9 : d4 / d11;
                        default:
                            double d12 = gq8Var2.b;
                            double d13 = gq8Var2.c;
                            double d14 = gq8Var2.d;
                            return d4 >= gq8Var2.e * d14 ? (Math.pow(d4 - gq8Var2.f, 1.0d / gq8Var2.a) - d13) / d12 : (d4 - gq8Var2.g) / d14;
                    }
                }
            };
        }
        this(str, fArr, yd9Var, null, fr1Var, fr1Var2, 0.0f, 1.0f, gq8Var, i);
    }

    @Override // defpackage.nv0
    public final float a(int i) {
        return this.f;
    }

    @Override // defpackage.nv0
    public final float b(int i) {
        return this.e;
    }

    @Override // defpackage.nv0
    public final boolean c() {
        return this.q;
    }

    @Override // defpackage.nv0
    public final long d(float f, float f2, float f3) {
        double d = f;
        g97 g97Var = this.p;
        float fD = (float) g97Var.d(d);
        float fD2 = (float) g97Var.d(f2);
        float fD3 = (float) g97Var.d(f3);
        float[] fArr = this.i;
        if (fArr.length < 9) {
            return 0L;
        }
        float f4 = (fArr[6] * fD3) + (fArr[3] * fD2) + (fArr[0] * fD);
        return (((long) Float.floatToRawIntBits((fArr[7] * fD3) + (fArr[4] * fD2) + (fArr[1] * fD))) & 4294967295L) | (Float.floatToRawIntBits(f4) << 32);
    }

    @Override // defpackage.nv0
    public final float e(float f, float f2, float f3) {
        double d = f;
        g97 g97Var = this.p;
        float fD = (float) g97Var.d(d);
        float fD2 = (float) g97Var.d(f2);
        float fD3 = (float) g97Var.d(f3);
        float[] fArr = this.i;
        return (fArr[8] * fD3) + (fArr[5] * fD2) + (fArr[2] * fD);
    }

    @Override // defpackage.nv0
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        a aVar = (a) obj;
        gq8 gq8Var = aVar.g;
        if (Float.compare(aVar.e, this.e) != 0 || Float.compare(aVar.f, this.f) != 0 || !js3.i(this.d, aVar.d) || !Arrays.equals(this.h, aVar.h)) {
            return false;
        }
        gq8 gq8Var2 = this.g;
        if (gq8Var2 != null) {
            return js3.i(gq8Var2, gq8Var);
        }
        if (gq8Var == null) {
            return true;
        }
        if (js3.i(this.k, aVar.k)) {
            return js3.i(this.n, aVar.n);
        }
        return false;
    }

    @Override // defpackage.nv0
    public final long f(float f, float f2, float f3, float f4, nv0 nv0Var) {
        float[] fArr = this.j;
        float f5 = (fArr[6] * f3) + (fArr[3] * f2) + (fArr[0] * f);
        float f6 = (fArr[7] * f3) + (fArr[4] * f2) + (fArr[1] * f);
        float f7 = (fArr[8] * f3) + (fArr[5] * f2) + (fArr[2] * f);
        g97 g97Var = this.m;
        return gu9.c((float) g97Var.d(f5), (float) g97Var.d(f6), (float) g97Var.d(f7), f4, nv0Var);
    }

    @Override // defpackage.nv0
    public final int hashCode() {
        int iHashCode = (Arrays.hashCode(this.h) + ((this.d.hashCode() + (super.hashCode() * 31)) * 31)) * 31;
        float f = this.e;
        int iFloatToIntBits = (iHashCode + (f == 0.0f ? 0 : Float.floatToIntBits(f))) * 31;
        float f2 = this.f;
        int iFloatToIntBits2 = (iFloatToIntBits + (f2 == 0.0f ? 0 : Float.floatToIntBits(f2))) * 31;
        gq8 gq8Var = this.g;
        int iHashCode2 = iFloatToIntBits2 + (gq8Var != null ? gq8Var.hashCode() : 0);
        if (gq8Var == null) {
            return this.n.hashCode() + ((this.k.hashCode() + (iHashCode2 * 31)) * 31);
        }
        return iHashCode2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0231  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0263  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public a(java.lang.String r33, float[] r34, defpackage.yd9 r35, float[] r36, defpackage.fr1 r37, defpackage.fr1 r38, float r39, float r40, defpackage.gq8 r41, int r42) {
        /*
            Method dump skipped, instruction units count: 672
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.graphics.colorspace.a.<init>(java.lang.String, float[], yd9, float[], fr1, fr1, float, float, gq8, int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public a(String str, float[] fArr, yd9 yd9Var, final double d, float f, float f2, int i) {
        fr1 fr1Var;
        fr1 fr1Var2 = r;
        if (d == 1.0d) {
            fr1Var = fr1Var2;
        } else {
            final int i2 = 0;
            fr1Var = new fr1() { // from class: h97
                @Override // defpackage.fr1
                public final double d(double d2) {
                    switch (i2) {
                        case 0:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, 1.0d / d);
                        default:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, d);
                    }
                }
            };
        }
        if (d != 1.0d) {
            final int i3 = 1;
            fr1Var2 = new fr1() { // from class: h97
                @Override // defpackage.fr1
                public final double d(double d2) {
                    switch (i3) {
                        case 0:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, 1.0d / d);
                        default:
                            if (d2 < 0.0d) {
                                d2 = 0.0d;
                            }
                            return Math.pow(d2, d);
                    }
                }
            };
        }
        this(str, fArr, yd9Var, null, fr1Var, fr1Var2, f, f2, new gq8(d, 1.0d, 0.0d, 0.0d, 0.0d), i);
    }
}
