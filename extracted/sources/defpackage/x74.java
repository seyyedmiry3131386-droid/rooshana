package defpackage;

import com.google.common.collect.LinkedListMultimap;
import java.util.AbstractSequentialList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class x74 extends AbstractSequentialList {
    public final /* synthetic */ int a;
    public final /* synthetic */ LinkedListMultimap b;

    public /* synthetic */ x74(LinkedListMultimap linkedListMultimap, int i) {
        this.a = i;
        this.b = linkedListMultimap;
    }

    @Override // java.util.AbstractSequentialList, java.util.AbstractList, java.util.List
    public final ListIterator listIterator(int i) {
        switch (this.a) {
            case 0:
                return new c84(this.b, i);
            default:
                c84 c84Var = new c84(this.b, i);
                return new y74(c84Var, c84Var);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        switch (this.a) {
        }
        return this.b.i;
    }
}
