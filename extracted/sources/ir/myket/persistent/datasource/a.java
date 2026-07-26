package ir.myket.persistent.datasource;

import android.content.Context;
import defpackage.bj6;
import defpackage.eb1;
import defpackage.fe5;
import defpackage.g27;
import defpackage.g51;
import defpackage.js3;
import defpackage.o4;
import defpackage.ol3;
import defpackage.ox3;
import defpackage.s7;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public static final bj6 A;
    public static final bj6 B;
    public static final ol3 m;
    public static final /* synthetic */ ox3[] n;
    public static final bj6 o;
    public static final bj6 p;
    public static final bj6 q;
    public static final bj6 r;
    public static final bj6 s;
    public static final bj6 t;
    public static final bj6 u;
    public static final bj6 v;
    public static final bj6 w;
    public static final bj6 x;
    public static final bj6 y;
    public static final bj6 z;
    public final eb1 a;
    public final b b;
    public final b c;
    public final b d;
    public final b e;
    public final b f;
    public final b g;
    public final b h;
    public final b i;
    public final b j;
    public final b k;
    public final o4 l;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(a.class, "token", "getToken()Ljava/lang/String;", 0);
        g27.a.getClass();
        n = new ox3[]{mutablePropertyReference1Impl, new MutablePropertyReference1Impl(a.class, "accountId", "getAccountId()Ljava/lang/String;", 0), new MutablePropertyReference1Impl(a.class, "uuid", "getUuid()Ljava/lang/String;", 0), new MutablePropertyReference1Impl(a.class, "sessionId", "getSessionId()Ljava/lang/String;", 0), new MutablePropertyReference1Impl(a.class, "accountKey", "getAccountKey()Ljava/lang/String;", 0), new MutablePropertyReference1Impl(a.class, "isUserLoggedIn", "isUserLoggedIn()Ljava/lang/Boolean;", 0), new MutablePropertyReference1Impl(a.class, "installQueueCache", "getInstallQueueCache()Ljava/lang/String;", 0), new MutablePropertyReference1Impl(a.class, "themeStyleName", "getThemeStyleName()Ljava/lang/String;", 0), new MutablePropertyReference1Impl(a.class, "uiMode", "getUiMode()Ljava/lang/String;", 0), new MutablePropertyReference1Impl(a.class, "fontStyleName", "getFontStyleName()Ljava/lang/String;", 0), new MutablePropertyReference1Impl(a.class, "isKidsModeEnabled", "isKidsModeEnabled()Ljava/lang/Boolean;", 0), new MutablePropertyReference1Impl(a.class, "isPackageInstallerAvailable", "isPackageInstallerAvailable()Ljava/lang/Boolean;", 0), new MutablePropertyReference1Impl(a.class, "appFirstLaunch", "getAppFirstLaunch()Ljava/lang/Boolean;", 0)};
        m = new ol3(9);
        o = s7.c0("key_access_token");
        p = s7.c0("key_account_id");
        q = s7.c0("key_uu_id");
        r = s7.c0("key_session_id");
        s = s7.c0("key_account_key");
        t = s7.e("key_is_user_logged_in");
        u = s7.c0("key_install_queue_cache");
        v = s7.c0("key_app_servers");
        w = s7.c0("key_theme_style");
        x = s7.c0("key_ui_mode");
        y = s7.c0("key_font_style");
        z = s7.e("key_kids_mode");
        A = s7.e("key_app_first_launch");
        B = s7.e("key_is_package_installer_available");
    }

    public a(Context context) {
        ox3[] ox3VarArr = fe5.a;
        eb1 eb1Var = (eb1) fe5.b.a(context, fe5.a[0]);
        this.a = eb1Var;
        this.b = new b(eb1Var, o, "");
        this.c = new b(eb1Var, p, "");
        this.d = new b(eb1Var, q, "");
        this.e = new b(eb1Var, r, "");
        this.f = new b(eb1Var, s, "");
        Boolean bool = Boolean.FALSE;
        this.g = new b(eb1Var, t, bool);
        js3.p(u, "key");
        this.h = new b(eb1Var, w, "");
        this.i = new b(eb1Var, x, "");
        this.j = new b(eb1Var, y, "");
        this.k = new b(eb1Var, z, bool);
        js3.p(B, "key");
        js3.p(A, "key");
        this.l = new o4(eb1Var.b(), 13);
    }

    public final Object a(bj6 bj6Var, String str, g51 g51Var) {
        Object objA = androidx.datastore.preferences.core.b.a(this.a, new MyketDataStore$put$2(bj6Var, str, null), (ContinuationImpl) g51Var);
        return objA == CoroutineSingletons.a ? objA : tx8.a;
    }
}
