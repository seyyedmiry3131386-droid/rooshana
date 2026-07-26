package ir.mservices.market.setting.model;

import defpackage.js3;
import defpackage.k65;
import defpackage.ni7;

/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public final ni7 a;
    public final k65 b;

    public b(ni7 ni7Var, k65 k65Var) {
        js3.p(ni7Var, "searchHistorySuspendableDao");
        js3.p(k65Var, "movieSearchHistoryDao");
        this.a = ni7Var;
        this.b = k65Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.jvm.internal.ContinuationImpl r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof ir.mservices.market.setting.model.SettingRepositoryImpl$clearSearchHistory$1
            if (r0 == 0) goto L13
            r0 = r6
            ir.mservices.market.setting.model.SettingRepositoryImpl$clearSearchHistory$1 r0 = (ir.mservices.market.setting.model.SettingRepositoryImpl$clearSearchHistory$1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ir.mservices.market.setting.model.SettingRepositoryImpl$clearSearchHistory$1 r0 = new ir.mservices.market.setting.model.SettingRepositoryImpl$clearSearchHistory$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.c
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 == r4) goto L32
            if (r2 != r3) goto L2a
            kotlin.b.b(r6)
            return r6
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L32:
            kotlin.b.b(r6)
            goto L46
        L36:
            kotlin.b.b(r6)
            r0.c = r4
            ni7 r6 = r5.a
            oi7 r6 = (defpackage.oi7) r6
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L46
            goto L52
        L46:
            r0.c = r3
            k65 r6 = r5.b
            y2 r6 = (defpackage.y2) r6
            java.lang.Object r6 = r6.b(r0)
            if (r6 != r1) goto L53
        L52:
            return r1
        L53:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.setting.model.b.a(kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }
}
