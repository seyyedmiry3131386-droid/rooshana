package com.google.common.collect;

import defpackage.z2;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class ArrayTable<R, C, V> extends z2 implements Serializable {
    private static final long serialVersionUID = 0;

    @Override // defpackage.z2
    public final Iterator a() {
        throw null;
    }

    @Override // defpackage.z2
    public final void b() {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.he8
    public final Set c() {
        Set set = this.a;
        if (set != null) {
            return set;
        }
        Set setE = e();
        this.a = setE;
        return setE;
    }

    @Override // defpackage.he8
    public final Map f() {
        return null;
    }

    @Override // defpackage.he8
    public final int size() {
        throw null;
    }
}
