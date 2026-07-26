package com.google.common.collect;

import defpackage.s7;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class a0 extends defpackage.h1 {
    public final Object a;
    public int b;
    public final /* synthetic */ CompactHashMap c;

    public a0(CompactHashMap compactHashMap, int i) {
        this.c = compactHashMap;
        Object obj = CompactHashMap.j;
        this.a = compactHashMap.s()[i];
        this.b = i;
    }

    public final void b() {
        int i = this.b;
        Object obj = this.a;
        CompactHashMap compactHashMap = this.c;
        if (i != -1 && i < compactHashMap.size()) {
            if (s7.l(obj, compactHashMap.s()[this.b])) {
                return;
            }
        }
        Object obj2 = CompactHashMap.j;
        this.b = compactHashMap.l(obj);
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.a;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        CompactHashMap compactHashMap = this.c;
        Map mapG = compactHashMap.g();
        if (mapG != null) {
            return mapG.get(this.a);
        }
        b();
        int i = this.b;
        if (i == -1) {
            return null;
        }
        return compactHashMap.t()[i];
    }

    @Override // defpackage.h1, java.util.Map.Entry
    public final Object setValue(Object obj) {
        CompactHashMap compactHashMap = this.c;
        Map mapG = compactHashMap.g();
        Object obj2 = this.a;
        if (mapG != null) {
            return mapG.put(obj2, obj);
        }
        b();
        int i = this.b;
        if (i == -1) {
            compactHashMap.put(obj2, obj);
            return null;
        }
        Object obj3 = compactHashMap.t()[i];
        compactHashMap.t()[this.b] = obj;
        return obj3;
    }
}
