package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.profileinstaller.ProfileInstallerInitializer;
import java.util.Random;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nk implements Choreographer.FrameCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nk(ProfileInstallerInitializer profileInstallerInitializer, Context context) {
        this.a = 2;
        this.b = context;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        switch (this.a) {
            case 0:
                ((Runnable) this.b).run();
                break;
            case 1:
                ((Runnable) this.b).run();
                break;
            default:
                (Build.VERSION.SDK_INT >= 28 ? ul.h(Looper.getMainLooper()) : new Handler(Looper.getMainLooper())).postDelayed(new vm((Context) this.b, 1), new Random().nextInt(Math.max(1000, 1)) + 5000);
                break;
        }
    }

    public /* synthetic */ nk(Runnable runnable, int i) {
        this.a = i;
        this.b = runnable;
    }
}
