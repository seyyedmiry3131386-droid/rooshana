package ir.mservices.market.setting;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.i;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.setting.SettingViewModel$removeSearchHistory$1", f = "SettingViewModel.kt", l = {116, 116}, m = "invokeSuspend", v = 1)
final class SettingViewModel$removeSearchHistory$1 extends SuspendLambda implements qp2 {
    public i a;
    public int b;
    public final /* synthetic */ SettingViewModel c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingViewModel$removeSearchHistory$1(SettingViewModel settingViewModel, g51 g51Var) {
        super(2, g51Var);
        this.c = settingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new SettingViewModel$removeSearchHistory$1(this.c, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((SettingViewModel$removeSearchHistory$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
    
        if (r1.emit(r5, r4) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r4.b
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L1e
            if (r1 == r3) goto L18
            if (r1 != r2) goto L10
            kotlin.b.b(r5)
            goto L3e
        L10:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L18:
            kotlinx.coroutines.flow.i r1 = r4.a
            kotlin.b.b(r5)
            goto L32
        L1e:
            kotlin.b.b(r5)
            ir.mservices.market.setting.SettingViewModel r5 = r4.c
            kotlinx.coroutines.flow.i r1 = r5.x
            ir.mservices.market.setting.model.b r5 = r5.t
            r4.a = r1
            r4.b = r3
            java.lang.Object r5 = r5.a(r4)
            if (r5 != r0) goto L32
            goto L3d
        L32:
            r3 = 0
            r4.a = r3
            r4.b = r2
            java.lang.Object r5 = r1.emit(r5, r4)
            if (r5 != r0) goto L3e
        L3d:
            return r0
        L3e:
            tx8 r5 = defpackage.tx8.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.setting.SettingViewModel$removeSearchHistory$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
