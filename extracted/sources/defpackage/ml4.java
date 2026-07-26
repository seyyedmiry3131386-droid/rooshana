package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Messenger;
import android.os.Process;
import androidx.media3.session.legacy.MediaSessionCompat$Token;

/* JADX INFO: loaded from: classes.dex */
public class ml4 {
    public final Context a;
    public final MediaBrowser b;
    public final Bundle c;
    public final kl4 d = new kl4(this);
    public final wv e = new wv(0);
    public nc2 f;
    public Messenger g;
    public MediaSessionCompat$Token h;

    public ml4(Context context, ComponentName componentName, y yVar, Bundle bundle) {
        this.a = context;
        Bundle bundle2 = bundle != null ? new Bundle(bundle) : new Bundle();
        this.c = bundle2;
        bundle2.putInt("extra_client_version", 1);
        bundle2.putInt("extra_calling_pid", Process.myPid());
        yVar.b = this;
        ll4 ll4Var = (ll4) yVar.a;
        ll4Var.getClass();
        this.b = new MediaBrowser(context, componentName, ll4Var, bundle2);
    }
}
