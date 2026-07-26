package ir.mservices.market.search.history.data;

import ir.mservices.market.app.detail.data.RecommendationDto;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class SearchKeywordsDto implements Serializable {
    private final List<RecommendationDto> recommendations;

    public SearchKeywordsDto(List<RecommendationDto> list) {
        this.recommendations = list;
    }

    public final List<RecommendationDto> getRecommendations() {
        return this.recommendations;
    }
}
