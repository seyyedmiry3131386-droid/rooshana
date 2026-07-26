package defpackage;

import com.google.common.cache.c;
import com.google.common.cache.d;

/* JADX INFO: loaded from: classes.dex */
public final class xb4 extends c {
    public final /* synthetic */ int i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xb4(d dVar, int i) {
        super(dVar);
        this.i = i;
    }

    @Override // com.google.common.cache.c, java.util.Iterator
    public Object next() {
        switch (this.i) {
            case 1:
                return c().a;
            case 2:
                return c().b;
            default:
                return super.next();
        }
    }
}
