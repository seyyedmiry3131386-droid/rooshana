package defpackage;

import com.google.common.cache.d;
import com.j256.ormlite.stmt.query.SimpleComparison;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class kc4 implements Map.Entry {
    public final Object a;
    public Object b;
    public final /* synthetic */ d c;

    public kc4(d dVar, Object obj, Object obj2) {
        this.c = dVar;
        this.a = obj;
        this.b = obj2;
    }

    @Override // java.util.Map.Entry
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

    @Override // java.util.Map.Entry
    public final int hashCode() {
        return this.a.hashCode() ^ this.b.hashCode();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        Object objPut = this.c.put(this.a, obj);
        this.b = obj;
        return objPut;
    }

    public final String toString() {
        return this.a + SimpleComparison.EQUAL_TO_OPERATION + this.b;
    }
}
