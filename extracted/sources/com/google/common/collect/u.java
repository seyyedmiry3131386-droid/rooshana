package com.google.common.collect;

import defpackage.rq5;
import defpackage.sq5;
import defpackage.wn5;

/* JADX INFO: loaded from: classes.dex */
public final class u extends v {
    public final /* synthetic */ int f;
    public final /* synthetic */ AbstractMapBasedMultiset g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ u(AbstractMapBasedMultiset abstractMapBasedMultiset, int i) {
        super(abstractMapBasedMultiset);
        this.f = i;
        this.g = abstractMapBasedMultiset;
    }

    @Override // com.google.common.collect.v
    public final Object b(int i) {
        switch (this.f) {
            case 0:
                sq5 sq5Var = this.g.c;
                wn5.l(i, sq5Var.c);
                return sq5Var.a[i];
            default:
                sq5 sq5Var2 = this.g.c;
                wn5.l(i, sq5Var2.c);
                return new rq5(sq5Var2, i);
        }
    }
}
