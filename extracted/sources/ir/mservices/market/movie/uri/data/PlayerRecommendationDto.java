package ir.mservices.market.movie.uri.data;

import defpackage.vo7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class PlayerRecommendationDto implements Serializable {

    @vo7("autoPlay")
    private final boolean autoPlay;

    @vo7("second")
    private final int second;

    public PlayerRecommendationDto(int i, boolean z) {
        this.second = i;
        this.autoPlay = z;
    }

    public final boolean getAutoPlay() {
        return this.autoPlay;
    }

    public final int getSecond() {
        return this.second;
    }

    public final int getSecondTime(int i) {
        int i2 = this.second;
        return i <= i2 ? (int) (((double) i) * 0.95d) : i2;
    }
}
