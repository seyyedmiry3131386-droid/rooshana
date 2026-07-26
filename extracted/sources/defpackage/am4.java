package defpackage;

import androidx.media.MediaBrowserServiceCompat;

/* JADX INFO: loaded from: classes.dex */
public class am4 extends rb4 {
    public final /* synthetic */ MediaBrowserServiceCompat i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public am4(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
        super(mediaBrowserServiceCompat);
        this.i = mediaBrowserServiceCompat;
    }

    @Override // defpackage.rb4
    public final void G() {
        yl4 yl4Var = new yl4(this, this.i);
        this.b = yl4Var;
        yl4Var.onCreate();
    }
}
