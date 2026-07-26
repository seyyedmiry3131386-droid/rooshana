package androidx.compose.ui.platform;

import android.view.accessibility.AccessibilityEvent;
import defpackage.dp2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
final class AndroidComposeViewAccessibilityDelegateCompat$onSendAccessibilityEvent$1 extends Lambda implements dp2 {
    public final /* synthetic */ c g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidComposeViewAccessibilityDelegateCompat$onSendAccessibilityEvent$1(c cVar) {
        super(1);
        this.g = cVar;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        c cVar = this.g;
        return Boolean.valueOf(cVar.d.getParent().requestSendAccessibilityEvent(cVar.d, (AccessibilityEvent) obj));
    }
}
