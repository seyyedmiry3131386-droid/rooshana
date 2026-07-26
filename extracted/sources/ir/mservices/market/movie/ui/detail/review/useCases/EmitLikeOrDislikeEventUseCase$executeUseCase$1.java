package ir.mservices.market.movie.ui.detail.review.useCases;

import defpackage.g51;
import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.movie.ui.detail.review.useCases.EmitLikeOrDislikeEventUseCase", f = "EmitLikeOrDislikeEventUseCase.kt", l = {13}, m = "executeUseCase", v = 1)
final class EmitLikeOrDislikeEventUseCase$executeUseCase$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ a b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmitLikeOrDislikeEventUseCase$executeUseCase$1(a aVar, g51 g51Var) {
        super(g51Var);
        this.b = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.o0(null, this);
    }
}
