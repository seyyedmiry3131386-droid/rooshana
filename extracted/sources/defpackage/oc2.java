package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes3.dex */
public final class oc2 implements Iterator, dx3 {
    public final /* synthetic */ int a;
    public final Iterator b;
    public int c;
    public Object d;
    public final /* synthetic */ ho7 e;

    public oc2(pc2 pc2Var) {
        this.a = 0;
        this.e = pc2Var;
        this.b = pc2Var.a.iterator();
        this.c = -1;
    }

    public void a() {
        Object next;
        pc2 pc2Var = (pc2) this.e;
        do {
            Iterator it = this.b;
            if (!it.hasNext()) {
                this.c = 0;
                return;
            }
            next = it.next();
        } while (((Boolean) pc2Var.c.invoke(next)).booleanValue() != pc2Var.b);
        this.d = next;
        this.c = 1;
    }

    public void b() {
        Iterator it = this.b;
        if (it.hasNext()) {
            Object next = it.next();
            if (((Boolean) ((dp2) ((gq1) this.e).c).invoke(next)).booleanValue()) {
                this.c = 1;
                this.d = next;
                return;
            }
        }
        this.c = 0;
    }

    public boolean c() {
        Iterator it;
        Iterator it2 = (Iterator) this.d;
        if (it2 != null && it2.hasNext()) {
            this.c = 1;
            return true;
        }
        do {
            Iterator it3 = this.b;
            if (!it3.hasNext()) {
                this.c = 2;
                this.d = null;
                return false;
            }
            Object next = it3.next();
            xd2 xd2Var = (xd2) this.e;
            it = (Iterator) xd2Var.c.invoke(xd2Var.b.invoke(next));
        } while (!it.hasNext());
        this.d = it;
        this.c = 1;
        return true;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.a) {
            case 0:
                if (this.c == -1) {
                    a();
                }
                return this.c == 1;
            case 1:
                int i = this.c;
                if (i == 1) {
                    return true;
                }
                if (i == 2) {
                    return false;
                }
                return c();
            default:
                if (this.c == -1) {
                    b();
                }
                return this.c == 1;
        }
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.a) {
            case 0:
                if (this.c == -1) {
                    a();
                }
                if (this.c == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.d;
                this.d = null;
                this.c = -1;
                return obj;
            case 1:
                int i = this.c;
                if (i == 2) {
                    throw new NoSuchElementException();
                }
                if (i == 0 && !c()) {
                    throw new NoSuchElementException();
                }
                this.c = 0;
                Iterator it = (Iterator) this.d;
                js3.m(it);
                return it.next();
            default:
                if (this.c == -1) {
                    b();
                }
                if (this.c == 0) {
                    throw new NoSuchElementException();
                }
                Object obj2 = this.d;
                this.d = null;
                this.c = -1;
                return obj2;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public oc2(xd2 xd2Var) {
        this.a = 1;
        this.e = xd2Var;
        this.b = xd2Var.a.iterator();
    }

    public oc2(gq1 gq1Var) {
        this.a = 2;
        this.e = gq1Var;
        this.b = ((ho7) gq1Var.b).iterator();
        this.c = -1;
    }
}
