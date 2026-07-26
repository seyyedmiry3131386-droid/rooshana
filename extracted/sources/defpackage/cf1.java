package defpackage;

import com.google.common.collect.z0;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class cf1 extends yj2 {
    public final Map s;

    public cf1(Map map) {
        super(16);
        this.s = map;
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

    @Override // defpackage.yj2, java.util.Map
    public final boolean containsKey(Object obj) {
        return obj != null && super.containsKey(obj);
    }

    @Override // defpackage.yj2, java.util.Map
    public final boolean containsValue(Object obj) {
        return s7.i(obj, new gi4(((oq7) entrySet()).iterator(), 1));
    }

    @Override // defpackage.yj2, java.util.Map
    public final Set entrySet() {
        return z0.d(super.entrySet(), new bf1(0));
    }

    @Override // defpackage.yj2, java.util.Map
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (obj != null) {
            if (this == obj) {
                zEquals = true;
            } else if (obj instanceof Map) {
                zEquals = ((oq7) entrySet()).equals(((Map) obj).entrySet());
            } else {
                zEquals = false;
            }
            if (zEquals) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.yj2, java.util.Map
    public final Object get(Object obj) {
        if (obj == null) {
            return null;
        }
        return (List) super.get(obj);
    }

    @Override // defpackage.yj2, java.util.Map
    public final int hashCode() {
        return z0.f(entrySet());
    }

    @Override // defpackage.yj2, java.util.Map
    public final boolean isEmpty() {
        return super.isEmpty() || (super.size() == 1 && super.containsKey(null));
    }

    @Override // defpackage.yj2, java.util.Map
    public final Set keySet() {
        return z0.d(super.keySet(), new bf1(1));
    }

    @Override // defpackage.yj2, java.util.Map
    public final int size() {
        return super.size() - (super.containsKey(null) ? 1 : 0);
    }
}
