package ir.mservices.market.setting.recycler;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.t61;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.xb5;
import defpackage.xk6;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.setting.recycler.SettingNightModeViewHolder$onAttach$1", f = "SettingNightMode.kt", l = {102}, m = "invokeSuspend", v = 1)
final class SettingNightModeViewHolder$onAttach$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ SettingNightModeData b;
    public final /* synthetic */ a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingNightModeViewHolder$onAttach$1(SettingNightModeData settingNightModeData, a aVar, g51 g51Var) {
        super(2, g51Var);
        this.b = settingNightModeData;
        this.c = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new SettingNightModeViewHolder$onAttach$1(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) throws Throwable {
        ((SettingNightModeViewHolder$onAttach$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        return CoroutineSingletons.a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            throw t61.q(obj);
        }
        kotlin.b.b(obj);
        xb5 xb5Var = this.b.g;
        xk6 xk6Var = new xk6(14, this.c);
        this.a = 1;
        ((l) xb5Var).a(xk6Var, this);
        return coroutineSingletons;
    }
}
