package ir.mservices.market.movie.streamers.data;

import defpackage.bf5;
import defpackage.js3;
import defpackage.vo7;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamersDto implements Serializable, bf5 {

    @vo7("eol")
    private final boolean eol;

    @vo7("streamers")
    private final List<StreamerDto> streamers;

    public StreamersDto(List<StreamerDto> list, boolean z) {
        js3.p(list, "streamers");
        this.streamers = list;
        this.eol = z;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StreamersDto copy$default(StreamersDto streamersDto, List list, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            list = streamersDto.streamers;
        }
        if ((i & 2) != 0) {
            z = streamersDto.eol;
        }
        return streamersDto.copy(list, z);
    }

    public final List<StreamerDto> component1() {
        return this.streamers;
    }

    public final boolean component2() {
        return this.eol;
    }

    public final StreamersDto copy(List<StreamerDto> list, boolean z) {
        js3.p(list, "streamers");
        return new StreamersDto(list, z);
    }

    @Override // defpackage.bf5
    public boolean endOfList() {
        return this.eol;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreamersDto)) {
            return false;
        }
        StreamersDto streamersDto = (StreamersDto) obj;
        return js3.i(this.streamers, streamersDto.streamers) && this.eol == streamersDto.eol;
    }

    public final boolean getEol() {
        return this.eol;
    }

    public final List<StreamerDto> getStreamers() {
        return this.streamers;
    }

    public int hashCode() {
        return (this.streamers.hashCode() * 31) + (this.eol ? 1231 : 1237);
    }

    public String toString() {
        return "StreamersDto(streamers=" + this.streamers + ", eol=" + this.eol + ")";
    }
}
