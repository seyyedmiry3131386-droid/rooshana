package ir.mservices.market.movie.streamers.data;

import defpackage.js3;
import defpackage.o40;
import defpackage.vo7;
import ir.mservices.market.version2.webapi.responsedto.RequestDTO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamerFollowDto implements RequestDTO, Serializable {

    @vo7("streamerKey")
    private final String streamerKey;

    public StreamerFollowDto(String str) {
        js3.p(str, "streamerKey");
        this.streamerKey = str;
    }

    public static /* synthetic */ StreamerFollowDto copy$default(StreamerFollowDto streamerFollowDto, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = streamerFollowDto.streamerKey;
        }
        return streamerFollowDto.copy(str);
    }

    public final String component1() {
        return this.streamerKey;
    }

    public final StreamerFollowDto copy(String str) {
        js3.p(str, "streamerKey");
        return new StreamerFollowDto(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof StreamerFollowDto) && js3.i(this.streamerKey, ((StreamerFollowDto) obj).streamerKey);
    }

    public final String getStreamerKey() {
        return this.streamerKey;
    }

    public int hashCode() {
        return this.streamerKey.hashCode();
    }

    public String toString() {
        return o40.y("StreamerFollowDto(streamerKey=", this.streamerKey, ")");
    }
}
