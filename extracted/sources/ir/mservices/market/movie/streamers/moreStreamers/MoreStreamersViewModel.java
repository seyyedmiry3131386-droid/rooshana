package ir.mservices.market.movie.streamers.moreStreamers;

import defpackage.qm5;
import defpackage.wu0;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.movie.streamers.data.StreamerDto;
import ir.mservices.market.movie.streamers.data.StreamersDto;
import ir.mservices.market.movie.streamers.recycler.OtherStreamerData;
import ir.mservices.market.viewModel.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class MoreStreamersViewModel extends a {
    public final qm5 v;

    public MoreStreamersViewModel(qm5 qm5Var) {
        super(true);
        this.v = qm5Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<RecyclerItem> fillData(StreamersDto streamersDto) {
        List<StreamerDto> streamers = streamersDto.getStreamers();
        ArrayList arrayList = new ArrayList(wu0.V(streamers, 10));
        Iterator<T> it = streamers.iterator();
        while (it.hasNext()) {
            arrayList.add(new RecyclerItem(new OtherStreamerData((StreamerDto) it.next())));
        }
        return arrayList;
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        p(new MoreStreamersViewModel$doRequest$1(this, null));
    }
}
