package defpackage;

import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: loaded from: classes.dex */
public class on4 extends nn4 {
    @Override // androidx.media3.session.legacy.c
    public final void a() {
        this.a.prepare();
    }

    @Override // androidx.media3.session.legacy.c
    public final void b(Bundle bundle, String str) {
        this.a.prepareFromMediaId(str, bundle);
    }

    @Override // androidx.media3.session.legacy.c
    public final void c(Bundle bundle, String str) {
        this.a.prepareFromSearch(str, bundle);
    }

    @Override // androidx.media3.session.legacy.c
    public final void d(Uri uri, Bundle bundle) {
        this.a.prepareFromUri(uri, bundle);
    }
}
