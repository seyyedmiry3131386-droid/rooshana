package ir.mservices.market.movie.ui.detail.recycler;

import defpackage.bz6;
import defpackage.h45;
import defpackage.qp2;
import defpackage.wu0;
import ir.mservices.market.app.detail.ui.recycler.AppHorizontalTagsData;
import ir.mservices.market.app.detail.ui.recycler.AppTagData;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.version2.ui.recycler.filter.GeneralFilter;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieHorizontalTagData extends AppHorizontalTagsData implements h45 {
    public final ArrayList d;

    public MovieHorizontalTagData(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList(wu0.V(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(new RecyclerItem((AppTagData) it.next()));
        }
        super(new bz6(arrayList2, (GeneralFilter) null, (qp2) null, 6));
        this.d = arrayList;
    }

    @Override // defpackage.h45
    public final String a() {
        return "tag";
    }

    @Override // ir.mservices.market.app.detail.ui.recycler.AppHorizontalTagsData, defpackage.g32
    public final String getUniqueId() {
        return "tag";
    }
}
