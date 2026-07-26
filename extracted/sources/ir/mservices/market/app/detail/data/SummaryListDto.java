package ir.mservices.market.app.detail.data;

import defpackage.js3;
import defpackage.vo7;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class SummaryListDto implements Serializable {

    @vo7("items")
    private final List<SummaryDto> items;

    public SummaryListDto(List<SummaryDto> list) {
        js3.p(list, "items");
        this.items = list;
    }

    public final List<SummaryDto> getItems() {
        return this.items;
    }
}
