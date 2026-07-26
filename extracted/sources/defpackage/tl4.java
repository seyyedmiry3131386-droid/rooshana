package defpackage;

import android.os.IBinder;
import androidx.media3.session.legacy.MediaBrowserServiceCompat;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class tl4 implements IBinder.DeathRecipient {
    public final String a;
    public final int b;
    public final int c;
    public final jr4 d;
    public final ql4 e;
    public final HashMap f = new HashMap();
    public final /* synthetic */ MediaBrowserServiceCompat g;

    public tl4(MediaBrowserServiceCompat mediaBrowserServiceCompat, String str, int i, int i2, ql4 ql4Var) {
        this.g = mediaBrowserServiceCompat;
        this.a = str;
        this.b = i;
        this.c = i2;
        this.d = new jr4(str, i, i2);
        this.e = ql4Var;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.g.g.post(new q6(24, this));
    }
}
