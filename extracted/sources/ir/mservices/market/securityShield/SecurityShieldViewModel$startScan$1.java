package ir.mservices.market.securityShield;

import defpackage.br9;
import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.securityShield.SecurityShieldViewModel$startScan$1", f = "SecurityShieldViewModel.kt", l = {159}, m = "invokeSuspend", v = 1)
final class SecurityShieldViewModel$startScan$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ SecurityShieldViewModel b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SecurityShieldViewModel$startScan$1(SecurityShieldViewModel securityShieldViewModel, g51 g51Var) {
        super(2, g51Var);
        this.b = securityShieldViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new SecurityShieldViewModel$startScan$1(this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((SecurityShieldViewModel$startScan$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SecurityShieldViewModel securityShieldViewModel = this.b;
        l lVar = securityShieldViewModel.z;
        Random random = securityShieldViewModel.I;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        tx8 tx8Var = tx8.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
            return tx8Var;
        }
        kotlin.b.b(obj);
        int iOrdinal = ((ScanState) lVar.getValue()).ordinal();
        if (iOrdinal == 0) {
            if (!securityShieldViewModel.v()) {
                ScanState scanState = ScanState.b;
                lVar.getClass();
                lVar.p(null, scanState);
                Iterator<T> it = securityShieldViewModel.J.getAppList().iterator();
                while (it.hasNext()) {
                    securityShieldViewModel.t((String) it.next());
                }
                securityShieldViewModel.J.getAppList().clear();
                return tx8Var;
            }
            ScanState scanState2 = ScanState.a;
            lVar.getClass();
            lVar.p(null, scanState2);
            this.a = 1;
            ArrayList arrayList = new ArrayList();
            arrayList.add(new Pair(0, Integer.valueOf(20 - random.nextInt(16))));
            arrayList.add(new Pair(((Pair) arrayList.get(0)).b, Integer.valueOf(40 - random.nextInt(16))));
            arrayList.add(new Pair(((Pair) arrayList.get(1)).b, Integer.valueOf(60 - random.nextInt(16))));
            arrayList.add(new Pair(((Pair) arrayList.get(2)).b, Integer.valueOf(80 - random.nextInt(16))));
            arrayList.add(new Pair(((Pair) arrayList.get(3)).b, Integer.valueOf(100 - random.nextInt(16))));
            securityShieldViewModel.D = br9.C(securityShieldViewModel.s(((Number) ((Pair) arrayList.get(0)).a).intValue(), ((Number) ((Pair) arrayList.get(0)).b).intValue()), securityShieldViewModel.s(((Number) ((Pair) arrayList.get(1)).a).intValue(), ((Number) ((Pair) arrayList.get(1)).b).intValue()));
            securityShieldViewModel.E = br9.C(securityShieldViewModel.s(((Number) ((Pair) arrayList.get(2)).a).intValue(), ((Number) ((Pair) arrayList.get(2)).b).intValue()), securityShieldViewModel.s(((Number) ((Pair) arrayList.get(3)).a).intValue(), ((Number) ((Pair) arrayList.get(3)).b).intValue()));
            securityShieldViewModel.F = ((Number) ((Pair) arrayList.get(4)).b).intValue() != 100 ? br9.C(securityShieldViewModel.s(((Number) ((Pair) arrayList.get(4)).a).intValue(), ((Number) ((Pair) arrayList.get(4)).b).intValue()), securityShieldViewModel.s(((Number) ((Pair) arrayList.get(4)).b).intValue(), 100)) : br9.B(securityShieldViewModel.s(((Number) ((Pair) arrayList.get(4)).a).intValue(), ((Number) ((Pair) arrayList.get(4)).b).intValue()));
            securityShieldViewModel.H = ProcessState.a;
            securityShieldViewModel.w();
            Object objR = securityShieldViewModel.r(this);
            if (objR != coroutineSingletons) {
                objR = tx8Var;
            }
            if (objR == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            List<String> appList = securityShieldViewModel.J.getAppList();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : appList) {
                if (!securityShieldViewModel.v.G((String) obj2)) {
                    arrayList2.add(obj2);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                securityShieldViewModel.t((String) it2.next());
            }
        }
        return tx8Var;
    }
}
