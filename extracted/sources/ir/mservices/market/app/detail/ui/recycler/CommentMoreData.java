package ir.mservices.market.app.detail.ui.recycler;

import defpackage.g32;
import defpackage.js3;
import defpackage.js6;
import defpackage.wo2;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class CommentMoreData implements MyketRecyclerData, wo2, g32 {
    public static final int b = js6.include_all_reviews;
    public final List a;

    public CommentMoreData(List list) {
        this.a = list;
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
        if (obj instanceof CommentMoreData) {
            return js3.i(this.a, ((CommentMoreData) obj).a);
        }
        return false;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return String.valueOf(hashCode());
    }

    public final int hashCode() {
        List list = this.a;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }
}
