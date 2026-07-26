package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class qk9 implements Iterator {
    public final /* synthetic */ Iterator a;

    public qk9(Iterator it) {
        this.a = it;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        return new cl9((String) this.a.next());
    }
}
