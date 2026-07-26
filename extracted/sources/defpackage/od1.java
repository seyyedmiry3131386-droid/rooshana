package defpackage;

import android.os.Handler;
import android.view.Choreographer;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class od1 implements Executor {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ od1(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        switch (this.a) {
            case 0:
                ((Handler) this.b).post(runnable);
                break;
            case 1:
                j29.a0(((qn4) this.b).h, runnable);
                break;
            case 2:
                j29.a0(((xp4) this.b).d, runnable);
                break;
            case 3:
                j29.a0(((xq4) this.b).l, runnable);
                break;
            default:
                ((Choreographer) this.b).postFrameCallback(new nk(runnable, 1));
                break;
        }
    }
}
