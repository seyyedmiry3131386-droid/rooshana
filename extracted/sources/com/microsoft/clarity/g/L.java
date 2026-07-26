package com.microsoft.clarity.g;

import android.content.Context;
import android.content.SharedPreferences;
import defpackage.js3;
import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class L {
    public final Long a;
    public final SharedPreferences b;
    public final String c;
    public final String d;
    public final SharedPreferences.Editor e;
    public final Object f;

    public L(Context context, Long l) {
        js3.p(context, "context");
        this.a = l;
        SharedPreferences sharedPreferences = context.getSharedPreferences("CLARITY_SHARED_PREFERENCES", 0);
        this.b = sharedPreferences;
        this.c = "NETWORK_USAGE_TRACKING_SIZE";
        this.d = "NETWORK_USAGE_TRACKING_DATE";
        this.e = sharedPreferences.edit();
        this.f = new Object();
    }

    public final void a(long j) {
        synchronized (this.f) {
            try {
                Locale locale = Locale.UK;
                String str = DateFormat.getDateInstance(3, locale).format(new Date());
                js3.o(str, "getDateInstance(DateForm…Locale.UK).format(Date())");
                if (js3.i(this.b.getString(this.d, ""), str)) {
                    SharedPreferences.Editor editor = this.e;
                    String str2 = this.c;
                    String string = this.b.getString(this.d, "");
                    String str3 = DateFormat.getDateInstance(3, locale).format(new Date());
                    js3.o(str3, "getDateInstance(DateForm…Locale.UK).format(Date())");
                    boolean zI = js3.i(string, str3);
                    long j2 = 0;
                    if (zI) {
                        j2 = this.b.getLong(this.c, 0L);
                    }
                    editor.putLong(str2, j + j2);
                } else {
                    this.e.putString(this.d, str).putLong(this.c, j);
                }
                this.e.apply();
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
