package ir.mservices.market.setting;

import defpackage.dp2;
import defpackage.er7;
import defpackage.g51;
import defpackage.pv6;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.KotlinNothingValueException;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.setting.SettingRecyclerListFragment$onViewCreated$2", f = "SettingRecyclerListFragment.kt", l = {117}, m = "invokeSuspend", v = 1)
final class SettingRecyclerListFragment$onViewCreated$2 extends SuspendLambda implements dp2 {
    public int a;
    public final /* synthetic */ SettingRecyclerListFragment b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingRecyclerListFragment$onViewCreated$2(SettingRecyclerListFragment settingRecyclerListFragment, g51 g51Var) {
        super(1, g51Var);
        this.b = settingRecyclerListFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(g51 g51Var) {
        return new SettingRecyclerListFragment$onViewCreated$2(this.b, g51Var);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        ((SettingRecyclerListFragment$onViewCreated$2) create((g51) obj)).invokeSuspend(tx8.a);
        return CoroutineSingletons.a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            int i2 = SettingRecyclerListFragment.k1;
            SettingRecyclerListFragment settingRecyclerListFragment = this.b;
            pv6 pv6Var = settingRecyclerListFragment.R1().A;
            er7 er7Var = new er7(settingRecyclerListFragment);
            this.a = 1;
            if (pv6Var.a.a(er7Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
