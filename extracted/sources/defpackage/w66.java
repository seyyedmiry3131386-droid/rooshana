package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class w66 extends c1 {
    public final Object[] d;
    public final ms8 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w66(int i, int i2, int i3, Object[] objArr, Object[] objArr2) {
        super(i, i2, 0);
        js3.p(objArr, "root");
        js3.p(objArr2, "tail");
        this.d = objArr2;
        int i4 = (i2 - 1) & (-32);
        this.e = new ms8(objArr, i > i4 ? i4 : i, i4, i3);
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        ms8 ms8Var = this.e;
        if (ms8Var.hasNext()) {
            this.b++;
            return ms8Var.next();
        }
        int i = this.b;
        this.b = i + 1;
        return this.d[i - ms8Var.c];
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i = this.b;
        ms8 ms8Var = this.e;
        int i2 = ms8Var.c;
        if (i <= i2) {
            this.b = i - 1;
            return ms8Var.previous();
        }
        int i3 = i - 1;
        this.b = i3;
        return this.d[i3 - i2];
    }
}
