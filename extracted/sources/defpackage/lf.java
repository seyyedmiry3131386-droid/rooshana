package defpackage;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: loaded from: classes.dex */
public final class lf implements ViewTranslationCallback {
    public static final lf a = new lf();

    public final boolean onClearTranslation(View view) {
        js3.n(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ((AndroidComposeView) view).getContentCaptureManager$ui().h();
        return true;
    }

    public final boolean onHideTranslation(View view) {
        js3.n(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ((AndroidComposeView) view).getContentCaptureManager$ui().i();
        return true;
    }

    public final boolean onShowTranslation(View view) {
        js3.n(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ((AndroidComposeView) view).getContentCaptureManager$ui().j();
        return true;
    }
}
