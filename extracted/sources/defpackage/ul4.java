package defpackage;

import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;
import androidx.media.MediaBrowserServiceCompat;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public final class ul4 implements IBinder.DeathRecipient {
    public final String a;
    public final int b;
    public final int c;
    public final nm5 d;
    public final HashMap e = new HashMap();
    public final /* synthetic */ MediaBrowserServiceCompat f;

    public ul4(MediaBrowserServiceCompat mediaBrowserServiceCompat, String str, int i, int i2, nm5 nm5Var) {
        this.f = mediaBrowserServiceCompat;
        this.a = str;
        this.b = i;
        this.c = i2;
        if (str == null) {
            throw new NullPointerException("package shouldn't be null");
        }
        if (TextUtils.isEmpty(str)) {
            throw new IllegalArgumentException("packageName should be nonempty");
        }
        if (Build.VERSION.SDK_INT >= 28) {
            nr4.a(str, i, i2);
        }
        this.d = nm5Var;
    }

    @Override // android.os.IBinder.DeathRecipient
    public final void binderDied() {
        this.f.f.post(new q6(25, this));
    }
}
