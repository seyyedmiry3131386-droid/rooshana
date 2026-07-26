package ir.mservices.market.app.detail.ui.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.wo2;
import ir.mservices.market.app.detail.data.MessageBoxDto;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public class MessageBoxData implements MyketRecyclerData, wo2, g32 {
    public static final int c = js6.message_box;
    public final MessageBoxDto a;
    public final int b;

    public MessageBoxData(MessageBoxDto messageBoxDto, int i) {
        js3.p(messageBoxDto, "messageBoxDto");
        this.a = messageBoxDto;
        this.b = i;
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
        if (!(obj instanceof MessageBoxData)) {
            return false;
        }
        MessageBoxData messageBoxData = (MessageBoxData) obj;
        return js3.i(this.a, messageBoxData.a) && this.b == messageBoxData.b;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return String.valueOf(hashCode());
    }

    public final int hashCode() {
        return (this.a.hashCode() * 31) + this.b;
    }
}
