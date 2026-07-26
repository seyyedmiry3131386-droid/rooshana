package androidx.privacysandbox.ads.adservices.adid;

import android.adservices.adid.AdIdManager;
import defpackage.g51;
import defpackage.oa;
import defpackage.y40;

/* JADX INFO: loaded from: classes.dex */
public abstract class AdIdManagerImplCommon extends y40 {
    public final AdIdManager s;

    public AdIdManagerImplCommon(AdIdManager adIdManager) {
        this.s = adIdManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object N(androidx.privacysandbox.ads.adservices.adid.AdIdManagerImplCommon r4, defpackage.g51<? super defpackage.oa> r5) {
        /*
            boolean r0 = r5 instanceof androidx.privacysandbox.ads.adservices.adid.AdIdManagerImplCommon$getAdId$1
            if (r0 == 0) goto L13
            r0 = r5
            androidx.privacysandbox.ads.adservices.adid.AdIdManagerImplCommon$getAdId$1 r0 = (androidx.privacysandbox.ads.adservices.adid.AdIdManagerImplCommon$getAdId$1) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            androidx.privacysandbox.ads.adservices.adid.AdIdManagerImplCommon$getAdId$1 r0 = new androidx.privacysandbox.ads.adservices.adid.AdIdManagerImplCommon$getAdId$1
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            androidx.privacysandbox.ads.adservices.adid.AdIdManagerImplCommon r4 = r0.a
            kotlin.b.b(r5)
            goto L5d
        L29:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L31:
            kotlin.b.b(r5)
            r0.a = r4
            r0.d = r3
            r4.getClass()
            om0 r5 = new om0
            g51 r0 = defpackage.ok4.I(r0)
            r5.<init>(r3, r0)
            r5.v()
            android.adservices.adid.AdIdManager r0 = r4.s
            qa r2 = new qa
            r3 = 0
            r2.<init>(r3)
            android.os.OutcomeReceiver r3 = androidx.core.os.a.a(r5)
            r0.getAdId(r2, r3)
            java.lang.Object r5 = r5.u()
            if (r5 != r1) goto L5d
            return r1
        L5d:
            android.adservices.adid.AdId r5 = defpackage.y32.b(r5)
            r4.getClass()
            oa r4 = new oa
            java.lang.String r0 = r5.getAdId()
            java.lang.String r1 = "response.adId"
            defpackage.js3.o(r0, r1)
            boolean r5 = r5.isLimitAdTrackingEnabled()
            r4.<init>(r0, r5)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.adid.AdIdManagerImplCommon.N(androidx.privacysandbox.ads.adservices.adid.AdIdManagerImplCommon, g51):java.lang.Object");
    }

    public Object M(g51<? super oa> g51Var) {
        return N(this, g51Var);
    }
}
