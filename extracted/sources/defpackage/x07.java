package defpackage;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes3.dex */
public final class x07 {
    public final Context a;
    public hw7 b;
    public final File c;

    public x07(Context context) {
        this.a = context;
        this.c = new File(context.getCacheDir(), "ExoplayerCache");
    }
}
