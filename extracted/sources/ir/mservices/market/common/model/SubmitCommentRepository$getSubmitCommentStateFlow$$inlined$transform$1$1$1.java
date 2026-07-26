package ir.mservices.market.common.model;

import defpackage.e9;
import defpackage.g51;
import defpackage.tb1;
import kotlin.Pair;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.common.model.SubmitCommentRepository$getSubmitCommentStateFlow$$inlined$transform$1$1", f = "SubmitCommentRepository.kt", l = {40, 42}, m = "emit", v = 1)
public final class SubmitCommentRepository$getSubmitCommentStateFlow$$inlined$transform$1$1$1 extends ContinuationImpl {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ e9 c;
    public Pair d;
    public int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SubmitCommentRepository$getSubmitCommentStateFlow$$inlined$transform$1$1$1(e9 e9Var, g51 g51Var) {
        super(g51Var);
        this.c = e9Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.a = obj;
        this.b |= Integer.MIN_VALUE;
        return this.c.emit(null, this);
    }
}
