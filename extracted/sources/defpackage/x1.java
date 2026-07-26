package defpackage;

import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public abstract class x1 extends yu6 {
    @Override // defpackage.yu6
    public final int a(int i) {
        return ((-i) >> 31) & (e().nextInt() >>> (32 - i));
    }

    @Override // defpackage.yu6
    public final int b() {
        return e().nextInt();
    }

    public abstract Random e();
}
