package com.android.installreferrer.commons;

import android.util.Log;
import io.sentry.android.core.t0;

/* JADX INFO: loaded from: classes.dex */
public final class InstallReferrerCommons {
    public static void logVerbose(String str, String str2) {
    }

    public static void logWarn(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            t0.m(str, str2);
        }
    }
}
