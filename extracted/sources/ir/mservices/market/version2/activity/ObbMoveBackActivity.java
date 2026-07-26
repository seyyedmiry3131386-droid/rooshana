package ir.mservices.market.version2.activity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import defpackage.a77;
import defpackage.dt2;
import defpackage.k68;
import defpackage.lq5;
import defpackage.lw;
import defpackage.mz2;
import defpackage.p40;
import defpackage.ps1;
import defpackage.rs6;
import defpackage.sb7;
import defpackage.sm;
import defpackage.wl2;
import ir.mservices.market.data.install.PendingInstall;
import ir.mservices.market.download.common.data.AppDownloadInfo;
import ir.mservices.market.version2.fragments.dialog.AppInstallProgressDialogFragment;
import ir.mservices.market.version2.fragments.task.ObbMoveBackFragment;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public class ObbMoveBackActivity extends mz2 implements lq5 {
    public ps1 T;
    public k68 U;
    public ObbMoveBackFragment V;
    public PendingInstall W;
    public int X;

    public ObbMoveBackActivity() {
        this.S = false;
        I(new sm(this, 15));
    }

    @Override // ir.mservices.market.activity.BaseContentActivity, defpackage.z80
    public final String C() {
        return getString(rs6.page_name_rollback_app_data);
    }

    @Override // ir.mservices.market.activity.BaseContentActivity
    public final String T() {
        return getString(rs6.page_name_rollback_app_data);
    }

    @Override // ir.mservices.market.activity.BaseContentActivity
    public final String U() {
        if (getIntent().getExtras() != null) {
            this.W = (PendingInstall) dt2.p(getIntent().getExtras(), "BUNDLE_KEY_INSTALL_DATA", PendingInstall.class);
            this.X = getIntent().getIntExtra("BUNDLE_KEY_MESSAGE", 4);
        }
        return "PackageName: " + this.W.getPackageName() + ", VersionCode: " + this.W.getVersionCode();
    }

    @Override // ir.mservices.market.activity.BaseContentActivity
    public final boolean Y() {
        return Build.VERSION.SDK_INT != 26;
    }

    public final void d0(int i) {
        Intent intent = new Intent();
        intent.putExtra("INSTALLATION_RESULT_MESSAGE", i);
        setResult(-1, intent);
        finish();
    }

    public final void e0() {
        String strReplace;
        sb7.p("MyketContentActivity", "Start to rolling-back obb files for:" + this.W.getPackageName(), null);
        AppDownloadInfo appDownloadInfoI = this.T.i(this.W.getPackageName(), Integer.valueOf(this.W.getVersionCode()));
        if (appDownloadInfoI == null) {
            lw.g(null, "MyketContentActivity", "appDownloadInfo must not be null!");
            d0(this.X);
            return;
        }
        String strConcat = this.U.e().concat("/");
        String destFilePath = appDownloadInfoI.getDestFilePath(20);
        String destFilePath2 = appDownloadInfoI.getDestFilePath(30);
        String packageName = this.W.getPackageName();
        String strReplace2 = "";
        if (TextUtils.isEmpty(destFilePath)) {
            strReplace = "";
        } else {
            String str = k68.e;
            strReplace = destFilePath.replace(strConcat, a77.h(packageName));
        }
        String packageName2 = this.W.getPackageName();
        if (!TextUtils.isEmpty(destFilePath2)) {
            String str2 = k68.e;
            strReplace2 = destFilePath2.replace(strConcat, a77.h(packageName2));
        }
        if (this.V != null) {
            lw.g(null, "MyketContentActivity", "InstallFilesRestorer mTaskFragment is not null!");
            d0(this.X);
            return;
        }
        ObbMoveBackFragment obbMoveBackFragment = new ObbMoveBackFragment();
        Bundle bundle = new Bundle();
        bundle.putString("BUNDLE_KEY_DESTINATION_FOLDER", strConcat);
        bundle.putStringArray("BUNDLE_KEY_FILES", new String[]{strReplace, strReplace2});
        obbMoveBackFragment.u0(bundle);
        this.V = obbMoveBackFragment;
        try {
            wl2 wl2VarL = L();
            wl2VarL.getClass();
            p40 p40Var = new p40(wl2VarL);
            p40Var.h(0, this.V, "InstallRestorerTaskFragment", 1);
            p40Var.e();
        } catch (Exception e) {
            lw.g(e, "InstallFileRestoreActivity", "cannot commit!");
            d0(this.X);
        }
    }

    @Override // ir.mservices.market.activity.BaseContentActivity, ir.mservices.market.activity.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        String iconPath = this.W.getIconPath();
        String title = this.W.getTitle();
        Bundle bundle2 = new Bundle();
        String string = getResources().getString(rs6.please_wait);
        AppInstallProgressDialogFragment.OnAppInstalledDialogResultEvent onAppInstalledDialogResultEvent = new AppInstallProgressDialogFragment.OnAppInstalledDialogResultEvent(bundle2, this.O);
        AppInstallProgressDialogFragment appInstallProgressDialogFragment = new AppInstallProgressDialogFragment();
        Bundle bundle3 = new Bundle();
        bundle3.putString("BUNDLE_KEY_ICON_PATH", iconPath);
        bundle3.putString("BUNDLE_KEY_TITLE", title);
        bundle3.putString("BUNDLE_KEY_DESCRIPTION", string);
        appInstallProgressDialogFragment.u0(bundle3);
        lw.d(null, null, onAppInstalledDialogResultEvent);
        appInstallProgressDialogFragment.V0 = onAppInstalledDialogResultEvent;
        appInstallProgressDialogFragment.G0 = false;
        Dialog dialog = appInstallProgressDialogFragment.L0;
        if (dialog != null) {
            dialog.setCancelable(false);
        }
        appInstallProgressDialogFragment.K0(L());
        try {
            e0();
        } catch (IOException e) {
            lw.g(e, "FileRestore startRollingBack() failed", null);
            d0(this.X);
        }
    }
}
