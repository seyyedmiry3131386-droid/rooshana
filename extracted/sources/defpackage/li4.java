package defpackage;

import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes.dex */
public final class li4 extends ki4 implements SortedSet {
    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return ((SortedMap) this.a).comparator();
    }

    @Override // defpackage.ki4
    public final Map d() {
        return (SortedMap) this.a;
    }

    @Override // java.util.SortedSet
    public final Object first() {
        return ((SortedMap) this.a).firstKey();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        return new li4(((SortedMap) this.a).headMap(obj));
    }

    @Override // java.util.SortedSet
    public final Object last() {
        return ((SortedMap) this.a).lastKey();
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        return new li4(((SortedMap) this.a).subMap(obj, obj2));
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        return new li4(((SortedMap) this.a).tailMap(obj));
    }
}
