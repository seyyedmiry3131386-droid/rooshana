package kotlin.time;

import defpackage.cq3;
import defpackage.js3;
import defpackage.xq2;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements cq3 {
    public final String a;
    public final String b;

    public a(String str, String str2) {
        js3.p(str, "error");
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.cq3
    public final Instant toInstant() {
        throw new InstantFormatException(this.a + " when parsing an Instant from \"" + xq2.N(64, this.b) + '\"');
    }
}
