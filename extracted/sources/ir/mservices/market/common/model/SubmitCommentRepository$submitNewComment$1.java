package ir.mservices.market.common.model;

import defpackage.tb1;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.common.model.SubmitCommentRepository", f = "SubmitCommentRepository.kt", l = {96, 101, 102, 106}, m = "submitNewComment", v = 1)
final class SubmitCommentRepository$submitNewComment$1 extends ContinuationImpl {
    public String a;
    public Object b;
    public Pair c;
    public int d;
    public int e;
    public /* synthetic */ Object f;
    public final /* synthetic */ a g;
    public int h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitCommentRepository$submitNewComment$1(a aVar, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.g = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.h |= Integer.MIN_VALUE;
        return this.g.c(null, null, null, 0, null, null, this);
    }
}
