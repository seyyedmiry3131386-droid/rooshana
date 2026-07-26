package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class cz7 implements f01, Iterable, dx3 {
    public int b;
    public int d;
    public int e;
    public boolean g;
    public int h;
    public HashMap j;
    public ya5 k;
    public int[] a = new int[0];
    public Object[] c = new Object[0];
    public final Object f = new Object();
    public ArrayList i = new ArrayList();

    public final int a(ge geVar) {
        if (this.g) {
            sz0.a("Use active SlotWriter to determine anchor location instead");
        }
        if (!geVar.a()) {
            wi6.a("Anchor refers to a group that was removed");
        }
        return geVar.a;
    }

    public final void c() {
        this.j = new HashMap();
    }

    public final bz7 d() {
        if (this.g) {
            throw new IllegalStateException("Cannot read while a writer is pending");
        }
        this.e++;
        return new bz7(this);
    }

    public final fz7 e() {
        if (this.g) {
            sz0.a("Cannot start a writer when another writer is pending");
        }
        if (this.e > 0) {
            sz0.a("Cannot start a writer when a reader is pending");
        }
        this.g = true;
        this.h++;
        return new fz7(this);
    }

    public final boolean f(ge geVar) {
        int iE;
        return geVar.a() && (iE = ez7.e(this.i, geVar.a, this.b)) >= 0 && js3.i(this.i.get(iE), geVar);
    }

    public final qv2 h(int i) {
        int i2;
        ArrayList arrayList;
        int iE;
        HashMap map = this.j;
        if (map != null) {
            if (this.g) {
                sz0.a("use active SlotWriter to crate an anchor for location instead");
            }
            ge geVar = (i < 0 || i >= (i2 = this.b) || (iE = ez7.e((arrayList = this.i), i, i2)) < 0) ? null : (ge) arrayList.get(iE);
            if (geVar != null) {
                return (qv2) map.get(geVar);
            }
        }
        return null;
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        return new pv2(this, 0, this.b);
    }
}
