package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class sv implements Iterator, dx3 {
    public int a;
    public int b;
    public boolean c;
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public sv(int i) {
        this.a = i;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a;
    }

    @Override // java.util.Iterator
    public final Object next() {
        Object objF;
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.b;
        switch (this.d) {
            case 0:
                objF = ((wv) this.e).f(i);
                break;
            case 1:
                objF = ((wv) this.e).j(i);
                break;
            default:
                objF = ((zv) this.e).b[i];
                break;
        }
        this.b++;
        this.c = true;
        return objF;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.c) {
            throw new IllegalStateException("Call next() before removing an element.");
        }
        int i = this.b - 1;
        this.b = i;
        switch (this.d) {
            case 0:
                ((wv) this.e).h(i);
                break;
            case 1:
                ((wv) this.e).h(i);
                break;
            default:
                ((zv) this.e).a(i);
                break;
        }
        this.a--;
        this.c = false;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public sv(zv zvVar) {
        this(zvVar.c);
        this.d = 2;
        this.e = zvVar;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public sv(wv wvVar, int i) {
        this(wvVar.c);
        this.d = i;
        switch (i) {
            case 1:
                this.e = wvVar;
                this(wvVar.c);
                break;
            default:
                this.e = wvVar;
                break;
        }
    }
}
