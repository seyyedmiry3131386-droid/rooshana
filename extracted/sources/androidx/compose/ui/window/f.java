package androidx.compose.ui.window;

import defpackage.qp2;
import defpackage.qz0;
import defpackage.tx8;

/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static final androidx.compose.runtime.internal.a a = new androidx.compose.runtime.internal.a(-1131826196, new qp2() { // from class: androidx.compose.ui.window.ComposableSingletons$AndroidPopup_androidKt$lambda$-1131826196$1
        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            qz0 qz0Var = (qz0) obj;
            int iIntValue = ((Number) obj2).intValue();
            if (!qz0Var.R(iIntValue & 1, (iIntValue & 3) != 2)) {
                qz0Var.U();
            }
            return tx8.a;
        }
    }, false);
}
