package ir.mservices.market.version2.webapi.requestdto;

import defpackage.js3;
import defpackage.yd1;
import ir.mservices.market.version2.webapi.responsedto.RequestDTO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class SpixPlayerRequestDto implements RequestDTO, Serializable {
    private String errorType;
    private Integer httpStatus;
    private final String mainUri;
    private String message;
    private final String movieId;
    private final String playId;
    private final String playerType;
    private Integer position;
    private String uri;

    public SpixPlayerRequestDto(String str, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, Integer num2) {
        js3.p(str, "movieId");
        js3.p(str2, "playId");
        js3.p(str3, "mainUri");
        js3.p(str4, "playerType");
        this.movieId = str;
        this.playId = str2;
        this.mainUri = str3;
        this.playerType = str4;
        this.errorType = str5;
        this.uri = str6;
        this.httpStatus = num;
        this.message = str7;
        this.position = num2;
    }

    public final String getErrorType() {
        return this.errorType;
    }

    public final Integer getHttpStatus() {
        return this.httpStatus;
    }

    public final String getMainUri() {
        return this.mainUri;
    }

    public final String getMessage() {
        return this.message;
    }

    public final String getMovieId() {
        return this.movieId;
    }

    public final String getPlayId() {
        return this.playId;
    }

    public final String getPlayerType() {
        return this.playerType;
    }

    public final Integer getPosition() {
        return this.position;
    }

    public final String getUri() {
        return this.uri;
    }

    public final void setErrorType(String str) {
        this.errorType = str;
    }

    public final void setHttpStatus(Integer num) {
        this.httpStatus = num;
    }

    public final void setMessage(String str) {
        this.message = str;
    }

    public final void setPosition(Integer num) {
        this.position = num;
    }

    public final void setUri(String str) {
        this.uri = str;
    }

    public /* synthetic */ SpixPlayerRequestDto(String str, String str2, String str3, String str4, String str5, String str6, Integer num, String str7, Integer num2, int i, yd1 yd1Var) {
        this(str, str2, str3, str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : num, (i & 128) != 0 ? null : str7, (i & 256) != 0 ? null : num2);
    }
}
