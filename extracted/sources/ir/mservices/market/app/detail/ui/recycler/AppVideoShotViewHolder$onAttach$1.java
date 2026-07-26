package ir.mservices.market.app.detail.ui.recycler;

import defpackage.e71;
import defpackage.fu7;
import defpackage.g51;
import defpackage.qp2;
import defpackage.r4;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.KotlinNothingValueException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.app.detail.ui.recycler.AppVideoShotViewHolder$onAttach$1", f = "AppVideoShot.kt", l = {180}, m = "invokeSuspend", v = 1)
final class AppVideoShotViewHolder$onAttach$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ AppVideoShotData b;
    public final /* synthetic */ h c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppVideoShotViewHolder$onAttach$1(AppVideoShotData appVideoShotData, h hVar, g51 g51Var) {
        super(2, g51Var);
        this.b = appVideoShotData;
        this.c = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new AppVideoShotViewHolder$onAttach$1(this.b, this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        ((AppVideoShotViewHolder$onAttach$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        return CoroutineSingletons.a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i == 0) {
            kotlin.b.b(obj);
            fu7 fu7Var = this.b.c;
            r4 r4Var = new r4(8, this.c);
            this.a = 1;
            if (fu7Var.a(r4Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.b.b(obj);
        }
        throw new KotlinNothingValueException();
    }
}
