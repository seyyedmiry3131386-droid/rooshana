package defpackage;

import androidx.compose.ui.layout.k;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.KotlinNothingValueException;

/* JADX INFO: loaded from: classes.dex */
public final class w34 {
    public final int a;
    public final List b;
    public final pd c;
    public final LayoutDirection d;
    public final int e;
    public final long f;
    public final Object g;
    public final Object h;
    public final v24 i;
    public int j;
    public final int k;
    public final int l;
    public final int m;
    public boolean n;
    public int o = Integer.MIN_VALUE;
    public final int[] p;

    public w34(int i, List list, pd pdVar, LayoutDirection layoutDirection, int i2, int i3, int i4, long j, Object obj, Object obj2, v24 v24Var, long j2) {
        this.a = i;
        this.b = list;
        this.c = pdVar;
        this.d = layoutDirection;
        this.e = i4;
        this.f = j;
        this.g = obj;
        this.h = obj2;
        this.i = v24Var;
        int size = list.size();
        int i5 = 0;
        int iMax = 0;
        for (int i6 = 0; i6 < size; i6++) {
            b96 b96Var = (b96) list.get(i6);
            i5 += b96Var.b;
            iMax = Math.max(iMax, b96Var.a);
        }
        this.k = i5;
        int i7 = i5 + this.e;
        this.l = i7 >= 0 ? i7 : 0;
        this.m = iMax;
        this.p = new int[this.b.size() * 2];
    }

    public final long a(int i) {
        int i2;
        long j;
        if (i == 0 && this.b.size() == 0) {
            i2 = this.j;
            j = 0;
        } else {
            int i3 = i * 2;
            int[] iArr = this.p;
            int i4 = iArr[i3];
            i2 = iArr[i3 + 1];
            j = i4;
        }
        return (4294967295L & ((long) i2)) | (j << 32);
    }

    public final void b(a96 a96Var) {
        if (this.o == Integer.MIN_VALUE) {
            un3.a("position() should be called first");
        }
        List list = this.b;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            b96 b96Var = (b96) list.get(i);
            int i2 = b96Var.b;
            long jA = a(i);
            dw1.x(((rb5) this.i.a).g(this.g));
            long jC = rq3.c(jA, this.f);
            dp2 dp2Var = k.a;
            a96Var.getClass();
            a96.a(a96Var, b96Var);
            b96Var.W(rq3.c(jC, b96Var.e), 0.0f, dp2Var);
        }
    }

    public final void c(int i, int i2, int i3) {
        this.j = i;
        this.o = i3;
        List list = this.b;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            b96 b96Var = (b96) list.get(i4);
            int i5 = i4 * 2;
            pd pdVar = this.c;
            if (pdVar == null) {
                un3.b("null horizontalAlignment when isVertical == true");
                throw new KotlinNothingValueException();
            }
            int iA = pdVar.a(b96Var.a, i2, this.d);
            int[] iArr = this.p;
            iArr[i5] = iA;
            iArr[i5 + 1] = i;
            i += b96Var.b;
        }
    }
}
