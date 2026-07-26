package ir.mservices.market.pika.send;

import androidx.paging.e;
import androidx.paging.m;
import defpackage.bp2;
import defpackage.bz6;
import defpackage.g51;
import defpackage.gu9;
import defpackage.qp2;
import defpackage.sl0;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xe2;
import defpackage.y97;
import ir.mservices.market.pika.send.model.c;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.pika.send.InstalledAppsViewModel$doRequest$1", f = "InstalledAppsViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class InstalledAppsViewModel$doRequest$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ InstalledAppsViewModel a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstalledAppsViewModel$doRequest$1(InstalledAppsViewModel installedAppsViewModel, g51 g51Var) {
        super(2, g51Var);
        this.a = installedAppsViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new InstalledAppsViewModel$doRequest$1(this.a, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((InstalledAppsViewModel$doRequest$1) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        InstalledAppsViewModel installedAppsViewModel = this.a;
        final c cVar = installedAppsViewModel.u;
        cVar.getClass();
        return new bz6(e.b(gu9.x((xe2) new m(gu9.B(), new bp2() { // from class: ir.mservices.market.pika.send.model.b
            @Override // defpackage.bp2
            public final Object invoke() {
                return new ir.mservices.market.model.paging.b(new InstalledAppsRepositoryImpl$getInstalledApps$1$1(cVar, null));
            }
        }).a, new sl0(installedAppsViewModel)), y97.G(installedAppsViewModel)), null, null, null, 14);
    }
}
