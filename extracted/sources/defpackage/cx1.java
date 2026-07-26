package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class cx1 implements Iterator, dx3 {
    public final /* synthetic */ int a = 0;
    public final Iterator b;
    public int c;

    public cx1(Iterator it) {
        js3.p(it, "iterator");
        this.b = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        Iterator it;
        switch (this.a) {
            case 0:
                break;
            default:
                return this.b.hasNext();
        }
        while (true) {
            int i = this.c;
            it = this.b;
            if (i > 0 && it.hasNext()) {
                it.next();
                this.c--;
            }
        }
        return it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        Iterator it;
        switch (this.a) {
            case 0:
                break;
            default:
                int i = this.c;
                this.c = i + 1;
                if (i >= 0) {
                    return new pm3(i, this.b.next());
                }
                br9.P();
                throw null;
        }
        while (true) {
            int i2 = this.c;
            it = this.b;
            if (i2 > 0 && it.hasNext()) {
                it.next();
                this.c--;
            }
        }
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public cx1(dx1 dx1Var) {
        this.b = dx1Var.a.iterator();
        this.c = dx1Var.b;
    }
}
