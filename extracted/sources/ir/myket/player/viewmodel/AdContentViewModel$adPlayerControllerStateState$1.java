package ir.myket.player.viewmodel;

import defpackage.cb;
import defpackage.g51;
import defpackage.rp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.player.viewmodel.AdContentViewModel$adPlayerControllerStateState$1", f = "AdContentViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class AdContentViewModel$adPlayerControllerStateState$1 extends SuspendLambda implements rp2 {
    public /* synthetic */ boolean a;
    public /* synthetic */ boolean b;

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
        AdContentViewModel$adPlayerControllerStateState$1 adContentViewModel$adPlayerControllerStateState$1 = new AdContentViewModel$adPlayerControllerStateState$1(3, (g51) obj3);
        adContentViewModel$adPlayerControllerStateState$1.a = zBooleanValue;
        adContentViewModel$adPlayerControllerStateState$1.b = zBooleanValue2;
        return adContentViewModel$adPlayerControllerStateState$1.invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        boolean z2 = this.b;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        return new cb(z, z2);
    }
}
