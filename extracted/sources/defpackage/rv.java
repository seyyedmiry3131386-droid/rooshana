package defpackage;

import com.google.common.collect.HashBiMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class rv extends AbstractSet {
    public final /* synthetic */ int a;
    public final Map b;

    public /* synthetic */ rv(int i, Map map) {
        this.a = i;
        this.b = map;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean add(Object obj) {
        switch (this.a) {
            case 2:
                Map.Entry entry = (Map.Entry) obj;
                if (contains(entry)) {
                    return false;
                }
                ((nz7) this.b).put((Comparable) entry.getKey(), entry.getValue());
                return true;
            case 3:
                Map.Entry entry2 = (Map.Entry) obj;
                if (contains(entry2)) {
                    return false;
                }
                ((oz7) this.b).put((Comparable) entry2.getKey(), entry2.getValue());
                return true;
            case 4:
                Map.Entry entry3 = (Map.Entry) obj;
                if (contains(entry3)) {
                    return false;
                }
                ((nt9) this.b).put((Comparable) entry3.getKey(), entry3.getValue());
                return true;
            default:
                return super.add(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        switch (this.a) {
            case 1:
                ((HashBiMap) this.b).clear();
                break;
            case 2:
                ((nz7) this.b).clear();
                break;
            case 3:
                ((oz7) this.b).clear();
                break;
            case 4:
                ((nt9) this.b).clear();
                break;
            default:
                super.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        switch (this.a) {
            case 1:
                HashBiMap hashBiMap = (HashBiMap) this.b;
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    hashBiMap.getClass();
                    int iH = hashBiMap.h(y97.b0(key), key);
                    if (iH != -1 && s7.l(hashBiMap.a[iH], value)) {
                        return true;
                    }
                }
                return false;
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                Object obj2 = ((nz7) this.b).get(entry2.getKey());
                Object value2 = entry2.getValue();
                return obj2 == value2 || (obj2 != null && obj2.equals(value2));
            case 3:
                Map.Entry entry3 = (Map.Entry) obj;
                Object obj3 = ((oz7) this.b).get(entry3.getKey());
                Object value3 = entry3.getValue();
                return obj3 == value3 || (obj3 != null && obj3.equals(value3));
            case 4:
                Map.Entry entry4 = (Map.Entry) obj;
                Object obj4 = ((nt9) this.b).get(entry4.getKey());
                Object value4 = entry4.getValue();
                if (obj4 != value4) {
                    return obj4 != null && obj4.equals(value4);
                }
                return true;
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator iterator() {
        switch (this.a) {
            case 0:
                return new uv((wv) this.b);
            case 1:
                return new lx2(this);
            case 2:
                return new tz7((nz7) this.b, 0);
            case 3:
                return new tz7((oz7) this.b, 1);
            default:
                return new tz7((nt9) this.b);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        switch (this.a) {
            case 1:
                HashBiMap hashBiMap = (HashBiMap) this.b;
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    int iB0 = y97.b0(key);
                    int iH = hashBiMap.h(iB0, key);
                    if (iH != -1 && s7.l(hashBiMap.a[iH], value)) {
                        hashBiMap.k(iH, y97.b0(hashBiMap.a[iH]), iB0);
                        return true;
                    }
                }
                return false;
            case 2:
                Map.Entry entry2 = (Map.Entry) obj;
                if (!contains(entry2)) {
                    return false;
                }
                ((nz7) this.b).remove(entry2.getKey());
                return true;
            case 3:
                Map.Entry entry3 = (Map.Entry) obj;
                if (!contains(entry3)) {
                    return false;
                }
                ((oz7) this.b).remove(entry3.getKey());
                return true;
            case 4:
                Map.Entry entry4 = (Map.Entry) obj;
                if (!contains(entry4)) {
                    return false;
                }
                ((nt9) this.b).remove(entry4.getKey());
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        switch (this.a) {
            case 0:
                return ((wv) this.b).c;
            case 1:
                return ((HashBiMap) this.b).c;
            case 2:
                return ((nz7) this.b).size();
            case 3:
                return ((oz7) this.b).size();
            default:
                return ((nt9) this.b).size();
        }
    }

    public rv(HashBiMap hashBiMap) {
        this.a = 1;
        this.b = hashBiMap;
    }
}
