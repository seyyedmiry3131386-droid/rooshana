package defpackage;

import androidx.media3.session.legacy.MediaBrowserServiceCompat;

/* JADX INFO: loaded from: classes.dex */
public final class bm4 extends zl4 {
    public final /* synthetic */ MediaBrowserServiceCompat j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bm4(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
        super(mediaBrowserServiceCompat);
        this.j = mediaBrowserServiceCompat;
    }

    @Override // defpackage.rb4
    public final jr4 t() {
        MediaBrowserServiceCompat mediaBrowserServiceCompat = this.j;
        tl4 tl4Var = mediaBrowserServiceCompat.f;
        if (tl4Var == null) {
            throw new IllegalStateException("This should be called inside of onGetRoot, onLoadChildren, onLoadItem, onSearch, or onCustomAction methods");
        }
        if (tl4Var != mediaBrowserServiceCompat.c) {
            return tl4Var.d;
        }
        wl4 wl4Var = (wl4) this.b;
        wl4Var.getClass();
        return new jr4(wl4Var.getCurrentBrowserInfo());
    }
}
