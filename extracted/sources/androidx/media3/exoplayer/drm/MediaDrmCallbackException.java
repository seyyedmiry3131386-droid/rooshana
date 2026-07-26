package androidx.media3.exoplayer.drm;

import android.net.Uri;
import defpackage.db1;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class MediaDrmCallbackException extends IOException {
    public MediaDrmCallbackException(db1 db1Var, Uri uri, Map map, long j, Exception exc) {
        super(exc);
    }
}
