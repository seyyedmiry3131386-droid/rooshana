package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class ts8 extends qs8 {
    public final t56 e;

    public ts8(t56 t56Var) {
        super(0);
        this.e = t56Var;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.d;
        this.d = i + 2;
        Object[] objArr = this.b;
        return new fb5(this.e, objArr[i], objArr[i + 1]);
    }
}
