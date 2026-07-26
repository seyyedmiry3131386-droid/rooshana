package ir.mservices.market.version2.ui.recycler;

import defpackage.g32;
import defpackage.js6;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;

/* JADX INFO: loaded from: classes3.dex */
public final class EmptyData implements MyketRecyclerData, g32 {
    public static final int a = js6.empty_card;

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int U() {
        return a;
    }

    @Override // ir.mservices.market.common.ui.recycler.MyketRecyclerData
    public final int d() {
        return 1;
    }

    @Override // defpackage.g32
    public final String getUniqueId() {
        return null;
    }
}
