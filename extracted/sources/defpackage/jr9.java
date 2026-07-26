package defpackage;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.res.Configuration;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.os.LocaleList;
import android.os.UserManager;
import android.text.format.DateUtils;
import android.view.PointerIcon;
import android.view.inputmethod.EditorInfo;
import androidx.media3.session.MediaSessionService;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.common.base.Optional;
import j$.util.stream.IntStream;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class jr9 {
    public static volatile Optional a;

    public static void A(li liVar, wc4 wc4Var) {
        ArrayList arrayList = new ArrayList(wu0.V(wc4Var, 10));
        Iterator it = wc4Var.a.iterator();
        while (it.hasNext()) {
            arrayList.add(((vc4) it.next()).a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        liVar.setTextLocales(new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length)));
    }

    public static void B(MediaSessionService mediaSessionService, boolean z) {
        mediaSessionService.stopForeground(z ? 1 : 2);
    }

    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036 A[Catch: all -> 0x0022, TryCatch #2 {all -> 0x0022, all -> 0x0070, blocks: (B:6:0x0007, B:8:0x000b, B:10:0x0019, B:20:0x0036, B:77:0x0186, B:15:0x0025, B:17:0x002d, B:21:0x003c, B:23:0x0042, B:25:0x0048, B:27:0x0050, B:76:0x0183, B:78:0x0189, B:79:0x018c, B:80:0x018d, B:28:0x0054, B:30:0x0058, B:31:0x0065, B:33:0x006b, B:39:0x0084, B:41:0x008a, B:42:0x0096, B:63:0x0166, B:64:0x0169, B:72:0x0178, B:71:0x0175, B:73:0x0179, B:74:0x017e, B:75:0x017f, B:36:0x0073, B:38:0x0079), top: B:88:0x0007 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.common.base.Optional C(android.content.Context r16) {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jr9.C(android.content.Context):com.google.common.base.Optional");
    }

    public static boolean a(NotificationManager notificationManager) {
        return notificationManager.areNotificationsEnabled();
    }

    public static IntStream b(CharSequence charSequence) {
        return IntStream.VivifiedWrapper.convert(charSequence.chars());
    }

    public static IntStream c(CharSequence charSequence) {
        return IntStream.VivifiedWrapper.convert(charSequence.codePoints());
    }

    public static Context d(Context context) {
        return context.createDeviceProtectedStorageContext();
    }

    public static Context e(Context context) {
        return context.createDeviceProtectedStorageContext();
    }

    public static LocaleList f(Locale... localeArr) {
        return new LocaleList(localeArr);
    }

    public static final void g(Context context, String str) {
        js3.p(context, "context");
        js3.p(str, AppMeasurementSdk.ConditionalUserProperty.NAME);
        context.deleteSharedPreferences(str);
    }

    public static File h(Context context) {
        return context.getDataDir();
    }

    public static h16 i(Long l, Long l2) {
        if (l == null && l2 == null) {
            return new h16(null, null);
        }
        if (l == null) {
            return new h16(null, j(l2.longValue()));
        }
        if (l2 == null) {
            return new h16(j(l.longValue()), null);
        }
        Calendar calendarH = e29.h();
        Calendar calendarI = e29.i(null);
        calendarI.setTimeInMillis(l.longValue());
        Calendar calendarI2 = e29.i(null);
        calendarI2.setTimeInMillis(l2.longValue());
        return calendarI.get(1) == calendarI2.get(1) ? calendarI.get(1) == calendarH.get(1) ? new h16(o(l.longValue(), Locale.getDefault()), o(l2.longValue(), Locale.getDefault())) : new h16(o(l.longValue(), Locale.getDefault()), r(l2.longValue(), Locale.getDefault())) : new h16(r(l.longValue(), Locale.getDefault()), r(l2.longValue(), Locale.getDefault()));
    }

    public static String j(long j) {
        Calendar calendarH = e29.h();
        Calendar calendarI = e29.i(null);
        calendarI.setTimeInMillis(j);
        return calendarH.get(1) == calendarI.get(1) ? o(j, Locale.getDefault()) : r(j, Locale.getDefault());
    }

    public static String k(Context context, long j, boolean z, boolean z2, boolean z3) {
        String str;
        Calendar calendarH = e29.h();
        Calendar calendarI = e29.i(null);
        calendarI.setTimeInMillis(j);
        if (calendarH.get(1) == calendarI.get(1)) {
            Locale locale = Locale.getDefault();
            str = Build.VERSION.SDK_INT >= 24 ? e29.c("MMMMEEEEd", locale).format(new Date(j)) : e29.g(0, locale).format(new Date(j));
        } else {
            Locale locale2 = Locale.getDefault();
            str = Build.VERSION.SDK_INT >= 24 ? e29.c("yMMMMEEEEd", locale2).format(new Date(j)) : e29.g(0, locale2).format(new Date(j));
        }
        if (z) {
            str = String.format(context.getString(ft6.mtrl_picker_today_description), str);
        }
        return z2 ? String.format(context.getString(ft6.mtrl_picker_start_date_description), str) : z3 ? String.format(context.getString(ft6.mtrl_picker_end_date_description), str) : str;
    }

    public static String l() {
        LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
        if (adjustedDefault.size() > 0) {
            return adjustedDefault.get(0).toLanguageTag();
        }
        return null;
    }

    public static DecimalFormatSymbols m(Locale locale) {
        return DecimalFormatSymbols.getInstance(locale);
    }

    public static LocaleList n(Configuration configuration) {
        return configuration.getLocales();
    }

    public static String o(long j, Locale locale) {
        if (Build.VERSION.SDK_INT >= 24) {
            return e29.c("MMMd", locale).format(new Date(j));
        }
        SimpleDateFormat simpleDateFormat = (SimpleDateFormat) e29.g(2, locale);
        String pattern = simpleDateFormat.toPattern();
        int iB = e29.b(1, 0, pattern, "yY");
        if (iB < pattern.length()) {
            int iB2 = e29.b(1, iB, pattern, "EMd");
            pattern = pattern.replace(pattern.substring(e29.b(-1, iB, pattern, iB2 < pattern.length() ? "EMd," : "EMd") + 1, iB2), " ").trim();
        }
        simpleDateFormat.applyPattern(pattern);
        return simpleDateFormat.format(new Date(j));
    }

    public static PointerIcon p(Context context) {
        return PointerIcon.getSystemIcon(context, 1002);
    }

    public static String q(long j) {
        return Build.VERSION.SDK_INT >= 24 ? e29.c("yMMMM", Locale.getDefault()).format(new Date(j)) : DateUtils.formatDateTime(null, j, 8228);
    }

    public static String r(long j, Locale locale) {
        return Build.VERSION.SDK_INT >= 24 ? e29.c("yMMMd", locale).format(new Date(j)) : e29.g(2, locale).format(new Date(j));
    }

    public static boolean s(Context context) {
        return context.isDeviceProtectedStorage();
    }

    public static boolean t(Context context) {
        js3.p(context, "context");
        return js3.i((Build.VERSION.SDK_INT >= 24 ? context.getResources().getConfiguration().getLocales().get(0) : context.getResources().getConfiguration().locale).getLanguage(), "fa");
    }

    public static boolean u(Activity activity2) {
        return activity2.isInMultiWindowMode();
    }

    public static boolean v(Context context) {
        return ((UserManager) context.getSystemService(UserManager.class)).isUserUnlocked();
    }

    public static void w(Notification.Action.Builder builder, boolean z) {
        builder.setAllowGeneratedReplies(z);
    }

    public static void x(EditorInfo editorInfo, wc4 wc4Var) {
        if (js3.i(wc4Var, wc4.c)) {
            editorInfo.hintLocales = null;
            return;
        }
        ArrayList arrayList = new ArrayList(wu0.V(wc4Var, 10));
        Iterator it = wc4Var.a.iterator();
        while (it.hasNext()) {
            arrayList.add(((vc4) it.next()).a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        editorInfo.hintLocales = new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }

    public static void y(Configuration configuration, yc4 yc4Var) {
        configuration.setLocales((LocaleList) yc4Var.a.b());
    }

    public static void z(Notification.Builder builder) {
        builder.setRemoteInputHistory(null);
    }
}
