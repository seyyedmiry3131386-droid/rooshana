package defpackage;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.p1;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class p81 implements ta8 {
    public static final p1 c = p1.c().g(new l31(9));
    public final ImmutableList a;
    public final long[] b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public p81(java.util.List r19) {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p81.<init>(java.util.List):void");
    }

    @Override // defpackage.ta8
    public final int a(long j) {
        int iA = j29.a(this.b, j, false);
        if (iA < this.a.size()) {
            return iA;
        }
        return -1;
    }

    @Override // defpackage.ta8
    public final long e(int i) {
        vy2.j(i < this.a.size());
        return this.b[i];
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ta8
    public final List h(long j) {
        int iE = j29.e(this.b, j, false);
        return iE == -1 ? ImmutableList.q() : (ImmutableList) this.a.get(iE);
    }

    @Override // defpackage.ta8
    public final int k() {
        return this.a.size();
    }
}
