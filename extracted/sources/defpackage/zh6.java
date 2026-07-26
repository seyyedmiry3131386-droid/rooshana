package defpackage;

import android.view.View;
import androidx.core.view.a;
import java.util.ArrayList;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;

/* JADX INFO: loaded from: classes.dex */
public abstract class zh6 {
    public static final int a = zr6.pooling_container_listener_holder_tag;
    public static final int b = zr6.is_pooling_container_tag;

    /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.coroutines.jvm.internal.RestrictedSuspendLambda, qp2] */
    public static final void a(View view) {
        js3.p(view, "<this>");
        io7 io7VarH = o27.h((RestrictedSuspendLambda) a.a(view).b);
        while (io7VarH.hasNext()) {
            ArrayList arrayList = b((View) io7VarH.next()).a;
            for (int iY = br9.y(arrayList); -1 < iY; iY--) {
                ((t69) arrayList.get(iY)).a.d();
            }
        }
    }

    public static final ai6 b(View view) {
        int i = a;
        ai6 ai6Var = (ai6) view.getTag(i);
        if (ai6Var != null) {
            return ai6Var;
        }
        ai6 ai6Var2 = new ai6();
        view.setTag(i, ai6Var2);
        return ai6Var2;
    }
}
