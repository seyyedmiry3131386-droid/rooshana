package defpackage;

import j$.util.concurrent.ThreadLocalRandom;
import java.util.Random;

/* JADX INFO: loaded from: classes3.dex */
public final class ea6 extends x1 {
    @Override // defpackage.yu6
    public final int c(int i, int i2) {
        return ThreadLocalRandom.current().nextInt(i, i2);
    }

    @Override // defpackage.x1
    public final Random e() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        js3.o(threadLocalRandomCurrent, "current(...)");
        return threadLocalRandomCurrent;
    }
}
