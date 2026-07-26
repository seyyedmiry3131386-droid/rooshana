package ir.mservices.market.app.suggest.detail.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class PlayDescriptionData implements MyketRecyclerData, g32 {
    public static final int c = js6.holder_play_description;
    public final String a;
    public final boolean b;

    public PlayDescriptionData(String str, boolean z) {
        this.a = str;
        this.b = z;
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
        if (!PlayDescriptionData.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        js3.n(obj, "null cannot be cast to non-null type ir.mservices.market.app.suggest.detail.recycler.PlayDescriptionData");
        return js3.i(this.a, ((PlayDescriptionData) obj).a);
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        String str = this.a;
        return str == null ? "" : str;
    }

    public final int hashCode() {
        String str = this.a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }
}
