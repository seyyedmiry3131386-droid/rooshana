package defpackage;

import android.os.Build;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class yc4 {
    public static final yc4 b = a(new Locale[0]);
    public final ad4 a;

    public yc4(ad4 ad4Var) {
        this.a = ad4Var;
    }

    public static yc4 a(Locale... localeArr) {
        return Build.VERSION.SDK_INT >= 24 ? new yc4(new bd4(jr9.f(localeArr))) : new yc4(new zc4(localeArr));
    }

    public static yc4 b(String str) {
        if (str == null || str.isEmpty()) {
            return b;
        }
        String[] strArrSplit = str.split(",", -1);
        int length = strArrSplit.length;
        Locale[] localeArr = new Locale[length];
        for (int i = 0; i < length; i++) {
            String str2 = strArrSplit[i];
            int i2 = xc4.a;
            localeArr[i] = Locale.forLanguageTag(str2);
        }
        return a(localeArr);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof yc4) {
            return this.a.equals(((yc4) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
