package defpackage;

import android.view.animation.AnimationUtils;
import androidx.transition.Transition;
import androidx.transition.TransitionSet;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class cr8 extends pr8 {
    public boolean b;
    public boolean c;
    public l38 e;
    public final pg f;
    public Runnable g;
    public final /* synthetic */ TransitionSet h;
    public long a = -1;
    public int d = 0;

    public cr8(TransitionSet transitionSet) {
        this.h = transitionSet;
        pg pgVar = new pg(20, false);
        long[] jArr = new long[20];
        pgVar.c = jArr;
        pgVar.d = new float[20];
        pgVar.b = 0;
        Arrays.fill(jArr, Long.MIN_VALUE);
        this.f = pgVar;
    }

    @Override // defpackage.pr8, defpackage.gr8
    public final void f(Transition transition) {
        this.c = true;
    }

    public final void h() {
        if (this.b) {
            i();
            this.e.a(this.h.A + 1);
        } else {
            this.d = 1;
            this.g = null;
        }
    }

    public final void i() {
        int i;
        if (this.e != null) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        float f = this.a;
        pg pgVar = this.f;
        int i2 = pgVar.b;
        float[] fArr = (float[]) pgVar.d;
        long[] jArr = (long[]) pgVar.c;
        char c = 20;
        int i3 = (i2 + 1) % 20;
        pgVar.b = i3;
        jArr[i3] = jCurrentAnimationTimeMillis;
        fArr[i3] = f;
        bv bvVar = new bv(4);
        float fSqrt = 0.0f;
        bvVar.b = 0.0f;
        this.e = new l38(bvVar);
        m38 m38Var = new m38();
        m38Var.a(1.0f);
        m38Var.b(200.0f);
        l38 l38Var = this.e;
        l38Var.m = m38Var;
        l38Var.b = this.a;
        l38Var.c = true;
        ArrayList arrayList = l38Var.l;
        if (l38Var.f) {
            throw new UnsupportedOperationException("Error: Update listeners must be added beforethe animation.");
        }
        if (!arrayList.contains(this)) {
            arrayList.add(this);
        }
        l38 l38Var2 = this.e;
        int i4 = pgVar.b;
        long j = Long.MIN_VALUE;
        if (i4 != 0 || jArr[i4] != Long.MIN_VALUE) {
            long j2 = jArr[i4];
            int i5 = 0;
            long j3 = j2;
            while (true) {
                long j4 = jArr[i4];
                if (j4 == j) {
                    break;
                }
                float f2 = j2 - j4;
                float fAbs = Math.abs(j4 - j3);
                if (f2 > 100.0f || fAbs > 40.0f) {
                    break;
                }
                if (i4 == 0) {
                    i4 = 20;
                }
                i4--;
                i5++;
                if (i5 >= 20) {
                    break;
                }
                j3 = j4;
                j = Long.MIN_VALUE;
            }
            if (i5 >= 2) {
                float f3 = 1000.0f;
                if (i5 == 2) {
                    int i6 = pgVar.b;
                    int i7 = i6 == 0 ? 19 : i6 - 1;
                    float f4 = jArr[i6] - jArr[i7];
                    if (f4 != 0.0f) {
                        fSqrt = ((fArr[i6] - fArr[i7]) / f4) * 1000.0f;
                    }
                } else {
                    int i8 = pgVar.b;
                    int i9 = ((i8 - i5) + 21) % 20;
                    int i10 = (i8 + 21) % 20;
                    long j5 = jArr[i9];
                    float f5 = fArr[i9];
                    int i11 = i9 + 1;
                    int i12 = i11 % 20;
                    float f6 = 0.0f;
                    while (i12 != i10) {
                        long j6 = jArr[i12];
                        char c2 = c;
                        float f7 = f3;
                        float f8 = j6 - j5;
                        if (f8 == fSqrt) {
                            i = i11;
                        } else {
                            float f9 = fArr[i12];
                            int i13 = i11;
                            float f10 = (f9 - f5) / f8;
                            float fAbs2 = (Math.abs(f10) * (f10 - ((float) (Math.sqrt(2.0f * Math.abs(f6)) * ((double) Math.signum(f6)))))) + f6;
                            i = i13;
                            if (i12 == i) {
                                fAbs2 *= 0.5f;
                            }
                            f6 = fAbs2;
                            f5 = f9;
                            j5 = j6;
                        }
                        i12 = (i12 + 1) % 20;
                        i11 = i;
                        c = c2;
                        f3 = f7;
                        fSqrt = 0.0f;
                    }
                    fSqrt = ((float) (Math.sqrt(Math.abs(f6) * 2.0f) * ((double) Math.signum(f6)))) * f3;
                }
            }
        }
        l38Var2.a = fSqrt;
        l38 l38Var3 = this.e;
        l38Var3.g = this.h.A + 1;
        l38Var3.h = -1.0f;
        l38Var3.j = 4.0f;
        br8 br8Var = new br8(this);
        ArrayList arrayList2 = l38Var3.k;
        if (arrayList2.contains(br8Var)) {
            return;
        }
        arrayList2.add(br8Var);
    }
}
