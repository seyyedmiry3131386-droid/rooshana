package ir.mservices.market.setting;

import defpackage.e71;
import defpackage.g51;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.setting.SettingViewModel$toggleKidsMode$1", f = "SettingViewModel.kt", l = {124, 126}, m = "invokeSuspend", v = 1)
final class SettingViewModel$toggleKidsMode$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ SettingViewModel b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SettingViewModel$toggleKidsMode$1(SettingViewModel settingViewModel, g51 g51Var) {
        super(2, g51Var);
        this.b = settingViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new SettingViewModel$toggleKidsMode$1(this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((SettingViewModel$toggleKidsMode$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x004a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            ir.mservices.market.setting.SettingViewModel r0 = r8.b
            pr7 r1 = r0.u
            kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r3 = r8.a
            tx8 r4 = defpackage.tx8.a
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L22
            if (r3 == r6) goto L1e
            if (r3 != r5) goto L16
            kotlin.b.b(r9)
            return r4
        L16:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1e:
            kotlin.b.b(r9)
            return r4
        L22:
            kotlin.b.b(r9)
            lu7 r9 = r1.a
            java.lang.String r3 = defpackage.lu7.z0
            r7 = 0
            boolean r9 = r9.b(r3, r7)
            if (r9 != 0) goto L40
            r1.e(r6)
            kotlinx.coroutines.flow.i r9 = r0.B
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r8.a = r6
            java.lang.Object r9 = r9.emit(r0, r8)
            if (r9 != r2) goto L4b
            goto L4a
        L40:
            kotlinx.coroutines.flow.i r9 = r0.z
            r8.a = r5
            java.lang.Object r9 = r9.emit(r4, r8)
            if (r9 != r2) goto L4b
        L4a:
            return r2
        L4b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.setting.SettingViewModel$toggleKidsMode$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
