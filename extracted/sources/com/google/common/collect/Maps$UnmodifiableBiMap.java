package com.google.common.collect;

import defpackage.xa0;
import defpackage.yj2;
import j$.util.DesugarCollections;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
class Maps$UnmodifiableBiMap<K, V> extends yj2 implements xa0, Serializable {
    private static final long serialVersionUID = 0;
    public final Map s;
    public final xa0 t;
    public xa0 u;
    public transient Set v;

    public Maps$UnmodifiableBiMap(xa0 xa0Var, xa0 xa0Var2) {
        super(16);
        this.s = DesugarCollections.unmodifiableMap(xa0Var);
        this.t = xa0Var;
        this.u = xa0Var2;
    }

    @Override // defpackage.hs9
    /* JADX INFO: renamed from: A */
    public final Object Y() {
        return this.s;
    }

    @Override // defpackage.yj2
    public final Map Y() {
        return this.s;
    }

    @Override // defpackage.xa0
    public final xa0 y() {
        xa0 xa0Var = this.u;
        if (xa0Var != null) {
            return xa0Var;
        }
        Maps$UnmodifiableBiMap maps$UnmodifiableBiMap = new Maps$UnmodifiableBiMap(this.t.y(), this);
        this.u = maps$UnmodifiableBiMap;
        return maps$UnmodifiableBiMap;
    }

    @Override // defpackage.yj2, java.util.Map
    public final Set values() {
        Set set = this.v;
        if (set != null) {
            return set;
        }
        Set setUnmodifiableSet = DesugarCollections.unmodifiableSet(this.t.values());
        this.v = setUnmodifiableSet;
        return setUnmodifiableSet;
    }
}
