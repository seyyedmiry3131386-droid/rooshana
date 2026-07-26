package io.sentry.android.core;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import io.sentry.SentryLevel;
import io.sentry.e5;
import io.sentry.h4;

/* JADX INFO: loaded from: classes3.dex */
public final class SentryInitProvider extends n0 {
    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        if (SentryInitProvider.class.getName().equals(providerInfo.authority)) {
            throw new IllegalStateException("An applicationId is required to fulfill the manifest placeholder.");
        }
        super.attachInfo(context, providerInfo);
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        Bundle bundle;
        io.sentry.android.core.performance.g.e(this);
        t tVar = new t(3);
        Context context = getContext();
        if (context == null) {
            tVar.i(SentryLevel.FATAL, "App. Context from ContentProvider is null", new Object[0]);
            io.sentry.android.core.performance.g.f(this);
            return false;
        }
        try {
            ApplicationInfo applicationInfo = Build.VERSION.SDK_INT >= 33 ? (ApplicationInfo) i0.d.b(context) : (ApplicationInfo) i0.e.b(context);
            bundle = applicationInfo != null ? applicationInfo.metaData : null;
        } catch (Throwable th) {
            tVar.f(SentryLevel.ERROR, "Failed to read auto-init from android manifest metadata.", th);
        }
        boolean zF = bundle != null ? t0.f(bundle, tVar, "io.sentry.auto-init", true) : true;
        if (zF && !i0.c(context)) {
            f1.c(context, tVar, new io.sentry.u1(20));
            e5.d().a("AutoInit");
        }
        io.sentry.android.core.performance.g.f(this);
        return true;
    }

    @Override // android.content.ContentProvider
    public final void shutdown() {
        h4.a();
    }
}
