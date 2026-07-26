package defpackage;

import androidx.compose.runtime.snapshots.a;

/* JADX INFO: loaded from: classes.dex */
public final class ut2 implements dp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ dp2 b;

    public /* synthetic */ ut2(int i, dp2 dp2Var) {
        this.a = i;
        this.b = dp2Var;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        long j;
        switch (this.a) {
            case 0:
                a aVar = (a) obj;
                synchronized (g08.c) {
                    j = g08.e;
                    g08.e = ((long) 1) + j;
                }
                return new qv6(j, aVar, this.b);
            default:
                return this.b.invoke(Long.valueOf(((Number) obj).longValue() / 1000000));
        }
    }
}
