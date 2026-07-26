package defpackage;

import android.text.TextUtils;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public final class z57 {
    public final String a;
    public final String b;
    public final String c;
    public final Map d;
    public final Map e;
    public final boolean f;
    public final String g;
    public final boolean h;
    public String i;

    public z57(String str) {
        this(str, null, null, null, null, false, false);
    }

    public final String toString() {
        return bl4.y(new StringBuilder("'"), this.g, '\'');
    }

    public z57(String str, String str2, String str3, Map map, Map map2, boolean z, boolean z2) {
        if (lw.b <= 0 && z2) {
            lw.c(str, null);
            lw.c(str2, null);
            lw.b(null, null, str.charAt(str.length() - 1) == '/');
            lw.b(null, null, str2.charAt(0) == '/');
            lw.b(null, null, str2.charAt(str2.length() - 1) == '/');
            lw.b(null, null, !TextUtils.isEmpty(str3) && str3.charAt(0) == '/');
            lw.b(null, null, !TextUtils.isEmpty(str3) && str3.charAt(str3.length() - 1) == '/');
            lw.b(null, null, !TextUtils.isEmpty(str3) && str3.charAt(str3.length() - 1) == '?');
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = map;
        this.e = map2;
        this.f = z;
        this.h = z2;
        this.g = js8.j(str, str2, str3, map, map2, z);
    }
}
