package io.sentry.android.replay.util;

import android.os.Build;
import defpackage.js3;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class g {
    public static String a(SystemProperties$Property systemProperties$Property) {
        String str;
        js3.p(systemProperties$Property, "key");
        if (Build.VERSION.SDK_INT < 31) {
            return "";
        }
        int i = f.a[systemProperties$Property.ordinal()];
        if (i == 1) {
            str = Build.SOC_MODEL;
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            str = Build.SOC_MANUFACTURER;
        }
        js3.m(str);
        return str;
    }
}
