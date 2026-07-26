package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.collections.builders.MapBuilder;

/* JADX INFO: loaded from: classes3.dex */
public final class bh4 extends s1 {
    public final /* synthetic */ int a;
    public final MapBuilder b;

    public /* synthetic */ bh4(MapBuilder mapBuilder, int i) {
        this.a = i;
        this.b = mapBuilder;
    }

    @Override // defpackage.s1
    public final int a() {
        switch (this.a) {
        }
        return this.b.i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.a) {
            case 0:
                js3.p((Map.Entry) obj, "element");
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        switch (this.a) {
            case 0:
                js3.p(collection, "elements");
                throw new UnsupportedOperationException();
            default:
                js3.p(collection, "elements");
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        switch (this.a) {
            case 0:
                this.b.clear();
                break;
            default:
                this.b.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                return this.b.g((Map.Entry) obj);
            default:
                return this.b.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.a) {
            case 0:
                js3.p(collection, "elements");
                return this.b.f(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        switch (this.a) {
        }
        return this.b.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                MapBuilder mapBuilder = this.b;
                mapBuilder.getClass();
                return new yg4(mapBuilder, 0);
            default:
                MapBuilder mapBuilder2 = this.b;
                mapBuilder2.getClass();
                return new yg4(mapBuilder2, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    MapBuilder mapBuilder = this.b;
                    mapBuilder.getClass();
                    mapBuilder.c();
                    int i = mapBuilder.i(entry.getKey());
                    if (i >= 0) {
                        Object[] objArr = mapBuilder.b;
                        js3.m(objArr);
                        if (js3.i(objArr[i], entry.getValue())) {
                            mapBuilder.m(i);
                            break;
                        }
                    }
                }
                break;
            default:
                MapBuilder mapBuilder2 = this.b;
                mapBuilder2.c();
                int i2 = mapBuilder2.i(obj);
                if (i2 >= 0) {
                    mapBuilder2.m(i2);
                    break;
                }
                break;
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        switch (this.a) {
            case 0:
                js3.p(collection, "elements");
                this.b.c();
                break;
            default:
                js3.p(collection, "elements");
                this.b.c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        switch (this.a) {
            case 0:
                js3.p(collection, "elements");
                this.b.c();
                break;
            default:
                js3.p(collection, "elements");
                this.b.c();
                break;
        }
        return super.retainAll(collection);
    }
}
