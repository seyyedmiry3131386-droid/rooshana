package defpackage;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public abstract class q1 extends AbstractList implements List, ex3 {
    public abstract int a();

    public abstract Object c(int i);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int i) {
        return c(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return a();
    }
}
