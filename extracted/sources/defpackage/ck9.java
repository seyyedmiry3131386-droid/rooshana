package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class ck9 implements Iterator {
    public final /* synthetic */ Iterator a;
    public final /* synthetic */ Iterator b;

    public ck9(gk9 gk9Var, Iterator it, Iterator it2) {
        this.a = it;
        this.b = it2;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.a.hasNext()) {
            return true;
        }
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        Iterator it = this.a;
        if (it.hasNext()) {
            return new cl9(((Integer) it.next()).toString());
        }
        Iterator it2 = this.b;
        if (it2.hasNext()) {
            return new cl9((String) it2.next());
        }
        throw new NoSuchElementException();
    }
}
