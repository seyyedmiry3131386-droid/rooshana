package ir.mservices.market.app.detail.more.data;

import defpackage.js3;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class MoreDescriptionList {
    private final List<MyketRecyclerData> items;

    /* JADX WARN: Multi-variable type inference failed */
    public MoreDescriptionList(List<? extends MyketRecyclerData> list) {
        js3.p(list, "items");
        this.items = list;
    }

    public final List<MyketRecyclerData> getItems() {
        return this.items;
    }
}
