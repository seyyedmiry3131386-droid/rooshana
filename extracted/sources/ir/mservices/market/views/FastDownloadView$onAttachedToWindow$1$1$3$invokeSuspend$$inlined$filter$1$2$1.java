package ir.mservices.market.views;

import defpackage.g51;
import defpackage.nl;
import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.views.FastDownloadView$onAttachedToWindow$1$1$3$invokeSuspend$$inlined$filter$1$2", f = "FastDownloadView.kt", l = {50}, m = "emit", v = 1)
public final class FastDownloadView$onAttachedToWindow$1$1$3$invokeSuspend$$inlined$filter$1$2$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ nl c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FastDownloadView$onAttachedToWindow$1$1$3$invokeSuspend$$inlined$filter$1$2$1(nl nlVar, g51 g51Var) {
        super(g51Var);
        this.c = nlVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
