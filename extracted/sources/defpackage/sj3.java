package defpackage;

import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.ImmutableMultimap;

/* JADX INFO: loaded from: classes.dex */
public final class sj3 extends zx8 {
    public final zx8 a;
    public zx8 b = pt3.d;

    public sj3(ImmutableMultimap immutableMultimap) {
        this.a = immutableMultimap.f.values().iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b.hasNext() || this.a.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!this.b.hasNext()) {
            this.b = ((ImmutableCollection) this.a.next()).iterator();
        }
        return this.b.next();
    }
}
