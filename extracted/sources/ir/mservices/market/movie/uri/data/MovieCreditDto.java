package ir.mservices.market.movie.uri.data;

import defpackage.vo7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieCreditDto implements Serializable {

    @vo7("end")
    private final int endTime;

    @vo7("start")
    private final int startTime;

    public MovieCreditDto(int i, int i2) {
        this.startTime = i;
        this.endTime = i2;
    }

    public final int getEndTime() {
        return this.endTime;
    }

    public final int getStartTime() {
        return this.startTime;
    }
}
