package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class kb5 implements List, ex3 {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ kb5(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean add(Object obj) {
        switch (this.a) {
            case 0:
                ((mb5) this.b).g(obj);
                break;
            default:
                ((zb5) this.b).b(obj);
                break;
        }
        return true;
    }

    @Override // java.util.List
    public final boolean addAll(int i, Collection collection) {
        switch (this.a) {
            case 0:
                js3.p(collection, "elements");
                mb5 mb5Var = (mb5) this.b;
                if (i < 0 || i > mb5Var.b) {
                    StringBuilder sbR = rm7.r(i, "Index ", " must be in 0..");
                    sbR.append(mb5Var.b);
                    lb7.k(sbR.toString());
                    throw null;
                }
                int i2 = 0;
                if (collection.isEmpty()) {
                    return false;
                }
                int size = collection.size() + mb5Var.b;
                Object[] objArr = mb5Var.a;
                if (objArr.length < size) {
                    mb5Var.n(size, objArr);
                }
                Object[] objArr2 = mb5Var.a;
                if (i != mb5Var.b) {
                    ew.y0(collection.size() + i, i, mb5Var.b, objArr2, objArr2);
                }
                for (Object obj : collection) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        br9.P();
                        throw null;
                    }
                    objArr2[i2 + i] = obj;
                    i2 = i3;
                }
                mb5Var.b = collection.size() + mb5Var.b;
                return true;
            default:
                return ((zb5) this.b).e(i, collection);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final void clear() {
        switch (this.a) {
            case 0:
                ((mb5) this.b).j();
                break;
            default:
                ((zb5) this.b).h();
                break;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean contains(Object obj) {
        switch (this.a) {
            case 0:
                return ((mb5) this.b).c(obj) >= 0;
            default:
                return ((zb5) this.b).i(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean containsAll(Collection collection) {
        switch (this.a) {
            case 0:
                js3.p(collection, "elements");
                mb5 mb5Var = (mb5) this.b;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    if (mb5Var.c(it.next()) < 0) {
                        break;
                    }
                }
                break;
            default:
                zb5 zb5Var = (zb5) this.b;
                zb5Var.getClass();
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    if (!zb5Var.i(it2.next())) {
                        break;
                    }
                }
                break;
        }
        return true;
    }

    @Override // java.util.List
    public final Object get(int i) {
        switch (this.a) {
            case 0:
                zq5.a(i, this);
                return ((mb5) this.b).b(i);
            default:
                ac5.a(i, this);
                return ((zb5) this.b).a[i];
        }
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        switch (this.a) {
            case 0:
                return ((mb5) this.b).c(obj);
            default:
                return ((zb5) this.b).j(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean isEmpty() {
        switch (this.a) {
            case 0:
                return ((mb5) this.b).d();
            default:
                return ((zb5) this.b).c == 0;
        }
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        switch (this.a) {
            case 0:
                return new jb5(0, 0, this);
            default:
                return new jb5(0, 1, this);
        }
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int i;
        switch (this.a) {
            case 0:
                mb5 mb5Var = (mb5) this.b;
                if (obj == null) {
                    Object[] objArr = mb5Var.a;
                    i = mb5Var.b - 1;
                    while (-1 < i) {
                        if (objArr[i] != null) {
                            i--;
                        }
                    }
                    return -1;
                }
                Object[] objArr2 = mb5Var.a;
                i = mb5Var.b - 1;
                while (-1 < i) {
                    if (!obj.equals(objArr2[i])) {
                        i--;
                    }
                }
                return -1;
                return i;
            default:
                zb5 zb5Var = (zb5) this.b;
                Object[] objArr3 = zb5Var.a;
                for (int i2 = zb5Var.c - 1; i2 >= 0; i2--) {
                    if (js3.i(obj, objArr3[i2])) {
                        return i2;
                    }
                }
                return -1;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        switch (this.a) {
            case 0:
                return new jb5(0, 0, this);
            default:
                return new jb5(0, 1, this);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean remove(Object obj) {
        switch (this.a) {
            case 0:
                return ((mb5) this.b).k(obj);
            default:
                return ((zb5) this.b).k(obj);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final boolean removeAll(Collection collection) {
        switch (this.a) {
            case 0:
                js3.p(collection, "elements");
                mb5 mb5Var = (mb5) this.b;
                mb5Var.getClass();
                int i = mb5Var.b;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    mb5Var.k(it.next());
                }
                if (i != mb5Var.b) {
                }
                break;
            default:
                zb5 zb5Var = (zb5) this.b;
                zb5Var.getClass();
                if (!collection.isEmpty()) {
                    int i2 = zb5Var.c;
                    Iterator it2 = collection.iterator();
                    while (it2.hasNext()) {
                        zb5Var.k(it2.next());
                    }
                    if (i2 != zb5Var.c) {
                    }
                }
                break;
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection
    public final boolean retainAll(Collection collection) {
        switch (this.a) {
            case 0:
                js3.p(collection, "elements");
                mb5 mb5Var = (mb5) this.b;
                mb5Var.getClass();
                int i = mb5Var.b;
                Object[] objArr = mb5Var.a;
                for (int i2 = i - 1; -1 < i2; i2--) {
                    if (!collection.contains(objArr[i2])) {
                        mb5Var.l(i2);
                    }
                }
                if (i != mb5Var.b) {
                }
                break;
            default:
                zb5 zb5Var = (zb5) this.b;
                int i3 = zb5Var.c;
                for (int i4 = i3 - 1; -1 < i4; i4--) {
                    if (!collection.contains(zb5Var.a[i4])) {
                        zb5Var.l(i4);
                    }
                }
                if (i3 != zb5Var.c) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.List
    public final Object set(int i, Object obj) {
        switch (this.a) {
            case 0:
                zq5.a(i, this);
                mb5 mb5Var = (mb5) this.b;
                if (i < 0 || i >= mb5Var.b) {
                    mb5Var.f(i);
                    throw null;
                }
                Object[] objArr = mb5Var.a;
                Object obj2 = objArr[i];
                objArr[i] = obj;
                return obj2;
            default:
                ac5.a(i, this);
                Object[] objArr2 = ((zb5) this.b).a;
                Object obj3 = objArr2[i];
                objArr2[i] = obj;
                return obj3;
        }
    }

    @Override // java.util.List, java.util.Collection
    public final int size() {
        switch (this.a) {
            case 0:
                return ((mb5) this.b).b;
            default:
                return ((zb5) this.b).c;
        }
    }

    @Override // java.util.List
    public final List subList(int i, int i2) {
        switch (this.a) {
            case 0:
                zq5.b(i, i2, this);
                return new lb5(i, i2, 0, this);
            default:
                ac5.b(i, i2, this);
                return new lb5(i, i2, 1, this);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray() {
        switch (this.a) {
        }
        return tv8.B(this);
    }

    @Override // java.util.List
    public final void add(int i, Object obj) {
        int i2;
        switch (this.a) {
            case 0:
                mb5 mb5Var = (mb5) this.b;
                if (i >= 0 && i <= (i2 = mb5Var.b)) {
                    int i3 = i2 + 1;
                    Object[] objArr = mb5Var.a;
                    if (objArr.length < i3) {
                        mb5Var.n(i3, objArr);
                    }
                    Object[] objArr2 = mb5Var.a;
                    int i4 = mb5Var.b;
                    if (i != i4) {
                        ew.y0(i + 1, i, i4, objArr2, objArr2);
                    }
                    objArr2[i] = obj;
                    mb5Var.b++;
                    return;
                }
                StringBuilder sbR = rm7.r(i, "Index ", " must be in 0..");
                sbR.append(mb5Var.b);
                lb7.k(sbR.toString());
                throw null;
            default:
                ((zb5) this.b).a(i, obj);
                return;
        }
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.a) {
            case 0:
                return new jb5(i, 0, this);
            default:
                return new jb5(i, 1, this);
        }
    }

    @Override // java.util.List
    public final Object remove(int i) {
        switch (this.a) {
            case 0:
                zq5.a(i, this);
                return ((mb5) this.b).l(i);
            default:
                ac5.a(i, this);
                return ((zb5) this.b).l(i);
        }
    }

    @Override // java.util.List, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        switch (this.a) {
            case 0:
                js3.p(objArr, "array");
                break;
        }
        return tv8.C(this, objArr);
    }

    @Override // java.util.List, java.util.Collection
    public final boolean addAll(Collection collection) {
        switch (this.a) {
            case 0:
                js3.p(collection, "elements");
                mb5 mb5Var = (mb5) this.b;
                int i = mb5Var.b;
                Iterator it = collection.iterator();
                while (it.hasNext()) {
                    mb5Var.g(it.next());
                }
                return i != mb5Var.b;
            default:
                zb5 zb5Var = (zb5) this.b;
                return zb5Var.e(zb5Var.c, collection);
        }
    }
}
