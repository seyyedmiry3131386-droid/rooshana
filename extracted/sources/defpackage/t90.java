package defpackage;

import android.view.View;
import ir.mservices.market.app.update.BaseUpdateFragment;
import ir.mservices.market.core.analytics.ActionBarEventBuilder;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class t90 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ BaseUpdateFragment b;

    public /* synthetic */ t90(BaseUpdateFragment baseUpdateFragment, int i) {
        this.a = i;
        this.b = baseUpdateFragment;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        BaseUpdateFragment baseUpdateFragment = this.b;
        switch (i) {
            case 0:
                int i2 = BaseUpdateFragment.p1;
                ActionBarEventBuilder actionBarEventBuilder = new ActionBarEventBuilder();
                actionBarEventBuilder.b("update_schedulesetting");
                actionBarEventBuilder.a();
                pk5.g(baseUpdateFragment.J0, new NavIntentDirections.ScheduleUpdate(), -1);
                break;
            case 1:
                int i3 = BaseUpdateFragment.p1;
                pk5.g(baseUpdateFragment.J0, new NavIntentDirections.ScheduleUpdate(), -1);
                break;
            case 2:
                int i4 = BaseUpdateFragment.p1;
                baseUpdateFragment.J0.p();
                break;
            case 3:
                int i5 = BaseUpdateFragment.p1;
                pk5.g(baseUpdateFragment.J0, new NavIntentDirections.MyMarket(), -1);
                break;
            default:
                int i6 = BaseUpdateFragment.p1;
                pk5.g(baseUpdateFragment.J0, new NavIntentDirections.RecentDownload(new zw6(new DialogDataModel(baseUpdateFragment.S1(), "DIALOG_KEY_NO_RESULT", null, 12))), -1);
                break;
        }
    }
}
