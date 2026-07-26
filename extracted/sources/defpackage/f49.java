package defpackage;

import androidx.compose.ui.input.pointer.util.VelocityTracker1D$Strategy;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes.dex */
public final class f49 {
    public final boolean a;
    public final VelocityTracker1D$Strategy b;
    public final int c;
    public final qa1[] d;
    public int e;
    public final float[] f;
    public final float[] g;
    public final float[] h;

    public f49(boolean z, VelocityTracker1D$Strategy velocityTracker1D$Strategy) {
        int i;
        this.a = z;
        this.b = velocityTracker1D$Strategy;
        if (z && velocityTracker1D$Strategy.equals(VelocityTracker1D$Strategy.a)) {
            throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
        }
        int iOrdinal = velocityTracker1D$Strategy.ordinal();
        if (iOrdinal == 0) {
            i = 3;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i = 2;
        }
        this.c = i;
        this.d = new qa1[20];
        this.f = new float[20];
        this.g = new float[20];
        this.h = new float[3];
    }

    public final void a(float f, long j) {
        int i = (this.e + 1) % 20;
        this.e = i;
        qa1[] qa1VarArr = this.d;
        qa1 qa1Var = qa1VarArr[i];
        if (qa1Var != null) {
            qa1Var.a = j;
            qa1Var.b = f;
        } else {
            qa1 qa1Var2 = new qa1();
            qa1Var2.a = j;
            qa1Var2.b = f;
            qa1VarArr[i] = qa1Var2;
        }
    }

    public final float b(float f) {
        VelocityTracker1D$Strategy velocityTracker1D$Strategy;
        float[] fArr;
        float[] fArr2;
        float f2;
        boolean z;
        int i;
        float fSignum;
        float f3 = f;
        float f4 = 0.0f;
        if (f3 <= 0.0f) {
            rn3.b("maximumVelocity should be a positive value. You specified=" + f3);
        }
        int i2 = this.e;
        qa1[] qa1VarArr = this.d;
        qa1 qa1Var = qa1VarArr[i2];
        if (qa1Var == null) {
            f2 = 0.0f;
        } else {
            int i3 = 0;
            qa1 qa1Var2 = qa1Var;
            while (true) {
                qa1 qa1Var3 = qa1VarArr[i2];
                boolean z2 = this.a;
                velocityTracker1D$Strategy = this.b;
                fArr = this.f;
                fArr2 = this.g;
                if (qa1Var3 == null) {
                    f2 = f4;
                    z = z2;
                    i = 1;
                    break;
                }
                long j = qa1Var.a;
                f2 = f4;
                int i4 = i2;
                long j2 = qa1Var3.a;
                float f5 = j - j2;
                z = z2;
                i = 1;
                float fAbs = Math.abs(j2 - qa1Var2.a);
                qa1Var2 = (velocityTracker1D$Strategy == VelocityTracker1D$Strategy.a || z) ? qa1Var3 : qa1Var;
                if (f5 > 100.0f || fAbs > 40.0f) {
                    break;
                }
                fArr[i3] = qa1Var3.b;
                fArr2[i3] = -f5;
                i2 = (i4 == 0 ? 20 : i4) - 1;
                i3++;
                if (i3 >= 20) {
                    break;
                }
                f4 = f2;
            }
            if (i3 >= this.c) {
                int iOrdinal = velocityTracker1D$Strategy.ordinal();
                if (iOrdinal == 0) {
                    try {
                        float[] fArr3 = this.h;
                        ia7.m(fArr2, fArr, i3, fArr3);
                        fSignum = fArr3[1];
                    } catch (IllegalArgumentException unused) {
                        fSignum = f2;
                    }
                } else {
                    if (iOrdinal != i) {
                        throw new NoWhenBranchMatchedException();
                    }
                    int i5 = i3 - i;
                    float f6 = fArr2[i5];
                    int i6 = i5;
                    float fAbs2 = f2;
                    while (i6 > 0) {
                        int i7 = i6 - 1;
                        float f7 = fArr2[i7];
                        if (f6 != f7) {
                            float f8 = (z ? -fArr[i7] : fArr[i6] - fArr[i7]) / (f6 - f7);
                            fAbs2 += Math.abs(f8) * (f8 - (Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2))));
                            if (i6 == i5) {
                                fAbs2 *= 0.5f;
                            }
                        }
                        i6--;
                        f6 = f7;
                    }
                    fSignum = Math.signum(fAbs2) * ((float) Math.sqrt(Math.abs(fAbs2) * 2));
                }
                f4 = fSignum * 1000;
            } else {
                f4 = f2;
            }
        }
        if (f4 == f2 || Float.isNaN(f4)) {
            return f2;
        }
        if (f4 <= f2) {
            f3 = -f3;
            if (f4 >= f3) {
                return f4;
            }
        } else if (f4 <= f3) {
            f3 = f4;
        }
        return f3;
    }

    public /* synthetic */ f49() {
        this(false, VelocityTracker1D$Strategy.a);
    }

    public f49(int i) {
        this(true, VelocityTracker1D$Strategy.b);
    }
}
