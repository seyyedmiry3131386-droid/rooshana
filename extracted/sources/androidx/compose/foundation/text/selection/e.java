package androidx.compose.foundation.text.selection;

import defpackage.bt2;
import defpackage.e71;
import defpackage.g51;
import defpackage.nr5;
import defpackage.tx8;
import defpackage.ze2;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* JADX INFO: loaded from: classes.dex */
public final class e implements ze2 {
    public final /* synthetic */ androidx.compose.animation.core.a a;
    public final /* synthetic */ e71 b;

    public e(androidx.compose.animation.core.a aVar, e71 e71Var) {
        this.a = aVar;
        this.b = e71Var;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        long j = ((nr5) obj).a;
        androidx.compose.animation.core.a aVar = this.a;
        long j2 = ((nr5) aVar.d()).a & 9223372034707292159L;
        tx8 tx8Var = tx8.a;
        if (j2 == 9205357640488583168L || (9223372034707292159L & j) == 9205357640488583168L || Float.intBitsToFloat((int) (((nr5) aVar.d()).a & 4294967295L)) == Float.intBitsToFloat((int) (j & 4294967295L))) {
            Object objE = aVar.e(g51Var, new nr5(j));
            return objE == CoroutineSingletons.a ? objE : tx8Var;
        }
        bt2.G(this.b, null, null, new SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1$2$1(aVar, j, null), 3);
        return tx8Var;
    }
}
