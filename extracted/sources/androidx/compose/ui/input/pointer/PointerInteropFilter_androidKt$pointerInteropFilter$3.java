package androidx.compose.ui.input.pointer;

import android.view.MotionEvent;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import defpackage.dp2;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
final class PointerInteropFilter_androidKt$pointerInteropFilter$3 extends Lambda implements dp2 {
    public final /* synthetic */ AndroidViewHolder g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PointerInteropFilter_androidKt$pointerInteropFilter$3(AndroidViewHolder androidViewHolder) {
        super(1);
        this.g = androidViewHolder;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        boolean zDispatchTouchEvent;
        MotionEvent motionEvent = (MotionEvent) obj;
        int actionMasked = motionEvent.getActionMasked();
        AndroidViewHolder androidViewHolder = this.g;
        switch (actionMasked) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                zDispatchTouchEvent = androidViewHolder.dispatchTouchEvent(motionEvent);
                break;
            default:
                zDispatchTouchEvent = androidViewHolder.dispatchGenericMotionEvent(motionEvent);
                break;
        }
        return Boolean.valueOf(zDispatchTouchEvent);
    }
}
