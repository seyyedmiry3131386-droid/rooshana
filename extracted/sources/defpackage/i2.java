package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public abstract class i2 extends zx8 {
    public Object a;

    public i2(Object obj) {
        this.a = obj;
    }

    public abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object obj = this.a;
        if (obj == null) {
            throw new NoSuchElementException();
        }
        this.a = a(obj);
        return obj;
    }
}
