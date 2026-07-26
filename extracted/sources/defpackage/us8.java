package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class us8 extends qs8 {
    public final t56 e;

    public us8(t56 t56Var) {
        super(1);
        this.e = t56Var;
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i = this.d;
        this.d = i + 2;
        Object[] objArr = this.b;
        return new gb5(this.e, objArr[i], objArr[i + 1]);
    }
}
