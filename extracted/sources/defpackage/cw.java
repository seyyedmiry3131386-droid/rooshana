package defpackage;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class cw implements Iterable, dx3 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ cw(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public void a(vb9 vb9Var) {
        LinkedList linkedList = (LinkedList) this.b;
        if (linkedList.size() > 1024) {
            ((vb9) linkedList.element()).a.close();
            linkedList.remove();
        }
        while (!linkedList.isEmpty()) {
            vb9 vb9Var2 = (vb9) linkedList.element();
            vb9Var2.getClass();
            if ((System.currentTimeMillis() - vb9Var2.c) / ((long) 1000) <= 10) {
                break;
            }
            ((vb9) linkedList.element()).a.close();
            linkedList.remove();
        }
        linkedList.add(vb9Var);
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return c26.K((Object[]) this.b);
            case 1:
                Iterator it = ((CopyOnWriteArrayList) this.b).iterator();
                js3.o(it, "iterator(...)");
                return it;
            case 2:
                return new cx1(c26.K((Object[]) ((x2) this.b).b));
            case 3:
                return new kj1((lj1) this.b);
            case 4:
                return new w0((q22) this.b);
            default:
                Iterator it2 = ((LinkedList) this.b).iterator();
                js3.o(it2, "iterator(...)");
                return it2;
        }
    }

    public cw(int i) {
        this.a = i;
        switch (i) {
            case 5:
                this.b = new LinkedList();
                break;
            default:
                this.b = new CopyOnWriteArrayList();
                break;
        }
    }
}
