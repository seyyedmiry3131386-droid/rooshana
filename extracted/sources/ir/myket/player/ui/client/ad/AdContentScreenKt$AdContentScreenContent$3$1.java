package ir.myket.player.ui.client.ad;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wb5;
import defpackage.ws5;
import defpackage.y40;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.player.ui.client.ad.AdContentScreenKt$AdContentScreenContent$3$1", f = "AdContentScreen.kt", l = {}, m = "invokeSuspend", v = 1)
final class AdContentScreenKt$AdContentScreenContent$3$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ wb5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdContentScreenKt$AdContentScreenContent$3$1(Context context, wb5 wb5Var, g51 g51Var) {
        super(2, g51Var);
        this.a = context;
        this.b = wb5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new AdContentScreenKt$AdContentScreenContent$3$1(this.a, this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        AdContentScreenKt$AdContentScreenContent$3$1 adContentScreenKt$AdContentScreenContent$3$1 = (AdContentScreenKt$AdContentScreenContent$3$1) create((e71) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        adContentScreenKt$AdContentScreenContent$3$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        FragmentActivity fragmentActivityQ;
        ws5 ws5VarC;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        if (!((Boolean) this.b.getValue()).booleanValue() && (fragmentActivityQ = y40.q(this.a)) != null && (ws5VarC = fragmentActivityQ.c()) != null) {
            ws5VarC.b();
        }
        return tx8.a;
    }
}
