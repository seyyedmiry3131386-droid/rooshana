package com.google.common.collect;

import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class k1 extends defpackage.h1 {
    public final Object a;
    public Object b;
    public final /* synthetic */ MapMakerInternalMap c;

    public k1(MapMakerInternalMap mapMakerInternalMap, Object obj, Object obj2) {
        this.c = mapMakerInternalMap;
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.h1, java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            if (this.a.equals(entry.getKey()) && this.b.equals(entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.b;
    }

    @Override // defpackage.h1, java.util.Map.Entry
    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override // defpackage.h1, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object objPut = this.c.put(this.a, obj);
        this.b = obj;
        return objPut;
    }
}
