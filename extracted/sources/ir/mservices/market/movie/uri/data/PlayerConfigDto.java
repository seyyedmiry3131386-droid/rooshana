package ir.mservices.market.movie.uri.data;

import defpackage.vo7;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class PlayerConfigDto implements Serializable {

    @vo7("minBitrate")
    private final Integer _minBitrate;

    @vo7("minHeight")
    private final Integer _minHeight;

    public PlayerConfigDto(Integer num, Integer num2) {
        this._minHeight = num;
        this._minBitrate = num2;
    }

    public final int getMinBitrate() {
        Integer num = this._minBitrate;
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }

    public final int getMinHeight() {
        Integer num = this._minHeight;
        if (num != null) {
            return num.intValue();
        }
        return -1;
    }
}
