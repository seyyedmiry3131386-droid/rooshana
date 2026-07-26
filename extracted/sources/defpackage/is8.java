package defpackage;

import com.google.common.collect.TreeBasedTable;
import com.google.common.collect.s1;
import java.util.Comparator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes.dex */
public final class is8 extends s1 implements SortedMap {
    public final Object d;
    public final Object e;
    public final /* synthetic */ TreeBasedTable f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public is8(TreeBasedTable treeBasedTable, Object obj, Object obj2, Object obj3) {
        super(treeBasedTable, obj);
        this.f = treeBasedTable;
        this.d = obj2;
        this.e = obj3;
        if (obj2 == null || obj3 == null) {
            return;
        }
        comparator();
        throw null;
    }

    @Override // com.google.common.collect.s1
    public final Map a() {
        f();
        return null;
    }

    @Override // com.google.common.collect.s1
    public final void c() {
        f();
    }

    @Override // java.util.SortedMap
    public final Comparator comparator() {
        this.f.getClass();
        return null;
    }

    @Override // com.google.common.collect.s1, java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        return e(obj) && super.containsKey(obj);
    }

    public final boolean e(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this.d != null) {
            comparator();
            throw null;
        }
        if (this.e == null) {
            return true;
        }
        comparator();
        throw null;
    }

    public final void f() {
        throw null;
    }

    @Override // java.util.SortedMap
    public final Object firstKey() {
        d();
        Map map = this.b;
        if (map != null) {
            return ((SortedMap) map).firstKey();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedMap
    public final SortedMap headMap(Object obj) {
        obj.getClass();
        wn5.j(e(obj));
        return new is8(this.f, this.a, this.d, obj);
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public final Set keySet() {
        return new li4(this);
    }

    @Override // java.util.SortedMap
    public final Object lastKey() {
        d();
        Map map = this.b;
        if (map != null) {
            return ((SortedMap) map).lastKey();
        }
        throw new NoSuchElementException();
    }

    @Override // com.google.common.collect.s1, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        obj.getClass();
        wn5.j(e(obj));
        return super.put(obj, obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
    @Override // java.util.SortedMap
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.util.SortedMap subMap(java.lang.Object r4, java.lang.Object r5) {
        /*
            r3 = this;
            r4.getClass()
            boolean r0 = r3.e(r4)
            if (r0 == 0) goto L14
            r5.getClass()
            boolean r0 = r3.e(r5)
            if (r0 == 0) goto L14
            r0 = 1
            goto L15
        L14:
            r0 = 0
        L15:
            defpackage.wn5.j(r0)
            is8 r0 = new is8
            com.google.common.collect.TreeBasedTable r1 = r3.f
            java.lang.Object r2 = r3.a
            r0.<init>(r1, r2, r4, r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.is8.subMap(java.lang.Object, java.lang.Object):java.util.SortedMap");
    }

    @Override // java.util.SortedMap
    public final SortedMap tailMap(Object obj) {
        obj.getClass();
        wn5.j(e(obj));
        return new is8(this.f, this.a, obj, this.e);
    }
}
