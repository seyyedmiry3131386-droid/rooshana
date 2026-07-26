package defpackage;

import android.os.IBinder;
import android.os.Messenger;
import androidx.media.MediaBrowserServiceCompat;

/* JADX INFO: loaded from: classes.dex */
public final class gm4 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ nm5 b;
    public final /* synthetic */ ck4 c;

    public /* synthetic */ gm4(ck4 ck4Var, nm5 nm5Var, int i) {
        this.a = i;
        this.c = ck4Var;
        this.b = nm5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                ul4 ul4Var = (ul4) ((MediaBrowserServiceCompat) this.c.b).e.remove(((Messenger) this.b.b).getBinder());
                if (ul4Var != null) {
                    ((Messenger) ul4Var.d.b).getBinder().unlinkToDeath(ul4Var, 0);
                }
                break;
            default:
                IBinder binder = ((Messenger) this.b.b).getBinder();
                ul4 ul4Var2 = (ul4) ((MediaBrowserServiceCompat) this.c.b).e.remove(binder);
                if (ul4Var2 != null) {
                    binder.unlinkToDeath(ul4Var2, 0);
                }
                break;
        }
    }
}
