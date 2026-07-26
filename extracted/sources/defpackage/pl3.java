package defpackage;

import ir.mservices.market.core.analytics.InboxEventBuilder;
import ir.mservices.market.core.notification.a;
import ir.mservices.market.version2.model.InboxInfoModel;

/* JADX INFO: loaded from: classes3.dex */
public final class pl3 implements gb8 {
    public final /* synthetic */ int a;
    public final /* synthetic */ InboxInfoModel b;
    public final /* synthetic */ ul3 c;

    public /* synthetic */ pl3(ul3 ul3Var, InboxInfoModel inboxInfoModel, int i) {
        this.a = i;
        this.c = ul3Var;
        this.b = inboxInfoModel;
    }

    @Override // defpackage.gb8
    public final void onSuccess(Object obj) {
        switch (this.a) {
            case 0:
                InboxEventBuilder inboxEventBuilder = new InboxEventBuilder();
                InboxInfoModel inboxInfoModel = this.b;
                inboxEventBuilder.c.putString("notification_id", inboxInfoModel.j());
                inboxEventBuilder.c.putInt("status", 1);
                inboxEventBuilder.a();
                ul3 ul3Var = this.c;
                ul3Var.b(null);
                a aVar = ul3Var.a;
                String strJ = inboxInfoModel.j();
                wv wvVar = aVar.h;
                if (wvVar.containsKey(strJ)) {
                    aVar.a.cancel(((Integer) wvVar.get(strJ)).intValue());
                    wvVar.remove(strJ);
                }
                break;
            default:
                InboxEventBuilder inboxEventBuilder2 = new InboxEventBuilder();
                inboxEventBuilder2.c.putString("notification_id", this.b.j());
                inboxEventBuilder2.c.putInt("status", 0);
                inboxEventBuilder2.a();
                this.c.b(new q6(18, this));
                break;
        }
    }
}
