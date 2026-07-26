package defpackage;

import android.view.View;
import ir.mservices.market.app.detail.ui.AppDetailFragment;
import ir.mservices.market.core.analytics.ClickEventBuilder;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class dp implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ AppDetailFragment b;

    public /* synthetic */ dp(AppDetailFragment appDetailFragment, int i) {
        this.a = i;
        this.b = appDetailFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        AppDetailFragment appDetailFragment = this.b;
        switch (i) {
            case 0:
                int i2 = AppDetailFragment.M1;
                appDetailFragment.J0.p();
                return;
            case 1:
                int i3 = AppDetailFragment.M1;
                pk5.g(appDetailFragment.J0, new NavIntentDirections.RecentDownload(new zw6(new DialogDataModel(appDetailFragment.W1(), "DIALOG_KEY_NO_RESULT", null, 12))), -1);
                return;
            default:
                int i4 = AppDetailFragment.M1;
                ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                clickEventBuilder.b("empty_state_request_app");
                clickEventBuilder.a();
                hp hpVar = appDetailFragment.u1;
                if (hpVar == null) {
                    js3.V("navArgs");
                    throw null;
                }
                String str = hpVar.a;
                pk5.g(appDetailFragment.J0, new NavIntentDirections.PlayDetail(new la6(new DialogDataModel(appDetailFragment.W1(), "DIALOG_KEY_PLAY_DETAIL", null, 12), str, str)), -1);
                return;
        }
    }
}
