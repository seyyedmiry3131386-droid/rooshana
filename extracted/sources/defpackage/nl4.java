package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Messenger;
import android.os.Process;
import android.support.v4.media.session.MediaSessionCompat$Token;

/* JADX INFO: loaded from: classes.dex */
public class nl4 {
    public final Context a;
    public final MediaBrowser b;
    public final Bundle c;
    public final kl4 d = new kl4(this);
    public final wv e = new wv(0);
    public hh2 f;
    public Messenger g;
    public MediaSessionCompat$Token h;

    public nl4(Context context, ComponentName componentName, on onVar) {
        this.a = context;
        Bundle bundle = new Bundle();
        this.c = bundle;
        bundle.putInt("extra_client_version", 1);
        bundle.putInt("extra_calling_pid", Process.myPid());
        onVar.b = this;
        this.b = new MediaBrowser(context, componentName, (ll4) onVar.a, bundle);
    }
}
