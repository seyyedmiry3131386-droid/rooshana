package com.google.common.cache;

import defpackage.c27;
import defpackage.ub4;
import defpackage.vb4;
import defpackage.wb4;
import java.util.AbstractQueue;
import java.util.Iterator;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AbstractQueue {
    public final /* synthetic */ int a;
    public final ub4 b;

    public b(int i) {
        this.a = i;
        switch (i) {
            case 1:
                vb4 vb4Var = new vb4(1);
                vb4Var.b = vb4Var;
                vb4Var.c = vb4Var;
                this.b = vb4Var;
                break;
            default:
                vb4 vb4Var2 = new vb4(0);
                vb4Var2.b = vb4Var2;
                vb4Var2.c = vb4Var2;
                this.b = vb4Var2;
                break;
        }
    }

    @Override // java.util.AbstractQueue, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        int i = this.a;
        LocalCache$NullEntry localCache$NullEntry = LocalCache$NullEntry.a;
        ub4 ub4Var = this.b;
        switch (i) {
            case 0:
                vb4 vb4Var = (vb4) ub4Var;
                c27 c27Var = vb4Var.b;
                while (c27Var != vb4Var) {
                    c27 c27VarO = c27Var.o();
                    Logger logger = d.t;
                    c27Var.p(localCache$NullEntry);
                    c27Var.k(localCache$NullEntry);
                    c27Var = c27VarO;
                }
                vb4Var.b = vb4Var;
                vb4Var.c = vb4Var;
                break;
            default:
                vb4 vb4Var2 = (vb4) ub4Var;
                c27 c27Var2 = vb4Var2.b;
                while (c27Var2 != vb4Var2) {
                    c27 c27VarL = c27Var2.l();
                    Logger logger2 = d.t;
                    c27Var2.i(localCache$NullEntry);
                    c27Var2.h(localCache$NullEntry);
                    c27Var2 = c27VarL;
                }
                vb4Var2.b = vb4Var2;
                vb4Var2.c = vb4Var2;
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                if (((c27) obj).o() != LocalCache$NullEntry.a) {
                }
                break;
            default:
                if (((c27) obj).l() != LocalCache$NullEntry.a) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        switch (this.a) {
            case 0:
                vb4 vb4Var = (vb4) this.b;
                if (vb4Var.b == vb4Var) {
                }
                break;
            default:
                vb4 vb4Var2 = (vb4) this.b;
                if (vb4Var2.b == vb4Var2) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                vb4 vb4Var = (vb4) this.b;
                c27 c27Var = vb4Var.b;
                if (c27Var == vb4Var) {
                    c27Var = null;
                }
                return new wb4(this, c27Var, 0);
            default:
                vb4 vb4Var2 = (vb4) this.b;
                c27 c27Var2 = vb4Var2.b;
                if (c27Var2 == vb4Var2) {
                    c27Var2 = null;
                }
                return new wb4(this, c27Var2, 1);
        }
    }

    @Override // java.util.Queue
    public final boolean offer(Object obj) {
        int i = this.a;
        ub4 ub4Var = this.b;
        switch (i) {
            case 0:
                c27 c27Var = (c27) obj;
                c27 c27VarE = c27Var.e();
                c27 c27VarO = c27Var.o();
                Logger logger = d.t;
                c27VarE.p(c27VarO);
                c27VarO.k(c27VarE);
                vb4 vb4Var = (vb4) ub4Var;
                c27 c27Var2 = vb4Var.c;
                c27Var2.p(c27Var);
                c27Var.k(c27Var2);
                c27Var.p(vb4Var);
                vb4Var.c = c27Var;
                break;
            default:
                c27 c27Var3 = (c27) obj;
                c27 c27VarQ = c27Var3.q();
                c27 c27VarL = c27Var3.l();
                Logger logger2 = d.t;
                c27VarQ.i(c27VarL);
                c27VarL.h(c27VarQ);
                vb4 vb4Var2 = (vb4) ub4Var;
                c27 c27Var4 = vb4Var2.c;
                c27Var4.i(c27Var3);
                c27Var3.h(c27Var4);
                c27Var3.i(vb4Var2);
                vb4Var2.c = c27Var3;
                break;
        }
        return true;
    }

    @Override // java.util.Queue
    public final Object peek() {
        switch (this.a) {
            case 0:
                vb4 vb4Var = (vb4) this.b;
                c27 c27Var = vb4Var.b;
                if (c27Var == vb4Var) {
                    return null;
                }
                return c27Var;
            default:
                vb4 vb4Var2 = (vb4) this.b;
                c27 c27Var2 = vb4Var2.b;
                if (c27Var2 == vb4Var2) {
                    return null;
                }
                return c27Var2;
        }
    }

    @Override // java.util.Queue
    public final Object poll() {
        switch (this.a) {
            case 0:
                vb4 vb4Var = (vb4) this.b;
                c27 c27Var = vb4Var.b;
                if (c27Var == vb4Var) {
                    return null;
                }
                remove(c27Var);
                return c27Var;
            default:
                vb4 vb4Var2 = (vb4) this.b;
                c27 c27Var2 = vb4Var2.b;
                if (c27Var2 == vb4Var2) {
                    return null;
                }
                remove(c27Var2);
                return c27Var2;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        int i = this.a;
        LocalCache$NullEntry localCache$NullEntry = LocalCache$NullEntry.a;
        switch (i) {
            case 0:
                c27 c27Var = (c27) obj;
                c27 c27VarE = c27Var.e();
                c27 c27VarO = c27Var.o();
                Logger logger = d.t;
                c27VarE.p(c27VarO);
                c27VarO.k(c27VarE);
                c27Var.p(localCache$NullEntry);
                c27Var.k(localCache$NullEntry);
                if (c27VarO != localCache$NullEntry) {
                }
                break;
            default:
                c27 c27Var2 = (c27) obj;
                c27 c27VarQ = c27Var2.q();
                c27 c27VarL = c27Var2.l();
                Logger logger2 = d.t;
                c27VarQ.i(c27VarL);
                c27VarL.h(c27VarQ);
                c27Var2.i(localCache$NullEntry);
                c27Var2.h(localCache$NullEntry);
                if (c27VarL != localCache$NullEntry) {
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.a) {
            case 0:
                vb4 vb4Var = (vb4) this.b;
                int i = 0;
                for (c27 c27VarO = vb4Var.b; c27VarO != vb4Var; c27VarO = c27VarO.o()) {
                    i++;
                }
                return i;
            default:
                vb4 vb4Var2 = (vb4) this.b;
                int i2 = 0;
                for (c27 c27VarL = vb4Var2.b; c27VarL != vb4Var2; c27VarL = c27VarL.l()) {
                    i2++;
                }
                return i2;
        }
    }
}
