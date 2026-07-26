package defpackage;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.builders.MapBuilder;

/* JADX INFO: loaded from: classes3.dex */
public final class ch4 extends AbstractCollection implements Collection, ex3 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ ch4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.a) {
            case 0:
                throw new UnsupportedOperationException();
            case 1:
                throw new UnsupportedOperationException();
            case 2:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean addAll(Collection collection) {
        switch (this.a) {
            case 0:
                js3.p(collection, "elements");
                throw new UnsupportedOperationException();
            default:
                return super.addAll(collection);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        switch (this.a) {
            case 0:
                ((MapBuilder) this.b).clear();
                break;
            case 1:
                ((n56) this.b).clear();
                break;
            case 2:
                ((o56) this.b).clear();
                break;
            default:
                ((i66) this.b).clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                return ((MapBuilder) this.b).containsValue(obj);
            case 1:
                return ((n56) this.b).containsValue(obj);
            case 2:
                return ((o56) this.b).containsValue(obj);
            default:
                return ((i66) this.b).containsValue(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        switch (this.a) {
            case 0:
                return ((MapBuilder) this.b).isEmpty();
            default:
                return super.isEmpty();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                MapBuilder mapBuilder = (MapBuilder) this.b;
                mapBuilder.getClass();
                return new yg4(mapBuilder, 2);
            case 1:
                n56 n56Var = (n56) this.b;
                js3.p(n56Var, "builder");
                qs8[] qs8VarArr = new qs8[8];
                for (int i = 0; i < 8; i++) {
                    qs8VarArr[i] = new rs8(2);
                }
                return new v56(n56Var, qs8VarArr);
            case 2:
                o56 o56Var = (o56) this.b;
                qs8[] qs8VarArr2 = new qs8[8];
                for (int i2 = 0; i2 < 8; i2++) {
                    qs8VarArr2[i2] = new ss8(2);
                }
                return new w56(o56Var, qs8VarArr2);
            default:
                return new j66((i66) this.b, 2);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                MapBuilder mapBuilder = (MapBuilder) this.b;
                mapBuilder.c();
                int iJ = mapBuilder.j(obj);
                if (iJ < 0) {
                    return false;
                }
                mapBuilder.m(iJ);
                return true;
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean removeAll(Collection collection) {
        switch (this.a) {
            case 0:
                js3.p(collection, "elements");
                ((MapBuilder) this.b).c();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean retainAll(Collection collection) {
        switch (this.a) {
            case 0:
                js3.p(collection, "elements");
                ((MapBuilder) this.b).c();
                break;
        }
        return super.retainAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        switch (this.a) {
            case 0:
                return ((MapBuilder) this.b).i;
            case 1:
                return ((n56) this.b).c();
            case 2:
                return ((o56) this.b).c();
            default:
                return ((i66) this.b).c();
        }
    }
}
