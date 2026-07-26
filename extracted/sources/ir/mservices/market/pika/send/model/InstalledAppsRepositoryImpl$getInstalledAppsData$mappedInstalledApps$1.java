package ir.mservices.market.pika.send.model;

import android.graphics.drawable.Drawable;
import defpackage.dp3;
import defpackage.e71;
import defpackage.g51;
import defpackage.js3;
import defpackage.lw8;
import defpackage.qp2;
import defpackage.rp3;
import defpackage.rt1;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wu0;
import ir.mservices.market.pika.send.recycler.InstalledAppData;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.pika.send.model.InstalledAppsRepositoryImpl$getInstalledAppsData$mappedInstalledApps$1", f = "InstalledAppsRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class InstalledAppsRepositoryImpl$getInstalledAppsData$mappedInstalledApps$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ List a;
    public final /* synthetic */ c b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InstalledAppsRepositoryImpl$getInstalledAppsData$mappedInstalledApps$1(List list, c cVar, g51 g51Var) {
        super(2, g51Var);
        this.a = list;
        this.b = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new InstalledAppsRepositoryImpl$getInstalledAppsData$mappedInstalledApps$1(this.a, this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((InstalledAppsRepositoryImpl$getInstalledAppsData$mappedInstalledApps$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        c cVar = this.b;
        List<rp3> listJ0 = kotlin.collections.a.J0(this.a, new rt1(2, cVar));
        ArrayList arrayList = new ArrayList(wu0.V(listJ0, 10));
        for (rp3 rp3Var : listJ0) {
            lw8 lw8Var = cVar.c;
            dp3 dp3Var = cVar.b;
            String str = rp3Var.a;
            long jT = dp3Var.t(str);
            lw8Var.getClass();
            String strH = lw8.h(jT);
            String strU = dp3Var.u(str);
            js3.o(strU, "getInstalledAppName(...)");
            Drawable drawableI = dp3Var.i(str);
            js3.o(drawableI, "getApplicationDrawableIcon(...)");
            arrayList.add(new InstalledAppData(str, strU, drawableI, lw8.e(cVar.c, strH)));
        }
        return arrayList;
    }
}
