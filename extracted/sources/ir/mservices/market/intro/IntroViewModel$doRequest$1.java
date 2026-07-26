package ir.mservices.market.intro;

import androidx.paging.e;
import androidx.paging.m;
import defpackage.bz6;
import defpackage.g51;
import defpackage.gu9;
import defpackage.qp2;
import defpackage.qq1;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.us3;
import defpackage.xe2;
import defpackage.y97;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.intro.IntroViewModel$doRequest$1", f = "IntroViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class IntroViewModel$doRequest$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ IntroViewModel a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IntroViewModel$doRequest$1(IntroViewModel introViewModel, g51 g51Var) {
        super(2, g51Var);
        this.a = introViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new IntroViewModel$doRequest$1(this.a, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((IntroViewModel$doRequest$1) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        IntroViewModel introViewModel = this.a;
        introViewModel.v.getClass();
        return new bz6(e.b(gu9.x((xe2) new m(gu9.B(), new qq1(16)).a, new us3(0)), y97.G(introViewModel)), null, null, null, 14);
    }
}
