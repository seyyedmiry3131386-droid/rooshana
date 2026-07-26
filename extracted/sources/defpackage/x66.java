package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class x66 extends c1 {
    public final Object[] d;
    public final ns8 e;

    public x66(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        super(i, i2, 1);
        this.d = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.e = new ns8(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        ns8 ns8Var = this.e;
        if (ns8Var.hasNext()) {
            this.b++;
            return ns8Var.next();
        }
        int i = this.b;
        this.b = i + 1;
        return this.d[i - ns8Var.c];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.b;
        ns8 ns8Var = this.e;
        int i2 = ns8Var.c;
        if (i <= i2) {
            this.b = i - 1;
            return ns8Var.previous();
        }
        int i3 = i - 1;
        this.b = i3;
        return this.d[i3 - i2];
    }
}
