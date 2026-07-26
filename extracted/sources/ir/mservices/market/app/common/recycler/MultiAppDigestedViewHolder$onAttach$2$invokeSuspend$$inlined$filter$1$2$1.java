package ir.mservices.market.app.common.recycler;

import defpackage.f95;
import defpackage.g51;
import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.common.recycler.MultiAppDigestedViewHolder$onAttach$2$invokeSuspend$$inlined$filter$1$2", f = "MultiAppDigestedViewHolder.kt", l = {50}, m = "emit", v = 1)
public final class MultiAppDigestedViewHolder$onAttach$2$invokeSuspend$$inlined$filter$1$2$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ f95 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MultiAppDigestedViewHolder$onAttach$2$invokeSuspend$$inlined$filter$1$2$1(f95 f95Var, g51 g51Var) {
        super(g51Var);
        this.c = f95Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
