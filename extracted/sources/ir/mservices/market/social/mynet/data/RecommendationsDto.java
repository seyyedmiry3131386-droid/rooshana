package ir.mservices.market.social.mynet.data;

import defpackage.js3;
import defpackage.vo7;
import ir.mservices.market.social.users.common.data.UsersDto;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class RecommendationsDto implements Serializable {

    @vo7("recommendations")
    private final List<UsersDto> recommendations;

    public RecommendationsDto(List<UsersDto> list) {
        this.recommendations = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ RecommendationsDto copy$default(RecommendationsDto recommendationsDto, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = recommendationsDto.recommendations;
        }
        return recommendationsDto.copy(list);
    }

    public final List<UsersDto> component1() {
        return this.recommendations;
    }

    public final RecommendationsDto copy(List<UsersDto> list) {
        return new RecommendationsDto(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RecommendationsDto) && js3.i(this.recommendations, ((RecommendationsDto) obj).recommendations);
    }

    public final List<UsersDto> getRecommendations() {
        return this.recommendations;
    }

    public int hashCode() {
        List<UsersDto> list = this.recommendations;
        if (list == null) {
            return 0;
        }
        return list.hashCode();
    }

    public String toString() {
        return "RecommendationsDto(recommendations=" + this.recommendations + ")";
    }
}
