package ir.myket.player.ui.client.ad;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wb5;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.player.ui.client.ad.AdContentScreenKt$AdContentScreenContent$6$1$1", f = "AdContentScreen.kt", l = {243}, m = "invokeSuspend", v = 1)
final class AdContentScreenKt$AdContentScreenContent$6$1$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ wb5 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdContentScreenKt$AdContentScreenContent$6$1$1(int i, wb5 wb5Var, g51 g51Var) {
        super(2, g51Var);
        this.b = i;
        this.c = wb5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new AdContentScreenKt$AdContentScreenContent$6$1$1(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((AdContentScreenKt$AdContentScreenContent$6$1$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            long millis = TimeUnit.SECONDS.toMillis(this.b);
            this.a = 1;
            if (kotlinx.coroutines.a.e(millis, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        this.c.setValue(Boolean.FALSE);
        return tx8.a;
    }
}
