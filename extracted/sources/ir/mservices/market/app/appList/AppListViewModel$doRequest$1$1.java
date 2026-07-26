package ir.mservices.market.app.appList;

import defpackage.bz6;
import defpackage.ew;
import defpackage.g51;
import defpackage.js3;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vb7;
import defpackage.wu0;
import defpackage.yl5;
import ir.mservices.market.app.common.recycler.AppData;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.version2.ui.recycler.filter.a;
import ir.mservices.market.version2.webapi.responsedto.ApplicationDTO;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.appList.AppListViewModel$doRequest$1$1", f = "AppListViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class AppListViewModel$doRequest$1$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ ArrayList a;
    public final /* synthetic */ AppListViewModel b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppListViewModel$doRequest$1$1(ArrayList arrayList, AppListViewModel appListViewModel, g51 g51Var) {
        super(2, g51Var);
        this.a = arrayList;
        this.b = appListViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new AppListViewModel$doRequest$1$1(this.a, this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((AppListViewModel$doRequest$1$1) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        AppListViewModel appListViewModel;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        ArrayList arrayList = this.a;
        js3.m(arrayList);
        ArrayList arrayList2 = new ArrayList(wu0.V(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            appListViewModel = this.b;
            if (!zHasNext) {
                break;
            }
            ApplicationDTO applicationDTO = (ApplicationDTO) it.next();
            yl5 yl5Var = appListViewModel.t;
            String packageName = applicationDTO.getPackageName();
            js3.o(packageName, "getPackageName(...)");
            arrayList2.add(new RecyclerItem(new AppData((vb7) yl5Var.a(packageName), appListViewModel.u.b, applicationDTO)));
        }
        String[] strArr = appListViewModel.v.c;
        return new bz6(arrayList2, a.a(strArr != null ? ew.X0(strArr) : null), (qp2) null, 4);
    }
}
