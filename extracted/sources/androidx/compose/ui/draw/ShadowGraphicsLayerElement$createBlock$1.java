package androidx.compose.ui.draw;

import defpackage.dp2;
import defpackage.o87;
import defpackage.tx8;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
final class ShadowGraphicsLayerElement$createBlock$1 extends Lambda implements dp2 {
    public final /* synthetic */ d g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShadowGraphicsLayerElement$createBlock$1(d dVar) {
        super(1);
        this.g = dVar;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        o87 o87Var = (o87) obj;
        d dVar = this.g;
        o87Var.k(o87Var.getDensity() * dVar.b);
        o87Var.l(dVar.c);
        o87Var.e(dVar.d);
        o87Var.c(dVar.e);
        o87Var.m(dVar.f);
        return tx8.a;
    }
}
