package defpackage;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class t56 implements Iterator, dx3 {
    public final /* synthetic */ int a = 0;
    public final Iterator b;

    public t56(o56 o56Var) {
        qs8[] qs8VarArr = new qs8[8];
        for (int i = 0; i < 8; i++) {
            qs8VarArr[i] = new us8(this);
        }
        this.b = new q56(o56Var, qs8VarArr);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                return ((p56) this.b).c;
            case 1:
                return ((q56) this.b).c;
            default:
                return this.b.hasNext();
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                return (Map.Entry) ((p56) this.b).next();
            case 1:
                return (Map.Entry) ((q56) this.b).next();
            default:
                return (u39) this.b.next();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                ((p56) this.b).remove();
                return;
            case 1:
                ((q56) this.b).remove();
                return;
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public t56(n56 n56Var) {
        js3.p(n56Var, "builder");
        qs8[] qs8VarArr = new qs8[8];
        for (int i = 0; i < 8; i++) {
            qs8VarArr[i] = new ts8(this);
        }
        this.b = new p56(n56Var, qs8VarArr);
    }

    public t56(s39 s39Var) {
        this.b = s39Var.j.iterator();
    }
}
