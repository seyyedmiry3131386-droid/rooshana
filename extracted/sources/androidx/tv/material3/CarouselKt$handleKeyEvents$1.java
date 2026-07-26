package androidx.tv.material3;

import android.view.KeyEvent;
import defpackage.by3;
import defpackage.dp2;
import defpackage.dy3;
import defpackage.tx3;
import defpackage.ub1;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
final class CarouselKt$handleKeyEvents$1 extends Lambda implements dp2 {
    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        KeyEvent keyEvent = ((by3) obj).a;
        if (dy3.z(keyEvent) == 1 || tx3.a(ub1.d(keyEvent.getKeyCode()), tx3.a) || (!tx3.a(ub1.d(keyEvent.getKeyCode()), tx3.f) && !tx3.a(ub1.d(keyEvent.getKeyCode()), tx3.g))) {
            return Boolean.FALSE;
        }
        throw null;
    }
}
