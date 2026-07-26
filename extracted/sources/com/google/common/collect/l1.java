package com.google.common.collect;

import defpackage.rq8;
import defpackage.yp2;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class l1 extends rq8 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l1(Synchronized$SynchronizedCollection synchronized$SynchronizedCollection, Iterator it, int i) {
        super(it);
        this.b = i;
        this.c = synchronized$SynchronizedCollection;
    }

    @Override // defpackage.rq8
    public final Object a(Object obj) {
        switch (this.b) {
            case 0:
                return new ImmutableEntry(obj, ((yp2) this.c).apply(obj));
            case 1:
                return new b(this, (Map.Entry) obj, 1);
            default:
                return z0.a(((Synchronized$SynchronizedAsMapValues) this.c).b, (Collection) obj);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l1(Iterator it, yp2 yp2Var) {
        super(it);
        this.b = 0;
        this.c = yp2Var;
    }
}
