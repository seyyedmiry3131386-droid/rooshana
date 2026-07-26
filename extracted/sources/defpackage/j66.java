package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class j66 implements Iterator, dx3 {
    public final /* synthetic */ int a;
    public final k66 b;

    public j66(i66 i66Var, int i) {
        this.a = i;
        switch (i) {
            case 1:
                js3.p(i66Var, "map");
                this.b = new k66(i66Var.b, i66Var);
                break;
            case 2:
                js3.p(i66Var, "map");
                this.b = new k66(i66Var.b, i66Var);
                break;
            default:
                js3.p(i66Var, "map");
                this.b = new k66(i66Var.b, i66Var);
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
                k66 k66Var = this.b;
                return new fb5(k66Var.b.d, k66Var.c, k66Var.next());
            case 1:
                k66 k66Var2 = this.b;
                k66Var2.next();
                return k66Var2.c;
            default:
                return this.b.next().a;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                this.b.remove();
                break;
            case 1:
                this.b.remove();
                break;
            default:
                this.b.remove();
                break;
        }
    }
}
