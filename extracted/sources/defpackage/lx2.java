package defpackage;

import com.google.common.collect.HashBiMap;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class lx2 implements Iterator {
    public int a;
    public int b;
    public int c;
    public int d;
    public final /* synthetic */ rv e;

    public lx2(rv rvVar) {
        this.e = rvVar;
        HashBiMap hashBiMap = (HashBiMap) rvVar.b;
        this.a = hashBiMap.i;
        this.b = -1;
        this.c = hashBiMap.d;
        this.d = hashBiMap.c;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (((HashBiMap) this.e.b).d == this.c) {
            return this.a != -2 && this.d > 0;
        }
        throw new ConcurrentModificationException();
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i = this.a;
        rv rvVar = this.e;
        kx2 kx2Var = new kx2((HashBiMap) rvVar.b, i);
        int i2 = this.a;
        this.b = i2;
        this.a = ((HashBiMap) rvVar.b).l[i2];
        this.d--;
        return kx2Var;
    }

    @Override // java.util.Iterator
    public final void remove() {
        rv rvVar = this.e;
        HashBiMap hashBiMap = (HashBiMap) rvVar.b;
        if (((HashBiMap) rvVar.b).d != this.c) {
            throw new ConcurrentModificationException();
        }
        vy2.q(this.b != -1);
        int i = this.b;
        hashBiMap.l(i, y97.b0(hashBiMap.a[i]));
        if (this.a == hashBiMap.c) {
            this.a = this.b;
        }
        this.b = -1;
        this.c = hashBiMap.d;
    }
}
