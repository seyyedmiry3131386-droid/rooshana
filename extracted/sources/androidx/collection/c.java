package androidx.collection;

import defpackage.dp2;
import defpackage.js3;
import defpackage.lb7;
import defpackage.ok4;
import defpackage.rm7;
import defpackage.uq3;

/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public Object[] a;
    public int b;

    public final Object a() {
        if (!d()) {
            return this.a[0];
        }
        lb7.l("ObjectList is empty.");
        throw null;
    }

    public final Object b(int i) {
        if (i >= 0 && i < this.b) {
            return this.a[i];
        }
        f(i);
        throw null;
    }

    public final int c(Object obj) {
        int i = 0;
        if (obj == null) {
            Object[] objArr = this.a;
            int i2 = this.b;
            while (i < i2) {
                if (objArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        Object[] objArr2 = this.a;
        int i3 = this.b;
        while (i < i3) {
            if (obj.equals(objArr2[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final boolean d() {
        return this.b == 0;
    }

    public final boolean e() {
        return this.b != 0;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof c) {
            c cVar = (c) obj;
            int i = cVar.b;
            int i2 = this.b;
            if (i == i2) {
                Object[] objArr = this.a;
                Object[] objArr2 = cVar.a;
                uq3 uq3VarZ = ok4.Z(0, i2);
                int i3 = uq3VarZ.a;
                int i4 = uq3VarZ.b;
                if (i3 > i4) {
                    return true;
                }
                while (js3.i(objArr[i3], objArr2[i3])) {
                    if (i3 == i4) {
                        return true;
                    }
                    i3++;
                }
                return false;
            }
        }
        return false;
    }

    public final void f(int i) {
        StringBuilder sbR = rm7.r(i, "Index ", " must be in 0..");
        sbR.append(this.b - 1);
        lb7.k(sbR.toString());
        throw null;
    }

    public final int hashCode() {
        Object[] objArr = this.a;
        int i = this.b;
        int iHashCode = 0;
        for (int i2 = 0; i2 < i; i2++) {
            Object obj = objArr[i2];
            iHashCode += (obj != null ? obj.hashCode() : 0) * 31;
        }
        return iHashCode;
    }

    public final String toString() {
        dp2 dp2Var = new dp2() { // from class: androidx.collection.ObjectList$toString$1
            {
                super(1);
            }

            @Override // defpackage.dp2
            public final Object invoke(Object obj) {
                return obj == this.g ? "(this)" : String.valueOf(obj);
            }
        };
        StringBuilder sb = new StringBuilder("[");
        Object[] objArr = this.a;
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                sb.append((CharSequence) "]");
                break;
            }
            Object obj = objArr[i2];
            if (i2 == -1) {
                sb.append((CharSequence) "...");
                break;
            }
            if (i2 != 0) {
                sb.append((CharSequence) ", ");
            }
            sb.append((CharSequence) dp2Var.invoke(obj));
            i2++;
        }
        String string = sb.toString();
        js3.o(string, "toString(...)");
        return string;
    }
}
