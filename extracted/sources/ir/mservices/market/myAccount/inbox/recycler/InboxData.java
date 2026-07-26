package ir.mservices.market.myAccount.inbox.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.version2.model.InboxInfoModel;
import j$.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class InboxData implements MyketRecyclerData, g32 {
    public static final int c = js6.inbox_row;
    public final InboxInfoModel a;
    public final String b;

    public InboxData(InboxInfoModel inboxInfoModel) {
        js3.p(inboxInfoModel, "inboxInfoModel");
        this.a = inboxInfoModel;
        String strJ = inboxInfoModel.j();
        js3.o(strJ, "getNotificationId(...)");
        this.b = strJ;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return c;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && InboxData.class.equals(obj.getClass()) && js3.i(this.a, ((InboxData) obj).a);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return this.b;
    }

    public final int hashCode() {
        InboxInfoModel inboxInfoModel = this.a;
        return Objects.hash(inboxInfoModel.j(), inboxInfoModel);
    }
}
