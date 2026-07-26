package defpackage;

import com.google.common.collect.z;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class z2 implements he8 {
    public transient Set a;
    public transient Collection b;

    public abstract Iterator a();

    public abstract void b();

    public Set e() {
        return new z(2, this);
    }

    @Override // defpackage.he8
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof he8) {
            return c().equals(((he8) obj).c());
        }
        return false;
    }

    public Object g(Object obj, Object obj2) {
        Map map = (Map) hs9.Q(f(), obj);
        if (map == null) {
            return null;
        }
        try {
            return map.get(obj2);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    @Override // defpackage.he8
    public final int hashCode() {
        return c().hashCode();
    }

    public final String toString() {
        return f().toString();
    }
}
