package defpackage;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
public final class bo3 implements co3 {
    public final InputContentInfo a;

    public bo3(Object obj) {
        this.a = (InputContentInfo) obj;
    }

    @Override // defpackage.co3
    public final ClipDescription c() {
        return this.a.getDescription();
    }

    @Override // defpackage.co3
    public final Uri d() {
        return this.a.getContentUri();
    }

    @Override // defpackage.co3
    public final void e() {
        this.a.requestPermission();
    }

    @Override // defpackage.co3
    public final Uri f() {
        return this.a.getLinkUri();
    }

    @Override // defpackage.co3
    public final Object g() {
        return this.a;
    }

    public bo3(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.a = new InputContentInfo(uri, clipDescription, uri2);
    }
}
