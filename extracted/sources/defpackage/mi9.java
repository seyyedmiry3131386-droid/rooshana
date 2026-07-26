package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.text.TextUtils;
import io.sentry.android.core.t0;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public abstract class mi9 {
    public static final fw7 a = new fw7(0);
    public static Locale b;

    public static String a(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(dt6.common_google_play_services_install_title);
            case 2:
                return resources.getString(dt6.common_google_play_services_update_title);
            case 3:
                return resources.getString(dt6.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                t0.d("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return e(context, "common_google_play_services_invalid_account_title");
            case 7:
                t0.d("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return e(context, "common_google_play_services_network_error_title");
            case 8:
                t0.d("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                t0.d("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                t0.d("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                t0.d("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 22);
                sb.append("Unexpected error code ");
                sb.append(i);
                t0.d("GoogleApiAvailability", sb.toString());
                return null;
            case 16:
                t0.d("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                t0.d("GoogleApiAvailability", "The specified account could not be signed in.");
                return e(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                t0.d("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return e(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String b(Context context, int i) {
        Resources resources = context.getResources();
        String strC = c(context);
        if (i == 1) {
            return resources.getString(dt6.common_google_play_services_install_text, strC);
        }
        if (i == 2) {
            return xq2.y(context) ? resources.getString(dt6.common_google_play_services_wear_update_text) : resources.getString(dt6.common_google_play_services_update_text, strC);
        }
        if (i == 3) {
            return resources.getString(dt6.common_google_play_services_enable_text, strC);
        }
        if (i == 5) {
            return d(context, "common_google_play_services_invalid_account_text", strC);
        }
        if (i == 7) {
            return d(context, "common_google_play_services_network_error_text", strC);
        }
        if (i == 9) {
            return resources.getString(dt6.common_google_play_services_unsupported_text, strC);
        }
        if (i == 20) {
            return d(context, "common_google_play_services_restricted_profile_text", strC);
        }
        switch (i) {
            case 16:
                return d(context, "common_google_play_services_api_unavailable_text", strC);
            case 17:
                return d(context, "common_google_play_services_sign_in_failed_text", strC);
            case 18:
                return resources.getString(dt6.common_google_play_services_updating_text, strC);
            default:
                return resources.getString(et6.common_google_play_services_unknown_issue, strC);
        }
    }

    public static String c(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = (Context) sg9.a(context).a;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String d(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String strE = e(context, str);
        if (strE == null) {
            strE = resources.getString(et6.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, strE, str2);
    }

    public static String e(Context context, String str) {
        Resources resourcesForApplication;
        fw7 fw7Var = a;
        synchronized (fw7Var) {
            try {
                Configuration configuration = context.getResources().getConfiguration();
                Locale locale = (Build.VERSION.SDK_INT >= 24 ? new yc4(new bd4(jr9.n(configuration))) : yc4.a(configuration.locale)).a.get(0);
                if (!locale.equals(b)) {
                    fw7Var.clear();
                    b = locale;
                }
                String str2 = (String) fw7Var.get(str);
                if (str2 != null) {
                    return str2;
                }
                int i = lu2.e;
                try {
                    resourcesForApplication = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resourcesForApplication = null;
                }
                if (resourcesForApplication != null) {
                    int identifier = resourcesForApplication.getIdentifier(str, "string", "com.google.android.gms");
                    if (identifier == 0) {
                        StringBuilder sb = new StringBuilder(str.length() + 18);
                        sb.append("Missing resource: ");
                        sb.append(str);
                        t0.m("GoogleApiAvailability", sb.toString());
                    } else {
                        String string = resourcesForApplication.getString(identifier);
                        if (!TextUtils.isEmpty(string)) {
                            fw7Var.put(str, string);
                            return string;
                        }
                        StringBuilder sb2 = new StringBuilder(str.length() + 20);
                        sb2.append("Got empty resource: ");
                        sb2.append(str);
                        t0.m("GoogleApiAvailability", sb2.toString());
                    }
                }
                return null;
            } finally {
            }
        }
    }
}
