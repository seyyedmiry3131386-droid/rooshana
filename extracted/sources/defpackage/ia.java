package defpackage;

import android.content.Context;
import android.view.View;
import ir.mservices.market.app.detail.data.MessageBoxDto;
import ir.mservices.market.core.analytics.ClickEventBuilder;
import ir.mservices.market.pika.common.model.NearbyRepository;
import ir.mservices.market.vpnService.adGuard.data.AdGuardData;
import ir.mservices.market.vpnService.cheetah.data.CheetahDto;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ia implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ View b;
    public final /* synthetic */ n99 c;

    public /* synthetic */ ia(View view, n99 n99Var, int i) {
        this.a = i;
        this.b = view;
        this.c = n99Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.a) {
            case 0:
                ClickEventBuilder clickEventBuilder = new ClickEventBuilder();
                clickEventBuilder.b("ad_guard_info");
                clickEventBuilder.a();
                Context context = this.b.getContext();
                MessageBoxDto messageBox = ((AdGuardData) ((l99) this.c).a).getMessageBox();
                String action = messageBox != null ? messageBox.getAction() : null;
                if (action != null) {
                    t61.v(action, "parse(...)", context, NearbyRepository.SERVICE_ID, null);
                }
                break;
            default:
                ClickEventBuilder clickEventBuilder2 = new ClickEventBuilder();
                clickEventBuilder2.b("cheetah_info");
                clickEventBuilder2.a();
                Context context2 = this.b.getContext();
                MessageBoxDto messageBox2 = ((CheetahDto) ((l99) this.c).a).getMessageBox();
                String action2 = messageBox2 != null ? messageBox2.getAction() : null;
                if (action2 != null) {
                    t61.v(action2, "parse(...)", context2, NearbyRepository.SERVICE_ID, null);
                }
                break;
        }
    }
}
