package defpackage;

import com.google.common.collect.z0;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class ii4 extends qq7 {
    public final /* synthetic */ int a;

    public /* synthetic */ ii4(int i) {
        this.a = i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.a) {
            case 0:
                d().clear();
                break;
            case 1:
                f().clear();
                break;
            default:
                f().clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    Object objQ = hs9.Q(d(), key);
                    if (s7.l(objQ, entry.getValue()) && (objQ != null || d().containsKey(key))) {
                        return true;
                    }
                }
                return false;
            case 1:
                return f().contains(obj);
            default:
                if (obj instanceof pa5) {
                    pa5 pa5Var = (pa5) obj;
                    if (pa5Var.a() > 0 && f().s0(pa5Var.b()) == pa5Var.a()) {
                        return true;
                    }
                }
                return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.a) {
            case 1:
                return f().containsAll(collection);
            default:
                return super.containsAll(collection);
        }
    }

    public abstract Map d();

    public abstract oa5 f();

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        switch (this.a) {
            case 0:
                return d().isEmpty();
            case 1:
                return f().isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                if (contains(obj) && (obj instanceof Map.Entry)) {
                    return d().keySet().remove(((Map.Entry) obj).getKey());
                }
                return false;
            case 1:
                return f().w0(Integer.MAX_VALUE, obj) > 0;
            default:
                if (obj instanceof pa5) {
                    pa5 pa5Var = (pa5) obj;
                    Object objB = pa5Var.b();
                    int iA = pa5Var.a();
                    if (iA != 0) {
                        return f().K(iA, objB);
                    }
                }
                return false;
        }
    }

    @Override // defpackage.qq7, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        switch (this.a) {
            case 0:
                try {
                    collection.getClass();
                    return z0.i(this, collection);
                } catch (UnsupportedOperationException unused) {
                    Iterator it = collection.iterator();
                    boolean zRemove = false;
                    while (it.hasNext()) {
                        zRemove |= remove(it.next());
                    }
                    return zRemove;
                }
            default:
                return super.removeAll(collection);
        }
    }

    @Override // defpackage.qq7, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        switch (this.a) {
            case 0:
                try {
                    collection.getClass();
                    return super.retainAll(collection);
                } catch (UnsupportedOperationException unused) {
                    HashSet hashSet = new HashSet(hs9.v(collection.size()));
                    for (Object obj : collection) {
                        if (contains(obj) && (obj instanceof Map.Entry)) {
                            hashSet.add(((Map.Entry) obj).getKey());
                        }
                    }
                    return d().keySet().retainAll(hashSet);
                }
            default:
                return super.retainAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        switch (this.a) {
            case 0:
                return d().size();
            default:
                return f().entrySet().size();
        }
    }
}
