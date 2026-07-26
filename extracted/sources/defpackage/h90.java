package defpackage;

import android.os.SystemClock;
import androidx.media3.common.b;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public abstract class h90 implements p62 {
    public final yo8 a;
    public final int b;
    public final int[] c;
    public final b[] d;
    public final long[] e;
    public int f;

    public h90(yo8 yo8Var, int[] iArr) {
        int i = 0;
        vy2.s(iArr.length > 0);
        yo8Var.getClass();
        this.a = yo8Var;
        int length = iArr.length;
        this.b = length;
        this.d = new b[length];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.d[i2] = yo8Var.d[iArr[i2]];
        }
        Arrays.sort(this.d, new mh(1));
        this.c = new int[this.b];
        while (true) {
            int i3 = this.b;
            if (i >= i3) {
                this.e = new long[i3];
                return;
            } else {
                this.c[i] = yo8Var.b(this.d[i]);
                i++;
            }
        }
    }

    @Override // defpackage.p62
    public final boolean a(int i, long j) {
        return this.e[i] > j;
    }

    @Override // defpackage.p62
    public final yo8 c() {
        return this.a;
    }

    @Override // defpackage.p62
    public final /* synthetic */ boolean e(long j, cr0 cr0Var, List list) {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            h90 h90Var = (h90) obj;
            if (this.a.equals(h90Var.a) && Arrays.equals(this.c, h90Var.c)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.p62
    public final b g(int i) {
        return this.d[i];
    }

    public final int hashCode() {
        if (this.f == 0) {
            this.f = Arrays.hashCode(this.c) + (System.identityHashCode(this.a) * 31);
        }
        return this.f;
    }

    @Override // defpackage.p62
    public final int i(int i) {
        return this.c[i];
    }

    @Override // defpackage.p62
    public int j(long j, List list) {
        return list.size();
    }

    @Override // defpackage.p62
    public final int l() {
        return this.c[d()];
    }

    @Override // defpackage.p62
    public final int length() {
        return this.c.length;
    }

    @Override // defpackage.p62
    public final b m() {
        return this.d[d()];
    }

    @Override // defpackage.p62
    public final boolean o(int i, long j) {
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        boolean zA = a(i, jElapsedRealtime);
        int i2 = 0;
        while (i2 < this.b && !zA) {
            zA = (i2 == i || a(i2, jElapsedRealtime)) ? false : true;
            i2++;
        }
        if (!zA) {
            return false;
        }
        long[] jArr = this.e;
        long j2 = jArr[i];
        String str = j29.a;
        long j3 = jElapsedRealtime + j;
        if (((j ^ j3) & (jElapsedRealtime ^ j3)) < 0) {
            j3 = Long.MAX_VALUE;
        }
        jArr[i] = Math.max(j2, j3);
        return true;
    }

    @Override // defpackage.p62
    public final /* synthetic */ void r() {
    }

    @Override // defpackage.p62
    public final /* synthetic */ void s() {
    }

    @Override // defpackage.p62
    public final int t(int i) {
        for (int i2 = 0; i2 < this.b; i2++) {
            if (this.c[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    @Override // defpackage.p62
    public void h() {
    }

    @Override // defpackage.p62
    public void k() {
    }

    @Override // defpackage.p62
    public final void f(boolean z) {
    }

    @Override // defpackage.p62
    public void p(float f) {
    }
}
