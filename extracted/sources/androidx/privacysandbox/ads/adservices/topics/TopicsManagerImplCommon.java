package androidx.privacysandbox.ads.adservices.topics;

import android.adservices.topics.GetTopicsRequest;
import android.adservices.topics.GetTopicsResponse;
import android.adservices.topics.TopicsManager;
import defpackage.g51;
import defpackage.hz1;
import defpackage.is2;
import defpackage.j97;
import defpackage.js2;
import defpackage.js3;

/* JADX INFO: loaded from: classes.dex */
public abstract class TopicsManagerImplCommon extends j97 {
    public TopicsManagerImplCommon(TopicsManager topicsManager) {
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object j(androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon r3, defpackage.is2 r4, defpackage.g51<? super defpackage.js2> r5) {
        /*
            boolean r4 = r5 instanceof androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon$getTopics$1
            if (r4 == 0) goto L13
            r4 = r5
            androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon$getTopics$1 r4 = (androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon$getTopics$1) r4
            int r0 = r4.c
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r0 & r1
            if (r2 == 0) goto L13
            int r0 = r0 - r1
            r4.c = r0
            goto L18
        L13:
            androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon$getTopics$1 r4 = new androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon$getTopics$1
            r4.<init>(r3, r5)
        L18:
            java.lang.Object r5 = r4.a
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r4 = r4.c
            r0 = 0
            if (r4 == 0) goto L32
            r3 = 1
            if (r4 != r3) goto L2a
            kotlin.b.b(r5)
            android.adservices.topics.GetTopicsResponse r5 = (android.adservices.topics.GetTopicsResponse) r5
            throw r0
        L2a:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L32:
            kotlin.b.b(r5)
            r3.g()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon.j(androidx.privacysandbox.ads.adservices.topics.TopicsManagerImplCommon, is2, g51):java.lang.Object");
    }

    public abstract GetTopicsRequest g();

    public js2 h(GetTopicsResponse getTopicsResponse) {
        js3.p(getTopicsResponse, "response");
        return hz1.a(getTopicsResponse);
    }

    public Object i(is2 is2Var, g51<? super js2> g51Var) {
        return j(this, is2Var, g51Var);
    }
}
