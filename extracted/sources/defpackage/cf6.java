package defpackage;

import ir.myket.movie.common.domain.models.SampleWatch;

/* JADX INFO: loaded from: classes3.dex */
public final class cf6 implements kj5 {
    public final SampleWatch a;

    public cf6(SampleWatch sampleWatch) {
        js3.p(sampleWatch, "sampleWatch");
        this.a = sampleWatch;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cf6) && js3.i(this.a, ((cf6) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SubscriptionDialogNavKey(sampleWatch=" + this.a + ")";
    }
}
