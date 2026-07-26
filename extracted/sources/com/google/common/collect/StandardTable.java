package com.google.common.collect;

import defpackage.z2;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes.dex */
public class StandardTable<R, C, V> extends z2 implements Serializable {
    private static final long serialVersionUID = 0;
    public transient Map c;

    @Override // defpackage.z2
    public final Iterator a() {
        throw null;
    }

    @Override // defpackage.z2
    public void b() {
        throw null;
    }

    @Override // defpackage.he8
    public Set c() {
        Set set = this.a;
        if (set != null) {
            return set;
        }
        Set setE = e();
        this.a = setE;
        return setE;
    }

    @Override // defpackage.he8
    public Map f() {
        Map map = this.c;
        if (map != null) {
            return map;
        }
        Map mapI = i();
        this.c = mapI;
        return mapI;
    }

    public boolean h(Object obj) {
        if (obj == null) {
            return false;
        }
        throw null;
    }

    public Map i() {
        return new t1(this);
    }

    public Object j(Object obj, Object obj2, Object obj3) {
        obj.getClass();
        throw null;
    }

    public Map k(Object obj) {
        return new s1(this, obj);
    }

    @Override // defpackage.he8
    public int size() {
        throw null;
    }
}
