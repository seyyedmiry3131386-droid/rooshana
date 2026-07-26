package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.j256.ormlite.stmt.query.SimpleComparison;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes3.dex */
public final class q0 {
    public final Context a;
    public final Intent b;
    public int c;
    public volatile Bundle d;
    public volatile Bundle e;
    public volatile int f;
    public volatile String g;
    public volatile String h;
    public volatile HashMap i;
    public volatile List j;
    public volatile List k;
    public volatile String l;

    public q0(Context context, Intent intent) {
        js3.p(context, "context");
        this.a = context;
        this.b = intent;
    }

    public final int a() {
        if (g(4)) {
            h(4);
            this.f = this.b.getIntExtra("BUNDLE_KEY_NOTIFICATION_REQUEST_CODE", 0);
        }
        return this.f;
    }

    public final String b(int i) {
        String string = this.a.getString(i);
        js3.o(string, "getString(...)");
        return string;
    }

    public final String c() {
        String lowerCase;
        String host;
        if (g(64)) {
            h(64);
            Uri data = this.b.getData();
            if (data == null || (host = data.getHost()) == null) {
                lowerCase = null;
            } else {
                lowerCase = host.toLowerCase(Locale.ROOT);
                js3.o(lowerCase, "toLowerCase(...)");
            }
            this.h = lowerCase;
        }
        return this.h;
    }

    public final List d() {
        List listP0;
        if (g(512)) {
            h(512);
            List<String> listE = e();
            if (listE != null) {
                ArrayList arrayList = new ArrayList(wu0.V(listE, 10));
                for (String str : listE) {
                    Locale locale = Locale.getDefault();
                    js3.o(locale, "getDefault(...)");
                    String lowerCase = str.toLowerCase(locale);
                    js3.o(lowerCase, "toLowerCase(...)");
                    arrayList.add(lowerCase);
                }
                listP0 = a.P0(arrayList);
            } else {
                listP0 = null;
            }
            this.j = listP0;
        }
        return this.j;
    }

    public final List e() {
        if (g(16)) {
            h(16);
            Uri data = this.b.getData();
            this.k = data != null ? data.getPathSegments() : null;
        }
        return this.k;
    }

    public final Map f() {
        if (g(128)) {
            h(128);
            Uri data = this.b.getData();
            HashMap map = null;
            String string = data != null ? data.toString() : null;
            if (string == null || f88.n0(string)) {
                lw.g(null, null, null);
            } else {
                map = new HashMap();
                String string2 = data.toString();
                js3.o(string2, "toString(...)");
                for (String str : (String[]) f88.y0(string2, new String[]{";"}, 6).toArray(new String[0])) {
                    if (f88.c0(str, SimpleComparison.EQUAL_TO_OPERATION, false)) {
                        String[] strArr = (String[]) f88.y0(str, new String[]{SimpleComparison.EQUAL_TO_OPERATION}, 6).toArray(new String[0]);
                        if (strArr.length > 1) {
                            map.put(strArr[0], strArr[1]);
                        }
                    }
                }
            }
            this.i = map;
        }
        return this.i;
    }

    public final boolean g(int i) {
        return (this.c & i) != i;
    }

    public final void h(int i) {
        this.c = i | this.c;
    }
}
