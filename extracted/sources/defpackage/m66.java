package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class m66 implements Iterator, dx3 {
    public final /* synthetic */ int a;
    public final n66 b;

    public m66(h66 h66Var, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = new n66(h66Var.a, h66Var.c, 0);
                break;
            case 2:
                this.b = new n66(h66Var.a, h66Var.c, 0);
                break;
            default:
                this.b = new n66(h66Var.a, h66Var.c, 0);
                break;
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
        }
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                n66 n66Var = this.b;
                return new eh4(n66Var.b, n66Var.b().a, 1);
            case 1:
                n66 n66Var2 = this.b;
                Object obj = n66Var2.b;
                n66Var2.b();
                return obj;
            default:
                return this.b.b().a;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }
}
