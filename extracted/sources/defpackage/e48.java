package defpackage;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes3.dex */
public final class e48 implements nj1 {
    public final char a;
    public int b = 0;
    public final LinkedList c = new LinkedList();

    public e48(char c) {
        this.a = c;
    }

    @Override // defpackage.nj1
    public final void a(nf8 nf8Var, nf8 nf8Var2, int i) {
        nj1 nj1Var;
        LinkedList linkedList = this.c;
        Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                nj1Var = (nj1) linkedList.getFirst();
                break;
            } else {
                nj1Var = (nj1) it.next();
                if (nj1Var.c() <= i) {
                    break;
                }
            }
        }
        nj1Var.a(nf8Var, nf8Var2, i);
    }

    @Override // defpackage.nj1
    public final char b() {
        return this.a;
    }

    @Override // defpackage.nj1
    public final int c() {
        return this.b;
    }

    @Override // defpackage.nj1
    public final int d(mj1 mj1Var, mj1 mj1Var2) {
        nj1 nj1Var;
        int i = mj1Var.g;
        LinkedList linkedList = this.c;
        Iterator it = linkedList.iterator();
        while (true) {
            if (!it.hasNext()) {
                nj1Var = (nj1) linkedList.getFirst();
                break;
            }
            nj1Var = (nj1) it.next();
            if (nj1Var.c() <= i) {
                break;
            }
        }
        return nj1Var.d(mj1Var, mj1Var2);
    }

    @Override // defpackage.nj1
    public final char e() {
        return this.a;
    }

    public final void f(nj1 nj1Var) {
        int iC = nj1Var.c();
        LinkedList linkedList = this.c;
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()) {
            int iC2 = ((nj1) listIterator.next()).c();
            if (iC > iC2) {
                listIterator.previous();
                listIterator.add(nj1Var);
                return;
            } else if (iC == iC2) {
                throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.a + "' and minimum length " + iC);
            }
        }
        linkedList.add(nj1Var);
        this.b = iC;
    }
}
