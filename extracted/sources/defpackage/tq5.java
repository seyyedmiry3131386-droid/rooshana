package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class tq5 extends sq5 {
    public transient long[] i;
    public transient int j;
    public transient int k;

    @Override // defpackage.sq5
    public final void a() {
        super.a();
        this.j = -2;
        this.k = -2;
    }

    @Override // defpackage.sq5
    public final int b() {
        int i = this.j;
        if (i == -2) {
            return -1;
        }
        return i;
    }

    @Override // defpackage.sq5
    public final void f(int i) {
        super.f(i);
        this.j = -2;
        this.k = -2;
        long[] jArr = new long[i];
        this.i = jArr;
        Arrays.fill(jArr, -1L);
    }

    @Override // defpackage.sq5
    public final void g(Object obj, int i, int i2, int i3) {
        super.g(obj, i, i2, i3);
        o(this.k, i);
        o(i, -2);
    }

    @Override // defpackage.sq5
    public final void h(int i) {
        int i2 = this.c - 1;
        long j = this.i[i];
        o((int) (j >>> 32), (int) j);
        if (i < i2) {
            o((int) (this.i[i2] >>> 32), i);
            o(i, (int) this.i[i2]);
        }
        super.h(i);
    }

    @Override // defpackage.sq5
    public final int i(int i) {
        int i2 = (int) this.i[i];
        if (i2 == -2) {
            return -1;
        }
        return i2;
    }

    @Override // defpackage.sq5
    public final int j(int i, int i2) {
        return i == this.c ? i2 : i;
    }

    @Override // defpackage.sq5
    public final void n(int i) {
        super.n(i);
        long[] jArr = this.i;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i);
        this.i = jArrCopyOf;
        Arrays.fill(jArrCopyOf, length, i, -1L);
    }

    public final void o(int i, int i2) {
        if (i == -2) {
            this.j = i2;
        } else {
            long[] jArr = this.i;
            jArr[i] = (jArr[i] & (-4294967296L)) | (((long) i2) & 4294967295L);
        }
        if (i2 == -2) {
            this.k = i;
        } else {
            long[] jArr2 = this.i;
            jArr2[i2] = (4294967295L & jArr2[i2]) | (((long) i) << 32);
        }
    }
}
