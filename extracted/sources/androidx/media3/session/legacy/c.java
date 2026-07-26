package androidx.media3.session.legacy;

import android.media.session.MediaController;
import android.net.Uri;
import android.os.Bundle;
import defpackage.o40;

/* JADX INFO: loaded from: classes.dex */
public abstract class c extends b {
    public final MediaController.TransportControls a;

    public c(MediaController.TransportControls transportControls) {
        this.a = transportControls;
    }

    public void a() {
        e(null, "android.support.v4.media.session.action.PREPARE");
    }

    public void b(Bundle bundle, String str) {
        Bundle bundle2 = new Bundle();
        bundle2.putString("android.support.v4.media.session.action.ARGUMENT_MEDIA_ID", str);
        bundle2.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle);
        e(bundle2, "android.support.v4.media.session.action.PREPARE_FROM_MEDIA_ID");
    }

    public void c(Bundle bundle, String str) {
        Bundle bundle2 = new Bundle();
        bundle2.putString("android.support.v4.media.session.action.ARGUMENT_QUERY", str);
        bundle2.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle);
        e(bundle2, "android.support.v4.media.session.action.PREPARE_FROM_SEARCH");
    }

    public void d(Uri uri, Bundle bundle) {
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("android.support.v4.media.session.action.ARGUMENT_URI", uri);
        bundle2.putBundle("android.support.v4.media.session.action.ARGUMENT_EXTRAS", bundle);
        e(bundle2, "android.support.v4.media.session.action.PREPARE_FROM_URI");
    }

    public final void e(Bundle bundle, String str) {
        if (str != null && ((str.equals("android.support.v4.media.session.action.FOLLOW") || str.equals("android.support.v4.media.session.action.UNFOLLOW")) && (bundle == null || !bundle.containsKey("android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE")))) {
            throw new IllegalArgumentException(o40.y("An extra field android.support.v4.media.session.ARGUMENT_MEDIA_ATTRIBUTE is required for this action ", str, "."));
        }
        this.a.sendCustomAction(str, bundle);
    }

    public void f(float f) {
        if (f == 0.0f) {
            throw new IllegalArgumentException("speed must not be zero");
        }
        Bundle bundle = new Bundle();
        bundle.putFloat("android.support.v4.media.session.action.ARGUMENT_PLAYBACK_SPEED", f);
        e(bundle, "android.support.v4.media.session.action.SET_PLAYBACK_SPEED");
    }
}
