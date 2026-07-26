package ir.myket.player.viewmodel;

import defpackage.ag6;
import defpackage.b47;
import defpackage.e62;
import defpackage.e71;
import defpackage.eo7;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xc6;
import ir.mservices.market.movie.data.webapi.CommonDataKt;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.player.viewmodel.AdContentViewModel$playerAnalyticsListener$1$1", f = "AdContentViewModel.kt", l = {160}, m = "invokeSuspend", v = 1)
final class AdContentViewModel$playerAnalyticsListener$1$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ xc6 b;
    public final /* synthetic */ ir.myket.analytics.spix.domain.usecase.a c;
    public final /* synthetic */ b d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ int g;
    public final /* synthetic */ String h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdContentViewModel$playerAnalyticsListener$1$1(xc6 xc6Var, ir.myket.analytics.spix.domain.usecase.a aVar, b bVar, String str, String str2, int i, String str3, g51 g51Var) {
        super(2, g51Var);
        this.b = xc6Var;
        this.c = aVar;
        this.d = bVar;
        this.e = str;
        this.f = str2;
        this.g = i;
        this.h = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new AdContentViewModel$playerAnalyticsListener$1$1(this.b, this.c, this.d, this.e, this.f, this.g, this.h, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((AdContentViewModel$playerAnalyticsListener$1$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            xc6 xc6Var = this.b;
            eo7 eo7Var = new eo7(new ag6(xc6Var.c, xc6Var.b, xc6Var.d, CommonDataKt.PLAYER_TYPE_AD, b47.v(((e62) this.d.d).d0()), this.e, this.f, this.g, this.h));
            this.a = 1;
            if (this.c.z0(eo7Var, this) == coroutineSingletons) {
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
