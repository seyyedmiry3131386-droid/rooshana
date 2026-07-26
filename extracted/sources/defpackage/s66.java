package defpackage;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public final class s66 extends v1 {
    public final Object[] a;
    public final Object[] b;
    public final int c;
    public final int d;

    public s66(Object[] objArr, Object[] objArr2, int i, int i2) {
        js3.p(objArr, "root");
        js3.p(objArr2, "tail");
        this.a = objArr;
        this.b = objArr2;
        this.c = i;
        this.d = i2;
        if (a() > 32) {
            return;
        }
        throw new IllegalArgumentException(("Trie-based persistent vector should have at least 33 elements, got " + a()).toString());
    }

    @Override // defpackage.o
    public final int a() {
        return this.c;
    }

    @Override // java.util.List
    public final Object get(int i) {
        Object[] objArr;
        int i2 = this.c;
        tt3.n(i, i2);
        if (((i2 - 1) & (-32)) <= i) {
            objArr = this.b;
        } else {
            objArr = this.a;
            for (int i3 = this.d; i3 > 0; i3 -= 5) {
                Object obj = objArr[c67.f(i, i3)];
                js3.n(obj, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
                objArr = (Object[]) obj;
            }
        }
        return objArr[i & 31];
    }

    @Override // defpackage.z0, java.util.List
    public final ListIterator listIterator(int i) {
        tt3.o(i, this.c);
        return new w66(i, this.c, (this.d / 5) + 1, this.a, this.b);
    }
}
