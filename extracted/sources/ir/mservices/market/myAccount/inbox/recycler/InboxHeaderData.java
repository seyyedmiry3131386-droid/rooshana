package ir.mservices.market.myAccount.inbox.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import j$.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
public final class InboxHeaderData implements MyketRecyclerData, g32 {
    public static final int b = js6.inbox_header_holder;
    public final String a;

    public InboxHeaderData(String str) {
        js3.p(str, "messageCount");
        this.a = str;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return b;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return -1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && InboxHeaderData.class.equals(obj.getClass()) && js3.i(this.a, ((InboxHeaderData) obj).a);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return "Header";
    }

    public final int hashCode() {
        return Objects.hash(this.a);
    }
}
