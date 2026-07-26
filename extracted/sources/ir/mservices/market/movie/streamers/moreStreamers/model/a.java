package ir.mservices.market.movie.streamers.moreStreamers.model;

import defpackage.bp2;
import defpackage.dc0;
import defpackage.qm5;
import ir.mservices.market.movie.streamers.data.StreamersDto;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class a implements bp2 {
    public final /* synthetic */ StreamersDto a;
    public final /* synthetic */ qm5 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a(StreamersDto streamersDto, qm5 qm5Var, Object obj) {
        this.a = streamersDto;
        this.b = qm5Var;
        this.c = obj;
    }

    @Override // defpackage.bp2
    public final Object invoke() {
        MoreStreamersStreamersRepositoryImpl$getMoreStreamers$1$1 moreStreamersStreamersRepositoryImpl$getMoreStreamers$1$1 = new MoreStreamersStreamersRepositoryImpl$getMoreStreamers$1$1(this.b, this.c, null);
        StreamersDto streamersDto = this.a;
        return new ir.mservices.market.model.paging.a(moreStreamersStreamersRepositoryImpl$getMoreStreamers$1$1, streamersDto != null ? new dc0(streamersDto.getStreamers().size(), 9, streamersDto) : null);
    }
}
