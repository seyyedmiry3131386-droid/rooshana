package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import j$.util.Objects;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class bj9 implements q46 {
    public final /* synthetic */ BasePendingResult a;
    public final /* synthetic */ rn6 b;

    public bj9(rn6 rn6Var, BasePendingResult basePendingResult) {
        this.a = basePendingResult;
        Objects.requireNonNull(rn6Var);
        this.b = rn6Var;
    }

    @Override // defpackage.q46
    public final void a(Status status) {
        ((Map) this.b.b).remove(this.a);
    }
}
