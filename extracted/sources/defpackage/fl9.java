package defpackage;

import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class fl9 extends sj0 {
    public boolean b;
    public final /* synthetic */ Object c;

    public fl9(Object obj) {
        super(4);
        this.c = obj;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return !this.b;
    }

    @Override // defpackage.sj0, java.util.Iterator, java.util.ListIterator
    public final Object next() {
        if (this.b) {
            throw new NoSuchElementException();
        }
        this.b = true;
        return this.c;
    }
}
