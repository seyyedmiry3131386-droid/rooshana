package ir.mservices.market.viewModel;

import defpackage.br9;
import defpackage.bz6;
import defpackage.f9;
import defpackage.g51;
import defpackage.qp2;
import defpackage.sz5;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.tz5;
import defpackage.uz5;
import defpackage.vz5;
import defpackage.wz5;
import defpackage.xp;
import defpackage.xz5;
import defpackage.yz5;
import defpackage.zz5;
import ir.mservices.market.common.Filter;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.viewModel.BaseViewModel$execute$1", f = "BaseViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class BaseViewModel$execute$1 extends SuspendLambda implements qp2 {
    public /* synthetic */ Object a;
    public final /* synthetic */ br9[] b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseViewModel$execute$1(br9[] br9VarArr, g51 g51Var) {
        super(2, g51Var);
        this.b = br9VarArr;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        BaseViewModel$execute$1 baseViewModel$execute$1 = new BaseViewModel$execute$1(this.b, g51Var);
        baseViewModel$execute$1.a = obj;
        return baseViewModel$execute$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((BaseViewModel$execute$1) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        bz6 bz6Var;
        bz6 bz6Var2;
        bz6 bz6Var3 = (bz6) this.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        if (bz6Var3 == null) {
            return null;
        }
        for (br9 br9Var : this.b) {
            if (br9Var instanceof wz5) {
                wz5 wz5Var = (wz5) br9Var;
                bz6Var2 = new bz6(new f9(bz6Var3.a, wz5Var.s, wz5Var.t, 6), bz6Var3.b, bz6Var3.c, bz6Var3.d);
            } else if (br9Var instanceof zz5) {
                zz5 zz5Var = (zz5) br9Var;
                bz6Var2 = new bz6(new f9(bz6Var3.a, zz5Var.t, zz5Var.s, 7), bz6Var3.b, bz6Var3.c, bz6Var3.d);
            } else {
                if (br9Var instanceof yz5) {
                    bz6Var = new bz6(new sz5(bz6Var3.a, ((yz5) br9Var).s, 0), bz6Var3.b, bz6Var3.c, bz6Var3.d);
                } else if (br9Var instanceof xz5) {
                    Filter filter = ((xz5) br9Var).s;
                    if (filter == null) {
                        filter = bz6Var3.b;
                    }
                    bz6Var = new bz6(bz6Var3.a, filter, bz6Var3.c, bz6Var3.d);
                } else if (br9Var instanceof tz5) {
                    tz5 tz5Var = (tz5) br9Var;
                    bz6Var2 = new bz6(new f9(bz6Var3.a, tz5Var.t, tz5Var.s, 4), bz6Var3.b, bz6Var3.c, bz6Var3.d);
                } else if (br9Var instanceof uz5) {
                    uz5 uz5Var = (uz5) br9Var;
                    bz6Var2 = new bz6(new f9(bz6Var3.a, uz5Var.t, uz5Var.s, 5), bz6Var3.b, bz6Var3.c, bz6Var3.d);
                } else {
                    if (!(br9Var instanceof vz5)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    bz6Var = new bz6(new xp(bz6Var3.a, ((vz5) br9Var).s, 12), bz6Var3.b, bz6Var3.c, bz6Var3.d);
                }
                bz6Var3 = bz6Var;
            }
            bz6Var3 = bz6Var2;
        }
        return bz6Var3;
    }
}
