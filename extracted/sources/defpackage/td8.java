package defpackage;

import android.os.Handler;
import android.os.Looper;

/* JADX INFO: loaded from: classes.dex */
public final class td8 {
    public static final td8 a = new td8();

    public final wd8 a(Looper looper, Handler.Callback callback) {
        return new wd8(new Handler(looper, callback));
    }
}
