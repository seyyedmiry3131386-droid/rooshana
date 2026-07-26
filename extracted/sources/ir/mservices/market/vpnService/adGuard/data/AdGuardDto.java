package ir.mservices.market.vpnService.adGuard.data;

import defpackage.js3;
import defpackage.vo7;
import ir.mservices.market.app.detail.data.MessageBoxDto;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class AdGuardDto implements Serializable {

    @vo7("domainsUrl")
    private final String domainsUrl;

    @vo7("messageBox")
    private final MessageBoxDto messageBox;

    public AdGuardDto(MessageBoxDto messageBoxDto, String str) {
        js3.p(str, "domainsUrl");
        this.messageBox = messageBoxDto;
        this.domainsUrl = str;
    }

    public static /* synthetic */ AdGuardDto copy$default(AdGuardDto adGuardDto, MessageBoxDto messageBoxDto, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            messageBoxDto = adGuardDto.messageBox;
        }
        if ((i & 2) != 0) {
            str = adGuardDto.domainsUrl;
        }
        return adGuardDto.copy(messageBoxDto, str);
    }

    public final MessageBoxDto component1() {
        return this.messageBox;
    }

    public final String component2() {
        return this.domainsUrl;
    }

    public final AdGuardDto copy(MessageBoxDto messageBoxDto, String str) {
        js3.p(str, "domainsUrl");
        return new AdGuardDto(messageBoxDto, str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdGuardDto)) {
            return false;
        }
        AdGuardDto adGuardDto = (AdGuardDto) obj;
        return js3.i(this.messageBox, adGuardDto.messageBox) && js3.i(this.domainsUrl, adGuardDto.domainsUrl);
    }

    public final String getDomainsUrl() {
        return this.domainsUrl;
    }

    public final MessageBoxDto getMessageBox() {
        return this.messageBox;
    }

    public int hashCode() {
        MessageBoxDto messageBoxDto = this.messageBox;
        return this.domainsUrl.hashCode() + ((messageBoxDto == null ? 0 : messageBoxDto.hashCode()) * 31);
    }

    public String toString() {
        return "AdGuardDto(messageBox=" + this.messageBox + ", domainsUrl=" + this.domainsUrl + ")";
    }
}
