package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class yj2 extends hs9 implements Map {
    public yj2() {
        super(16);
    }

    public abstract Map Y();

    public void clear() {
        Y().clear();
    }

    public boolean containsKey(Object obj) {
        return Y().containsKey(obj);
    }

    public boolean containsValue(Object obj) {
        return Y().containsValue(obj);
    }

    public Set entrySet() {
        return Y().entrySet();
    }

    public boolean equals(Object obj) {
        return obj == this || Y().equals(obj);
    }

    public Object get(Object obj) {
        return Y().get(obj);
    }

    public int hashCode() {
        return Y().hashCode();
    }

    public boolean isEmpty() {
        return Y().isEmpty();
    }

    public Set keySet() {
        return Y().keySet();
    }

    public Object put(Object obj, Object obj2) {
        return Y().put(obj, obj2);
    }

    public void putAll(Map map) {
        Y().putAll(map);
    }

    public Object remove(Object obj) {
        return Y().remove(obj);
    }

    public int size() {
        return Y().size();
    }

    public Collection values() {
        return Y().values();
    }
}
