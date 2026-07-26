package defpackage;

import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class ot3 extends rq8 {
    public final /* synthetic */ yp2 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ot3(Iterator it, yp2 yp2Var) {
        super(it);
        this.b = yp2Var;
    }

    @Override // defpackage.rq8
    public final Object a(Object obj) {
        return this.b.apply(obj);
    }
}
