package androidx.compose.ui.draw;

import defpackage.dp2;
import defpackage.id0;
import defpackage.o87;
import defpackage.tt3;
import defpackage.tx8;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
final class BlurKt$blur$1 extends Lambda implements dp2 {
    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        o87 o87Var = (o87) obj;
        float density = o87Var.o.getDensity() * 0.0f;
        float density2 = o87Var.o.getDensity() * 0.0f;
        o87Var.g((density <= 0.0f || density2 <= 0.0f) ? null : new id0(density, density2));
        o87Var.l(tt3.d);
        o87Var.e(false);
        return tx8.a;
    }
}
