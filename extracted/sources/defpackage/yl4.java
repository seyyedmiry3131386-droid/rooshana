package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.service.media.MediaBrowserService;

/* JADX INFO: loaded from: classes.dex */
public final class yl4 extends wl4 {
    public final /* synthetic */ am4 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yl4(am4 am4Var, Context context) {
        super(am4Var, context, (char) 0);
        this.d = am4Var;
    }

    @Override // android.service.media.MediaBrowserService
    public final void onLoadChildren(String str, MediaBrowserService.Result result, Bundle bundle) {
        rq4.v(bundle);
        this.d.i.b();
    }
}
