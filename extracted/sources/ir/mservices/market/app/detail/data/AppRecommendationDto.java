package ir.mservices.market.app.detail.data;

import defpackage.vo7;
import ir.mservices.market.movie.data.webapi.CommonDataKt;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class AppRecommendationDto implements Serializable {

    @vo7(CommonDataKt.HOME_MOVIE_TYPE_LIST)
    private final List<RecommendationDto> list;

    @vo7("movableIds")
    private final List<String> movableIds;

    public AppRecommendationDto(List<RecommendationDto> list, List<String> list2) {
        this.list = list;
        this.movableIds = list2;
    }

    public final List<RecommendationDto> getList() {
        return this.list;
    }

    public final List<String> getMovableIds() {
        return this.movableIds;
    }
}
