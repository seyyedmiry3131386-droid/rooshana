package defpackage;

import com.google.common.collect.e0;
import com.google.common.collect.r0;
import com.google.common.reflect.c;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class lt3 extends e0 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Iterable c;
    public final /* synthetic */ Object d;

    public /* synthetic */ lt3(Iterable iterable, Object obj, int i) {
        this.b = i;
        this.c = iterable;
        this.d = obj;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, zi6] */
    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.b) {
            case 0:
                Iterator it = this.c.iterator();
                it.getClass();
                return new r0(it, this.d);
            default:
                return new ot3(this.c.iterator(), (c) this.d);
        }
    }
}
