package ir.mservices.market.app.update;

import defpackage.br9;
import defpackage.bs1;
import defpackage.cs1;
import defpackage.es1;
import defpackage.g51;
import defpackage.rp2;
import defpackage.s30;
import defpackage.tb1;
import defpackage.tx8;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.update.UpdateViewModel$isUpdateInProgressFlow$1", f = "UpdateViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class UpdateViewModel$isUpdateInProgressFlow$1 extends SuspendLambda implements rp2 {
    public /* synthetic */ Map a;
    public /* synthetic */ List b;

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        UpdateViewModel$isUpdateInProgressFlow$1 updateViewModel$isUpdateInProgressFlow$1 = new UpdateViewModel$isUpdateInProgressFlow$1(3, (g51) obj3);
        updateViewModel$isUpdateInProgressFlow$1.a = (Map) obj;
        updateViewModel$isUpdateInProgressFlow$1.b = (List) obj2;
        return updateViewModel$isUpdateInProgressFlow$1.invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        bs1 bs1Var;
        Map map = this.a;
        List list = this.b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        boolean z = false;
        if (list == null || !list.isEmpty()) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                s30 s30Var = (s30) it.next();
                List listC = br9.C(new Integer(110), new Integer(100));
                cs1 cs1Var = (cs1) map.get(s30Var.a.n);
                if (kotlin.collections.a.h0(listC, (cs1Var == null || (bs1Var = cs1Var.a) == null) ? null : new Integer(((es1) bs1Var).f))) {
                    z = true;
                    break;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
