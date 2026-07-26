package ir.mservices.market.app.suggest.detail.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.wo2;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class PlayScreenshots implements MyketRecyclerData, wo2, g32 {
    public static final int c = js6.holder_play_screenshot_list;
    public final List a;
    public final String b;

    public PlayScreenshots(List list, String str) {
        this.a = list;
        this.b = str;
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
        if (!PlayScreenshots.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.app.suggest.detail.recycler.PlayScreenshots");
        PlayScreenshots playScreenshots = (PlayScreenshots) obj;
        return js3.i(this.a, playScreenshots.a) && js3.i(this.b, playScreenshots.b);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return String.valueOf(hashCode());
    }

    public final int hashCode() {
        String str = this.b;
        return this.a.hashCode() + ((str != null ? str.hashCode() : 0) * 31);
    }
}
