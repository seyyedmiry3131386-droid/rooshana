package defpackage;

import com.google.common.collect.e0;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class nt3 extends e0 {
    public final /* synthetic */ Iterable b;
    public final /* synthetic */ int c;

    public nt3(int i, Collection collection) {
        this.b = collection;
        this.c = i;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        Iterable iterable = this.b;
        boolean z = iterable instanceof List;
        int i = this.c;
        if (z) {
            List list = (List) iterable;
            return list.subList(Math.min(list.size(), i), list.size()).iterator();
        }
        Iterator it = iterable.iterator();
        it.getClass();
        wn5.i("numberToAdvance must be nonnegative", i >= 0);
        for (int i2 = 0; i2 < i && it.hasNext(); i2++) {
            it.next();
        }
        return new mt3(it);
    }
}
