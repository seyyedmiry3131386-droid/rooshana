package ir.mservices.market.myAccount.city;

import androidx.paging.e;
import androidx.paging.m;
import defpackage.bz6;
import defpackage.d;
import defpackage.g51;
import defpackage.gu9;
import defpackage.nm5;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vd7;
import defpackage.xe2;
import defpackage.y97;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.myAccount.city.SelectCityViewModel$doRequest$1", f = "SelectCityViewModel.kt", l = {64}, m = "invokeSuspend", v = 1)
final class SelectCityViewModel$doRequest$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ SelectCityViewModel b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectCityViewModel$doRequest$1(SelectCityViewModel selectCityViewModel, g51 g51Var) {
        super(2, g51Var);
        this.b = selectCityViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new SelectCityViewModel$doRequest$1(this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((SelectCityViewModel$doRequest$1) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        SelectCityViewModel selectCityViewModel = this.b;
        if (i == 0) {
            b.b(obj);
            nm5 nm5Var = selectCityViewModel.v;
            l lVar = selectCityViewModel.w;
            this.a = 1;
            nm5Var.getClass();
            obj = (xe2) new m(gu9.B(), new d(lVar, nm5Var, 14)).a;
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        return new bz6(e.b(gu9.x((xe2) obj, new vd7(18)), y97.G(selectCityViewModel)), null, null, null, 14);
    }
}
