package defpackage;

import android.view.View;
import ir.mservices.market.version2.fragments.base.BaseDialogFragment;
import ir.mservices.market.version2.fragments.dialog.AppDataInstallProgressDialogFragment;

/* JADX INFO: loaded from: classes3.dex */
public final class wo implements View.OnClickListener {
    public final /* synthetic */ AppDataInstallProgressDialogFragment a;

    public wo(AppDataInstallProgressDialogFragment appDataInstallProgressDialogFragment) {
        this.a = appDataInstallProgressDialogFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = AppDataInstallProgressDialogFragment.j1;
        AppDataInstallProgressDialogFragment appDataInstallProgressDialogFragment = this.a;
        appDataInstallProgressDialogFragment.J0(BaseDialogFragment.DialogResult.a);
        appDataInstallProgressDialogFragment.z0();
    }
}
