package defpackage;

import android.adservices.appsetid.AppSetIdManager;
import androidx.privacysandbox.ads.adservices.appsetid.AppSetIdManagerImplCommon;

/* JADX INFO: loaded from: classes.dex */
public final class ts extends AppSetIdManagerImplCommon {
    /* JADX WARN: Illegal instructions before constructor call */
    public ts() {
        js3.p(null, "context");
        AppSetIdManager appSetIdManager = AppSetIdManager.get(null);
        js3.o(appSetIdManager, "get(context)");
        super(appSetIdManager);
    }
}
