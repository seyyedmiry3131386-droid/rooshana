package ir.mservices.market.app.detail.ui.recycler;

import defpackage.fq;
import defpackage.g51;
import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.detail.ui.recycler.AppDownloadViewHolder$onAttach$4$invokeSuspend$$inlined$filter$1$2", f = "AppDownload.kt", l = {50}, m = "emit", v = 1)
public final class AppDownloadViewHolder$onAttach$4$invokeSuspend$$inlined$filter$1$2$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ fq c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppDownloadViewHolder$onAttach$4$invokeSuspend$$inlined$filter$1$2$1(fq fqVar, g51 g51Var) {
        super(g51Var);
        this.c = fqVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
