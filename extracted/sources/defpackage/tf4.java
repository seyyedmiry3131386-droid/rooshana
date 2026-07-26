package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import com.airbnb.lottie.b;
import java.util.concurrent.Semaphore;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tf4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ tf4(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                Drawable drawable = this.b;
                Drawable.Callback callback = drawable.getCallback();
                if (callback != null) {
                    callback.invalidateDrawable(drawable);
                    return;
                }
                return;
            default:
                b bVar = this.b;
                Semaphore semaphore = bVar.N;
                l01 l01Var = bVar.p;
                if (l01Var == null) {
                    return;
                }
                try {
                    semaphore.acquire();
                    l01Var.r(bVar.b.d());
                    if (b.S && bVar.L) {
                        if (bVar.O == null) {
                            bVar.O = new Handler(Looper.getMainLooper());
                            bVar.P = new tf4(bVar, 0);
                        }
                        bVar.O.post(bVar.P);
                    }
                    break;
                } catch (InterruptedException unused) {
                } catch (Throwable th) {
                    semaphore.release();
                    throw th;
                }
                semaphore.release();
                return;
        }
    }
}
