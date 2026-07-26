package com.google.common.collect;

import defpackage.s7;
import defpackage.wn5;
import defpackage.zj2;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class b extends zj2 {
    public final /* synthetic */ int s;
    public final Map.Entry t;
    public final /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj, Map.Entry entry, int i) {
        super(16);
        this.s = i;
        this.u = obj;
        this.t = entry;
    }

    @Override // defpackage.hs9
    /* JADX INFO: renamed from: A */
    public final Object Y() {
        switch (this.s) {
        }
        return this.t;
    }

    @Override // defpackage.zj2
    public final Map.Entry Y() {
        switch (this.s) {
        }
        return this.t;
    }

    @Override // defpackage.zj2, java.util.Map.Entry
    public Object getValue() {
        switch (this.s) {
            case 1:
                return z0.a(((Synchronized$SynchronizedAsMapEntries) ((l1) this.u).c).b, (Collection) this.t.getValue());
            default:
                return super.getValue();
        }
    }

    @Override // defpackage.zj2, java.util.Map.Entry
    public Object setValue(Object obj) {
        switch (this.s) {
            case 0:
                AbstractBiMap abstractBiMap = (AbstractBiMap) this.u;
                abstractBiMap.a0(obj);
                wn5.s("entry no longer in map", abstractBiMap.entrySet().contains(this));
                if (s7.l(obj, getValue())) {
                    return obj;
                }
                wn5.g(obj, "value already present: %s", !abstractBiMap.containsValue(obj));
                Object value = this.t.setValue(obj);
                wn5.s("entry no longer in map", s7.l(obj, abstractBiMap.get(getKey())));
                Object key = getKey();
                abstractBiMap.t.s.remove(value);
                abstractBiMap.t.s.put(obj, key);
                return value;
            default:
                return super.setValue(obj);
        }
    }
}
