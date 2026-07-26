package ir.myket.player.ui.client.ad;

import android.content.Context;
import defpackage.ci1;
import defpackage.e71;
import defpackage.g51;
import defpackage.hy2;
import defpackage.n52;
import defpackage.qg1;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wb5;
import defpackage.wc6;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.player.ui.client.ad.AdContentScreenKt$AdContentScreen$2$1", f = "AdContentScreen.kt", l = {}, m = "invokeSuspend", v = 1)
final class AdContentScreenKt$AdContentScreen$2$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ wc6 a;
    public final /* synthetic */ wb5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdContentScreenKt$AdContentScreen$2$1(wc6 wc6Var, wb5 wb5Var, g51 g51Var) {
        super(2, g51Var);
        this.a = wc6Var;
        this.b = wb5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new AdContentScreenKt$AdContentScreen$2$1(this.a, this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        AdContentScreenKt$AdContentScreen$2$1 adContentScreenKt$AdContentScreen$2$1 = (AdContentScreenKt$AdContentScreen$2$1) create((e71) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        adContentScreenKt$AdContentScreen$2$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        Context context = this.a.a;
        n52 n52Var = new n52(context);
        qg1 qg1Var = new qg1(context);
        qg1Var.c = true;
        n52Var.c(qg1Var);
        n52Var.d(new ci1(context, new hy2(24)));
        this.b.setValue(n52Var.a());
        return tx8.a;
    }
}
