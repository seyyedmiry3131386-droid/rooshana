package defpackage;

import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ha5 extends mi4 {
    public final n1 d;

    public ha5(n1 n1Var) {
        this.d = n1Var;
    }

    @Override // defpackage.mi4
    public final Set a() {
        return new ji4(this, 1);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.d.clear();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.d.containsKey(obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object get(Object obj) {
        n1 n1Var = this.d;
        if (n1Var.containsKey(obj)) {
            return n1Var.get(obj);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean isEmpty() {
        return this.d.isEmpty();
    }

    @Override // defpackage.mi4, java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        return this.d.keySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        n1 n1Var = this.d;
        if (n1Var.containsKey(obj)) {
            return n1Var.a(obj);
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.d.keySet().size();
    }
}
