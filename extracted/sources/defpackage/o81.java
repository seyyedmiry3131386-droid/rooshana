package defpackage;

import com.google.common.collect.ImmutableList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class o81 {
    public final ImmutableList a;
    public final long b;
    public final long c;
    public final long d;

    public o81(List list, long j, long j2) {
        this.a = ImmutableList.n(list);
        this.b = j;
        this.c = j2;
        long j3 = -9223372036854775807L;
        if (j != -9223372036854775807L && j2 != -9223372036854775807L) {
            j3 = j + j2;
        }
        this.d = j3;
    }
}
