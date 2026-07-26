package defpackage;

import com.j256.ormlite.stmt.query.SimpleComparison;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class xb7 implements Map.Entry {
    public final Object a;
    public final Object b;
    public xb7 c;
    public xb7 d;

    public xb7(Object obj, Object obj2) {
        this.a = obj;
        this.b = obj2;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof xb7)) {
            return false;
        }
        xb7 xb7Var = (xb7) obj;
        return this.a.equals(xb7Var.a) && this.b.equals(xb7Var.b);
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
        throw new UnsupportedOperationException("An entry modification is not supported");
    }

    public final String toString() {
        return this.a + SimpleComparison.EQUAL_TO_OPERATION + this.b;
    }
}
