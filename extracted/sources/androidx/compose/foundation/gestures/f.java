package androidx.compose.foundation.gestures;

import defpackage.e49;
import defpackage.j97;
import defpackage.rp2;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static final rp2 a = new DraggableKt$NoOpOnDragStarted$1(3, null);
    public static final rp2 b = new DraggableKt$NoOpOnDragStopped$1(3, null);

    public static final long a(long j) {
        return j97.a(Float.isNaN(e49.b(j)) ? 0.0f : e49.b(j), Float.isNaN(e49.c(j)) ? 0.0f : e49.c(j));
    }
}
