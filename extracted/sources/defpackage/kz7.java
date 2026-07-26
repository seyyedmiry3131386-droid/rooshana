package defpackage;

import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public final class kz7 extends v1 implements pj3 {
    public static final kz7 b = new kz7(new Object[0]);
    public final Object[] a;

    public kz7(Object[] objArr) {
        this.a = objArr;
    }

    @Override // defpackage.o
    public final int a() {
        return this.a.length;
    }

    public final u66 c() {
        return new u66(this, null, this.a, 0);
    }

    @Override // java.util.List
    public final Object get(int i) {
        tt3.n(i, a());
        return this.a[i];
    }

    @Override // defpackage.z0, java.util.List
    public final int indexOf(Object obj) {
        return ew.N0(this.a, obj);
    }

    @Override // defpackage.z0, java.util.List
    public final int lastIndexOf(Object obj) {
        return ew.P0(this.a, obj);
    }

    @Override // defpackage.z0, java.util.List
    public final ListIterator listIterator(int i) {
        Object[] objArr = this.a;
        tt3.o(i, objArr.length);
        return new ih0(objArr, i, objArr.length);
    }
}
