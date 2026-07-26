package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import ir.mservices.market.version2.ApplicationLauncher;
import ir.myket.common.utils.a;
import java.util.Locale;

/* JADX INFO: loaded from: classes3.dex */
public final class d04 {
    public final lu7 a;
    public String b;

    public d04(lu7 lu7Var) {
        js3.p(lu7Var, "sharedPreferencesProxy");
        this.a = lu7Var;
        String str = lu7.e;
        String strF = lu7Var.f(str, null);
        this.b = strF;
        if (strF == null) {
            String strF2 = lu7Var.f(lu7.O, null);
            this.b = strF2;
            if (strF2 != null) {
                if (strF2.equals("fa") || js3.i(this.b, "en")) {
                    lu7Var.i(str, this.b);
                } else {
                    this.b = null;
                }
            }
        }
        String str2 = this.b;
        if (str2 == null) {
            g("fa");
            return;
        }
        if (!m88.T(str2, "fa", false) && !m88.T(this.b, "en", false)) {
            lw.g(null, "Wrong language in preferences", this.b);
            g("fa");
        } else {
            String str3 = this.b;
            if (str3 != null) {
                h(str3);
            }
        }
    }

    public static void h(String str) {
        Context applicationContext = ApplicationLauncher.o.getApplicationContext();
        a aVar = a.a;
        js3.m(applicationContext);
        aVar.getClass();
        a.b(applicationContext, str);
        Locale locale = new Locale(str);
        Locale.setDefault(locale);
        Configuration configuration = new Configuration(applicationContext.getResources().getConfiguration());
        configuration.setLocale(locale);
        applicationContext.getResources().updateConfiguration(configuration, applicationContext.getResources().getDisplayMetrics());
    }

    public final void a() {
        String str;
        String language = Locale.getDefault().getLanguage();
        String language2 = ApplicationLauncher.o.getApplicationContext().getResources().getConfiguration().locale.getLanguage();
        if ((language.equals(this.b) && language2.equals(this.b)) || (str = this.b) == null) {
            return;
        }
        h(str);
    }

    public final String b() {
        String str = this.b;
        return str == null ? "" : str;
    }

    public final int c() {
        return !e() ? 1 : 0;
    }

    public final Locale d() {
        return new Locale(b());
    }

    public final boolean e() {
        return !f();
    }

    public final boolean f() {
        return b().equals("fa");
    }

    public final void g(String str) {
        js3.p(str, "language");
        h(str);
        this.b = str;
        this.a.i(lu7.e, str);
    }
}
