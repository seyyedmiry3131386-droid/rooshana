package defpackage;

import com.google.common.collect.w;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class o1 extends ii4 {
    public final /* synthetic */ w b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(w wVar) {
        super(1);
        this.b = wVar;
    }

    @Override // defpackage.ii4
    public final oa5 f() {
        return this.b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return this.b.f();
    }
}
