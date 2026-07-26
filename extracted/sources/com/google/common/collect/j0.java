package com.google.common.collect;

import defpackage.rj3;
import defpackage.vy2;
import defpackage.wu8;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class j0 {
    public Object[] a;
    public int b = 0;
    public rj3 c;

    public j0(int i) {
        this.a = new Object[i * 2];
    }

    public final ImmutableMap a(boolean z) {
        rj3 rj3Var;
        rj3 rj3Var2;
        if (z && (rj3Var2 = this.c) != null) {
            throw rj3Var2.a();
        }
        RegularImmutableMap regularImmutableMapP = RegularImmutableMap.p(this.b, this.a, this);
        if (!z || (rj3Var = this.c) == null) {
            return regularImmutableMapP;
        }
        throw rj3Var.a();
    }

    public ImmutableMap b() {
        return a(true);
    }

    public j0 c(Object obj, Object obj2) {
        int i = (this.b + 1) * 2;
        Object[] objArr = this.a;
        if (i > objArr.length) {
            this.a = Arrays.copyOf(objArr, wu8.t(objArr.length, i));
        }
        vy2.k(obj, obj2);
        Object[] objArr2 = this.a;
        int i2 = this.b;
        int i3 = i2 * 2;
        objArr2[i3] = obj;
        objArr2[i3 + 1] = obj2;
        this.b = i2 + 1;
        return this;
    }

    public j0 d(Iterable iterable) {
        if (iterable instanceof Collection) {
            int size = (((Collection) iterable).size() + this.b) * 2;
            Object[] objArr = this.a;
            if (size > objArr.length) {
                this.a = Arrays.copyOf(objArr, wu8.t(objArr.length, size));
            }
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            c(entry.getKey(), entry.getValue());
        }
        return this;
    }

    public j0 e(Map map) {
        return d(map.entrySet());
    }
}
