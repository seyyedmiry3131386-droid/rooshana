package ir.mservices.market.app.home.ui.recycler;

import defpackage.e71;
import defpackage.g51;
import defpackage.iu;
import defpackage.js3;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ua3;
import defpackage.ub5;
import ir.mservices.market.app.common.recycler.AppNestedData;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.version2.webapi.responsedto.ApplicationDTO;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.home.ui.recycler.HomeAppsViewHolder$onAttach$3$1", f = "HomeAppsRow.kt", l = {160}, m = "invokeSuspend", v = 1)
final class HomeAppsViewHolder$onAttach$3$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ HomeAppsRowData b;
    public final /* synthetic */ AppNestedData c;
    public final /* synthetic */ ua3 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HomeAppsViewHolder$onAttach$3$1(HomeAppsRowData homeAppsRowData, AppNestedData appNestedData, ua3 ua3Var, g51 g51Var) {
        super(2, g51Var);
        this.b = homeAppsRowData;
        this.c = appNestedData;
        this.d = ua3Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new HomeAppsViewHolder$onAttach$3$1(this.b, this.c, this.d, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((HomeAppsViewHolder$onAttach$3$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            HomeAppsRowData homeAppsRowData = this.b;
            ub5 ub5Var = homeAppsRowData.j;
            if (ub5Var != null) {
                AppNestedData appNestedData = this.c;
                ApplicationDTO applicationDTO = appNestedData.a;
                String packageName = applicationDTO != null ? applicationDTO.getPackageName() : null;
                String str = appNestedData.b;
                Iterator it = ((ArrayList) this.d.J().D().d).iterator();
                int i2 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i2 = -1;
                        break;
                    }
                    if (js3.i(((RecyclerItem) it.next()).c, homeAppsRowData)) {
                        break;
                    }
                    i2++;
                }
                iu iuVar = new iu(packageName, i2, str, homeAppsRowData.h.getMode());
                this.a = 1;
                if (ub5Var.emit(iuVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
