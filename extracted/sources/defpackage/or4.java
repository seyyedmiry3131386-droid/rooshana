package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.session.MediaSessionService;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class or4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaSessionService b;
    public final /* synthetic */ jq4 c;

    public /* synthetic */ or4(MediaSessionService mediaSessionService, jq4 jq4Var, int i) {
        this.a = i;
        this.b = mediaSessionService;
        this.c = jq4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        MediaSessionService mediaSessionService = this.b;
        switch (i) {
            case 0:
                jq4 jq4Var = this.c;
                xq4 xq4Var = jq4Var.a;
                int i2 = MediaSessionService.g;
                xp4 xp4VarB = mediaSessionService.b(null);
                MediaSessionService mediaSessionService2 = xp4VarB.a;
                HashMap map = xp4VarB.g;
                if (!map.containsKey(jq4Var)) {
                    wp4 wp4Var = new wp4(xp4VarB, mediaSessionService2, jq4Var);
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("androidx.media3.session.MediaNotificationManager", true);
                    eq7 eq7Var = xq4Var.j;
                    eq7Var.getClass();
                    Bundle bundle2 = Bundle.EMPTY;
                    j29.x();
                    Bundle bundle3 = new Bundle(bundle);
                    Looper mainLooper = Looper.getMainLooper();
                    mainLooper.getClass();
                    qn4 qn4Var = new qn4(mainLooper);
                    j29.a0(new Handler(mainLooper), new dn4(qn4Var, new gn4(mediaSessionService2, eq7Var, bundle3, wp4Var, mainLooper, qn4Var, eq7Var.a.d() ? new do3(new ab1(mediaSessionService2)) : null), 0));
                    map.put(jq4Var, new vp4(qn4Var));
                    qn4Var.e(new m11(xp4VarB, qn4Var, wp4Var, jq4Var, 3), xp4VarB.e);
                }
                xq4Var.w = new nm5(28, mediaSessionService);
                break;
            default:
                int i3 = MediaSessionService.g;
                HashMap map2 = mediaSessionService.b(null).g;
                jq4 jq4Var2 = this.c;
                vp4 vp4Var = (vp4) map2.remove(jq4Var2);
                if (vp4Var != null) {
                    gn4.i0(vp4Var.a);
                }
                jq4Var2.a.w = null;
                break;
        }
    }
}
