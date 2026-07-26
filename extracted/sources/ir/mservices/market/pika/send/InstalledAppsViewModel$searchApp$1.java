package ir.mservices.market.pika.send;

import defpackage.br9;
import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xz5;
import ir.mservices.market.version2.ui.recycler.filter.FilterCondition;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.a;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.pika.send.InstalledAppsViewModel$searchApp$1", f = "InstalledAppsViewModel.kt", l = {88}, m = "invokeSuspend", v = 1)
final class InstalledAppsViewModel$searchApp$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ InstalledAppsViewModel b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstalledAppsViewModel$searchApp$1(InstalledAppsViewModel installedAppsViewModel, String str, g51 g51Var) {
        super(2, g51Var);
        this.b = installedAppsViewModel;
        this.c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new InstalledAppsViewModel$searchApp$1(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((InstalledAppsViewModel$searchApp$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            this.a = 1;
            if (a.e(150L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        this.b.g(new xz5(ir.mservices.market.version2.ui.recycler.filter.a.b(br9.B(new FilterCondition.StringCondition(this.c)))));
        return tx8.a;
    }
}
