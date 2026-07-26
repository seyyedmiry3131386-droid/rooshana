package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* JADX INFO: loaded from: classes.dex */
public final class ji9 extends BasePendingResult {
    public final Status N;

    public ji9(Status status) {
        super(null);
        this.N = status;
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    public final f87 p0(Status status) {
        return this.N;
    }
}
