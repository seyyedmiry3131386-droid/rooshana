package androidx.privacysandbox.ads.adservices.appsetid;

import android.adservices.appsetid.AppSetIdManager;
import defpackage.g51;
import defpackage.is3;
import defpackage.ss;

/* JADX INFO: loaded from: classes.dex */
public abstract class AppSetIdManagerImplCommon extends is3 {
    public final AppSetIdManager u;

    public AppSetIdManagerImplCommon(AppSetIdManager appSetIdManager) {
        this.u = appSetIdManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object S(androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManagerImplCommon r5, defpackage.g51<? super defpackage.ss> r6) {
        /*
            boolean r0 = r6 instanceof androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManagerImplCommon$getAppSetId$1
            if (r0 == 0) goto L13
            r0 = r6
            androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManagerImplCommon$getAppSetId$1 r0 = (androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManagerImplCommon$getAppSetId$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManagerImplCommon$getAppSetId$1 r0 = new androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManagerImplCommon$getAppSetId$1
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManagerImplCommon r5 = r0.a
            kotlin.b.b(r6)
            goto L5d
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.b.b(r6)
            r0.a = r5
            r0.d = r3
            r5.getClass()
            om0 r6 = new om0
            g51 r0 = defpackage.ok4.I(r0)
            r6.<init>(r3, r0)
            r6.v()
            android.adservices.appsetid.AppSetIdManager r0 = r5.u
            qa r2 = new qa
            r4 = 0
            r2.<init>(r4)
            android.os.OutcomeReceiver r4 = androidx.core.os.a.a(r6)
            r0.getAppSetId(r2, r4)
            java.lang.Object r6 = r6.u()
            if (r6 != r1) goto L5d
            return r1
        L5d:
            android.adservices.appsetid.AppSetId r6 = (android.adservices.appsetid.AppSetId) r6
            r5.getClass()
            int r5 = r6.getScope()
            java.lang.String r0 = "response.id"
            if (r5 != r3) goto L77
            ss r5 = new ss
            java.lang.String r6 = r6.getId()
            defpackage.js3.o(r6, r0)
            r5.<init>(r6, r3)
            return r5
        L77:
            ss r5 = new ss
            java.lang.String r6 = r6.getId()
            defpackage.js3.o(r6, r0)
            r0 = 2
            r5.<init>(r6, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManagerImplCommon.S(androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManagerImplCommon, g51):java.lang.Object");
    }

    public Object R(g51<? super ss> g51Var) {
        return S(this, g51Var);
    }
}
