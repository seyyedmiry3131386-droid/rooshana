package androidx.media3.session.legacy;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.os.ResultReceiver;
import defpackage.qq4;
import defpackage.yh0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"RestrictedApi"})
class MediaBrowserCompat$SearchResultReceiver extends ResultReceiver {
    @Override // android.support.v4.os.ResultReceiver
    public final void a(int i, Bundle bundle) {
        if (bundle != null) {
            bundle = qq4.H(bundle);
        }
        if (i != 0 || bundle == null || !bundle.containsKey("search_results")) {
            throw null;
        }
        Parcelable[] parcelableArray = bundle.getParcelableArray("search_results");
        parcelableArray.getClass();
        ArrayList arrayList = new ArrayList(parcelableArray.length);
        for (Parcelable parcelable : parcelableArray) {
            arrayList.add((MediaBrowserCompat$MediaItem) yh0.p(parcelable, MediaBrowserCompat$MediaItem.CREATOR));
        }
        throw null;
    }
}
