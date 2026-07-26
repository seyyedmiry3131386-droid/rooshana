package defpackage;

import android.adservices.adselection.AdSelectionManager;
import androidx.privacysandbox.ads.adservices.adselection.AdSelectionManagerImplCommon;

/* JADX INFO: loaded from: classes.dex */
public final class nb extends AdSelectionManagerImplCommon {
    /* JADX WARN: Illegal instructions before constructor call */
    public nb() {
        js3.p(null, "context");
        AdSelectionManager adSelectionManager = AdSelectionManager.get(null);
        js3.o(adSelectionManager, "get(context)");
        super(adSelectionManager);
    }
}
