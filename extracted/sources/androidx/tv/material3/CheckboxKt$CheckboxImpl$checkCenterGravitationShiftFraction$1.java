package androidx.tv.material3;

import androidx.compose.ui.state.ToggleableState;
import defpackage.b08;
import defpackage.dr8;
import defpackage.qz0;
import defpackage.rp2;
import defpackage.y97;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes.dex */
final class CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$1 extends Lambda implements rp2 {
    public static final CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$1 g = new CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$1();

    public CheckboxKt$CheckboxImpl$checkCenterGravitationShiftFraction$1() {
        super(3);
    }

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        dr8 dr8Var = (dr8) obj;
        qz0 qz0Var = (qz0) obj2;
        ((Number) obj3).intValue();
        qz0Var.b0(-1742268475);
        Object objB = dr8Var.b();
        ToggleableState toggleableState = ToggleableState.b;
        Object b08Var = objB == toggleableState ? new b08(0) : dr8Var.c() == toggleableState ? new b08(100) : y97.e0(100, 0, null, 6);
        qz0Var.q(false);
        return b08Var;
    }
}
