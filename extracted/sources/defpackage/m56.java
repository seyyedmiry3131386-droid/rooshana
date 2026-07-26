package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public abstract class m56 implements Iterator, dx3 {
    public final /* synthetic */ int a;
    public int b;
    public boolean c;
    public final Object[] d;

    public m56(ps8 ps8Var, qs8[] qs8VarArr) {
        this.a = 1;
        this.d = qs8VarArr;
        this.c = true;
        qs8VarArr[0].a(ps8Var.d, Integer.bitCount(ps8Var.a) * 2, 0);
        this.b = 0;
        a();
    }

    public void a() {
        qs8[] qs8VarArr = (qs8[]) this.d;
        int i = this.b;
        qs8 qs8Var = qs8VarArr[i];
        if (qs8Var.d < qs8Var.c) {
            return;
        }
        while (-1 < i) {
            int iC = c(i);
            if (iC == -1) {
                qs8 qs8Var2 = qs8VarArr[i];
                int i2 = qs8Var2.d;
                Object[] objArr = qs8Var2.b;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    qs8Var2.d = i2 + 1;
                    iC = c(i);
                }
            }
            if (iC != -1) {
                this.b = iC;
                return;
            }
            if (i > 0) {
                qs8 qs8Var3 = qs8VarArr[i - 1];
                int i3 = qs8Var3.d;
                int length2 = qs8Var3.b.length;
                qs8Var3.d = i3 + 1;
            }
            qs8VarArr[i].a(ps8.e.d, 0, 0);
            i--;
        }
        this.c = false;
    }

    public void b() {
        qs8[] qs8VarArr = (qs8[]) this.d;
        int i = this.b;
        qs8 qs8Var = qs8VarArr[i];
        if (qs8Var.d < qs8Var.c) {
            return;
        }
        while (-1 < i) {
            int iD = d(i);
            if (iD == -1) {
                qs8 qs8Var2 = qs8VarArr[i];
                int i2 = qs8Var2.d;
                Object[] objArr = qs8Var2.b;
                if (i2 < objArr.length) {
                    int length = objArr.length;
                    qs8Var2.d = i2 + 1;
                    iD = d(i);
                }
            }
            if (iD != -1) {
                this.b = iD;
                return;
            }
            if (i > 0) {
                qs8 qs8Var3 = qs8VarArr[i - 1];
                int i3 = qs8Var3.d;
                int length2 = qs8Var3.b.length;
                qs8Var3.d = i3 + 1;
            }
            qs8 qs8Var4 = qs8VarArr[i];
            Object[] objArr2 = os8.e.d;
            qs8Var4.getClass();
            js3.p(objArr2, "buffer");
            qs8Var4.b = objArr2;
            qs8Var4.c = 0;
            qs8Var4.d = 0;
            i--;
        }
        this.c = false;
    }

    public int c(int i) {
        qs8[] qs8VarArr = (qs8[]) this.d;
        qs8 qs8Var = qs8VarArr[i];
        int i2 = qs8Var.d;
        if (i2 < qs8Var.c) {
            return i;
        }
        Object[] objArr = qs8Var.b;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i2];
        js3.n(obj, "null cannot be cast to non-null type androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        ps8 ps8Var = (ps8) obj;
        if (i == 6) {
            qs8 qs8Var2 = qs8VarArr[i + 1];
            Object[] objArr2 = ps8Var.d;
            qs8Var2.a(objArr2, objArr2.length, 0);
        } else {
            qs8VarArr[i + 1].a(ps8Var.d, Integer.bitCount(ps8Var.a) * 2, 0);
        }
        return c(i + 1);
    }

    public int d(int i) {
        qs8[] qs8VarArr = (qs8[]) this.d;
        qs8 qs8Var = qs8VarArr[i];
        int i2 = qs8Var.d;
        if (i2 < qs8Var.c) {
            return i;
        }
        Object[] objArr = qs8Var.b;
        if (i2 >= objArr.length) {
            return -1;
        }
        int length = objArr.length;
        Object obj = objArr[i2];
        js3.n(obj, "null cannot be cast to non-null type kotlinx.collections.immutable.implementations.immutableMap.TrieNode<K of kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator, V of kotlinx.collections.immutable.implementations.immutableMap.TrieNodeBaseIterator>");
        os8 os8Var = (os8) obj;
        if (i == 6) {
            qs8 qs8Var2 = qs8VarArr[i + 1];
            Object[] objArr2 = os8Var.d;
            int length2 = objArr2.length;
            qs8Var2.getClass();
            qs8Var2.b = objArr2;
            qs8Var2.c = length2;
            qs8Var2.d = 0;
        } else {
            qs8 qs8Var3 = qs8VarArr[i + 1];
            Object[] objArr3 = os8Var.d;
            int iBitCount = Integer.bitCount(os8Var.a) * 2;
            qs8Var3.getClass();
            js3.p(objArr3, "buffer");
            qs8Var3.b = objArr3;
            qs8Var3.c = iBitCount;
            qs8Var3.d = 0;
        }
        return d(i + 1);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
        }
        return this.c;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.a) {
            case 0:
                if (!this.c) {
                    throw new NoSuchElementException();
                }
                Object next = ((qs8[]) this.d)[this.b].next();
                b();
                return next;
            default:
                if (!this.c) {
                    throw new NoSuchElementException();
                }
                Object next2 = ((qs8[]) this.d)[this.b].next();
                a();
                return next2;
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public m56(os8 os8Var, qs8[] qs8VarArr) {
        this.a = 0;
        js3.p(os8Var, "node");
        this.d = qs8VarArr;
        this.c = true;
        qs8 qs8Var = qs8VarArr[0];
        Object[] objArr = os8Var.d;
        int iBitCount = Integer.bitCount(os8Var.a) * 2;
        qs8Var.getClass();
        js3.p(objArr, "buffer");
        qs8Var.b = objArr;
        qs8Var.c = iBitCount;
        qs8Var.d = 0;
        this.b = 0;
        b();
    }
}
