package defpackage;

import android.os.Trace;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public final class b02 implements Runnable {
    public static final /* synthetic */ b02 b = new b02(2);
    public static final /* synthetic */ b02 c = new b02(3);
    public final /* synthetic */ int a;

    public /* synthetic */ b02(int i) {
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                try {
                    Method method = uo8.b;
                    Trace.beginSection("EmojiCompat.EmojiCompatInitializer.run");
                    if (zz1.d()) {
                        zz1.a().e();
                        break;
                    }
                    Trace.endSection();
                    return;
                } catch (Throwable th) {
                    Method method2 = uo8.b;
                    Trace.endSection();
                    throw th;
                }
            case 1:
            case 2:
                return;
            default:
                or9.i.incrementAndGet();
                return;
        }
    }

    private final void a() {
    }

    private final /* synthetic */ void b() {
    }
}
