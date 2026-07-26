package com.google.common.collect;

import defpackage.sq8;
import java.util.AbstractList;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes.dex */
public final class y0 extends sq8 {
    public final /* synthetic */ int b;
    public final /* synthetic */ AbstractList c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y0(AbstractList abstractList, ListIterator listIterator, int i) {
        super(listIterator);
        this.b = i;
        this.c = abstractList;
    }

    @Override // defpackage.rq8
    public final Object a(Object obj) {
        switch (this.b) {
            case 0:
                return ((Lists$TransformingRandomAccessList) this.c).b.apply(obj);
            default:
                return ((Lists$TransformingSequentialList) this.c).b.apply(obj);
        }
    }
}
