package defpackage;

import java.io.File;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes.dex */
public class rb2 implements lv6 {
    public final File a;
    public final AtomicBoolean b = new AtomicBoolean(false);

    public rb2(File file) {
        this.a = file;
    }

    @Override // defpackage.eu0
    public final void close() {
        this.b.set(true);
    }
}
