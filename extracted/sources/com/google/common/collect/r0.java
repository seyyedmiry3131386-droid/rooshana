package com.google.common.collect;

import defpackage.nq7;
import defpackage.zi6;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class r0 extends e {
    public final /* synthetic */ int c = 0;
    public final Iterator d;
    public final /* synthetic */ Object e;

    public r0(Iterator it, zi6 zi6Var) {
        this.d = it;
        this.e = zi6Var;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.common.collect.e
    public final Object a() {
        Object next;
        Object next2;
        switch (this.c) {
            case 0:
                do {
                    Iterator it = this.d;
                    if (!it.hasNext()) {
                        this.a = AbstractIterator$State.c;
                    } else {
                        next = it.next();
                    }
                    break;
                } while (!((zi6) this.e).apply(next));
                break;
            default:
                do {
                    Iterator it2 = this.d;
                    if (!it2.hasNext()) {
                        this.a = AbstractIterator$State.c;
                    } else {
                        next2 = it2.next();
                    }
                    break;
                } while (!((nq7) this.e).b.contains(next2));
                break;
        }
        return null;
    }

    public r0(nq7 nq7Var) {
        this.e = nq7Var;
        this.d = nq7Var.a.iterator();
    }
}
