package ir.mservices.market.gateway;

import android.os.Bundle;
import defpackage.rm1;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.version2.webapi.responsedto.GatewayDTO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements rm1 {
    public final /* synthetic */ GatewayBottomDialogFragment a;

    public a(GatewayBottomDialogFragment gatewayBottomDialogFragment) {
        this.a = gatewayBottomDialogFragment;
    }

    @Override // defpackage.rm1
    public final void onCancel() {
    }

    @Override // defpackage.rm1
    public final void onCommit() {
        DialogResult dialogResult = DialogResult.a;
        Bundle bundle = new Bundle();
        GatewayBottomDialogFragment gatewayBottomDialogFragment = this.a;
        bundle.putSerializable("BUNDLE_KEY_INFO_GATEWAY", (Serializable) gatewayBottomDialogFragment.W0().y.a.getValue());
        bundle.putString("BUNDLE_KEY_ANALYTICS_NAME", ((GatewayDTO) gatewayBottomDialogFragment.V0().c.get(0)).getAnalyticsName());
        gatewayBottomDialogFragment.R0(dialogResult, bundle);
    }
}
