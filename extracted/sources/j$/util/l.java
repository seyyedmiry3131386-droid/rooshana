package j$.util;

import java.util.Iterator;
import java.util.Map;
import java.util.function.Consumer;

/* JADX INFO: loaded from: classes2.dex */
public final class l implements Iterator, a0 {
    public final /* synthetic */ int a = 0;
    public final Iterator b;

    public l(m mVar) {
        this.b = mVar.a.iterator();
    }

    public l(s sVar) {
        this.b = sVar.a.iterator();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
        }
        return this.b.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                return this.b.next();
            default:
                return new q((Map.Entry) this.b.next());
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.Iterator, j$.util.a0
    public final void forEachRemaining(Consumer consumer) {
        switch (this.a) {
            case 0:
                j$.com.android.tools.r8.a.J(this.b, consumer);
                break;
            default:
                j$.com.android.tools.r8.a.J(this.b, new p(0, consumer));
                break;
        }
    }
}
