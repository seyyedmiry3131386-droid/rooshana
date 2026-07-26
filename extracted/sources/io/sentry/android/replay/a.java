package io.sentry.android.replay;

import defpackage.bp2;
import defpackage.js3;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.r3;
import j$.util.DesugarCollections;
import java.util.HashSet;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.text.Regex;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements r3 {
    public static final Object c = kotlin.a.b(LazyThreadSafetyMode.c, new bp2() { // from class: io.sentry.android.replay.DefaultReplayBreadcrumbConverter$Companion$snakecasePattern$2
        @Override // defpackage.bp2
        public final Object invoke() {
            return new Regex("_[a-z]");
        }
    });
    public static final HashSet d;
    public String a;
    public final Map b;

    static {
        HashSet hashSet = new HashSet();
        hashSet.add("status_code");
        hashSet.add("method");
        hashSet.add("response_content_length");
        hashSet.add("request_content_length");
        hashSet.add("http.response_content_length");
        hashSet.add("http.request_content_length");
        d = hashSet;
    }

    public a(SentryAndroidOptions sentryAndroidOptions) {
        js3.p(sentryAndroidOptions, "options");
        this.b = DesugarCollections.synchronizedMap(new DefaultReplayBreadcrumbConverter$httpNetworkDetails$1());
        sentryAndroidOptions.setBeforeBreadcrumb(new io.sentry.internal.debugmeta.c(this, sentryAndroidOptions.getBeforeBreadcrumb(), 9));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02ad  */
    /* JADX WARN: Type inference failed for: r3v4, types: [c24, java.lang.Object] */
    @Override // io.sentry.r3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final io.sentry.rrweb.b a(io.sentry.f r15) {
        /*
            Method dump skipped, instruction units count: 1024
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: io.sentry.android.replay.a.a(io.sentry.f):io.sentry.rrweb.b");
    }
}
