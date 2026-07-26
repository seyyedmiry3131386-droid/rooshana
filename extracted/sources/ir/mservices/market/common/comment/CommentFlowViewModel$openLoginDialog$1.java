package ir.mservices.market.common.comment;

import defpackage.tb1;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.common.comment.CommentFlowViewModel", f = "CommentFlowViewModel.kt", l = {189}, m = "openLoginDialog", v = 1)
final class CommentFlowViewModel$openLoginDialog$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public final /* synthetic */ CommentFlowViewModel b;
    public int c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentFlowViewModel$openLoginDialog$1(CommentFlowViewModel commentFlowViewModel, ContinuationImpl continuationImpl) {
        super(continuationImpl);
        this.b = commentFlowViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.c |= Integer.MIN_VALUE;
        return this.b.e(null, this);
    }
}
