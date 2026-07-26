package ir.mservices.market.securityShield;

import defpackage.bl4;
import defpackage.e71;
import defpackage.g51;
import defpackage.lu7;
import defpackage.lw;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.uz5;
import defpackage.vd7;
import defpackage.vl8;
import defpackage.wu0;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.securityShield.recycler.HarmFulAppViewData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.securityShield.SecurityShieldViewModel$createAnimator$1$1$1", f = "SecurityShieldViewModel.kt", l = {354}, m = "invokeSuspend", v = 1)
final class SecurityShieldViewModel$createAnimator$1$1$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ SecurityShieldViewModel b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityShieldViewModel$createAnimator$1$1$1(SecurityShieldViewModel securityShieldViewModel, g51 g51Var) {
        super(2, g51Var);
        this.b = securityShieldViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new SecurityShieldViewModel$createAnimator$1$1$1(this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((SecurityShieldViewModel$createAnimator$1$1$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ScanState scanState;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        SecurityShieldViewModel securityShieldViewModel = this.b;
        if (i == 0) {
            kotlin.b.b(obj);
            long jNextInt = (securityShieldViewModel.I.nextInt(2) + 1) * 1000;
            this.a = 1;
            if (kotlinx.coroutines.a.e(jNextInt, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (securityShieldViewModel.J.getAppList().isEmpty()) {
            lw.f(null, null, jCurrentTimeMillis >= 0);
            securityShieldViewModel.x.getClass();
            lw.b(null, null, vl8.c(jCurrentTimeMillis));
            securityShieldViewModel.u.h(jCurrentTimeMillis, lu7.s0);
            scanState = ScanState.b;
        } else {
            ArrayList arrayList = new ArrayList();
            List<String> appList = securityShieldViewModel.J.getAppList();
            ArrayList arrayList2 = new ArrayList(wu0.V(appList, 10));
            Iterator<T> it = appList.iterator();
            while (it.hasNext()) {
                arrayList2.add(new HarmFulAppViewData((String) it.next()));
            }
            arrayList.addAll(arrayList2);
            ArrayList arrayList3 = new ArrayList(wu0.V(arrayList, 10));
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                bl4.G((MyketRecyclerData) it2.next(), arrayList3);
            }
            securityShieldViewModel.g(new uz5(arrayList3, new vd7(16)));
            scanState = ScanState.c;
        }
        l lVar = securityShieldViewModel.z;
        lVar.getClass();
        lVar.p(null, scanState);
        SecurityShieldViewModel.x(securityShieldViewModel, securityShieldViewModel.J.getTitle(), Integer.valueOf(securityShieldViewModel.J.getHarmfulAppsSize()), null, 4);
        return tx8.a;
    }
}
