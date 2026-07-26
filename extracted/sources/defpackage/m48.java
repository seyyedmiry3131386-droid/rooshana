package defpackage;

import com.google.common.collect.s1;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class m48 implements Iterator {
    public final /* synthetic */ Iterator a;
    public final /* synthetic */ s1 b;

    public m48(s1 s1Var, Iterator it) {
        this.a = it;
        this.b = s1Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        return new ra5((Map.Entry) this.a.next(), 1);
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.a.remove();
        this.b.c();
    }
}
