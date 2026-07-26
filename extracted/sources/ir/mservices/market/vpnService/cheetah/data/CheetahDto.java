package ir.mservices.market.vpnService.cheetah.data;

import defpackage.dw1;
import defpackage.js3;
import defpackage.rm7;
import defpackage.vo7;
import ir.mservices.market.app.detail.data.MessageBoxDto;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class CheetahDto implements Serializable {

    @vo7("messageBox")
    private final MessageBoxDto messageBox;

    @vo7("packageNames")
    private final List<String> packageNames;

    @vo7("primaryDNS")
    private final String primaryDNS;

    @vo7("secondaryDNS")
    private final String secondaryDNS;

    public CheetahDto(MessageBoxDto messageBoxDto, List<String> list, String str, String str2) {
        js3.p(str, "primaryDNS");
        js3.p(str2, "secondaryDNS");
        this.messageBox = messageBoxDto;
        this.packageNames = list;
        this.primaryDNS = str;
        this.secondaryDNS = str2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CheetahDto copy$default(CheetahDto cheetahDto, MessageBoxDto messageBoxDto, List list, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            messageBoxDto = cheetahDto.messageBox;
        }
        if ((i & 2) != 0) {
            list = cheetahDto.packageNames;
        }
        if ((i & 4) != 0) {
            str = cheetahDto.primaryDNS;
        }
        if ((i & 8) != 0) {
            str2 = cheetahDto.secondaryDNS;
        }
        return cheetahDto.copy(messageBoxDto, list, str, str2);
    }

    public final MessageBoxDto component1() {
        return this.messageBox;
    }

    public final List<String> component2() {
        return this.packageNames;
    }

    public final String component3() {
        return this.primaryDNS;
    }

    public final String component4() {
        return this.secondaryDNS;
    }

    public final CheetahDto copy(MessageBoxDto messageBoxDto, List<String> list, String str, String str2) {
        js3.p(str, "primaryDNS");
        js3.p(str2, "secondaryDNS");
        return new CheetahDto(messageBoxDto, list, str, str2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CheetahDto)) {
            return false;
        }
        CheetahDto cheetahDto = (CheetahDto) obj;
        return js3.i(this.messageBox, cheetahDto.messageBox) && js3.i(this.packageNames, cheetahDto.packageNames) && js3.i(this.primaryDNS, cheetahDto.primaryDNS) && js3.i(this.secondaryDNS, cheetahDto.secondaryDNS);
    }

    public final MessageBoxDto getMessageBox() {
        return this.messageBox;
    }

    public final List<String> getPackageNames() {
        return this.packageNames;
    }

    public final String getPrimaryDNS() {
        return this.primaryDNS;
    }

    public final String getSecondaryDNS() {
        return this.secondaryDNS;
    }

    public int hashCode() {
        MessageBoxDto messageBoxDto = this.messageBox;
        int iHashCode = (messageBoxDto == null ? 0 : messageBoxDto.hashCode()) * 31;
        List<String> list = this.packageNames;
        return this.secondaryDNS.hashCode() + rm7.k(this.primaryDNS, (iHashCode + (list != null ? list.hashCode() : 0)) * 31, 31);
    }

    public String toString() {
        MessageBoxDto messageBoxDto = this.messageBox;
        List<String> list = this.packageNames;
        String str = this.primaryDNS;
        String str2 = this.secondaryDNS;
        StringBuilder sb = new StringBuilder("CheetahDto(messageBox=");
        sb.append(messageBoxDto);
        sb.append(", packageNames=");
        sb.append(list);
        sb.append(", primaryDNS=");
        return dw1.p(str, ", secondaryDNS=", str2, ")", sb);
    }
}
