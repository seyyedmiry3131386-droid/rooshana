package kotlin.time;

import defpackage.cq3;
import defpackage.ct2;

/* JADX INFO: loaded from: classes3.dex */
public final class b implements cq3 {
    public final long a;
    public final int b;

    public b(int i, long j) {
        this.a = j;
        this.b = i;
    }

    @Override // defpackage.cq3
    public final Instant toInstant() {
        long j = Instant.c.a;
        long j2 = this.a;
        if (j2 >= j && j2 <= Instant.d.a) {
            return ct2.j(this.b, j2);
        }
        throw new InstantFormatException("The parsed date is outside the range representable by Instant (Unix epoch second " + j2 + ')');
    }
}
