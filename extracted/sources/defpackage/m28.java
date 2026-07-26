package defpackage;

import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class m28 implements Cloneable {
    public /* synthetic */ boolean a;
    public /* synthetic */ int[] b;
    public /* synthetic */ Object[] c;
    public /* synthetic */ int d;

    public m28(int i) {
        int i2;
        int i3 = 4;
        while (true) {
            i2 = 40;
            if (i3 >= 32) {
                break;
            }
            int i4 = (1 << i3) - 12;
            if (40 <= i4) {
                i2 = i4;
                break;
            }
            i3++;
        }
        int i5 = i2 / 4;
        this.b = new int[i5];
        this.c = new Object[i5];
    }

    public final void a(int i, Object obj) {
        int i2 = this.d;
        if (i2 != 0 && i <= this.b[i2 - 1]) {
            e(i, obj);
            return;
        }
        if (this.a && i2 >= this.b.length) {
            m91.f(this);
        }
        int i3 = this.d;
        if (i3 >= this.b.length) {
            int i4 = (i3 + 1) * 4;
            int i5 = 4;
            while (true) {
                if (i5 >= 32) {
                    break;
                }
                int i6 = (1 << i5) - 12;
                if (i4 <= i6) {
                    i4 = i6;
                    break;
                }
                i5++;
            }
            int i7 = i4 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.b, i7);
            js3.o(iArrCopyOf, "copyOf(...)");
            this.b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.c, i7);
            js3.o(objArrCopyOf, "copyOf(...)");
            this.c = objArrCopyOf;
        }
        this.b[i3] = i;
        this.c[i3] = obj;
        this.d = i3 + 1;
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final m28 clone() throws CloneNotSupportedException {
        Object objClone = super.clone();
        js3.n(objClone, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
        m28 m28Var = (m28) objClone;
        m28Var.b = (int[]) this.b.clone();
        m28Var.c = (Object[]) this.c.clone();
        return m28Var;
    }

    public final Object c(int i) {
        Object obj;
        int i2 = bt2.i(this.d, i, this.b);
        if (i2 < 0 || (obj = this.c[i2]) == m91.e) {
            return null;
        }
        return obj;
    }

    public final int d(int i) {
        if (this.a) {
            m91.f(this);
        }
        return this.b[i];
    }

    public final void e(int i, Object obj) {
        int i2 = bt2.i(this.d, i, this.b);
        if (i2 >= 0) {
            this.c[i2] = obj;
            return;
        }
        int i3 = ~i2;
        int i4 = this.d;
        if (i3 < i4) {
            Object[] objArr = this.c;
            if (objArr[i3] == m91.e) {
                this.b[i3] = i;
                objArr[i3] = obj;
                return;
            }
        }
        if (this.a && i4 >= this.b.length) {
            m91.f(this);
            i3 = ~bt2.i(this.d, i, this.b);
        }
        int i5 = this.d;
        if (i5 >= this.b.length) {
            int i6 = (i5 + 1) * 4;
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
            int i9 = i6 / 4;
            int[] iArrCopyOf = Arrays.copyOf(this.b, i9);
            js3.o(iArrCopyOf, "copyOf(...)");
            this.b = iArrCopyOf;
            Object[] objArrCopyOf = Arrays.copyOf(this.c, i9);
            js3.o(objArrCopyOf, "copyOf(...)");
            this.c = objArrCopyOf;
        }
        int i10 = this.d;
        if (i10 - i3 != 0) {
            int[] iArr = this.b;
            int i11 = i3 + 1;
            ew.x0(i11, i3, i10, iArr, iArr);
            Object[] objArr2 = this.c;
            ew.y0(i11, i3, this.d, objArr2, objArr2);
        }
        this.b[i3] = i;
        this.c[i3] = obj;
        this.d++;
    }

    public final int f() {
        if (this.a) {
            m91.f(this);
        }
        return this.d;
    }

    public final Object g(int i) {
        if (this.a) {
            m91.f(this);
        }
        Object[] objArr = this.c;
        if (i < objArr.length) {
            return objArr[i];
        }
        throw new ArrayIndexOutOfBoundsException();
    }

    public final String toString() {
        if (f() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.d * 28);
        sb.append('{');
        int i = this.d;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            sb.append(d(i2));
            sb.append('=');
            Object objG = g(i2);
            if (objG != this) {
                sb.append(objG);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        String string = sb.toString();
        js3.o(string, "toString(...)");
        return string;
    }
}
