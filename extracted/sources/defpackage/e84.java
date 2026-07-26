package defpackage;

import com.google.gson.internal.LinkedTreeMap;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes.dex */
public final class e84 implements Iterator {
    public g84 a;
    public g84 b = null;
    public int c;
    public final /* synthetic */ LinkedTreeMap d;
    public final /* synthetic */ int e;

    public e84(LinkedTreeMap linkedTreeMap, int i) {
        this.e = i;
        this.d = linkedTreeMap;
        this.a = linkedTreeMap.f.d;
        this.c = linkedTreeMap.e;
    }

    public final Object a() {
        return b();
    }

    public final g84 b() {
        g84 g84Var = this.a;
        LinkedTreeMap linkedTreeMap = this.d;
        if (g84Var == linkedTreeMap.f) {
            throw new NoSuchElementException();
        }
        if (linkedTreeMap.e != this.c) {
            throw new ConcurrentModificationException();
        }
        this.a = g84Var.d;
        this.b = g84Var;
        return g84Var;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.a != this.d.f;
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.e) {
            case 1:
                return b().f;
            default:
                return a();
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        g84 g84Var = this.b;
        if (g84Var == null) {
            throw new IllegalStateException();
        }
        LinkedTreeMap linkedTreeMap = this.d;
        linkedTreeMap.c(g84Var, true);
        this.b = null;
        this.c = linkedTreeMap.e;
    }
}
