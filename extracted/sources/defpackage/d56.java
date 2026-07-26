package defpackage;

import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import ir.mservices.market.activity.PermissionDialogActivity;
import ir.mservices.market.core.notification.a;
import ir.mservices.market.data.permission.Permission;
import ir.mservices.market.data.permission.PermissionReasonId;
import ir.mservices.market.data.permission.Quality;
import ir.mservices.market.movie.data.webapi.CommonDataKt;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class d56 {
    public final b56 a;
    public final lu7 b;
    public final dr1 c;
    public final wo5 d;

    public d56(b56 b56Var, lu7 lu7Var, dr1 dr1Var, wo5 wo5Var) {
        js3.p(b56Var, "permissionFactory");
        js3.p(lu7Var, "sharedPreferencesProxy");
        js3.p(dr1Var, "notificationController");
        this.a = b56Var;
        this.b = lu7Var;
        this.c = dr1Var;
        this.d = wo5Var;
        t32.b().l(this, false);
    }

    public static boolean c(Context context, String str) {
        js3.p(context, "context");
        js3.p(str, "permissionManifestId");
        return p3.c(context, str) == 0;
    }

    public static boolean f(FragmentActivity fragmentActivity, Permission[] permissionArr) {
        js3.p(permissionArr, "permissions");
        if (permissionArr.length == 0) {
            return false;
        }
        Intent intent = new Intent(fragmentActivity, (Class<?>) PermissionDialogActivity.class);
        Bundle bundle = new Bundle();
        bundle.putParcelableArray("BUNDLE_KEY_PERMISSIONS_PARCELABLE", permissionArr);
        intent.putExtras(bundle);
        fragmentActivity.startActivityForResult(intent, 9898);
        return true;
    }

    public final void a(Activity activity2, boolean z) {
        if (z) {
            this.d.a.b("notification_permission", "type", CommonDataKt.HOME_MOVIE_ADDAX_TYPE);
            return;
        }
        if (Build.VERSION.SDK_INT < 33 ? a.d(activity2, "download") : d7.b(activity2, "android.permission.POST_NOTIFICATIONS")) {
            return;
        }
        this.b.j(lu7.k, true);
    }

    public final boolean b(Context context, int i) {
        js3.p(context, "context");
        Resources resources = context.getResources();
        this.a.getClass();
        String str = b56.a(resources, i, PermissionReasonId.a, Quality.MANDATORY).b;
        js3.o(str, "getManifestId(...)");
        return c(context, str);
    }

    public final void d(FragmentActivity fragmentActivity, PermissionReasonId permissionReasonId) {
        Resources resources = fragmentActivity.getResources();
        this.a.getClass();
        f(fragmentActivity, new Permission[]{b56.a(resources, 3, permissionReasonId, Quality.OPTIONAL)});
    }

    public final void e(FragmentActivity fragmentActivity, int... iArr) {
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            Resources resources = fragmentActivity.getResources();
            this.a.getClass();
            arrayList.add(b56.a(resources, i, PermissionReasonId.a, Quality.MANDATORY));
        }
        f(fragmentActivity, (Permission[]) arrayList.toArray(new Permission[0]));
    }

    public final void g(FragmentActivity fragmentActivity, lk2 lk2Var) {
        if (!b(fragmentActivity, 3)) {
            h(fragmentActivity, lk2Var, 9898);
            return;
        }
        if (!a.d(((a) this.c.get()).i, "vpn") || Build.VERSION.SDK_INT < 26) {
            return;
        }
        Object systemService = fragmentActivity.getSystemService("notification");
        js3.n(systemService, "null cannot be cast to non-null type android.app.NotificationManager");
        NotificationChannel notificationChannel = ((NotificationManager) systemService).getNotificationChannel("vpn");
        if (notificationChannel == null || notificationChannel.getImportance() == 0) {
            Intent intent = new Intent("android.settings.CHANNEL_NOTIFICATION_SETTINGS");
            intent.putExtra("android.provider.extra.APP_PACKAGE", fragmentActivity.getPackageName());
            intent.putExtra("android.provider.extra.CHANNEL_ID", "vpn");
            fragmentActivity.startActivity(intent);
        }
    }

    public final void h(Activity activity2, t7 t7Var, int i) {
        dr1 dr1Var = this.c;
        if (!a.d(((a) dr1Var.get()).i, "download")) {
            hh2.H(new hh2(activity2, activity2.getString(rs6.notification_already_activated)));
            return;
        }
        if (this.b.b(lu7.k, false)) {
            ((a) dr1Var.get()).h(activity2, i);
            return;
        }
        if (b(activity2, 3)) {
            if (a.d(((a) dr1Var.get()).i, "download")) {
                ((a) dr1Var.get()).h(activity2, i);
            }
        } else if (Build.VERSION.SDK_INT < 33) {
            ((a) dr1Var.get()).h(activity2, i);
        } else if (t7Var != null) {
            t7Var.a("android.permission.POST_NOTIFICATIONS");
        }
    }

    public final void onEvent(f60 f60Var) {
        js3.p(f60Var, "event");
        if (f60Var.a != 100 || a.d(((a) this.c.get()).i, "download")) {
            return;
        }
        this.d.a.b("notification_permission", "type", CommonDataKt.HOME_MOVIE_ADDAX_TYPE);
    }
}
