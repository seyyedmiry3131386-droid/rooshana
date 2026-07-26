package androidx.graphics.shapes;

import defpackage.dp2;
import defpackage.js3;
import kotlin.Pair;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
final class FeatureMappingKt$featureMapper$1$1 extends Lambda implements dp2 {
    static {
        new FeatureMappingKt$featureMapper$1$1();
    }

    public FeatureMappingKt$featureMapper$1$1() {
        super(1);
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        Pair pair = (Pair) obj;
        js3.p(pair, "it");
        return ((Number) pair.a).floatValue() + " -> " + ((Number) pair.b).floatValue();
    }
}
