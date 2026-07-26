package androidx.compose.ui.platform;

import android.content.res.Resources;
import android.os.Build;
import defpackage.az0;
import defpackage.dp2;
import defpackage.ey7;
import defpackage.kf;
import defpackage.rp2;
import defpackage.tj1;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class AndroidComposeView$dragAndDropManager$1 extends FunctionReferenceImpl implements rp2 {
    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        if (obj != null) {
            throw new ClassCastException();
        }
        AndroidComposeView androidComposeView = (AndroidComposeView) this.receiver;
        Class cls = AndroidComposeView.h1;
        Resources resources = androidComposeView.getContext().getResources();
        az0 az0Var = new az0(new tj1(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), ((ey7) obj2).a, (dp2) obj3);
        if (Build.VERSION.SDK_INT >= 24) {
            return Boolean.valueOf(kf.a.a(androidComposeView, null, az0Var));
        }
        throw null;
    }
}
