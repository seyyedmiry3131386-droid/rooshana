package com.google.common.collect;

import defpackage.yj2;
import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ImmutableClassToInstanceMap<B> extends yj2 implements Map, Serializable {
    public static final ImmutableClassToInstanceMap t = new ImmutableClassToInstanceMap(RegularImmutableMap.g);
    public final ImmutableMap s;

    public ImmutableClassToInstanceMap(ImmutableMap immutableMap) {
        super(16);
        this.s = immutableMap;
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

    public Object readResolve() {
        return isEmpty() ? t : this;
    }
}
