package ir.mservices.market.app.update.recycler;

import defpackage.g51;
import defpackage.tb1;
import defpackage.y50;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.update.recycler.BaseAppUpdateViewHolder$onAttach$4$invokeSuspend$$inlined$filter$1$2", f = "BaseAppUpdate.kt", l = {50}, m = "emit", v = 1)
public final class BaseAppUpdateViewHolder$onAttach$4$invokeSuspend$$inlined$filter$1$2$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ y50 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseAppUpdateViewHolder$onAttach$4$invokeSuspend$$inlined$filter$1$2$1(y50 y50Var, g51 g51Var) {
        super(g51Var);
        this.c = y50Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
