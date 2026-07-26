package androidx.paging;

import defpackage.a06;
import defpackage.dp2;
import defpackage.fx8;
import defpackage.g51;
import defpackage.h06;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xe2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes.dex */
@tb1(c = "androidx.paging.PagingDataPresenter$collectFrom$2", f = "PagingDataPresenter.kt", l = {119}, m = "invokeSuspend", v = 1)
final class PagingDataPresenter$collectFrom$2 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ a b;
    public final /* synthetic */ a06 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagingDataPresenter$collectFrom$2(a aVar, a06 a06Var, g51 g51Var) {
        super(1, g51Var);
        this.b = aVar;
        this.c = a06Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new PagingDataPresenter$collectFrom$2(this.b, this.c, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        return ((PagingDataPresenter$collectFrom$2) create((g51) obj)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            a06 a06Var = this.c;
            fx8 fx8Var = a06Var.b;
            a aVar = this.b;
            fx8 fx8Var2 = aVar.c;
            aVar.c = fx8Var;
            if (fx8Var2 instanceof h06) {
                h06 h06Var = (h06) fx8Var2;
                if (h06Var.a) {
                    fx8Var.a();
                }
                if (h06Var.b) {
                    fx8Var.k();
                }
            }
            xe2 xe2Var = a06Var.a;
            b bVar = new b(aVar, a06Var, 3);
            this.a = 1;
            if (xe2Var.a(bVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        return tx8.a;
    }
}
