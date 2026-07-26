package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public class sq5 {
    public transient Object[] a;
    public transient int[] b;
    public transient int c;
    public transient int d;
    public transient int[] e;
    public transient long[] f;
    public transient float g;
    public transient int h;

    public sq5(int i, int i2) {
        f(i);
    }

    public void a() {
        this.d++;
        Arrays.fill(this.a, 0, this.c, (Object) null);
        Arrays.fill(this.b, 0, this.c, 0);
        Arrays.fill(this.e, -1);
        Arrays.fill(this.f, -1L);
        this.c = 0;
    }

    public int b() {
        return this.c == 0 ? -1 : 0;
    }

    public final int c(Object obj) {
        int iE = e(obj);
        if (iE == -1) {
            return 0;
        }
        return this.b[iE];
    }

    public final int d(int i) {
        wn5.l(i, this.c);
        return this.b[i];
    }

    public final int e(Object obj) {
        int iB0 = y97.b0(obj);
        int i = this.e[(r1.length - 1) & iB0];
        while (i != -1) {
            long j = this.f[i];
            if (((int) (j >>> 32)) == iB0 && s7.l(obj, this.a[i])) {
                return i;
            }
            i = (int) j;
        }
        return -1;
    }

    public void f(int i) {
        wn5.i("Initial capacity must be non-negative", i >= 0);
        int iS = y97.s(i, 1.0f);
        int[] iArr = new int[iS];
        Arrays.fill(iArr, -1);
        this.e = iArr;
        this.g = 1.0f;
        this.a = new Object[i];
        this.b = new int[i];
        long[] jArr = new long[i];
        Arrays.fill(jArr, -1L);
        this.f = jArr;
        this.h = Math.max(1, (int) (iS * 1.0f));
    }

    public void g(Object obj, int i, int i2, int i3) {
        this.f[i] = (((long) i3) << 32) | 4294967295L;
        this.a[i] = obj;
        this.b[i] = i2;
    }

    public void h(int i) {
        int i2 = this.c - 1;
        if (i >= i2) {
            this.a[i] = null;
            this.b[i] = 0;
            this.f[i] = -1;
            return;
        }
        Object[] objArr = this.a;
        objArr[i] = objArr[i2];
        int[] iArr = this.b;
        iArr[i] = iArr[i2];
        objArr[i2] = null;
        iArr[i2] = 0;
        long[] jArr = this.f;
        long j = jArr[i2];
        jArr[i] = j;
        jArr[i2] = -1;
        int[] iArr2 = this.e;
        int length = ((int) (j >>> 32)) & (iArr2.length - 1);
        int i3 = iArr2[length];
        if (i3 == i2) {
            iArr2[length] = i;
            return;
        }
        while (true) {
            long[] jArr2 = this.f;
            long j2 = jArr2[i3];
            int i4 = (int) j2;
            if (i4 == i2) {
                jArr2[i3] = (j2 & (-4294967296L)) | (4294967295L & ((long) i));
                return;
            }
            i3 = i4;
        }
    }

    public int i(int i) {
        int i2 = i + 1;
        if (i2 < this.c) {
            return i2;
        }
        return -1;
    }

    public int j(int i, int i2) {
        return i - 1;
    }

    public final int k(int i, Object obj) {
        long j;
        vy2.p(i, "count");
        long[] jArr = this.f;
        Object[] objArr = this.a;
        int[] iArr = this.b;
        int iB0 = y97.b0(obj);
        int[] iArr2 = this.e;
        int length = (iArr2.length - 1) & iB0;
        int i2 = this.c;
        int i3 = iArr2[length];
        if (i3 == -1) {
            iArr2[length] = i2;
            j = 4294967295L;
        } else {
            while (true) {
                long j2 = jArr[i3];
                j = 4294967295L;
                if (((int) (j2 >>> 32)) == iB0 && s7.l(obj, objArr[i3])) {
                    int i4 = iArr[i3];
                    iArr[i3] = i;
                    return i4;
                }
                int i5 = (int) j2;
                if (i5 == -1) {
                    jArr[i3] = ((-4294967296L) & j2) | (((long) i2) & 4294967295L);
                    break;
                }
                i3 = i5;
            }
        }
        if (i2 == Integer.MAX_VALUE) {
            throw new IllegalStateException("Cannot contain more than Integer.MAX_VALUE elements!");
        }
        int i6 = i2 + 1;
        int length2 = this.f.length;
        if (i6 > length2) {
            int iMax = Math.max(1, length2 >>> 1) + length2;
            if (iMax < 0) {
                iMax = Integer.MAX_VALUE;
            }
            if (iMax != length2) {
                n(iMax);
            }
        }
        g(obj, i2, i, iB0);
        this.c = i6;
        if (i2 >= this.h) {
            int[] iArr3 = this.e;
            int length3 = iArr3.length * 2;
            if (iArr3.length >= 1073741824) {
                this.h = Integer.MAX_VALUE;
            } else {
                int i7 = ((int) (length3 * this.g)) + 1;
                int[] iArr4 = new int[length3];
                Arrays.fill(iArr4, -1);
                long[] jArr2 = this.f;
                int i8 = length3 - 1;
                for (int i9 = 0; i9 < this.c; i9++) {
                    int i10 = (int) (jArr2[i9] >>> 32);
                    int i11 = i10 & i8;
                    int i12 = iArr4[i11];
                    iArr4[i11] = i9;
                    jArr2[i9] = (((long) i10) << 32) | (((long) i12) & j);
                }
                this.h = i7;
                this.e = iArr4;
            }
        }
        this.d++;
        return 0;
    }

    public final int l(int i, Object obj) {
        int length = (r0.length - 1) & i;
        int i2 = this.e[length];
        if (i2 == -1) {
            return 0;
        }
        int i3 = -1;
        while (true) {
            if (((int) (this.f[i2] >>> 32)) == i && s7.l(obj, this.a[i2])) {
                int i4 = this.b[i2];
                if (i3 == -1) {
                    this.e[length] = (int) this.f[i2];
                } else {
                    long[] jArr = this.f;
                    jArr[i3] = (jArr[i3] & (-4294967296L)) | (4294967295L & ((long) ((int) jArr[i2])));
                }
                h(i2);
                this.c--;
                this.d++;
                return i4;
            }
            int i5 = (int) this.f[i2];
            if (i5 == -1) {
                return 0;
            }
            i3 = i2;
            i2 = i5;
        }
    }

    public final int m(int i) {
        return l((int) (this.f[i] >>> 32), this.a[i]);
    }

    public void n(int i) {
        this.a = Arrays.copyOf(this.a, i);
        this.b = Arrays.copyOf(this.b, i);
        long[] jArr = this.f;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i);
        if (i > length) {
            Arrays.fill(jArrCopyOf, length, i, -1L);
        }
        this.f = jArrCopyOf;
    }
}
