package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.activity.ComponentActivity;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class by0 implements ViewTreeObserver.OnDrawListener, Runnable, Executor {
    public final long a = SystemClock.uptimeMillis() + ((long) 10000);
    public Runnable b;
    public boolean c;
    public final /* synthetic */ ComponentActivity d;

    public by0(ComponentActivity componentActivity) {
        this.d = componentActivity;
    }

    public final void a(View view) {
        if (this.c) {
            return;
        }
        this.c = true;
        view.getViewTreeObserver().addOnDrawListener(this);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        js3.p(runnable, "runnable");
        this.b = runnable;
        View decorView = this.d.getWindow().getDecorView();
        js3.o(decorView, "getDecorView(...)");
        if (!this.c) {
            decorView.postOnAnimation(new b7(10, this));
        } else if (js3.i(Looper.myLooper(), Looper.getMainLooper())) {
            decorView.invalidate();
        } else {
            decorView.postInvalidate();
        }
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        boolean z;
        ComponentActivity componentActivity = this.d;
        Runnable runnable = this.b;
        if (runnable == null) {
            if (SystemClock.uptimeMillis() > this.a) {
                this.c = false;
                componentActivity.getWindow().getDecorView().post(this);
                return;
            }
            return;
        }
        runnable.run();
        this.b = null;
        xo2 xo2Var = (xo2) componentActivity.g.getValue();
        synchronized (xo2Var.c) {
            z = xo2Var.d;
        }
        if (z) {
            this.c = false;
            componentActivity.getWindow().getDecorView().post(this);
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
    }
}
