package ir.mservices.market.setting;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.i;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.setting.SettingViewModel$disableKidsMode$1", f = "SettingViewModel.kt", l = {134}, m = "invokeSuspend", v = 1)
final class SettingViewModel$disableKidsMode$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ SettingViewModel b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingViewModel$disableKidsMode$1(SettingViewModel settingViewModel, g51 g51Var) {
        super(2, g51Var);
        this.b = settingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new SettingViewModel$disableKidsMode$1(this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((SettingViewModel$disableKidsMode$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            b.b(obj);
            SettingViewModel settingViewModel = this.b;
            settingViewModel.u.e(false);
            i iVar = settingViewModel.B;
            Boolean bool = Boolean.FALSE;
            this.a = 1;
            if (iVar.emit(bool, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        return tx8.a;
    }
}
