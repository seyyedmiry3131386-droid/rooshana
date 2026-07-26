package defpackage;

import j$.util.Objects;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class uj3 extends zx8 {
    public int a;
    public Object b;
    public final /* synthetic */ Iterator c;

    public uj3(zx8 zx8Var) {
        this.c = zx8Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a > 0 || this.c.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.a <= 0) {
            pa5 pa5Var = (pa5) this.c.next();
            this.b = pa5Var.b();
            this.a = pa5Var.a();
        }
        this.a--;
        Object obj = this.b;
        Objects.requireNonNull(obj);
        return obj;
    }
}
