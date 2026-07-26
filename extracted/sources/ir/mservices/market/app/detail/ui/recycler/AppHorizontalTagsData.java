package ir.mservices.market.app.detail.ui.recycler;

import android.os.Parcelable;
import defpackage.bz6;
import defpackage.g32;
import defpackage.js6;
import defpackage.wo2;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public class AppHorizontalTagsData implements MyketRecyclerData, wo2, g32 {
    public static final int c = js6.holder_app_tags;
    public final bz6 a;
    public Parcelable b;

    public AppHorizontalTagsData(bz6 bz6Var) {
        this.a = bz6Var;
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
        return getClass().equals(obj != null ? obj.getClass() : null);
    }

    @Override // defpackage.g32
    public String getUniqueId() {
        return String.valueOf(hashCode());
    }

    public final int hashCode() {
        return getClass().hashCode();
    }
}
