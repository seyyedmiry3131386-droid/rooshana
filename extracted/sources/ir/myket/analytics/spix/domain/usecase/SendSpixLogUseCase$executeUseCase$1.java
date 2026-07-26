package ir.myket.analytics.spix.domain.usecase;

import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.analytics.spix.domain.usecase.SendSpixLogUseCase", f = "SendSpixLogUseCase.kt", l = {16}, m = "executeUseCase", v = 1)
final class SendSpixLogUseCase$executeUseCase$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ a b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendSpixLogUseCase$executeUseCase$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.z0(null, this);
    }
}
