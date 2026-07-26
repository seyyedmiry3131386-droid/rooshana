package androidx.compose.ui.window;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import defpackage.bp2;
import defpackage.s01;

/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final s01 a = new s01(new bp2() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$LocalPopupTestTag$1
        @Override // defpackage.bp2
        public final /* bridge */ /* synthetic */ Object invoke() {
            return "DEFAULT_TEST_TAG";
        }
    });
    public static final s01 b = new s01(new bp2() { // from class: androidx.compose.ui.window.AndroidPopup_androidKt$LocalIsInPopupLayout$1
        @Override // defpackage.bp2
        public final /* bridge */ /* synthetic */ Object invoke() {
            return Boolean.FALSE;
        }
    });

    /* JADX WARN: Removed duplicated region for block: B:105:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0071  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(defpackage.fi6 r22, defpackage.bp2 r23, final defpackage.gi6 r24, final androidx.compose.runtime.internal.a r25, defpackage.qz0 r26, final int r27, final int r28) {
        /*
            Method dump skipped, instruction units count: 617
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.window.d.a(fi6, bp2, gi6, androidx.compose.runtime.internal.a, qz0, int, int):void");
    }

    public static final boolean b(View view) {
        ViewGroup.LayoutParams layoutParams = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams2 = layoutParams instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams : null;
        return (layoutParams2 == null || (layoutParams2.flags & 8192) == 0) ? false : true;
    }
}
