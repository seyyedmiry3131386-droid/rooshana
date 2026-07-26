package ir.mservices.market.reels.home.data;

import defpackage.bf5;
import defpackage.dw1;
import defpackage.js3;
import defpackage.rm7;
import defpackage.vo7;
import ir.mservices.market.reels.data.ReelHomeDto;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class ReelsHomeDto implements bf5, Serializable {

    @vo7("displayMode")
    private final String displayMode;

    @vo7("eol")
    private final boolean eol;

    @vo7("reels")
    private final List<ReelHomeDto> reels;

    public ReelsHomeDto(boolean z, List<ReelHomeDto> list, String str) {
        js3.p(list, "reels");
        js3.p(str, "displayMode");
        this.eol = z;
        this.reels = list;
        this.displayMode = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReelsHomeDto copy$default(ReelsHomeDto reelsHomeDto, boolean z, List list, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = reelsHomeDto.eol;
        }
        if ((i & 2) != 0) {
            list = reelsHomeDto.reels;
        }
        if ((i & 4) != 0) {
            str = reelsHomeDto.displayMode;
        }
        return reelsHomeDto.copy(z, list, str);
    }

    public final boolean component1() {
        return this.eol;
    }

    public final List<ReelHomeDto> component2() {
        return this.reels;
    }

    public final String component3() {
        return this.displayMode;
    }

    public final ReelsHomeDto copy(boolean z, List<ReelHomeDto> list, String str) {
        js3.p(list, "reels");
        js3.p(str, "displayMode");
        return new ReelsHomeDto(z, list, str);
    }

    @Override // defpackage.bf5
    public boolean endOfList() {
        return this.eol;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ReelsHomeDto)) {
            return false;
        }
        ReelsHomeDto reelsHomeDto = (ReelsHomeDto) obj;
        return this.eol == reelsHomeDto.eol && js3.i(this.reels, reelsHomeDto.reels) && js3.i(this.displayMode, reelsHomeDto.displayMode);
    }

    public final String getDisplayMode() {
        return this.displayMode;
    }

    public final boolean getEol() {
        return this.eol;
    }

    public final List<ReelHomeDto> getReels() {
        return this.reels;
    }

    public int hashCode() {
        return this.displayMode.hashCode() + rm7.i((this.eol ? 1231 : 1237) * 31, 31, this.reels);
    }

    public String toString() {
        boolean z = this.eol;
        List<ReelHomeDto> list = this.reels;
        String str = this.displayMode;
        StringBuilder sb = new StringBuilder("ReelsHomeDto(eol=");
        sb.append(z);
        sb.append(", reels=");
        sb.append(list);
        sb.append(", displayMode=");
        return dw1.s(sb, str, ")");
    }
}
