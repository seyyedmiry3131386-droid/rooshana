package defpackage;

import com.google.gson.reflect.TypeToken;
import ir.mservices.market.vpnService.adGuard.data.AdGuardDomainDto;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes3.dex */
public final class na extends o2 {
    public final Object g(String str, Object obj, g51 g51Var) {
        Type type = new TypeToken<AdGuardDomainDto>() { // from class: ir.mservices.market.vpnService.adGuard.services.AdGuardService$getDomains$2
        }.getType();
        js3.o(type, "getType(...)");
        return dy3.v(this, type, new z57(str), obj, g51Var, 504);
    }
}
