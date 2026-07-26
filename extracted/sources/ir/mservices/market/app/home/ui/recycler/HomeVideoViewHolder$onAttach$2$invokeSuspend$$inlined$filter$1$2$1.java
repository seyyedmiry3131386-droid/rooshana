package ir.mservices.market.app.home.ui.recycler;

import defpackage.fc3;
import defpackage.g51;
import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.home.ui.recycler.HomeVideoViewHolder$onAttach$2$invokeSuspend$$inlined$filter$1$2", f = "HomeVideoViewHolder.kt", l = {50}, m = "emit", v = 1)
public final class HomeVideoViewHolder$onAttach$2$invokeSuspend$$inlined$filter$1$2$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ fc3 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeVideoViewHolder$onAttach$2$invokeSuspend$$inlined$filter$1$2$1(fc3 fc3Var, g51 g51Var) {
        super(g51Var);
        this.c = fc3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
