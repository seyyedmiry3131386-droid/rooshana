package defpackage;

import android.util.Base64;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ya1 implements vb8 {
    public final /* synthetic */ int a;

    public /* synthetic */ ya1(int i) {
        this.a = i;
    }

    @Override // defpackage.vb8
    public final Object get() {
        switch (this.a) {
            case 0:
                ExecutorService executorServiceNewSingleThreadExecutor = Executors.newSingleThreadExecutor();
                if (executorServiceNewSingleThreadExecutor instanceof u94) {
                    return (u94) executorServiceNewSingleThreadExecutor;
                }
                return executorServiceNewSingleThreadExecutor instanceof ScheduledExecutorService ? new zx4((ScheduledExecutorService) executorServiceNewSingleThreadExecutor) : new wx4(executorServiceNewSingleThreadExecutor);
            case 1:
                byte[] bArr = new byte[12];
                pg1.i.nextBytes(bArr);
                return Base64.encodeToString(bArr, 10);
            case 2:
                return new yf1(new qc1(65536), 50000, 50000, 1000, 2000, false, 0, false);
            case 3:
                try {
                    return Class.forName("androidx.media3.effect.DefaultVideoFrameProcessor$Factory$Builder");
                } catch (Exception e) {
                    throw new IllegalStateException(e);
                }
            default:
                throw new IllegalStateException();
        }
    }
}
