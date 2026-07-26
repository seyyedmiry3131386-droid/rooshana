package defpackage;

import android.content.res.Resources;
import ir.mservices.market.app.detail.data.ApplicationFullDto;
import ir.mservices.market.app.detail.ui.AppDetailFragment;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bp implements bp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ AppDetailFragment b;

    public /* synthetic */ bp(AppDetailFragment appDetailFragment, int i) {
        this.a = i;
        this.b = appDetailFragment;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        int i = this.a;
        AppDetailFragment appDetailFragment = this.b;
        switch (i) {
            case 0:
                int i2 = AppDetailFragment.M1;
                return Boolean.valueOf(appDetailFragment.K().getBoolean(yp6.app_detail_tablet_land));
            default:
                Resources resourcesK = appDetailFragment.K();
                int i3 = rs6.share_body;
                ApplicationFullDto applicationFullDtoR = appDetailFragment.R1().R();
                String title = applicationFullDtoR != null ? applicationFullDtoR.getTitle() : null;
                hp hpVar = appDetailFragment.u1;
                if (hpVar == null) {
                    js3.V("navArgs");
                    throw null;
                }
                String string = resourcesK.getString(i3, title, dw1.n("https://myket.ir/app/", hpVar.a));
                js3.o(string, "getString(...)");
                return string;
        }
    }
}
