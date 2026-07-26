package ir.mservices.market.vpnService.adGuard.data;

import defpackage.js3;
import ir.mservices.market.app.detail.data.MessageBoxDto;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class AdGuardData implements Serializable {
    private final List<String> domains;
    private final MessageBoxDto messageBox;

    public AdGuardData(MessageBoxDto messageBoxDto, List<String> list) {
        js3.p(list, "domains");
        this.messageBox = messageBoxDto;
        this.domains = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdGuardData copy$default(AdGuardData adGuardData, MessageBoxDto messageBoxDto, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            messageBoxDto = adGuardData.messageBox;
        }
        if ((i & 2) != 0) {
            list = adGuardData.domains;
        }
        return adGuardData.copy(messageBoxDto, list);
    }

    public final MessageBoxDto component1() {
        return this.messageBox;
    }

    public final List<String> component2() {
        return this.domains;
    }

    public final AdGuardData copy(MessageBoxDto messageBoxDto, List<String> list) {
        js3.p(list, "domains");
        return new AdGuardData(messageBoxDto, list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdGuardData)) {
            return false;
        }
        AdGuardData adGuardData = (AdGuardData) obj;
        return js3.i(this.messageBox, adGuardData.messageBox) && js3.i(this.domains, adGuardData.domains);
    }

    public final List<String> getDomains() {
        return this.domains;
    }

    public final MessageBoxDto getMessageBox() {
        return this.messageBox;
    }

    public int hashCode() {
        MessageBoxDto messageBoxDto = this.messageBox;
        return this.domains.hashCode() + ((messageBoxDto == null ? 0 : messageBoxDto.hashCode()) * 31);
    }

    public String toString() {
        return "AdGuardData(messageBox=" + this.messageBox + ", domains=" + this.domains + ")";
    }
}
