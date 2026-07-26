package defpackage;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: loaded from: classes.dex */
public abstract class i70 extends BasePendingResult {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i70(qq4 qq4Var, GoogleApiClient googleApiClient) {
        super(googleApiClient);
        rq4.o(googleApiClient, "GoogleApiClient must not be null");
        rq4.o(qq4Var, "Api must not be null");
    }

    public abstract void t0(sl slVar);

    public final void u0(Status status) {
        rq4.h("Failed result must not be success", !status.u());
        s0(p0(status));
    }
}
