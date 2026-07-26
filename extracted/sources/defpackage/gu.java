package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.os.Build;
import androidx.media3.common.b;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class gu implements om4, yz1, nt2 {
    public final Context a;

    public /* synthetic */ gu(Context context, boolean z) {
        this.a = context;
    }

    @Override // defpackage.yz1
    public void a(ct2 ct2Var) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new v01("EmojiCompatInitializer", 0));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new ii(this, ct2Var, threadPoolExecutor, 8));
    }

    @Override // defpackage.om4
    public pm4 c(on onVar) {
        Context context;
        int i = Build.VERSION.SDK_INT;
        if (i < 31 && ((context = this.a) == null || i < 28 || !context.getPackageManager().hasSystemFeature("com.amazon.hardware.tv_screen"))) {
            return new sl3(27).c(onVar);
        }
        int iH = tv4.h(((b) onVar.c).n);
        wn5.Q("Creating an asynchronous MediaCodec adapter for track type " + j29.J(iH));
        return new qq4(new sx(iH, 0), new sx(iH, 1)).c(onVar);
    }

    @Override // defpackage.nt2
    public Object get() {
        return (ConnectivityManager) this.a.getSystemService("connectivity");
    }

    public gu(Context context) {
        this.a = context.getApplicationContext();
    }
}
