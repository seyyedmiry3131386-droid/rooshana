package ir.mservices.market.myReview.incomplete.model;

import defpackage.dx4;
import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.myReview.incomplete.model.InCompleteReviewsRepositoryImpl", f = "InCompleteReviewsRepositoryImpl.kt", l = {40}, m = "getInstalledAppModels", v = 1)
final class InCompleteReviewsRepositoryImpl$getInstalledAppModels$1 extends ContinuationImpl {
    public dx4 a;
    public String b;
    public Object c;
    public /* synthetic */ Object d;
    public final /* synthetic */ b e;
    public int f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InCompleteReviewsRepositoryImpl$getInstalledAppModels$1(b bVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.e = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.d = obj;
        this.f |= Integer.MIN_VALUE;
        return this.e.a(null, null, false, null, this);
    }
}
