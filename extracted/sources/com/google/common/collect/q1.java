package com.google.common.collect;

import defpackage.i2;

/* JADX INFO: loaded from: classes.dex */
public final class q1 extends i2 {
    public final /* synthetic */ int b;
    public final Comparable c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(RegularContiguousSet regularContiguousSet, Comparable comparable, int i) {
        super(comparable);
        this.b = i;
        switch (i) {
            case 1:
                super(comparable);
                this.c = regularContiguousSet.first();
                break;
            default:
                this.c = regularContiguousSet.last();
                break;
        }
    }

    @Override // defpackage.i2
    public final Object a(Object obj) {
        int i = this.b;
        Comparable comparable = this.c;
        switch (i) {
            case 0:
                Comparable comparable2 = (Comparable) obj;
                int i2 = RegularContiguousSet.h;
                if (comparable == null) {
                    throw null;
                }
                Range range = Range.c;
                if (comparable2.compareTo(comparable) == 0) {
                    return null;
                }
                throw null;
            default:
                Comparable comparable3 = (Comparable) obj;
                int i3 = RegularContiguousSet.h;
                if (comparable == null) {
                    throw null;
                }
                Range range2 = Range.c;
                if (comparable3.compareTo(comparable) == 0) {
                    return null;
                }
                throw null;
        }
    }
}
