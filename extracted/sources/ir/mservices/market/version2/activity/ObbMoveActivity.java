package ir.mservices.market.version2.activity;

import android.app.Dialog;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.DocumentsContract;
import defpackage.a77;
import defpackage.c56;
import defpackage.d56;
import defpackage.dp3;
import defpackage.dt2;
import defpackage.hh2;
import defpackage.js3;
import defpackage.js6;
import defpackage.k68;
import defpackage.lw;
import defpackage.lz2;
import defpackage.nq5;
import defpackage.ns6;
import defpackage.oq5;
import defpackage.p3;
import defpackage.p40;
import defpackage.pk5;
import defpackage.pq5;
import defpackage.ps1;
import defpackage.ql3;
import defpackage.rs6;
import defpackage.sb7;
import defpackage.t32;
import defpackage.wl2;
import defpackage.xq1;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.data.permission.Permission;
import ir.mservices.market.data.permission.PermissionResult;
import ir.mservices.market.download.common.data.AppDownloadInfo;
import ir.mservices.market.version2.fragments.base.BaseDialogFragment;
import ir.mservices.market.version2.fragments.dialog.AppDataInstallProgressDialogFragment;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.version2.fragments.task.ObbMoveFragment;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes3.dex */
public class ObbMoveActivity extends lz2 implements pq5 {
    public ps1 A0;
    public d56 B0;
    public k68 C0;
    public ObbMoveFragment D0;
    public String E0;
    public int F0;
    public String G0;
    public String H0;
    public AppDataInstallProgressDialogFragment I0;
    public dp3 z0;

    public ObbMoveActivity() {
        super(0);
    }

    @Override // ir.mservices.market.activity.BaseNavigationContentActivity, defpackage.mm2
    public final void B(Bundle bundle, String str) {
        super.B(bundle, str);
        if (str.equalsIgnoreCase(k0())) {
            DialogDataModel dialogDataModel = (DialogDataModel) dt2.p(bundle, "BUNDLE_KEY_DATA", DialogDataModel.class);
            if ("DIALOG_KEY_DOCUMENT_PERMISSION".equalsIgnoreCase(dialogDataModel.b)) {
                DialogResult dialogResult = dialogDataModel.d;
                if (dialogResult == DialogResult.a) {
                    l0();
                } else if (dialogResult == DialogResult.b) {
                    finish();
                }
            }
        }
    }

    @Override // ir.mservices.market.activity.BaseContentActivity, defpackage.z80
    public final String C() {
        return getString(rs6.page_name_install_app_data);
    }

    @Override // ir.mservices.market.activity.Hilt_BaseNavigationContentActivity, ir.mservices.market.activity.BaseContentActivity
    public final String T() {
        return getString(rs6.page_name_install_app_data);
    }

    @Override // ir.mservices.market.activity.BaseContentActivity
    public final String U() {
        this.E0 = getIntent().getStringExtra("packageName");
        this.F0 = getIntent().getIntExtra("BUNDLE_KEY_VERSION_CODE", 0);
        this.G0 = getIntent().getStringExtra("BUNDLE_KEY_TITLE");
        this.H0 = getIntent().getStringExtra("BUNDLE_KEY_ICON_PATH");
        return "PackageName: " + this.E0 + ", VersionCode: " + this.F0;
    }

    @Override // ir.mservices.market.activity.BaseContentActivity
    public final boolean Y() {
        return Build.VERSION.SDK_INT != 26;
    }

    public final String k0() {
        return getClass().getSimpleName() + "_" + this.O;
    }

    public final void l0() {
        if (this.z0.G(this.E0) && this.z0.p(this.E0).intValue() == this.F0) {
            finish();
            return;
        }
        if (this.D0 == null) {
            AppDownloadInfo appDownloadInfoI = this.A0.i(this.E0, null);
            if (appDownloadInfoI == null) {
                this.I0.N0(2, 1);
                return;
            }
            String destFilePath = appDownloadInfoI.getDestFilePath(20);
            String destFilePath2 = appDownloadInfoI.getDestFilePath(30);
            this.I0.N0(1, 0);
            String str = this.E0;
            String str2 = k68.e;
            String strH = a77.h(str);
            String[] strArr = {destFilePath, destFilePath2};
            ObbMoveFragment obbMoveFragment = new ObbMoveFragment();
            Bundle bundle = new Bundle();
            bundle.putString("BUNDLE_KEY_DESTINATION_FOLDER", strH);
            bundle.putStringArray("BUNDLE_KEY_FILES", strArr);
            obbMoveFragment.u0(bundle);
            this.D0 = obbMoveFragment;
            try {
                wl2 wl2VarL = L();
                wl2VarL.getClass();
                p40 p40Var = new p40(wl2VarL);
                p40Var.h(0, this.D0, "task_fragment", 1);
                p40Var.e();
            } catch (Exception unused) {
                this.I0.N0(2, 0);
            }
        }
    }

    public final void m0(nq5 nq5Var) {
        int i = nq5Var.a;
        if (i == 4) {
            if (getIntent().getBooleanExtra("IS_DEFAULT_SCENARIO", false)) {
                this.z0.E(this.E0, this.G0, Integer.valueOf(this.F0), this.H0);
            }
            setResult(-1);
            finish();
            return;
        }
        if (i == 1) {
            this.A0.v(this.E0);
            t32.b().j(new ql3());
        } else if (i == 5) {
            hh2.H(new hh2(this, getResources().getString(rs6.document_file_wrong_path)));
            finish();
            return;
        }
        this.I0.N0(2, nq5Var.a);
    }

    public final void n0() {
        if (Build.VERSION.SDK_INT < 24) {
            l0();
            return;
        }
        String str = this.E0;
        String str2 = k68.e;
        if (p3.b(a77.h(str)) || p3.d(this)) {
            l0();
        } else {
            pk5.h(this, new NavIntentDirections.DocumentFilePermission(new xq1(new DialogDataModel(k0(), "DIALOG_KEY_DOCUMENT_PERMISSION"))));
        }
    }

    @Override // ir.mservices.market.activity.BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        Parcelable[] parcelableArr;
        ObbMoveFragment obbMoveFragment = this.D0;
        if (obbMoveFragment != null && i == 3000) {
            int i3 = Build.VERSION.SDK_INT;
            if (i3 <= 29) {
                lw.g(null, "MoveObbDocumentFile handleDocumentFileOnActivityResult(), sdk below Q is illegal!!", null);
                ((ObbMoveActivity) obbMoveFragment.C0).m0(new nq5(0));
                return;
            }
            if (intent == null || intent.getData() == null) {
                ((ObbMoveActivity) obbMoveFragment.C0).m0(new nq5(5));
                return;
            }
            if (!(i3 > 29 ? DocumentsContract.buildTreeDocumentUri("com.android.externalstorage.documents", "primary:Android/obb") : null).equals(intent.getData())) {
                ((ObbMoveActivity) obbMoveFragment.C0).m0(new nq5(5));
                return;
            } else {
                if (obbMoveFragment.F() == null) {
                    ((ObbMoveActivity) obbMoveFragment.C0).m0(new nq5(5));
                    return;
                }
                obbMoveFragment.F().getContentResolver().takePersistableUriPermission(intent.getData(), 3);
                new oq5(obbMoveFragment, obbMoveFragment.F(), obbMoveFragment.A0).b(obbMoveFragment.B0);
                return;
            }
        }
        if (obbMoveFragment != null) {
            obbMoveFragment.U(i, i2, intent);
        }
        if (i == 9898) {
            Parcelable[] parcelableArrayExtra = intent.getParcelableArrayExtra("BUNDLE_KEY_PERMISSIONS_PARCELABLE");
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
                lw.g(null, "InstallApplicationActivity list of permissions is null in isDeniedForEver()!", null);
            } else {
                for (Permission permission : permissionArr) {
                    if (permission.a != 2) {
                        lw.g(null, "InstallApplicationActivity illegal type of permission in isDeniedForEver()!", null);
                    } else if (permission.d == PermissionResult.DENIED_FOREVER) {
                        sb7.p("InstallApplicationActivity", "Permission denied forever! activity finished.", null);
                    }
                }
            }
            finish();
            break;
        } else if (i == 20000) {
            if (Build.VERSION.SDK_INT <= 29) {
                lw.g(null, "ObbMoveActivity InstallUnknownApp permission requested for android below 10", null);
            } else if (this.C0.s(this.E0)) {
                this.C0.v(this.E0);
                throw null;
            }
            finish();
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // ir.mservices.market.activity.BaseNavigationContentActivity, ir.mservices.market.activity.BaseContentActivity, ir.mservices.market.activity.Hilt_BaseActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle bundle2 = new Bundle();
        String str = this.G0;
        String str2 = this.H0;
        AppDataInstallProgressDialogFragment.OnAppInstalledDialogResultEvent onAppInstalledDialogResultEvent = new AppDataInstallProgressDialogFragment.OnAppInstalledDialogResultEvent(bundle2, this.O);
        AppDataInstallProgressDialogFragment appDataInstallProgressDialogFragment = new AppDataInstallProgressDialogFragment();
        Bundle bundle3 = new Bundle();
        bundle3.putString("BUNDLE_KEY_TITLE", str);
        bundle3.putString("BUNDLE_KEY_ICON_PATH", str2);
        appDataInstallProgressDialogFragment.u0(bundle3);
        lw.d(null, null, onAppInstalledDialogResultEvent);
        appDataInstallProgressDialogFragment.V0 = onAppInstalledDialogResultEvent;
        appDataInstallProgressDialogFragment.G0 = false;
        Dialog dialog = appDataInstallProgressDialogFragment.L0;
        if (dialog != null) {
            dialog.setCancelable(false);
        }
        this.I0 = appDataInstallProgressDialogFragment;
        appDataInstallProgressDialogFragment.K0(L());
        d(k0(), this);
        setContentView(js6.nav_content);
        j0();
        g0().e(ns6.nav_graph_obb_move);
        if (Build.VERSION.SDK_INT > 29 && !getPackageManager().canRequestPackageInstalls()) {
            this.I0.N0(3, 0);
        } else if (this.B0.b(this, 2)) {
            n0();
        } else {
            getIntent().putExtra("BUNDLE_KEY_PERMISSIONS_REQUESTED", true);
            this.B0.e(this, 2);
        }
        setResult(1);
    }

    @Override // ir.mservices.market.activity.BaseNavigationContentActivity, ir.mservices.market.activity.BaseContentActivity, ir.mservices.market.activity.Hilt_BaseActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        x(k0());
    }

    public void onEvent(AppDataInstallProgressDialogFragment.OnAppInstalledDialogResultEvent onAppInstalledDialogResultEvent) {
        if (Build.VERSION.SDK_INT > 29 && this.I0.f1 == 3) {
            lw.d(null, null, onAppInstalledDialogResultEvent.c);
            if (onAppInstalledDialogResultEvent.c == BaseDialogFragment.DialogResult.a) {
                this.z0.O(this, 20000);
                return;
            }
        }
        finish();
    }

    public void onEvent(c56 c56Var) {
        for (Permission permission : c56Var.a) {
            Bundle extras = getIntent().getExtras();
            if (2 == permission.a && extras != null) {
                boolean z = extras.getBoolean("BUNDLE_KEY_PERMISSIONS_REQUESTED", false);
                if (permission.d == PermissionResult.GRANTED && z) {
                    if (!this.C0.s(this.E0)) {
                        n0();
                        getIntent().removeExtra("BUNDLE_KEY_PERMISSIONS_REQUESTED");
                        return;
                    } else {
                        this.C0.v(this.E0);
                        throw null;
                    }
                }
                if (z) {
                    getIntent().removeExtra("BUNDLE_KEY_PERMISSIONS_REQUESTED");
                    finish();
                }
            }
        }
    }
}
