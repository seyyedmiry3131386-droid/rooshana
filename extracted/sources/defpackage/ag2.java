package defpackage;

import com.google.common.collect.e0;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ag2 extends e0 {
    public final /* synthetic */ Iterable b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ag2(Iterable iterable, Iterable iterable2) {
        super(iterable);
        this.b = iterable2;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return this.b.iterator();
    }
}
