package ir.mservices.market.reels.ui;

import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.reels.ui.ReelsViewModel", f = "ReelsViewModel.kt", l = {87, 90, 94}, m = "likeReel", v = 1)
final class ReelsViewModel$likeReel$1 extends ContinuationImpl {
    public Object a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ReelsViewModel c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReelsViewModel$likeReel$1(ReelsViewModel reelsViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = reelsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return ReelsViewModel.s(this.c, null, this);
    }
}
