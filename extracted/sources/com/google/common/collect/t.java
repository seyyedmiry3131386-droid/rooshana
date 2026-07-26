package com.google.common.collect;

import java.util.Comparator;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes.dex */
public class t extends o implements SortedSet {
    public final /* synthetic */ AbstractMapBasedMultimap f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(AbstractMapBasedMultimap abstractMapBasedMultimap, Object obj, SortedSet sortedSet, o oVar) {
        super(abstractMapBasedMultimap, obj, sortedSet, oVar);
        this.f = abstractMapBasedMultimap;
    }

    @Override // java.util.SortedSet
    public final Comparator comparator() {
        return e().comparator();
    }

    public SortedSet e() {
        return (SortedSet) this.b;
    }

    @Override // java.util.SortedSet
    public final Object first() {
        c();
        return e().first();
    }

    @Override // java.util.SortedSet
    public final SortedSet headSet(Object obj) {
        c();
        SortedSet sortedSetHeadSet = e().headSet(obj);
        o oVar = this.c;
        if (oVar == null) {
            oVar = this;
        }
        return new t(this.f, this.a, sortedSetHeadSet, oVar);
    }

    @Override // java.util.SortedSet
    public final Object last() {
        c();
        return e().last();
    }

    @Override // java.util.SortedSet
    public final SortedSet subSet(Object obj, Object obj2) {
        c();
        SortedSet sortedSetSubSet = e().subSet(obj, obj2);
        o oVar = this.c;
        if (oVar == null) {
            oVar = this;
        }
        return new t(this.f, this.a, sortedSetSubSet, oVar);
    }

    @Override // java.util.SortedSet
    public final SortedSet tailSet(Object obj) {
        c();
        SortedSet sortedSetTailSet = e().tailSet(obj);
        o oVar = this.c;
        if (oVar == null) {
            oVar = this;
        }
        return new t(this.f, this.a, sortedSetTailSet, oVar);
    }
}
