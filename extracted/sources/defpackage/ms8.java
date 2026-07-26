package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class ms8 extends c1 {
    public int d;
    public Object[] e;
    public boolean f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public ms8(Object[] objArr, int i, int i2, int i3) {
        super(i, i2, 0);
        js3.p(objArr, "root");
        this.d = i3;
        Object[] objArr2 = new Object[i3];
        this.e = objArr2;
        ?? r5 = i == i2 ? 1 : 0;
        this.f = r5;
        objArr2[0] = objArr;
        b(i - r5, 1);
    }

    public final Object a() {
        int i = this.b & 31;
        Object obj = this.e[this.d - 1];
        js3.n(obj, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.collections.immutable.implementations.immutableList.TrieIterator>");
        return ((Object[]) obj)[i];
    }

    public final void b(int i, int i2) {
        int i3 = (this.d - i2) * 5;
        while (i2 < this.d) {
            Object[] objArr = this.e;
            Object obj = objArr[i2 - 1];
            js3.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
            objArr[i2] = ((Object[]) obj)[c67.f(i, i3)];
            i3 -= 5;
            i2++;
        }
    }

    public final void c(int i) {
        int i2 = 0;
        while (c67.f(this.b, i2) == i) {
            i2 += 5;
        }
        if (i2 > 0) {
            b(this.b, ((this.d - 1) - (i2 / 5)) + 1);
        }
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object objA = a();
        int i = this.b + 1;
        this.b = i;
        if (i == this.c) {
            this.f = true;
            return objA;
        }
        c(0);
        return objA;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.b--;
        if (this.f) {
            this.f = false;
            return a();
        }
        c(31);
        return a();
    }
}
