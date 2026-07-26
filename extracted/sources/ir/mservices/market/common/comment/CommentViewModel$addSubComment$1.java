package ir.mservices.market.common.comment;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.i;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.common.comment.CommentViewModel$addSubComment$1", f = "CommentViewModel.kt", l = {120, 119}, m = "invokeSuspend", v = 1)
final class CommentViewModel$addSubComment$1 extends SuspendLambda implements qp2 {
    public i a;
    public int b;
    public final /* synthetic */ CommentViewModel c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentViewModel$addSubComment$1(CommentViewModel commentViewModel, String str, String str2, String str3, g51 g51Var) {
        super(2, g51Var);
        this.c = commentViewModel;
        this.d = str;
        this.e = str2;
        this.f = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new CommentViewModel$addSubComment$1(this.c, this.d, this.e, this.f, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((CommentViewModel$addSubComment$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00d4, code lost:
    
        if (r10.emit(r0, r24) == r8) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r25) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.common.comment.CommentViewModel$addSubComment$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
