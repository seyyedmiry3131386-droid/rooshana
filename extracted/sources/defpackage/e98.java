package defpackage;

import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public final class e98 extends AbstractCollection implements Set {
    public f98[] a;
    public int b;

    public final int a(f98 f98Var) {
        for (int i = 0; i < this.b; i++) {
            f98 f98Var2 = this.a[i];
            if (f98Var == f98Var2 || (f98Var.getClass() == f98Var2.getClass() && f98Var.size() == f98Var2.size() && f98Var.getPointer().equals(f98Var2.getPointer()))) {
                return i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        f98 f98Var = (f98) obj;
        if (!contains(f98Var)) {
            int i = this.b + 1;
            f98[] f98VarArr = this.a;
            if (f98VarArr == null) {
                this.a = new f98[(i * 3) / 2];
            } else if (f98VarArr.length < i) {
                f98[] f98VarArr2 = new f98[(i * 3) / 2];
                System.arraycopy(f98VarArr, 0, f98VarArr2, 0, f98VarArr.length);
                this.a = f98VarArr2;
            }
            f98[] f98VarArr3 = this.a;
            int i2 = this.b;
            this.b = i2 + 1;
            f98VarArr3[i2] = f98Var;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return a((f98) obj) != -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.b;
        f98[] f98VarArr = new f98[i];
        if (i > 0) {
            System.arraycopy(this.a, 0, f98VarArr, 0, i);
        }
        return Arrays.asList(f98VarArr).iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int iA = a((f98) obj);
        if (iA == -1) {
            return false;
        }
        int i = this.b - 1;
        this.b = i;
        if (i >= 0) {
            f98[] f98VarArr = this.a;
            f98VarArr[iA] = f98VarArr[i];
            f98VarArr[i] = null;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.b;
    }
}
