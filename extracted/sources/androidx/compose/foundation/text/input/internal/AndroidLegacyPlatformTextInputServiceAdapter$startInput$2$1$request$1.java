package androidx.compose.foundation.text.input.internal;

import defpackage.dp2;
import defpackage.is3;
import defpackage.pk4;
import defpackage.q44;
import defpackage.s08;
import defpackage.tx8;
import defpackage.v04;
import kotlin.jvm.internal.FunctionReferenceImpl;

/* JADX INFO: loaded from: classes.dex */
final /* synthetic */ class AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$request$1 extends FunctionReferenceImpl implements dp2 {
    public final /* synthetic */ q44 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1$request$1(q44 q44Var) {
        super(1, is3.class, "localToScreen", "startInput$localToScreen(Landroidx/compose/foundation/text/input/internal/LegacyPlatformTextInputServiceAdapter$LegacyPlatformTextInputNode;[F)V", 0);
        this.a = q44Var;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        float[] fArr = ((pk4) obj).a;
        v04 v04Var = (v04) ((s08) this.a.r).getValue();
        if (v04Var != null) {
            if (!v04Var.h()) {
                v04Var = null;
            }
            if (v04Var != null) {
                v04Var.i(fArr);
            }
        }
        return tx8.a;
    }
}
