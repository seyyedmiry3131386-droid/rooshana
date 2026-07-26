package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.Settings;
import android.text.TextUtils;
import ir.mservices.market.activity.BaseActivity;
import ir.mservices.market.data.install.PendingInstall;
import ir.mservices.market.data.install.PostInstall;
import ir.mservices.market.data.install.PreInstall;
import ir.mservices.market.download.common.data.AppDownloadInfo;
import ir.mservices.market.pika.common.model.NearbyRepository;
import ir.mservices.market.version2.ApplicationLauncher;
import ir.mservices.market.version2.activity.ObbMoveActivity;
import ir.mservices.market.version2.download.DownloadDataModel;
import ir.mservices.market.version2.manager.install.a;
import ir.mservices.market.version2.manager.install.f;
import ir.mservices.market.version2.webapi.requestdto.DownloadUriChecksumRequestDto;
import ir.mservices.market.version2.webapi.responsedto.ConfirmDTO;
import ir.myket.callback.domain.models.CallbackUrlType;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.util.AbstractMap;
import java.util.HashMap;

/* JADX INFO: loaded from: classes3.dex */
public final class dp3 implements nr1, Application.ActivityLifecycleCallbacks {
    public final ps1 a;
    public dv2 b;
    public Context c;
    public pr7 d;
    public lu7 e;
    public k68 f;
    public a g;
    public f h;
    public final Object i = bt2.D(ir.myket.callback.manager.a.class);
    public final HashMap j = new HashMap();
    public boolean k;

    public dp3(Application application, t32 t32Var, ps1 ps1Var) {
        this.a = ps1Var;
        t32Var.l(this, false);
        application.registerActivityLifecycleCallbacks(this);
        ps1Var.u(this);
    }

    public static String B(String str) {
        return ApplicationLauncher.o.getApplicationContext().getPackageManager().getApplicationInfo(y(str), 128).publicSourceDir;
    }

    public static boolean L(Context context) {
        if (Build.VERSION.SDK_INT > 23) {
            return true;
        }
        Intent intent = new Intent();
        intent.setAction("android.content.pm.action.CONFIRM_PERMISSIONS");
        return intent.resolveActivity(context.getPackageManager()) != null;
    }

    public static boolean M(String str) {
        try {
            ApplicationLauncher.o.getApplicationContext().startActivity(ApplicationLauncher.o.getApplicationContext().getPackageManager().getLaunchIntentForPackage(y(str)));
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static boolean a(PackageInfo packageInfo, String str) {
        String[] strArr = packageInfo.requestedPermissions;
        if (strArr == null) {
            lw.g(null, "requested permission is null", "packageName: " + packageInfo.packageName);
            return false;
        }
        for (String str2 : strArr) {
            if (str2.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public static String b(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (int i = 0; i < bArr.length; i++) {
            String hexString = Integer.toHexString(bArr[i]);
            int length = hexString.length();
            if (length == 1) {
                hexString = "0".concat(hexString);
            }
            if (length > 2) {
                hexString = hexString.substring(length - 2, length);
            }
            sb.append(hexString.toUpperCase());
            if (i < bArr.length - 1) {
                sb.append(':');
            }
        }
        return sb.toString();
    }

    public static boolean c(Context context) {
        if (Build.VERSION.SDK_INT >= 26) {
            return context.getPackageManager().canRequestPackageInstalls();
        }
        try {
            return Settings.Secure.getInt(context.getContentResolver(), "install_non_market_apps") == 1;
        } catch (Settings.SettingNotFoundException unused) {
            return true;
        }
    }

    public static DownloadUriChecksumRequestDto s(String str, boolean z) {
        File file = new File(str);
        String strI = null;
        if (z) {
            try {
                String str2 = k68.e;
                strI = a77.i(str);
            } catch (Exception unused) {
            }
        }
        return new DownloadUriChecksumRequestDto(bc2.a(str), strI, file.length());
    }

    public static String w(String str) {
        return str.endsWith(".m.m.free") ? str : str.concat(".m.m.free");
    }

    public static String y(String str) {
        return str.replace(".m.m.free", "");
    }

    public final String A(PendingInstall pendingInstall) {
        return "PackageName: " + pendingInstall.getPackageName() + ", pendingVersionCode: " + pendingInstall.getVersionCode() + ", installedVersionCode: " + p(pendingInstall.getPackageName());
    }

    public final void C(DownloadDataModel downloadDataModel) {
        ps1 ps1Var = this.a;
        try {
            String str = downloadDataModel.a;
            int i = downloadDataModel.b;
            AppDownloadInfo appDownloadInfoI = ps1Var.i(str, Integer.valueOf(i));
            if (appDownloadInfoI == null ? false : appDownloadInfoI.isAllFileExist()) {
                D(str, downloadDataModel.g, Integer.valueOf(i), downloadDataModel.h);
                return;
            }
            sb7.p("DownloadManagerRemove", "remove download from installApplication() File removed from user device", null);
            Context context = this.c;
            hh2.H(new hh2(context, context != null ? context.getString(rs6.install_removed_file_message) : null));
            ps1Var.v(str);
            ps1Var.f(downloadDataModel);
        } catch (IOException e) {
            lw.g(e, "Could not install apk", "PackageName: " + downloadDataModel.a);
        }
    }

    public final void D(String str, String str2, Integer num, String str3) {
        if (!J(num.intValue(), str) || !I(num.intValue(), str)) {
            E(str, str2, num, str3);
            return;
        }
        Intent intentX = x(str, num, str2, str3, Boolean.TRUE);
        intentX.addFlags(268435456);
        this.c.startActivity(intentX);
    }

    public final void E(String str, String str2, Integer num, String str3) {
        if (!this.h.g(str)) {
            N(str, num.intValue(), "intentLaunch", null, null, null);
        }
        try {
            f(num.intValue(), str, this.f.c(str, num.intValue(), false), str3, str2);
        } catch (IOException unused) {
            Context context = this.c;
            hh2.H(new hh2(context, context != null ? context.getString(rs6.install_error_apk_install_problem) : null));
        }
    }

    public final boolean F(String str) {
        return this.c.getPackageManager().getApplicationEnabledSetting(y(str)) == 3;
    }

    public final boolean G(String str) {
        return l(y(str)) != null;
    }

    public final boolean H(String str) {
        String strReplace = str.replace(".m.m.free", "");
        return G(strReplace) && !F(strReplace);
    }

    public final boolean I(int i, String str) {
        AppDownloadInfo appDownloadInfoI = this.a.i(str, Integer.valueOf(i));
        if (appDownloadInfoI != null) {
            return PreInstall.fromString(appDownloadInfoI.getPreInstall()) == PreInstall.Default && PostInstall.fromString(appDownloadInfoI.getPostInstall()) == PostInstall.Default;
        }
        lw.g(null, "install app: downloadInfo must not be null.", "packageName:" + str + ", versionCode:" + i);
        return true;
    }

    public final boolean J(int i, String str) {
        AppDownloadInfo appDownloadInfoI = this.a.i(str, Integer.valueOf(i));
        return appDownloadInfoI != null && appDownloadInfoI.isDownloadWithData();
    }

    public final boolean K(String str) {
        return this.c.getPackageManager().getLaunchIntentForPackage(y(str)) != null;
    }

    /* JADX WARN: Type inference failed for: r7v2, types: [c24, java.lang.Object] */
    public final void N(String str, int i, String str2, Boolean bool, Boolean bool2, Boolean bool3) {
        Integer numValueOf = Integer.valueOf(i);
        ps1 ps1Var = this.a;
        AppDownloadInfo appDownloadInfoI = ps1Var.i(str, numValueOf);
        if (appDownloadInfoI == null || TextUtils.isEmpty(appDownloadInfoI.getInstallCallback())) {
            return;
        }
        String installCallback = appDownloadInfoI.getInstallCallback();
        if (TextUtils.isEmpty(installCallback)) {
            return;
        }
        int iL = ps1Var.l(str);
        if (iL == 140 || iL == 150) {
            try {
                Uri uri = Uri.parse(installCallback);
                String str3 = "?}Z9b3~~Xw_b}@-+9E=Wk]CX}Y_" + uri.getQueryParameter("guid");
                js3.p(str3, ConfirmDTO.INPUT_TYPE_TEXT);
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
                Charset charsetForName = Charset.forName("iso-8859-1");
                js3.o(charsetForName, "forName(...)");
                byte[] bytes = str3.getBytes(charsetForName);
                js3.o(bytes, "getBytes(...)");
                messageDigest.update(bytes, 0, str3.length());
                byte[] bArrDigest = messageDigest.digest();
                js3.o(bArrDigest, "digest(...)");
                Uri.Builder builderAppendQueryParameter = uri.buildUpon().appendQueryParameter("sec", vi0.a(bArrDigest, false));
                if (!TextUtils.isEmpty(str2)) {
                    builderAppendQueryParameter.appendQueryParameter("type", str2);
                }
                if (bool != null) {
                    builderAppendQueryParameter.appendQueryParameter("isUpdate", bool.toString());
                }
                if (bool2 != null) {
                    builderAppendQueryParameter.appendQueryParameter("hasPackage", bool2.toString());
                }
                if (bool3 != null) {
                    builderAppendQueryParameter.appendQueryParameter("hasComponent", bool3.toString());
                }
                ((ir.myket.callback.manager.a) this.i.getValue()).b(new ql0(builderAppendQueryParameter.toString(), CallbackUrlType.c));
            } catch (Exception e) {
                lw.g(e, "install callback failed", installCallback);
            }
        }
    }

    public final void O(BaseActivity baseActivity, int i) {
        Intent intent;
        if (Build.VERSION.SDK_INT >= 26) {
            intent = new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES");
            intent.setData(Uri.parse("package:ir.mservices.market"));
        } else {
            intent = new Intent("android.settings.SECURITY_SETTINGS");
        }
        if (intent.resolveActivity(this.c.getPackageManager()) == null) {
            lw.g(null, "InstallApplicationActivity can't resolve Setting Intent", null);
            intent = null;
        }
        if (intent != null) {
            baseActivity.startActivityForResult(intent, i);
            return;
        }
        Intent intent2 = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent2.setData(Uri.fromParts("package", NearbyRepository.SERVICE_ID, null));
        Intent intent3 = intent2.resolveActivity(this.c.getPackageManager()) != null ? intent2 : null;
        if (intent3 != null) {
            baseActivity.startActivityForResult(intent3, i);
        } else {
            hh2.H(new hh2(baseActivity, baseActivity.getString(rs6.app_settings_failed_message)));
        }
    }

    public final boolean P(String str) {
        Intent intent = new Intent();
        intent.setAction("android.settings.APPLICATION_DETAILS_SETTINGS");
        intent.addCategory("android.intent.category.DEFAULT");
        intent.setData(Uri.parse("package:" + y(str)));
        intent.addFlags(268435456);
        try {
            this.c.startActivity(intent);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public final void Q(String str) {
        try {
            Intent intent = new Intent("android.intent.action.DELETE", Uri.parse("package:" + y(str)));
            intent.setFlags(268435456);
            this.c.startActivity(intent);
        } catch (Exception e) {
            lw.g(e, "Could not launch uninstall intent", "PackageName: " + str);
        }
    }

    public final Boolean d(String str, int i, Long l) {
        PackageInfo packageInfoZ;
        if (l == null || (packageInfoZ = z(4096, str)) == null || i != packageInfoZ.versionCode) {
            return null;
        }
        if (l.longValue() >= 0) {
            return Boolean.valueOf(!a(packageInfoZ, "ir.mservices.market.BILLING"));
        }
        try {
            return Boolean.valueOf(a(packageInfoZ, new String(wn5.y(this.c.getResources().getString(rs6.force_update_permission)), "UTF-8")));
        } catch (Exception e) {
            lw.g(e, "cannot decode permission", null);
            return Boolean.FALSE;
        }
    }

    public final void e(int i, String str) {
        this.j.remove(new AbstractMap.SimpleEntry(str, Integer.valueOf(i)));
        t32.b().g(new cp3());
    }

    public final void f(int i, String str, String str2, String str3, String str4) {
        if (!new File(str2).exists()) {
            lw.g(null, "Call installApk() but file not exist!, isAppInstalled: " + G(str), null);
            return;
        }
        AppDownloadInfo appDownloadInfoI = this.a.i(str, Integer.valueOf(i));
        if (appDownloadInfoI == null) {
            lw.g(null, "install app: downloadInfo must not be null.", "packageName:" + str + ", versionCode:" + i);
            return;
        }
        PostInstall postInstallFromString = PostInstall.fromString(appDownloadInfoI.getPostInstall());
        PreInstall preInstallFromString = PreInstall.fromString(appDownloadInfoI.getPreInstall());
        if (this.k && this.h.g(str) && preInstallFromString != PreInstall.Default) {
            this.h.f(new PendingInstall(str2, str, postInstallFromString, str3, str4, preInstallFromString, i, appDownloadInfoI.getPostInstallIntent(), appDownloadInfoI.getPostInstallPackageName()), appDownloadInfoI);
            return;
        }
        PreInstall preInstall = PreInstall.Default;
        if (preInstallFromString == preInstall && postInstallFromString == PostInstall.Default) {
            Intent intentA = fg5.a(this.c, new File(str2));
            intentA.addFlags(268435456);
            intentA.putExtra("android.intent.extra.NOT_UNKNOWN_SOURCE", true);
            intentA.putExtra("android.intent.extra.INSTALLER_PACKAGE_NAME", NearbyRepository.SERVICE_ID);
            ApplicationLauncher.o.getApplicationContext().startActivity(intentA);
            return;
        }
        boolean zB = this.e.b(lu7.v0, true);
        if (preInstallFromString != preInstall && zB) {
            this.g.i(str);
        }
        String postInstallIntent = appDownloadInfoI.getPostInstallIntent();
        String postInstallPackageName = appDownloadInfoI.getPostInstallPackageName();
        if (preInstallFromString == PreInstall.Package && postInstallFromString == PostInstall.Default) {
            lw.g(null, "post install must not be default, in preInstall: PackageInstaller", null);
            postInstallFromString = PostInstall.ShowDialog;
        }
        try {
            lw.b(null, null, TextUtils.isEmpty(str));
            lw.b(null, null, TextUtils.isEmpty(str2));
            lw.d(null, null, postInstallFromString);
            lw.d(null, null, preInstallFromString);
            PendingInstall pendingInstall = new PendingInstall(str2, str, postInstallFromString, str3, str4, preInstallFromString, i, postInstallIntent, postInstallPackageName);
            sb7.p("AddDownload", "Install application", A(pendingInstall));
            this.g.a(pendingInstall);
        } catch (InterruptedException e) {
            lw.g(e, "Interrupted exception when putting in installPendingQueue!", "PackageName: ".concat(str));
        }
    }

    public final Intent g(String str) {
        Intent intentA = fg5.a(this.c, new File(str));
        intentA.putExtra("android.intent.extra.NOT_UNKNOWN_SOURCE", true);
        intentA.putExtra("android.intent.extra.RETURN_RESULT", true);
        intentA.putExtra("android.intent.extra.INSTALLER_PACKAGE_NAME", NearbyRepository.SERVICE_ID);
        return intentA;
    }

    public final long h(String str) {
        ApplicationInfo applicationInfoL = l(y(str));
        if (applicationInfoL == null || applicationInfoL.publicSourceDir == null) {
            return 0L;
        }
        return new File(applicationInfoL.publicSourceDir).length();
    }

    public final Drawable i(String str) {
        try {
            return this.c.getPackageManager().getApplicationIcon(str.replace(".m.m.free", ""));
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public final Bitmap k(String str) {
        try {
            return this.b.b(this.c.getPackageManager().getApplicationIcon(y(str)));
        } catch (PackageManager.NameNotFoundException e) {
            e.getMessage();
            return null;
        } catch (Exception e2) {
            e2.getMessage();
            return null;
        }
    }

    public final ApplicationInfo l(String str) {
        try {
            return this.c.getPackageManager().getApplicationInfo(y(str), 0);
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return null;
        }
    }

    public final String m(String str) {
        try {
            ApplicationInfo applicationInfoL = l(y(str));
            if (applicationInfoL != null) {
                return this.c.getPackageManager().getApplicationLabel(applicationInfoL).toString();
            }
        } catch (Exception unused) {
        }
        return "";
    }

    @Override // defpackage.nr1
    public final void n(es1 es1Var, int i) {
        AppDownloadInfo appDownloadInfoE;
        if (i == 251 && (appDownloadInfoE = this.a.e(es1Var)) != null && appDownloadInfoE.getStatus() == 140) {
            sb7.p("MyketInstallManager", "InstallApplication() called in onInfoChange", "PackageName: " + appDownloadInfoE.getPackageName());
            D(appDownloadInfoE.getPackageName(), appDownloadInfoE.getTitle(), Integer.valueOf(appDownloadInfoE.getVersionCode()), appDownloadInfoE.getIconPath());
        }
    }

    public final String o(String str) {
        PackageInfo packageInfoZ = z(0, y(str));
        if (packageInfoZ != null) {
            return packageInfoZ.versionName;
        }
        return null;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity2) {
        this.k = false;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity2) {
        this.k = true;
    }

    public void onEvent(ly5 ly5Var) {
        boolean zCancelDownload;
        Intent intent = ly5Var.b;
        String str = ly5Var.a;
        if (intent.getAction().equals("android.intent.action.PACKAGE_ADDED") || intent.getAction().equals("android.intent.action.PACKAGE_REPLACED")) {
            boolean zEquals = intent.getAction().equals("android.intent.action.PACKAGE_ADDED");
            boolean zCancelDownload2 = false;
            ps1 ps1Var = this.a;
            if (zEquals && !TextUtils.isEmpty(str) && !intent.getBooleanExtra("android.intent.extra.REPLACING", false) && this.d.a.b(lu7.Y, false) && ps1Var.l(str) == 140 && K(str)) {
                Intent launchIntentForPackage = this.c.getPackageManager().getLaunchIntentForPackage(str.replace(".m.m.free", ""));
                launchIntentForPackage.addFlags(268435456);
                launchIntentForPackage.addFlags(67108864);
                Intent intent2 = new Intent();
                intent2.putExtra("android.intent.extra.shortcut.INTENT", launchIntentForPackage);
                intent2.putExtra("android.intent.extra.shortcut.NAME", m(str));
                intent2.putExtra("android.intent.extra.shortcut.ICON", k(str));
                intent2.setAction("com.android.launcher.action.INSTALL_SHORTCUT");
                this.c.sendBroadcast(intent2);
            }
            this.g.h(w(str));
            this.g.h(str.replace(".m.m.free", ""));
            AppDownloadInfo appDownloadInfoI = ps1Var.i(str.replace(".m.m.free", ""), null);
            xl5 xl5Var = ps1Var.b;
            if (appDownloadInfoI != null) {
                lw.d(null, null, appDownloadInfoI);
                zCancelDownload = appDownloadInfoI.cancelDownload(xl5Var);
            } else {
                zCancelDownload = false;
            }
            if (!zCancelDownload) {
                AppDownloadInfo appDownloadInfoI2 = ps1Var.i(w(str), null);
                if (appDownloadInfoI2 != null) {
                    lw.d(null, null, appDownloadInfoI2);
                    zCancelDownload2 = appDownloadInfoI2.cancelDownload(xl5Var);
                }
                if (!zCancelDownload2) {
                    return;
                }
            }
            sb7.p("MyketInstallManager", "App install and download Reset", "Packagename: ".concat(str));
        }
    }

    public final Integer p(String str) {
        PackageInfo packageInfoZ = z(0, y(str));
        if (packageInfoZ != null) {
            return Integer.valueOf(packageInfoZ.versionCode);
        }
        return null;
    }

    public final String q(String str) {
        int i = Build.VERSION.SDK_INT;
        PackageInfo packageInfoZ = z(i >= 28 ? 134217728 : 64, str);
        if (packageInfoZ == null) {
            lw.g(null, "InstallManager, getSigning, packageInfo=null", "Packagename=" + str);
            return "";
        }
        try {
            return b(MessageDigest.getInstance("SHA1").digest(((X509Certificate) CertificateFactory.getInstance("X509").generateCertificate(new ByteArrayInputStream((i >= 28 ? packageInfoZ.signingInfo.getApkContentsSigners() : packageInfoZ.signatures)[0].toByteArray()))).getEncoded()));
        } catch (Exception e) {
            lw.g(e, "InstallManager, getCertificateSHA1Fingerprint, Error", "Packagename=" + str);
            return "";
        }
    }

    public final String r(int i, String str) {
        return (String) this.j.get(new AbstractMap.SimpleEntry(str, Integer.valueOf(i)));
    }

    public final long t(String str) {
        ApplicationInfo applicationInfoL = l(str.replace(".m.m.free", ""));
        long length = 0;
        if (applicationInfoL == null || applicationInfoL.publicSourceDir == null) {
            return 0L;
        }
        File file = new File(applicationInfoL.publicSourceDir);
        String[] strArr = applicationInfoL.splitPublicSourceDirs;
        if (strArr != null) {
            for (String str2 : strArr) {
                length += new File(str2).length();
            }
        }
        return file.length() + length;
    }

    public final String u(String str) {
        try {
            return this.c.getPackageManager().getApplicationLabel(this.c.getPackageManager().getPackageInfo(y(str), 0).applicationInfo).toString();
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public final String v(String str) {
        try {
            return Build.VERSION.SDK_INT < 30 ? this.c.getPackageManager().getInstallerPackageName(y(str)) : this.c.getPackageManager().getInstallSourceInfo(y(str)).getInstallingPackageName();
        } catch (Exception unused) {
            return "";
        }
    }

    public final Intent x(String str, Integer num, String str2, String str3, Boolean bool) {
        Intent intent = new Intent(this.c, (Class<?>) ObbMoveActivity.class);
        intent.putExtra("packageName", str);
        intent.putExtra("BUNDLE_KEY_VERSION_CODE", num);
        intent.putExtra("BUNDLE_KEY_TITLE", str2);
        intent.putExtra("BUNDLE_KEY_ICON_PATH", str3);
        intent.putExtra("IS_DEFAULT_SCENARIO", bool);
        return intent;
    }

    public final PackageInfo z(int i, String str) {
        try {
            return this.c.getPackageManager().getPackageInfo(y(str), i);
        } catch (PackageManager.NameNotFoundException | Exception unused) {
            return null;
        }
    }

    @Override // defpackage.nr1
    public final void j(bs1 bs1Var) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity2) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity2) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity2) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity2, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity2, Bundle bundle) {
    }
}
