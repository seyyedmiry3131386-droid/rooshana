package defpackage;

import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;

/* JADX INFO: loaded from: classes.dex */
public final class yy extends ContentObserver {
    public final ContentResolver a;
    public final Uri b;
    public final /* synthetic */ zy c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yy(zy zyVar, Handler handler, ContentResolver contentResolver, Uri uri) {
        super(handler);
        this.c = zyVar;
        this.a = contentResolver;
        this.b = uri;
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        zy zyVar = this.c;
        zyVar.a(wy.b(zyVar.a, zyVar.i, zyVar.h));
    }
}
