package defpackage;

import android.database.ContentObserver;

/* JADX INFO: loaded from: classes.dex */
public final class hr9 extends ContentObserver {
    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        or9.i.incrementAndGet();
    }
}
