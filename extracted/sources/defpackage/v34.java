package defpackage;

import androidx.compose.foundation.gestures.Orientation;
import java.util.List;
import java.util.Map;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes.dex */
public final class v34 implements dl4 {
    public final w34 a;
    public final int b;
    public final boolean c;
    public final float d;
    public final dl4 e;
    public final float f;
    public final boolean g;
    public final e71 h;
    public final qj1 i;
    public final long j;
    public final List k;
    public final int l;
    public final int m;
    public final int n;
    public final Orientation o;
    public final int p;
    public final int q;

    public v34(w34 w34Var, int i, boolean z, float f, dl4 dl4Var, float f2, boolean z2, e71 e71Var, qj1 qj1Var, long j, List list, int i2, int i3, int i4, Orientation orientation, int i5, int i6) {
        this.a = w34Var;
        this.b = i;
        this.c = z;
        this.d = f;
        this.e = dl4Var;
        this.f = f2;
        this.g = z2;
        this.h = e71Var;
        this.i = qj1Var;
        this.j = j;
        this.k = list;
        this.l = i2;
        this.m = i3;
        this.n = i4;
        this.o = orientation;
        this.p = i5;
        this.q = i6;
    }

    @Override // defpackage.dl4
    public final int a() {
        return this.e.a();
    }

    @Override // defpackage.dl4
    public final int b() {
        return this.e.b();
    }

    @Override // defpackage.dl4
    public final Map c() {
        return this.e.c();
    }

    @Override // defpackage.dl4
    public final void d() {
        this.e.d();
    }

    @Override // defpackage.dl4
    public final dp2 e() {
        return this.e.e();
    }

    public final v34 f(int i, boolean z) {
        w34 w34Var;
        if (this.g) {
            return null;
        }
        List list = this.k;
        if (list.isEmpty() || (w34Var = this.a) == null) {
            return null;
        }
        int i2 = w34Var.l;
        int i3 = this.b - i;
        if (i3 < 0 || i3 >= i2) {
            return null;
        }
        w34 w34Var2 = (w34) a.o0(list);
        w34 w34Var3 = (w34) a.u0(list);
        if (w34Var2.n || w34Var3.n) {
            return null;
        }
        int i4 = this.m;
        int i5 = this.l;
        if (i < 0) {
            if (Math.min((w34Var2.j + w34Var2.l) - i5, (w34Var3.j + w34Var3.l) - i4) <= (-i)) {
                return null;
            }
        } else if (Math.min(i5 - w34Var2.j, i4 - w34Var3.j) <= i) {
            return null;
        }
        int size = list.size();
        for (int i6 = 0; i6 < size; i6++) {
            w34 w34Var4 = (w34) list.get(i6);
            w34Var4.getClass();
            int[] iArr = w34Var4.p;
            if (!w34Var4.n) {
                w34Var4.j += i;
                int length = iArr.length;
                for (int i7 = 0; i7 < length; i7++) {
                    if ((i7 & 1) != 0) {
                        iArr[i7] = iArr[i7] + i;
                    }
                }
                if (z) {
                    int size2 = w34Var4.b.size();
                    for (int i8 = 0; i8 < size2; i8++) {
                        dw1.x(((rb5) w34Var4.i.a).g(w34Var4.g));
                    }
                }
            }
        }
        return new v34(this.a, i3, this.c || i > 0, i, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q);
    }

    public final long g() {
        dl4 dl4Var = this.e;
        return (((long) dl4Var.b()) << 32) | (((long) dl4Var.a()) & 4294967295L);
    }
}
