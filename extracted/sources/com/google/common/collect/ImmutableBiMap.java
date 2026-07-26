package com.google.common.collect;

import com.google.common.collect.ImmutableMap;
import defpackage.xa0;
import j$.util.Map;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class ImmutableBiMap<K, V> extends ImmutableMap<K, V> implements xa0, Map {
    private static final long serialVersionUID = 912559;

    public static class SerializedForm<K, V> extends ImmutableMap.SerializedForm<K, V> {
        private static final long serialVersionUID = 0;

        @Override // com.google.common.collect.ImmutableMap.SerializedForm
        public final j0 a(int i) {
            return new i0(i);
        }
    }

    public static ImmutableBiMap q() {
        return RegularImmutableBiMap.i;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // com.google.common.collect.ImmutableMap
    public final ImmutableCollection f() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.ImmutableMap
    /* JADX INFO: renamed from: o */
    public final ImmutableCollection values() {
        return y().keySet();
    }

    @Override // defpackage.xa0
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public abstract ImmutableBiMap y();

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final Collection values() {
        return y().keySet();
    }

    @Override // com.google.common.collect.ImmutableMap
    public Object writeReplace() {
        return new SerializedForm(this);
    }

    @Override // com.google.common.collect.ImmutableMap, java.util.Map
    public final Set values() {
        return y().keySet();
    }
}
