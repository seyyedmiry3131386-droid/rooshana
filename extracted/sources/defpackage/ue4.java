package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class ue4 implements Cloneable {
    public /* synthetic */ boolean a;
    public /* synthetic */ long[] b;
    public /* synthetic */ Object[] c;
    public /* synthetic */ int d;

    public ue4(int i) {
        if (i == 0) {
            this.b = bt2.g;
            this.c = bt2.h;
            return;
        }
        int i2 = i * 8;
        int i3 = 4;
        while (true) {
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (i2 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 8;
        this.b = new long[i5];
        this.c = new Object[i5];
    }

    public final void a(long j, Long l) {
        int i = this.d;
        if (i != 0 && j <= this.b[i - 1]) {
            i(j, l);
            return;
        }
        if (this.a) {
            long[] jArr = this.b;
            if (i >= jArr.length) {
                Object[] objArr = this.c;
                int i2 = 0;
                for (int i3 = 0; i3 < i; i3++) {
                    Object obj = objArr[i3];
                    if (obj != c26.b) {
                        if (i3 != i2) {
                            jArr[i2] = jArr[i3];
                            objArr[i2] = obj;
                            objArr[i3] = null;
                        }
                        i2++;
                    }
                }
                this.a = false;
                this.d = i2;
            }
        }
        int i4 = this.d;
        if (i4 >= this.b.length) {
            int i5 = (i4 + 1) * 8;
            int i6 = 4;
            while (true) {
                if (i6 >= 32) {
                    break;
                }
                int i7 = (1 << i6) - 12;
                if (i5 <= i7) {
                    i5 = i7;
                    break;
                }
                i6++;
            }
            int i8 = i5 / 8;
            long[] jArrCopyOf = Arrays.copyOf(this.b, i8);
            js3.o(jArrCopyOf, "copyOf(...)");
            this.b = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.c, i8);
            js3.o(objArrCopyOf, "copyOf(...)");
            this.c = objArrCopyOf;
        }
        this.b[i4] = j;
        this.c[i4] = l;
        this.d = i4 + 1;
    }

    public final void b() {
        int i = this.d;
        Object[] objArr = this.c;
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = null;
        }
        this.d = 0;
        this.a = false;
    }

    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final ue4 clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        js3.n(objClone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        ue4 ue4Var = (ue4) objClone;
        ue4Var.b = (long[]) this.b.clone();
        ue4Var.c = (Object[]) this.c.clone();
        return ue4Var;
    }

    public final Object d(long j) {
        Object obj;
        int iJ = bt2.j(this.d, j, this.b);
        if (iJ < 0 || (obj = this.c[iJ]) == c26.b) {
            return null;
        }
        return obj;
    }

    public final Object e(long j) {
        Object obj;
        int iJ = bt2.j(this.d, j, this.b);
        if (iJ < 0 || (obj = this.c[iJ]) == c26.b) {
            return -1L;
        }
        return obj;
    }

    public final int f(long j) {
        if (this.a) {
            int i = this.d;
            long[] jArr = this.b;
            Object[] objArr = this.c;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != c26.b) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.a = false;
            this.d = i2;
        }
        return bt2.j(this.d, j, this.b);
    }

    public final boolean g() {
        return k() == 0;
    }

    public final long h(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.d)) {
            lb7.j("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        if (this.a) {
            long[] jArr = this.b;
            Object[] objArr = this.c;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != c26.b) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.a = false;
            this.d = i3;
        }
        return this.b[i];
    }

    public final void i(long j, Object obj) {
        Object obj2 = c26.b;
        int iJ = bt2.j(this.d, j, this.b);
        if (iJ >= 0) {
            this.c[iJ] = obj;
            return;
        }
        int i = ~iJ;
        int i2 = this.d;
        if (i < i2) {
            Object[] objArr = this.c;
            if (objArr[i] == obj2) {
                this.b[i] = j;
                objArr[i] = obj;
                return;
            }
        }
        if (this.a) {
            long[] jArr = this.b;
            if (i2 >= jArr.length) {
                Object[] objArr2 = this.c;
                int i3 = 0;
                for (int i4 = 0; i4 < i2; i4++) {
                    Object obj3 = objArr2[i4];
                    if (obj3 != obj2) {
                        if (i4 != i3) {
                            jArr[i3] = jArr[i4];
                            objArr2[i3] = obj3;
                            objArr2[i4] = null;
                        }
                        i3++;
                    }
                }
                this.a = false;
                this.d = i3;
                i = ~bt2.j(i3, j, this.b);
            }
        }
        int i5 = this.d;
        if (i5 >= this.b.length) {
            int i6 = (i5 + 1) * 8;
            int i7 = 4;
            while (true) {
                if (i7 >= 32) {
                    break;
                }
                int i8 = (1 << i7) - 12;
                if (i6 <= i8) {
                    i6 = i8;
                    break;
                }
                i7++;
            }
            int i9 = i6 / 8;
            long[] jArrCopyOf = Arrays.copyOf(this.b, i9);
            js3.o(jArrCopyOf, "copyOf(...)");
            this.b = jArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.c, i9);
            js3.o(objArrCopyOf, "copyOf(...)");
            this.c = objArrCopyOf;
        }
        int i10 = this.d;
        if (i10 - i != 0) {
            long[] jArr2 = this.b;
            int i11 = i + 1;
            ew.A0(jArr2, jArr2, i11, i, i10);
            Object[] objArr3 = this.c;
            ew.y0(i11, i, this.d, objArr3, objArr3);
        }
        this.b[i] = j;
        this.c[i] = obj;
        this.d++;
    }

    public final void j(long j) {
        int iJ = bt2.j(this.d, j, this.b);
        if (iJ >= 0) {
            Object[] objArr = this.c;
            Object obj = objArr[iJ];
            Object obj2 = c26.b;
            if (obj != obj2) {
                objArr[iJ] = obj2;
                this.a = true;
            }
        }
    }

    public final int k() {
        if (this.a) {
            int i = this.d;
            long[] jArr = this.b;
            Object[] objArr = this.c;
            int i2 = 0;
            for (int i3 = 0; i3 < i; i3++) {
                Object obj = objArr[i3];
                if (obj != c26.b) {
                    if (i3 != i2) {
                        jArr[i2] = jArr[i3];
                        objArr[i2] = obj;
                        objArr[i3] = null;
                    }
                    i2++;
                }
            }
            this.a = false;
            this.d = i2;
        }
        return this.d;
    }

    public final Object l(int i) {
        int i2;
        if (i < 0 || i >= (i2 = this.d)) {
            lb7.j("Expected index to be within 0..size()-1, but was " + i);
            throw null;
        }
        if (this.a) {
            long[] jArr = this.b;
            Object[] objArr = this.c;
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                Object obj = objArr[i4];
                if (obj != c26.b) {
                    if (i4 != i3) {
                        jArr[i3] = jArr[i4];
                        objArr[i3] = obj;
                        objArr[i4] = null;
                    }
                    i3++;
                }
            }
            this.a = false;
            this.d = i3;
        }
        return this.c[i];
    }

    public final String toString() {
        if (k() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.d * 28);
        sb.append('{');
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(h(i2));
            sb.append('=');
            Object objL = l(i2);
            if (objL != sb) {
                sb.append(objL);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        js3.o(string, "toString(...)");
        return string;
    }

    public /* synthetic */ ue4(Object obj) {
        this(10);
    }
}
