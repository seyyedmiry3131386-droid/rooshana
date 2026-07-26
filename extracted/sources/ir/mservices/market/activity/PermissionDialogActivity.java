package ir.mservices.market.activity;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.Window;
import defpackage.b56;
import defpackage.d7;
import defpackage.dt2;
import defpackage.e56;
import defpackage.hh2;
import defpackage.js3;
import defpackage.js6;
import defpackage.k68;
import defpackage.lu7;
import defpackage.lw;
import defpackage.lz2;
import defpackage.ns6;
import defpackage.p3;
import defpackage.pk5;
import defpackage.r7;
import defpackage.rk1;
import defpackage.rs6;
import defpackage.s7;
import defpackage.sj8;
import defpackage.w42;
import defpackage.y7;
import defpackage.z46;
import defpackage.zk8;
import ir.mservices.market.activity.PermissionDialogActivity;
import ir.mservices.market.core.notification.a;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.data.permission.Permission;
import ir.mservices.market.data.permission.PermissionReason;
import ir.mservices.market.data.permission.PermissionResult;
import ir.mservices.market.version2.ApplicationLauncher;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public class PermissionDialogActivity extends lz2 {
    public static final /* synthetic */ int F0 = 0;
    public lu7 A0;
    public a B0;
    public k68 C0;
    public y7 D0;
    public y7 E0;
    public b56 z0;

    static {
        rk1.a("PermissionDialogActivity");
    }

    public PermissionDialogActivity() {
        super(1);
    }

    public static boolean m0(Permission[] permissionArr) {
        for (Permission permission : permissionArr) {
            if (permission.a == 3) {
                return true;
            }
        }
        return false;
    }

    @Override // ir.mservices.market.activity.BaseNavigationContentActivity, defpackage.mm2
    public final void B(Bundle bundle, String str) {
        Parcelable[] parcelableArr;
        super.B(bundle, str);
        if (str.equalsIgnoreCase(l0())) {
            DialogDataModel dialogDataModel = (DialogDataModel) dt2.p(bundle, "BUNDLE_KEY_DATA", DialogDataModel.class);
            if ("DIALOG_KEY_PERMISSION_REASON_ACTIVITY".equalsIgnoreCase(dialogDataModel.b)) {
                Parcelable[] parcelableArrayExtra = getIntent().getParcelableArrayExtra("BUNDLE_KEY_PERMISSIONS_PARCELABLE");
                int i = 0;
                if (parcelableArrayExtra != null) {
                    Object objNewInstance = Array.newInstance((Class<?>) Permission.class, parcelableArrayExtra.length);
                    js3.n(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of ir.myket.core.utils.BundleUtils.Companion.getParcelableArray>");
                    parcelableArr = (Parcelable[]) objNewInstance;
                    System.arraycopy(parcelableArrayExtra, 0, parcelableArr, 0, parcelableArrayExtra.length);
                } else {
                    parcelableArr = null;
                }
                Permission[] permissionArr = (Permission[]) parcelableArr;
                if (permissionArr == null) {
                    return;
                }
                DialogResult dialogResult = dialogDataModel.d;
                if (dialogResult != DialogResult.a) {
                    if (dialogResult == DialogResult.b) {
                        int length = permissionArr.length;
                        while (i < length) {
                            Permission permission = permissionArr[i];
                            if (permission.d == PermissionResult.NOT_SET) {
                                permission.d = PermissionResult.DENIED;
                            }
                            i++;
                        }
                        o0(permissionArr);
                        finish();
                        return;
                    }
                    return;
                }
                if (dialogDataModel.c.getBoolean("BUNDLE_KEY_PERMISSIONS_CANCELABLE", false)) {
                    if (Build.VERSION.SDK_INT >= 33) {
                        for (Permission permission2 : permissionArr) {
                            int i2 = permission2.a;
                            if (i2 == 2 || i2 == 1) {
                                p0();
                                break;
                            }
                        }
                        if (!m0(permissionArr)) {
                            int length2 = permissionArr.length;
                            while (true) {
                                if (i >= length2) {
                                    break;
                                }
                                int i3 = permissionArr[i].a;
                                if (i3 != 2 && i3 != 1) {
                                    n0();
                                    break;
                                }
                                i++;
                            }
                        } else {
                            this.B0.h(this, 3415);
                        }
                    } else if (!m0(permissionArr)) {
                        int length3 = permissionArr.length;
                        while (true) {
                            if (i >= length3) {
                                n0();
                                break;
                            } else if (permissionArr[i].a != 4) {
                                i++;
                            } else if (this.C0.p() != null) {
                                startActivityForResult(this.C0.p(), 354);
                            } else {
                                hh2.H(new hh2(this, getString(rs6.uncatchable_intent)));
                            }
                        }
                    } else {
                        this.B0.h(this, 3415);
                    }
                    o0(permissionArr);
                    finish();
                    return;
                }
                for (Permission permission3 : permissionArr) {
                    this.A0.j(lu7.T + permission3.b, true);
                }
                getIntent().putExtra("BUNDLE_KEY_PERMISSIONS", permissionArr);
                int length4 = permissionArr.length;
                int i4 = 0;
                while (true) {
                    if (i4 >= length4) {
                        break;
                    }
                    if (permissionArr[i4].a != 4) {
                        i4++;
                    } else if (this.C0.p() != null) {
                        startActivityForResult(this.C0.p(), 354);
                    } else {
                        hh2.H(new hh2(this, getString(rs6.uncatchable_intent)));
                    }
                }
                if (Build.VERSION.SDK_INT < 33) {
                    if (m0(permissionArr)) {
                        this.B0.h(this, 354);
                        return;
                    } else {
                        this.z0.getClass();
                        d7.a(this, b56.b(permissionArr), 354);
                        return;
                    }
                }
                int length5 = permissionArr.length;
                while (i < length5) {
                    int i5 = permissionArr[i].a;
                    if (i5 == 2 || i5 == 1) {
                        if (p0()) {
                            return;
                        }
                        finish();
                        return;
                    }
                    i++;
                }
                if (m0(permissionArr)) {
                    this.I.h(this, this.E0, 354);
                } else {
                    this.z0.getClass();
                    d7.a(this, b56.b(permissionArr), 354);
                }
            }
        }
    }

    @Override // ir.mservices.market.activity.BaseContentActivity, defpackage.z80
    public final String C() {
        return getString(rs6.page_name_permission);
    }

    @Override // ir.mservices.market.activity.Hilt_BaseNavigationContentActivity, ir.mservices.market.activity.BaseContentActivity
    public final String T() {
        return getString(rs6.page_name_permission);
    }

    @Override // ir.mservices.market.activity.BaseContentActivity
    public final boolean Y() {
        return Build.VERSION.SDK_INT != 26;
    }

    public final PermissionResult k0(int i, String str) {
        int i2 = Build.VERSION.SDK_INT;
        PermissionResult permissionResult = PermissionResult.DENIED_FOREVER;
        if (i2 >= 33 && str.equals("android.permission.POST_NOTIFICATIONS") && i == 0 && a.d(this.B0.i, "download")) {
            return permissionResult;
        }
        if (i == 0) {
            return PermissionResult.GRANTED;
        }
        if (i == -1) {
            boolean zB = false;
            if (this.A0.b(lu7.T + str, false)) {
                js3.p(str, "permissionManifestId");
                int i3 = Build.VERSION.SDK_INT;
                if (i3 < 33 || (!str.equals("android.permission.WRITE_EXTERNAL_STORAGE") && !str.equals("android.permission.READ_EXTERNAL_STORAGE"))) {
                    zB = (i3 >= 33 || !str.equals("android.permission.POST_NOTIFICATIONS")) ? d7.b(this, str) : a.d(this, "download");
                }
                if (zB) {
                    return permissionResult;
                }
            }
        }
        return PermissionResult.DENIED;
    }

    public final String l0() {
        return getClass().getSimpleName() + "_" + this.O;
    }

    public final void n0() {
        Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.setData(Uri.fromParts("package", getPackageName(), null));
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(intent, 3415);
        } else {
            hh2.H(new hh2(this, getString(rs6.app_settings_failed_message)));
        }
    }

    public final void o0(Permission[] permissionArr) {
        for (Permission permission : permissionArr) {
            lw.b("All permission results must be set before posting them", null, permission.d == PermissionResult.NOT_SET);
        }
        Intent intent = new Intent();
        Bundle bundle = new Bundle();
        bundle.putParcelableArray("BUNDLE_KEY_PERMISSIONS_PARCELABLE", permissionArr);
        intent.putExtras(bundle);
        setResult(-1, intent);
    }

    @Override // ir.mservices.market.activity.BaseNavigationContentActivity, ir.mservices.market.activity.BaseContentActivity, ir.mservices.market.activity.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        c().a(this, new z46(true));
        ApplicationLauncher.f(this);
        setResult(0);
        Window window = getWindow();
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        window.setStatusBarColor(sj8.b().N);
        d(l0(), this);
        setContentView(js6.nav_content);
        j0();
        g0().e(ns6.nav_graph_permission);
        final int i = 0;
        this.D0 = (y7) K(new r7(this) { // from class: y46
            public final /* synthetic */ PermissionDialogActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.r7
            public final void g(Object obj) {
                Parcelable[] parcelableArr;
                int i2 = i;
                PermissionDialogActivity permissionDialogActivity = this.b;
                switch (i2) {
                    case 0:
                        int i3 = PermissionDialogActivity.F0;
                        permissionDialogActivity.finish();
                        break;
                    default:
                        int i4 = PermissionDialogActivity.F0;
                        permissionDialogActivity.I.a(permissionDialogActivity, ((Boolean) obj).booleanValue());
                        if (permissionDialogActivity.getIntent().getExtras() != null) {
                            Parcelable[] parcelableArrayExtra = permissionDialogActivity.getIntent().getParcelableArrayExtra("BUNDLE_KEY_PERMISSIONS_PARCELABLE");
                            if (parcelableArrayExtra != null) {
                                Object objNewInstance = Array.newInstance((Class<?>) Permission.class, parcelableArrayExtra.length);
                                js3.n(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of ir.myket.core.utils.BundleUtils.Companion.getParcelableArray>");
                                parcelableArr = (Parcelable[]) objNewInstance;
                                System.arraycopy(parcelableArrayExtra, 0, parcelableArr, 0, parcelableArrayExtra.length);
                            } else {
                                parcelableArr = null;
                            }
                            Permission[] permissionArr = (Permission[]) parcelableArr;
                            if (permissionArr != null) {
                                permissionDialogActivity.o0(permissionArr);
                            }
                            permissionDialogActivity.finish();
                        }
                        break;
                }
            }
        }, new s7(2));
        final int i2 = 1;
        this.E0 = (y7) K(new r7(this) { // from class: y46
            public final /* synthetic */ PermissionDialogActivity b;

            {
                this.b = this;
            }

            @Override // defpackage.r7
            public final void g(Object obj) {
                Parcelable[] parcelableArr;
                int i22 = i2;
                PermissionDialogActivity permissionDialogActivity = this.b;
                switch (i22) {
                    case 0:
                        int i3 = PermissionDialogActivity.F0;
                        permissionDialogActivity.finish();
                        break;
                    default:
                        int i4 = PermissionDialogActivity.F0;
                        permissionDialogActivity.I.a(permissionDialogActivity, ((Boolean) obj).booleanValue());
                        if (permissionDialogActivity.getIntent().getExtras() != null) {
                            Parcelable[] parcelableArrayExtra = permissionDialogActivity.getIntent().getParcelableArrayExtra("BUNDLE_KEY_PERMISSIONS_PARCELABLE");
                            if (parcelableArrayExtra != null) {
                                Object objNewInstance = Array.newInstance((Class<?>) Permission.class, parcelableArrayExtra.length);
                                js3.n(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of ir.myket.core.utils.BundleUtils.Companion.getParcelableArray>");
                                parcelableArr = (Parcelable[]) objNewInstance;
                                System.arraycopy(parcelableArrayExtra, 0, parcelableArr, 0, parcelableArrayExtra.length);
                            } else {
                                parcelableArr = null;
                            }
                            Permission[] permissionArr = (Permission[]) parcelableArr;
                            if (permissionArr != null) {
                                permissionDialogActivity.o0(permissionArr);
                            }
                            permissionDialogActivity.finish();
                        }
                        break;
                }
            }
        }, new s7(1));
    }

    @Override // ir.mservices.market.activity.BaseNavigationContentActivity, ir.mservices.market.activity.BaseContentActivity, ir.mservices.market.activity.Hilt_BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        y7 y7Var = this.D0;
        if (y7Var != null) {
            y7Var.b();
            this.D0 = null;
        }
        y7 y7Var2 = this.E0;
        if (y7Var2 != null) {
            y7Var2.b();
            this.E0 = null;
        }
        x(l0());
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Handler handler;
        super.onRequestPermissionsResult(i, strArr, iArr);
        Arrays.toString(strArr);
        Arrays.toString(iArr);
        if (i == 354) {
            w42 w42Var = new w42(this, strArr, iArr);
            synchronized (zk8.class) {
                handler = zk8.a;
                if (handler == null) {
                    handler = new Handler(Looper.getMainLooper());
                    zk8.a = handler;
                }
            }
            lw.f(null, null, handler.post(w42Var));
        }
    }

    @Override // ir.mservices.market.activity.BaseNavigationContentActivity, ir.mservices.market.activity.BaseContentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onStart() {
        Parcelable[] parcelableArr;
        super.onStart();
        if (getIntent().getExtras() != null) {
            Parcelable[] parcelableArrayExtra = getIntent().getParcelableArrayExtra("BUNDLE_KEY_PERMISSIONS_PARCELABLE");
            if (parcelableArrayExtra != null) {
                Object objNewInstance = Array.newInstance((Class<?>) Permission.class, parcelableArrayExtra.length);
                js3.n(objNewInstance, "null cannot be cast to non-null type kotlin.Array<T of ir.myket.core.utils.BundleUtils.Companion.getParcelableArray>");
                parcelableArr = (Parcelable[]) objNewInstance;
                System.arraycopy(parcelableArrayExtra, 0, parcelableArr, 0, parcelableArrayExtra.length);
            } else {
                parcelableArr = null;
            }
            Permission[] permissionArr = (Permission[]) parcelableArr;
            if (permissionArr == null) {
                lw.g(null, "permissions is null", null);
                finish();
                return;
            }
            for (Permission permission : permissionArr) {
                PermissionResult permissionResultK0 = k0(p3.c(this, permission.b), permission.b);
                if (permissionResultK0 == PermissionResult.GRANTED) {
                    permission.d = permissionResultK0;
                }
            }
            for (Permission permission2 : permissionArr) {
                if (permission2.d == PermissionResult.NOT_SET) {
                    q0(permissionArr);
                    return;
                }
            }
            o0(permissionArr);
            finish();
        }
    }

    public final boolean p0() {
        Intent intent = new Intent("android.settings.MANAGE_APP_ALL_FILES_ACCESS_PERMISSION");
        intent.setData(Uri.parse("package:ir.mservices.market"));
        if (intent.resolveActivity(getPackageManager()) != null) {
            this.D0.a(intent);
            return true;
        }
        hh2.H(new hh2(this, getString(rs6.app_settings_failed_message)));
        return false;
    }

    public final void q0(Permission[] permissionArr) {
        HashMap map = new HashMap();
        for (Permission permission : permissionArr) {
            PermissionResult permissionResultK0 = k0(p3.c(this, permission.b), permission.b);
            permission.d = permissionResultK0;
            if (permissionResultK0 != PermissionResult.GRANTED) {
                map.put(permission.f, permission);
            }
        }
        if (map.size() <= 0 || L().G("permission_reason") != null) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        String string = getString(rs6.denied_forever_title);
        boolean z = false;
        int i = 0;
        String str = string;
        String str2 = "";
        String str3 = str2;
        String str4 = str3;
        String str5 = str4;
        for (Permission permission2 : map.values()) {
            sb.append(permission2.c.c);
            sb.append("\n");
            if (map.size() == 1) {
                PermissionReason permissionReason = permission2.c;
                String str6 = permissionReason.b;
                i = permissionReason.a;
                z = permissionReason.d;
                String str7 = permissionReason.g;
                String str8 = permissionReason.h;
                String str9 = permissionReason.f;
                str3 = permissionReason.e;
                str2 = str7;
                str5 = str8;
                str4 = str9;
                str = str6;
            }
        }
        Bundle bundle = new Bundle();
        bundle.putParcelableArray("BUNDLE_KEY_PERMISSIONS_PARCELABLE", permissionArr);
        bundle.putBoolean("BUNDLE_KEY_PERMISSIONS_CANCELABLE", false);
        pk5.h(this, new NavIntentDirections.PermissionReason(new e56(new DialogDataModel(l0(), "DIALOG_KEY_PERMISSION_REASON_ACTIVITY", bundle), false, new PermissionReason(str, z, sb.substring(0, sb.length() - 1), str2, str3, str4, i, str5))));
    }
}
