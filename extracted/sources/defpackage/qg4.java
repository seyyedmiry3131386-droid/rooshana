package defpackage;

import android.os.Build;
import androidx.compose.ui.semantics.g;

/* JADX INFO: loaded from: classes.dex */
public abstract class qg4 {
    public static final g a = new g("MagnifierPositionInRoot");

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 28;
    }
}
