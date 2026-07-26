package defpackage;

import androidx.media3.session.legacy.MediaBrowserServiceCompat;

/* JADX INFO: loaded from: classes.dex */
public class zl4 extends rb4 {
    public final /* synthetic */ MediaBrowserServiceCompat i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zl4(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
        super(mediaBrowserServiceCompat);
        this.i = mediaBrowserServiceCompat;
    }

    @Override // defpackage.rb4
    public final void G() {
        xl4 xl4Var = new xl4(this, this.i);
        this.b = xl4Var;
        xl4Var.onCreate();
    }
}
