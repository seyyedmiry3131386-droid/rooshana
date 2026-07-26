package okhttp3.internal.platform;

import android.content.Context;
import defpackage.js3;
import defpackage.k96;
import defpackage.mn3;
import defpackage.y41;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes3.dex */
public final class PlatformInitializer implements mn3 {
    @Override // defpackage.mn3
    public final List a() {
        return EmptyList.a;
    }

    @Override // defpackage.mn3
    public final Object b(Context context) {
        js3.p(context, "context");
        k96 k96Var = k96.a;
        Object obj = k96.a;
        y41 y41Var = obj != null ? (y41) obj : null;
        if (y41Var != null) {
            y41Var.a(context);
        }
        return k96.a;
    }
}
