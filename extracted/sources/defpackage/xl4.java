package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.service.media.MediaBrowserService;
import androidx.media3.session.legacy.MediaBrowserServiceCompat;

/* JADX INFO: loaded from: classes.dex */
public final class xl4 extends wl4 {
    public final /* synthetic */ zl4 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xl4(zl4 zl4Var, Context context) {
        super(zl4Var, context);
        this.d = zl4Var;
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadChildren(String str, MediaBrowserService.Result result, Bundle bundle) {
        qq4.l(bundle);
        zl4 zl4Var = this.d;
        MediaBrowserServiceCompat mediaBrowserServiceCompat = zl4Var.i;
        tl4 tl4Var = mediaBrowserServiceCompat.c;
        vl4 vl4Var = new vl4(zl4Var, str, new r79(26, result), bundle);
        mediaBrowserServiceCompat.f = tl4Var;
        vl4Var.c = 1;
        mediaBrowserServiceCompat.b(vl4Var);
        mediaBrowserServiceCompat.f = null;
        mediaBrowserServiceCompat.f = null;
    }
}
