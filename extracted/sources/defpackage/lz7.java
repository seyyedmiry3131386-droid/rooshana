package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class lz7 extends w1 {
    public static final lz7 b = new lz7(new Object[0]);
    public final Object[] a;

    public lz7(Object[] objArr) {
        this.a = objArr;
    }

    @Override // defpackage.o
    public final int a() {
        return this.a.length;
    }

    @Override // defpackage.w1
    public final w1 c(int i, Object obj) {
        Object[] objArr = this.a;
        dy3.j(i, objArr.length);
        if (i == objArr.length) {
            return e(obj);
        }
        if (objArr.length < 32) {
            Object[] objArr2 = new Object[objArr.length + 1];
            ew.C0(0, i, 6, objArr, objArr2);
            ew.y0(i + 1, i, objArr.length, objArr, objArr2);
            objArr2[i] = obj;
            return new lz7(objArr2);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        js3.o(objArrCopyOf, "copyOf(...)");
        ew.y0(i + 1, i, objArr.length - 1, objArr, objArrCopyOf);
        objArrCopyOf[i] = obj;
        Object[] objArr3 = new Object[32];
        objArr3[0] = objArr[31];
        return new t66(objArrCopyOf, objArr3, objArr.length + 1, 0);
    }

    @Override // defpackage.w1
    public final w1 e(Object obj) {
        Object[] objArr = this.a;
        if (objArr.length >= 32) {
            Object[] objArr2 = new Object[32];
            objArr2[0] = obj;
            return new t66(objArr, objArr2, objArr.length + 1, 0);
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length + 1);
        js3.o(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[objArr.length] = obj;
        return new lz7(objArrCopyOf);
    }

    @Override // defpackage.w1
    public final w1 f(Collection collection) {
        Object[] objArr = this.a;
        if (collection.size() + objArr.length > 32) {
            v66 v66VarH = h();
            v66VarH.addAll(collection);
            return v66VarH.e();
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, collection.size() + objArr.length);
        js3.o(objArrCopyOf, "copyOf(...)");
        int length = objArr.length;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            objArrCopyOf[length] = it.next();
            length++;
        }
        return new lz7(objArrCopyOf);
    }

    @Override // java.util.List
    public final Object get(int i) {
        dy3.i(i, a());
        return this.a[i];
    }

    @Override // defpackage.w1
    public final v66 h() {
        return new v66(this, null, this.a, 0);
    }

    @Override // defpackage.w1
    public final w1 i(u1 u1Var) {
        Object[] objArr = this.a;
        int length = objArr.length;
        int length2 = objArr.length;
        Object[] objArrCopyOf = objArr;
        boolean z = false;
        for (int i = 0; i < length2; i++) {
            Object obj = objArr[i];
            if (((Boolean) u1Var.invoke(obj)).booleanValue()) {
                if (!z) {
                    objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
                    js3.o(objArrCopyOf, "copyOf(...)");
                    z = true;
                    length = i;
                }
            } else if (z) {
                objArrCopyOf[length] = obj;
                length++;
            }
        }
        return length == objArr.length ? this : length == 0 ? b : new lz7(ew.E0(objArrCopyOf, 0, length));
    }

    @Override // defpackage.z0, java.util.List
    public final int indexOf(Object obj) {
        return ew.N0(this.a, obj);
    }

    @Override // defpackage.w1
    public final w1 j(int i) {
        Object[] objArr = this.a;
        dy3.i(i, objArr.length);
        if (objArr.length == 1) {
            return b;
        }
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length - 1);
        js3.o(objArrCopyOf, "copyOf(...)");
        ew.y0(i, i + 1, objArr.length, objArr, objArrCopyOf);
        return new lz7(objArrCopyOf);
    }

    @Override // defpackage.w1
    public final w1 l(int i, Object obj) {
        Object[] objArr = this.a;
        dy3.i(i, objArr.length);
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        js3.o(objArrCopyOf, "copyOf(...)");
        objArrCopyOf[i] = obj;
        return new lz7(objArrCopyOf);
    }

    @Override // defpackage.z0, java.util.List
    public final int lastIndexOf(Object obj) {
        return ew.P0(this.a, obj);
    }

    @Override // defpackage.z0, java.util.List
    public final ListIterator listIterator(int i) {
        Object[] objArr = this.a;
        dy3.j(i, objArr.length);
        return new jh0(objArr, i, objArr.length);
    }
}
