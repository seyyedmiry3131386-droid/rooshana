package ir.mservices.market.vpnService.adGuard.data;

import defpackage.js3;
import defpackage.vo7;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class AdGuardDomainDto implements Serializable {

    @vo7("domains")
    private final List<String> domains;

    public AdGuardDomainDto(List<String> list) {
        js3.p(list, "domains");
        this.domains = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdGuardDomainDto copy$default(AdGuardDomainDto adGuardDomainDto, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = adGuardDomainDto.domains;
        }
        return adGuardDomainDto.copy(list);
    }

    public final List<String> component1() {
        return this.domains;
    }

    public final AdGuardDomainDto copy(List<String> list) {
        js3.p(list, "domains");
        return new AdGuardDomainDto(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AdGuardDomainDto) && js3.i(this.domains, ((AdGuardDomainDto) obj).domains);
    }

    public final List<String> getDomains() {
        return this.domains;
    }

    public int hashCode() {
        return this.domains.hashCode();
    }

    public String toString() {
        return "AdGuardDomainDto(domains=" + this.domains + ")";
    }
}
