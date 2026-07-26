package androidx.collection;

import defpackage.dx3;
import defpackage.io7;
import defpackage.o27;
import defpackage.ob5;
import defpackage.tb5;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class b implements Iterator, dx3 {
    public final /* synthetic */ int a = 0;
    public int b = -1;
    public final io7 c;
    public final /* synthetic */ Object d;

    public b(tb5 tb5Var) {
        this.d = tb5Var;
        this.c = o27.h(new MutableSetWrapper$iterator$1$iterator$1(tb5Var, this, null));
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
        }
        return this.c.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
        }
        return this.c.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                int i = this.b;
                if (i != -1) {
                    ((ob5) this.d).b.h(i);
                    this.b = -1;
                }
                break;
            default:
                int i2 = this.b;
                if (i2 != -1) {
                    ((tb5) this.d).b.m(i2);
                    this.b = -1;
                }
                break;
        }
    }

    public b(ob5 ob5Var) {
        this.d = ob5Var;
        this.c = o27.h(new MutableOrderedSetWrapper$iterator$1$iterator$1(ob5Var, this, null));
    }
}
