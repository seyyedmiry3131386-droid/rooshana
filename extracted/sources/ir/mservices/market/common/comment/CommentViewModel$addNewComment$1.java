package ir.mservices.market.common.comment;

import defpackage.dp3;
import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.common.comment.CommentViewModel$addNewComment$1", f = "CommentViewModel.kt", l = {72}, m = "invokeSuspend", v = 1)
final class CommentViewModel$addNewComment$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ CommentViewModel b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ int e;
    public final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CommentViewModel$addNewComment$1(CommentViewModel commentViewModel, String str, String str2, int i, String str3, g51 g51Var) {
        super(2, g51Var);
        this.b = commentViewModel;
        this.c = str;
        this.d = str2;
        this.e = i;
        this.f = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new CommentViewModel$addNewComment$1(this.b, this.c, this.d, this.e, this.f, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((CommentViewModel$addNewComment$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            CommentViewModel commentViewModel = this.b;
            ir.mservices.market.common.model.a aVar = commentViewModel.b;
            dp3 dp3Var = commentViewModel.f;
            String str = this.c;
            Integer numP = dp3Var.p(str);
            this.a = 1;
            if (aVar.c(str, numP, this.d, this.e, this.f, commentViewModel, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        return tx8.a;
    }
}
