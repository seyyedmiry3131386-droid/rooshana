package androidx.media3.session.legacy;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v4.os.ResultReceiver;
import defpackage.qq4;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedApi"})
class MediaBrowserCompat$ItemReceiver extends ResultReceiver {
    @Override // android.support.v4.os.ResultReceiver
    public final void a(int i, Bundle bundle) {
        if (bundle != null) {
            bundle = qq4.H(bundle);
        }
        if (i != 0 || bundle == null || !bundle.containsKey("media_item")) {
            throw null;
        }
        throw null;
    }
}
