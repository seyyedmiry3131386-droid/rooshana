package defpackage;

import android.adservices.customaudience.CustomAudienceManager;

/* JADX INFO: loaded from: classes.dex */
public final class v81 extends x81 {
    /* JADX WARN: Illegal instructions before constructor call */
    public v81() {
        js3.p(null, "context");
        CustomAudienceManager customAudienceManager = CustomAudienceManager.get(null);
        js3.o(customAudienceManager, "get(context)");
        super(customAudienceManager);
    }
}
