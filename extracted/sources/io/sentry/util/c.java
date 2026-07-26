package io.sentry.util;

import io.sentry.SentryLevel;
import io.sentry.g2;
import io.sentry.i1;
import io.sentry.u0;
import java.nio.charset.Charset;
import java.util.Calendar;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public abstract class c {
    public static final Charset a = Charset.forName("UTF-8");

    public static long a(i1 i1Var, u0 u0Var, g2 g2Var) {
        try {
            b bVar = new b();
            i1Var.a(g2Var, bVar);
            return bVar.a;
        } catch (Throwable th) {
            u0Var.f(SentryLevel.ERROR, "Could not calculate size of serializable", th);
            return 0L;
        }
    }

    public static HashMap b(Calendar calendar) {
        HashMap map = new HashMap();
        map.put("year", Integer.valueOf(calendar.get(1)));
        map.put("month", Integer.valueOf(calendar.get(2)));
        map.put("dayOfMonth", Integer.valueOf(calendar.get(5)));
        map.put("hourOfDay", Integer.valueOf(calendar.get(11)));
        map.put("minute", Integer.valueOf(calendar.get(12)));
        map.put("second", Integer.valueOf(calendar.get(13)));
        return map;
    }
}
