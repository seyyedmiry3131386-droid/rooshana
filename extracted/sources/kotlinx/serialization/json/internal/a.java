package kotlinx.serialization.json.internal;

import defpackage.js3;
import defpackage.lz1;
import defpackage.no7;

/* JADX INFO: loaded from: classes3.dex */
public final class a {
    public final lz1 a;
    public boolean b;

    public a(no7 no7Var) {
        js3.p(no7Var, "descriptor");
        this.a = new lz1(no7Var, new JsonElementMarker$origin$1(2, this, a.class, "readIfAbsent", "readIfAbsent(Lkotlinx/serialization/descriptors/SerialDescriptor;I)Z", 0));
    }
}
