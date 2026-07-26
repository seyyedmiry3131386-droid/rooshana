package ir.mservices.market.movie.ui.detail.review.useCases;

import defpackage.tb1;
import defpackage.zn7;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.ui.detail.review.useCases.SendLikeOrDislikeUseCase", f = "SendLikeOrDislikeUseCase.kt", l = {15, 24}, m = "executeUseCase", v = 1)
final class SendLikeOrDislikeUseCase$executeUseCase$1 extends ContinuationImpl {
    public zn7 a;
    public /* synthetic */ Object b;
    public final /* synthetic */ a c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendLikeOrDislikeUseCase$executeUseCase$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.c = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.p0(null, this);
    }
}
