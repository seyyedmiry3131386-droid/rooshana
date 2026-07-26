package ir.mservices.market.version2.webapi.requestdto;

import ir.mservices.market.version2.webapi.responsedto.RequestDTO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class SpixMovieDownloadRequestDto implements RequestDTO, Serializable {
    private final long localSize;
    private final long metaDataSize;
    private final String playId;
    private final String refId;
    private final long serverSize;

    public SpixMovieDownloadRequestDto(long j, long j2, long j3, String str, String str2) {
        this.localSize = j;
        this.serverSize = j2;
        this.metaDataSize = j3;
        this.refId = str;
        this.playId = str2;
    }

    public final long getLocalSize() {
        return this.localSize;
    }

    public final long getMetaDataSize() {
        return this.metaDataSize;
    }

    public final String getPlayId() {
        return this.playId;
    }

    public final String getRefId() {
        return this.refId;
    }

    public final long getServerSize() {
        return this.serverSize;
    }
}
