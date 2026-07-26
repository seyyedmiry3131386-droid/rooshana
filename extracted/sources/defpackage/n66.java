package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public class n66 implements Iterator, dx3 {
    public final /* synthetic */ int a;
    public Object b;
    public final Object c;
    public int d;

    public n66(Object obj, Map map, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = obj;
                this.c = map;
                break;
            default:
                js3.p(map, "hashMap");
                this.b = obj;
                this.c = map;
                break;
        }
    }

    public void a() {
        Object objInvoke;
        gq1 gq1Var = (gq1) this.c;
        if (this.d == -2) {
            objInvoke = ((bp2) gq1Var.b).invoke();
        } else {
            dp2 dp2Var = (dp2) gq1Var.c;
            Object obj = this.b;
            js3.m(obj);
            objInvoke = dp2Var.invoke(obj);
        }
        this.b = objInvoke;
        this.d = objInvoke == null ? 0 : 1;
    }

    public h84 b() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        Object obj = ((Map) this.c).get(this.b);
        if (obj != null) {
            h84 h84Var = (h84) obj;
            this.d++;
            this.b = h84Var.c;
            return h84Var;
        }
        throw new ConcurrentModificationException("Hash code of a key (" + this.b + ") has changed after it was added to the persistent map.");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                return this.d < ((Map) this.c).size();
            case 1:
                return this.d < ((Map) this.c).size();
            default:
                if (this.d < 0) {
                    a();
                }
                return this.d == 1;
        }
    }

    @Override // java.util.Iterator
    public Object next() {
        switch (this.a) {
            case 0:
                return b();
            case 1:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                Object obj = this.b;
                this.d++;
                Object obj2 = ((Map) this.c).get(obj);
                if (obj2 != null) {
                    this.b = ((i84) obj2).b;
                    return obj;
                }
                throw new ConcurrentModificationException("Hash code of an element (" + obj + ") has changed after it was added to the persistent set.");
            default:
                if (this.d < 0) {
                    a();
                }
                if (this.d == 0) {
                    throw new NoSuchElementException();
                }
                Object obj3 = this.b;
                js3.n(obj3, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.d = -1;
                return obj3;
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public n66(gq1 gq1Var) {
        this.a = 2;
        this.c = gq1Var;
        this.d = -2;
    }
}
