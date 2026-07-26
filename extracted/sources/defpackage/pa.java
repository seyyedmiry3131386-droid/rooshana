package defpackage;

import android.adservices.adid.AdIdManager;
import androidx.privacysandbox.ads.adservices.adid.AdIdManagerImplCommon;

/* JADX INFO: loaded from: classes.dex */
public final class pa extends AdIdManagerImplCommon {
    /* JADX WARN: Illegal instructions before constructor call */
    public pa() {
        js3.p(null, "context");
        AdIdManager adIdManager = AdIdManager.get(null);
        js3.o(adIdManager, "get(context)");
        super(adIdManager);
    }
}
