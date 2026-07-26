package ir.mservices.market.app.update.common.modal;

import defpackage.g51;
import defpackage.rp2;
import defpackage.s30;
import defpackage.tb1;
import defpackage.tx8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.update.common.modal.AppUpdateRepositoryImpl$getUpdateListFlow$1", f = "AppUpdateRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 1)
final class AppUpdateRepositoryImpl$getUpdateListFlow$1 extends SuspendLambda implements rp2 {
    public /* synthetic */ List a;
    public /* synthetic */ Pair b;

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        AppUpdateRepositoryImpl$getUpdateListFlow$1 appUpdateRepositoryImpl$getUpdateListFlow$1 = new AppUpdateRepositoryImpl$getUpdateListFlow$1(3, (g51) obj3);
        appUpdateRepositoryImpl$getUpdateListFlow$1.a = (List) obj;
        appUpdateRepositoryImpl$getUpdateListFlow$1.b = (Pair) obj2;
        return appUpdateRepositoryImpl$getUpdateListFlow$1.invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        List list = this.a;
        Pair pair = this.b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((s30) next).a.n.equals(pair != null ? (String) pair.a : null)) {
                obj2 = next;
                break;
            }
        }
        s30 s30Var = (s30) obj2;
        if (s30Var != null) {
            s30Var.b = pair != null ? ((Boolean) pair.b).booleanValue() : true;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj3 : list) {
            if (((s30) obj3).b) {
                arrayList.add(obj3);
            }
        }
        return arrayList;
    }
}
