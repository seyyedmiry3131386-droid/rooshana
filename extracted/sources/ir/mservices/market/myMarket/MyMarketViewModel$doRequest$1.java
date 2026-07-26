package ir.mservices.market.myMarket;

import androidx.paging.e;
import androidx.paging.m;
import defpackage.ba;
import defpackage.bz6;
import defpackage.dp2;
import defpackage.g51;
import defpackage.gu9;
import defpackage.i25;
import defpackage.js3;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.sl3;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xe2;
import defpackage.y97;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.myMarket.MyMarketViewModel$doRequest$1", f = "MyMarketViewModel.kt", l = {73}, m = "invokeSuspend", v = 1)
final class MyMarketViewModel$doRequest$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ MyMarketViewModel b;

    /* JADX INFO: renamed from: ir.mservices.market.myMarket.MyMarketViewModel$doRequest$1$1, reason: invalid class name */
    final /* synthetic */ class AnonymousClass1 extends FunctionReferenceImpl implements dp2 {
        @Override // defpackage.dp2
        public final Object invoke(Object obj) {
            String str = (String) obj;
            js3.p(str, "p0");
            ((MyMarketViewModel) this.receiver).k(str);
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MyMarketViewModel$doRequest$1(MyMarketViewModel myMarketViewModel, g51 g51Var) {
        super(2, g51Var);
        this.b = myMarketViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new MyMarketViewModel$doRequest$1(this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((MyMarketViewModel$doRequest$1) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        MyMarketViewModel myMarketViewModel = this.b;
        if (i == 0) {
            b.b(obj);
            sl3 sl3Var = myMarketViewModel.z;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(1, myMarketViewModel, MyMarketViewModel.class, "removeIfEmptyCallback", "removeIfEmptyCallback(Ljava/lang/String;)V", 0);
            this.a = 1;
            sl3Var.getClass();
            obj = (xe2) new m(gu9.B(), new ba(7, anonymousClass1)).a;
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        pv6 pv6VarB = e.b(gu9.x((xe2) obj, new i25(10)), y97.G(myMarketViewModel));
        myMarketViewModel.checkRecentDownloadAnimationIcon();
        return new bz6(pv6VarB, null, null, null, 14);
    }
}
