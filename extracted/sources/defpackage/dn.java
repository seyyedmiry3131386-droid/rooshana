package defpackage;

import android.content.res.Configuration;
import android.os.LocaleList;

/* JADX INFO: loaded from: classes.dex */
public abstract class dn {
    public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
        LocaleList locales = configuration.getLocales();
        LocaleList locales2 = configuration2.getLocales();
        if (locales.equals(locales2)) {
            return;
        }
        configuration3.setLocales(locales2);
        configuration3.locale = configuration2.locale;
    }

    public static yc4 b(Configuration configuration) {
        return yc4.b(configuration.getLocales().toLanguageTags());
    }

    public static void c(yc4 yc4Var) {
        LocaleList.setDefault(LocaleList.forLanguageTags(yc4Var.a.a()));
    }

    public static void d(Configuration configuration, yc4 yc4Var) {
        configuration.setLocales(LocaleList.forLanguageTags(yc4Var.a.a()));
    }
}
