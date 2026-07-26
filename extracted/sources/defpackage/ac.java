package defpackage;

import android.os.SystemClock;
import androidx.media3.common.b;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ac extends h90 {
    public final j50 g;
    public final long h;
    public final long i;
    public final long j;
    public final int k;
    public final int l;
    public final float m;
    public final float n;
    public final ImmutableList o;
    public final td8 p;
    public float q;
    public int r;
    public int s;
    public long t;
    public lm4 u;

    public ac(yo8 yo8Var, int[] iArr, j50 j50Var, long j, long j2, long j3, ImmutableList immutableList) {
        super(yo8Var, iArr);
        if (j3 < j) {
            wn5.k0("AdaptiveTrackSelection", "Adjusting minDurationToRetainAfterDiscardMs to be at least minDurationForQualityIncreaseMs");
            j3 = j;
        }
        this.g = j50Var;
        this.h = j * 1000;
        this.i = j2 * 1000;
        this.j = j3 * 1000;
        this.k = 1279;
        this.l = 719;
        this.m = 0.7f;
        this.n = 0.75f;
        this.o = ImmutableList.n(immutableList);
        this.p = td8.a;
        this.q = 1.0f;
        this.s = 0;
        this.t = -9223372036854775807L;
    }

    public static void u(ArrayList arrayList, long[] jArr) {
        long j = 0;
        for (long j2 : jArr) {
            j += j2;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            lj3 lj3Var = (lj3) arrayList.get(i);
            if (lj3Var != null) {
                lj3Var.O(new zb(j, jArr[i]));
            }
        }
    }

    public static long w(List list) {
        if (!list.isEmpty()) {
            lm4 lm4Var = (lm4) tv8.q(list);
            long j = lm4Var.g;
            if (j != -9223372036854775807L) {
                long j2 = lm4Var.h;
                if (j2 != -9223372036854775807L) {
                    return j2 - j;
                }
            }
        }
        return -9223372036854775807L;
    }

    @Override // defpackage.p62
    public final void b(long j, long j2, long j3, List list, mm4[] mm4VarArr) {
        long jW;
        this.p.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        int i = this.r;
        int i2 = 0;
        if (i >= mm4VarArr.length || !mm4VarArr[i].next()) {
            int length = mm4VarArr.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    jW = w(list);
                    break;
                }
                mm4 mm4Var = mm4VarArr[i3];
                if (mm4Var.next()) {
                    jW = mm4Var.c() - mm4Var.b();
                    break;
                }
                i3++;
            }
        } else {
            mm4 mm4Var2 = mm4VarArr[this.r];
            jW = mm4Var2.c() - mm4Var2.b();
        }
        int i4 = this.s;
        if (i4 == 0) {
            this.s = 1;
            this.r = v(jElapsedRealtime);
            return;
        }
        int i5 = this.r;
        boolean zIsEmpty = list.isEmpty();
        b[] bVarArr = this.d;
        if (zIsEmpty) {
            i2 = -1;
        } else {
            b bVar = ((lm4) tv8.q(list)).d;
            while (i2 < this.b) {
                if (bVarArr[i2] == bVar) {
                    break;
                } else {
                    i2++;
                }
            }
            i2 = -1;
        }
        if (i2 != -1) {
            i4 = ((lm4) tv8.q(list)).e;
            i5 = i2;
        }
        int iV = v(jElapsedRealtime);
        if (iV != i5 && !a(i5, jElapsedRealtime)) {
            b bVar2 = bVarArr[i5];
            b bVar3 = bVarArr[iV];
            long jMin = this.h;
            if (j3 != -9223372036854775807L) {
                jMin = Math.min((long) ((jW != -9223372036854775807L ? j3 - jW : j3) * this.n), jMin);
            }
            int i6 = bVar3.j;
            int i7 = bVar2.j;
            if ((i6 > i7 && j2 < jMin) || (i6 < i7 && j2 >= this.i)) {
                iV = i5;
            }
        }
        if (iV != i5) {
            i4 = 3;
        }
        this.s = i4;
        this.r = iV;
    }

    @Override // defpackage.p62
    public final int d() {
        return this.r;
    }

    @Override // defpackage.h90, defpackage.p62
    public final void h() {
        this.t = -9223372036854775807L;
        this.u = null;
    }

    @Override // defpackage.h90, defpackage.p62
    public final int j(long j, List list) {
        int i;
        int i2;
        this.p.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        long j2 = this.t;
        if (j2 != -9223372036854775807L && jElapsedRealtime - j2 < 1000 && (list.isEmpty() || ((lm4) tv8.q(list)).equals(this.u))) {
            return list.size();
        }
        this.t = jElapsedRealtime;
        this.u = list.isEmpty() ? null : (lm4) tv8.q(list);
        if (list.isEmpty()) {
            return 0;
        }
        int size = list.size();
        long jF = j29.F(this.q, ((lm4) list.get(size - 1)).g - j);
        long j3 = this.j;
        if (jF >= j3) {
            w(list);
            b bVar = this.d[v(jElapsedRealtime)];
            for (int i3 = 0; i3 < size; i3++) {
                lm4 lm4Var = (lm4) list.get(i3);
                b bVar2 = lm4Var.d;
                if (j29.F(this.q, lm4Var.g - j) >= j3 && bVar2.j < bVar.j && (i = bVar2.v) != -1 && i <= this.l && (i2 = bVar2.u) != -1 && i2 <= this.k && i < bVar.v) {
                    return i3;
                }
            }
        }
        return size;
    }

    @Override // defpackage.h90, defpackage.p62
    public final void k() {
        this.u = null;
    }

    @Override // defpackage.p62
    public final int n() {
        return this.s;
    }

    @Override // defpackage.h90, defpackage.p62
    public final void p(float f) {
        this.q = f;
    }

    @Override // defpackage.p62
    public final Object q() {
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int v(long j) {
        long j2;
        td1 td1Var = (td1) this.g;
        synchronized (td1Var) {
            j2 = td1Var.l;
        }
        long j3 = (long) (j2 * this.m);
        this.g.getClass();
        long j4 = (long) (j3 / this.q);
        if (!this.o.isEmpty()) {
            int i = 1;
            while (i < this.o.size() - 1 && ((zb) this.o.get(i)).a < j4) {
                i++;
            }
            zb zbVar = (zb) this.o.get(i - 1);
            zb zbVar2 = (zb) this.o.get(i);
            long j5 = zbVar.a;
            long j6 = zbVar.b;
            j4 = j6 + ((long) (((j4 - j5) / (zbVar2.a - j5)) * (zbVar2.b - j6)));
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.b; i3++) {
            if (j == Long.MIN_VALUE || !a(i3, j)) {
                if (this.d[i3].j <= j4) {
                    return i3;
                }
                i2 = i3;
            }
        }
        return i2;
    }
}
