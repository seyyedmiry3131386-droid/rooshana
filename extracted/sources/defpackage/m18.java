package defpackage;

import androidx.constraintlayout.core.SolverVariable$Type;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class m18 implements Comparable {
    public boolean a;
    public float e;
    public SolverVariable$Type i;
    public int b = -1;
    public int c = -1;
    public int d = 0;
    public boolean f = false;
    public final float[] g = new float[9];
    public final float[] h = new float[9];
    public yv[] j = new yv[16];
    public int k = 0;
    public int l = 0;

    public m18(SolverVariable$Type solverVariable$Type) {
        this.i = solverVariable$Type;
    }

    public final void a(yv yvVar) {
        int i = 0;
        while (true) {
            int i2 = this.k;
            if (i >= i2) {
                yv[] yvVarArr = this.j;
                if (i2 >= yvVarArr.length) {
                    this.j = (yv[]) Arrays.copyOf(yvVarArr, yvVarArr.length * 2);
                }
                yv[] yvVarArr2 = this.j;
                int i3 = this.k;
                yvVarArr2[i3] = yvVar;
                this.k = i3 + 1;
                return;
            }
            if (this.j[i] == yvVar) {
                return;
            } else {
                i++;
            }
        }
    }

    public final void b(yv yvVar) {
        int i = this.k;
        int i2 = 0;
        while (i2 < i) {
            if (this.j[i2] == yvVar) {
                while (i2 < i - 1) {
                    yv[] yvVarArr = this.j;
                    int i3 = i2 + 1;
                    yvVarArr[i2] = yvVarArr[i3];
                    i2 = i3;
                }
                this.k--;
                return;
            }
            i2++;
        }
    }

    public final void c() {
        this.i = SolverVariable$Type.d;
        this.d = 0;
        this.b = -1;
        this.c = -1;
        this.e = 0.0f;
        this.f = false;
        int i = this.k;
        for (int i2 = 0; i2 < i; i2++) {
            this.j[i2] = null;
        }
        this.k = 0;
        this.l = 0;
        this.a = false;
        Arrays.fill(this.h, 0.0f);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.b - ((m18) obj).b;
    }

    public final void d(l74 l74Var, float f) {
        this.e = f;
        this.f = true;
        int i = this.k;
        this.c = -1;
        for (int i2 = 0; i2 < i; i2++) {
            this.j[i2].h(l74Var, this, false);
        }
        this.k = 0;
    }

    public final void e(l74 l74Var, yv yvVar) {
        int i = this.k;
        for (int i2 = 0; i2 < i; i2++) {
            this.j[i2].i(l74Var, yvVar, false);
        }
        this.k = 0;
    }

    public final String toString() {
        return "" + this.b;
    }
}
