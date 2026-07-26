package ir.myket.common.utils;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import defpackage.aj6;
import defpackage.bj6;
import defpackage.bt2;
import defpackage.d87;
import defpackage.e87;
import defpackage.g27;
import defpackage.js3;
import defpackage.kf1;
import defpackage.ox3;
import defpackage.s7;
import defpackage.tv8;
import defpackage.tx8;
import defpackage.ug1;
import defpackage.up1;
import java.util.Locale;
import kotlin.jvm.internal.PropertyReference2Impl;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public static final a a;
    public static final /* synthetic */ ox3[] b;
    public static final bj6 c;
    public static final aj6 d;

    static {
        PropertyReference2Impl propertyReference2Impl = new PropertyReference2Impl(a.class, "localeDataStore", "getLocaleDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;");
        g27.a.getClass();
        b = new ox3[]{propertyReference2Impl};
        a = new a();
        c = s7.c0("key_language");
        d = tv8.v("locale_prefs", null, null, 14);
    }

    public static Language a(Context context) {
        ug1 ug1Var = up1.a;
        return (Language) bt2.Q(kf1.c, new LocaleManager$getLanguage$1(context, null));
    }

    public static void b(Context context, String str) {
        js3.p(str, "language");
        ug1 ug1Var = up1.a;
        bt2.Q(kf1.c, new LocaleManager$setLanguage$1(str, context, null));
    }

    public static Context c(Context context) {
        Object d87Var;
        String lowerCase = a(context).name().toLowerCase(Locale.ROOT);
        js3.o(lowerCase, "toLowerCase(...)");
        Locale localeForLanguageTag = Locale.forLanguageTag(lowerCase);
        Locale.setDefault(localeForLanguageTag);
        Configuration configuration = new Configuration(context.getResources().getConfiguration());
        if (Build.VERSION.SDK_INT >= 24) {
            configuration.setLocale(localeForLanguageTag);
            d87Var = new e87(tx8.a);
        } else {
            d87Var = new d87();
        }
        if (d87Var instanceof d87) {
            configuration.locale = localeForLanguageTag;
        }
        Context contextCreateConfigurationContext = context.createConfigurationContext(configuration);
        js3.o(contextCreateConfigurationContext, "createConfigurationContext(...)");
        return contextCreateConfigurationContext;
    }
}
