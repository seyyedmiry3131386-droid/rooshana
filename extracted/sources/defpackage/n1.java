package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public abstract class n1 implements fa5 {
    public transient Collection a;
    public transient Set b;
    public transient oa5 c;
    public transient Collection d;
    public transient Map e;

    public boolean b(Object obj) {
        Iterator it = h().values().iterator();
        while (it.hasNext()) {
            if (((Collection) it.next()).contains(obj)) {
                return true;
            }
        }
        return false;
    }

    public abstract Map c();

    public abstract Set e();

    @Override // defpackage.fa5
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof fa5) {
            return h().equals(((fa5) obj).h());
        }
        return false;
    }

    public abstract Collection f();

    public abstract Collection g();

    @Override // defpackage.fa5
    public Map h() {
        Map map = this.e;
        if (map != null) {
            return map;
        }
        Map mapC = c();
        this.e = mapC;
        return mapC;
    }

    @Override // defpackage.fa5
    public int hashCode() {
        return h().hashCode();
    }

    @Override // defpackage.fa5
    public boolean i(Object obj, Object obj2) {
        Collection collection = (Collection) h().get(obj);
        return collection != null && collection.contains(obj2);
    }

    @Override // defpackage.fa5
    public boolean isEmpty() {
        return size() == 0;
    }

    public abstract Iterator j();

    public Iterator k() {
        return new gi4(g().iterator(), 1);
    }

    @Override // defpackage.fa5
    public Set keySet() {
        Set set = this.b;
        if (set != null) {
            return set;
        }
        Set setE = e();
        this.b = setE;
        return setE;
    }

    @Override // defpackage.fa5
    public boolean remove(Object obj, Object obj2) {
        Collection collection = (Collection) h().get(obj);
        return collection != null && collection.remove(obj2);
    }

    public final String toString() {
        return h().toString();
    }

    @Override // defpackage.fa5
    public Collection values() {
        Collection collection = this.d;
        if (collection != null) {
            return collection;
        }
        Collection collectionF = f();
        this.d = collectionF;
        return collectionF;
    }
}
