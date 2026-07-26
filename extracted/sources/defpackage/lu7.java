package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class lu7 {
    public static final String A;
    public static final String A0;
    public static final String B;
    public static final String B0;
    public static final String C;
    public static final String C0;
    public static final String D;
    public static final String D0;
    public static final String E;
    public static final String E0;
    public static final String F;
    public static final String F0;
    public static final String G;
    public static final String G0;
    public static final String H;
    public static final String I;
    public static final String J;
    public static final String K;
    public static final String L;
    public static final String M;
    public static final String N;
    public static final String O;
    public static final String P;
    public static final String Q;
    public static final String R;
    public static final String S;
    public static final String T;
    public static final String U;
    public static final String V;
    public static final String W;
    public static final String X;
    public static final String Y;
    public static final String Z;
    public static final String a0;
    public static final ArrayList b;
    public static final String b0;
    public static final ArrayList c;
    public static final String c0;
    public static final String d;
    public static final String d0;
    public static final String e;
    public static final String e0;
    public static final String f;
    public static final String f0;
    public static final String g;
    public static final String g0;
    public static final String h;
    public static final String h0;
    public static final String i;
    public static final String i0;
    public static final String j;
    public static final String j0;
    public static final String k;
    public static final String k0;
    public static final String l;
    public static final String l0;
    public static final String m;
    public static final String m0;
    public static final String n;
    public static final String n0;
    public static final String o;
    public static final String o0;
    public static final String p;
    public static final String p0;
    public static final String q;
    public static final String q0;
    public static final String r;
    public static final String r0;
    public static final String s;
    public static final String s0;
    public static final String t;
    public static final String t0;
    public static final String u;
    public static final String u0;
    public static final String v;
    public static final String v0;
    public static final String w;
    public static final String w0;
    public static final String x;
    public static final String x0;
    public static final String y;
    public static final String y0;
    public static final String z;
    public static final String z0;
    public Context a;

    static {
        ArrayList arrayList = new ArrayList();
        b = arrayList;
        c = new ArrayList();
        d = a("ACCESS_TOKEN_ID");
        e = "UNVERSIONED_".concat("LANGUAGE");
        f = "UNVERSIONED_".concat("QUALITY_CHOSEN");
        g = "UNVERSIONED_".concat("ACCOUNT_EMAIL");
        h = "UNVERSIONED_".concat("ACCOUNT_BIND_EMAIL");
        i = "UNVERSIONED_".concat("ACCOUNT_NICKNAME");
        j = a("KEY_SHOW_NOTIFICATION_WARNING_STEPS");
        k = a("SHOULD_SHOW_NOTIFICATION_RATIONALE");
        l = "UNVERSIONED_".concat("ACCOUNT_BIO");
        m = "UNVERSIONED_".concat("ACCOUNT_AVATAR_URL");
        n = "UNVERSIONED_".concat("ACCOUNT_PHONE");
        o = "UNVERSIONED_".concat("ACCOUNT_TELEGRAM");
        p = "UNVERSIONED_".concat("ACCOUNT_KEY");
        q = "UNVERSIONED_".concat("ACCOUNT_UUID");
        r = "UNVERSIONED_".concat("ACCOUNT_USERNAME");
        s = "UNVERSIONED_".concat("KEY_ACCOUNT_PUBLIC_USER_ID");
        t = a("MYKET_LATEST_VERSION");
        u = a("MYKET_FORCE_UPDATE");
        v = a("MYKET_MESSAGE");
        w = a("MYKET_TITLE");
        x = a("MYKET_INTENT");
        y = a("MYKET_UPDATE_DIALOG_SHOWN");
        z = "UNVERSIONED_".concat("SCHEDULED_START");
        A = "UNVERSIONED_".concat("SCHEDULED_STOP");
        B = "UNVERSIONED_".concat("SCHEDULED_DOWNLOAD_ON_GPRS_ENABLE");
        C = "UNVERSIONED_".concat("APP_SERVERS");
        D = "UNVERSIONED_".concat("NEW_DOWNLOAD_SERVERS");
        E = "UNVERSIONED_".concat("FIRST_RUN_EVER");
        F = a("FIRST_RUN_AFTER_UPDATE");
        G = "UNVERSIONED_".concat("UI_FIRST_RUN_EVER");
        H = a("UI_FIRST_RUN_AFTER_UPDATE");
        I = "UNVERSIONED_".concat("MYKET_LAST_RUN_VERSION");
        J = "UNVERSIONED_".concat("MYKET_LAST_VERSION_NOTE");
        K = "UNVERSIONED_".concat("LAST_USER_ENTER_MYKET_TIME");
        L = "UNVERSIONED_".concat("LAST_USER_CHECK_UPDATES_TIME");
        M = "UNVERSIONED_".concat("UPDATE_REFRESH_TIME");
        a("LAST_DATABASE_CLEANUP_TIME");
        lw.f(null, null, arrayList.add("is_first_installation"));
        N = "is_first_installation";
        lw.f(null, null, arrayList.add("Language"));
        O = "Language";
        P = "UNVERSIONED_".concat("KEY_INBOX_BADGE_ON");
        Q = "UNVERSIONED_".concat("KEY_LAST_SHOWN_SPLASH_SCREEN");
        R = "UNVERSIONED_".concat("KEY_TUTORIAL_SHOWN");
        S = "UNVERSIONED_".concat("KEY_INTRO_SHOWN_905");
        T = "UNVERSIONED_".concat("KEY_REQUEST_PERMISSIONS_");
        U = "UNVERSIONED_".concat("REPORT_DOWNLOAD_FAIL_REASON");
        V = "UNVERSIONED_".concat("DOWNLOAD_FAIL_REASON_SAMPLE_RATE");
        W = "UNVERSIONED_".concat("SEND_REFERRER");
        X = "UNVERSIONED_".concat("HAS_REFERRER");
        Y = "UNVERSIONED_".concat("HOME_SHORTCUT_APPLICATION");
        Z = a("KEY_POP_UP_NOTIFICATION");
        a0 = "UNVERSIONED_".concat("DOWNLOAD_DIRECTORY_PATH");
        b0 = "UNVERSIONED_".concat("EXTERNAL_FILE_DIRECTORY_PATH");
        c0 = "UNVERSIONED_".concat("IGNORED_PUSH_APPLICATIONS");
        d0 = "UNVERSIONED_".concat("KEY_STARTER_ID");
        e0 = "UNVERSIONED_".concat("NIGHT_MODE");
        f0 = "UNVERSIONED_".concat("THEME_STYLE");
        g0 = "UNVERSIONED_".concat("FONT_STYLE");
        h0 = "UNVERSIONED_".concat("AUTHORIZE_DATA");
        i0 = "UNVERSIONED_".concat("ONE_SIGNAL_NEW_USER");
        j0 = "UNVERSIONED_".concat("KEY_PUSH_MESSAGE_TOKEN");
        k0 = "UNVERSIONED_".concat("TOGO_COOKIE_");
        l0 = "UNVERSIONED_".concat("XIAOMI_OPTIMIZATION");
        m0 = a("APP_UPDATE_SYNC_CACHE");
        n0 = a("update_extension_key");
        o0 = a("update_extension_empty_list_key");
        p0 = a("update_show_traffic_hint");
        q0 = "UNVERSIONED_".concat("CAMERA_FILE_NAME");
        r0 = "UNVERSIONED_".concat("KEY_BIRTHDAY_BALLOONS");
        s0 = a("KEY_LAST_SECURE_SCAN_TIME");
        t0 = a("KEY_SHOW_UPDATE_EMPTY");
        a("FIRST_DOWNLOAD_HINT_DISPLAY");
        u0 = "UNVERSIONED_".concat("INSTALL_QUEUE");
        v0 = a("IS_PACKAGE_INSTALLER_AVAILABLE");
        w0 = a("PERMISSION_ALREADY_DENIED");
        x0 = "UNVERSIONED_".concat("KEY_SCHEDULED_DOWNLOAD_ENABLE");
        y0 = "UNVERSIONED_".concat("KEY_UPDATE_PERIODIC_NEXT_ALARM");
        z0 = "UNVERSIONED_".concat("KIDS_MODE");
        A0 = "UNVERSIONED_".concat("KEY_DOWNLOAD_VPN_HINT");
        B0 = "UNVERSIONED_".concat("KEY_CLARITY_SAMPLE_RATE");
        C0 = "UNVERSIONED_".concat("APP_SPEED_CONTROL_SAMPLE_RATE");
        D0 = "UNVERSIONED_".concat("APP_SPEED_CONTROL_TIME_LIMIT");
        E0 = "UNVERSIONED_".concat("MOVIE_SPEED_CONTROL_SAMPLE_RATE");
        F0 = "UNVERSIONED_".concat("MOVIE_SPEED_CONTROL_TIME_LIMIT");
        G0 = "UNVERSIONED_".concat("KEY_UPDATE_BADGE_COUNT");
    }

    public static String a(String str) {
        return dw1.n("VERSIONED_", str);
    }

    public final boolean b(String str, boolean z2) {
        return e(str).getBoolean(str, z2);
    }

    public final int c(int i2, String str) {
        return e(str).getInt(str, i2);
    }

    public final long d(String str) {
        return e(str).getLong(str, 0L);
    }

    public final SharedPreferences e(String str) {
        if (str.startsWith("VERSIONED_")) {
            return this.a.getSharedPreferences("myket_1028", 0);
        }
        if (str.startsWith("UNVERSIONED_")) {
            return this.a.getSharedPreferences("myket_uv", 0);
        }
        if (b.contains(str)) {
            return this.a.getSharedPreferences("MyKet", 0);
        }
        if (c.contains(str)) {
            return PreferenceManager.getDefaultSharedPreferences(this.a);
        }
        throw new IllegalArgumentException("Invalid key: ".concat(str));
    }

    public final String f(String str, String str2) {
        return e(str).getString(str, str2);
    }

    public final void g(int i2, String str) {
        e(str).edit().putInt(str, i2).apply();
    }

    public final void h(long j2, String str) {
        e(str).edit().putLong(str, j2).apply();
    }

    public final void i(String str, String str2) {
        e(str).edit().putString(str, str2).apply();
    }

    public final void j(String str, boolean z2) {
        e(str).edit().putBoolean(str, z2).apply();
    }
}
