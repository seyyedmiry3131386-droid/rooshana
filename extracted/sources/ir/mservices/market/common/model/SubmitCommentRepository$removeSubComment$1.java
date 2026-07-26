package ir.mservices.market.common.model;

import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.common.model.SubmitCommentRepository", f = "SubmitCommentRepository.kt", l = {132, 134}, m = "removeSubComment", v = 1)
final class SubmitCommentRepository$removeSubComment$1 extends ContinuationImpl {
    public String a;
    public Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ a d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitCommentRepository$removeSubComment$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.d = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.e |= Integer.MIN_VALUE;
        return this.d.b(null, null, null, null, null, this);
    }
}
