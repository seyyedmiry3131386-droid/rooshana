package ir.myket.player.ui.client.bottomsheets;

import android.content.Context;
import androidx.compose.material3.n;
import defpackage.bp2;
import defpackage.e71;
import defpackage.f88;
import defpackage.fz1;
import defpackage.g51;
import defpackage.g99;
import defpackage.js3;
import defpackage.k99;
import defpackage.l32;
import defpackage.m99;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.v7;
import defpackage.vs6;
import defpackage.wb5;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.player.ui.client.bottomsheets.PlayerErrorDetailBottomSheetKt$PlayerErrorDetailBottomSheet$2$1", f = "PlayerErrorDetailBottomSheet.kt", l = {}, m = "invokeSuspend", v = 1)
final class PlayerErrorDetailBottomSheetKt$PlayerErrorDetailBottomSheet$2$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ Context a;
    public final /* synthetic */ n b;
    public final /* synthetic */ e71 c;
    public final /* synthetic */ bp2 d;
    public final /* synthetic */ wb5 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerErrorDetailBottomSheetKt$PlayerErrorDetailBottomSheet$2$1(Context context, n nVar, e71 e71Var, bp2 bp2Var, wb5 wb5Var, g51 g51Var) {
        super(2, g51Var);
        this.a = context;
        this.b = nVar;
        this.c = e71Var;
        this.d = bp2Var;
        this.e = wb5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new PlayerErrorDetailBottomSheetKt$PlayerErrorDetailBottomSheet$2$1(this.a, this.b, this.c, this.d, this.e, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        PlayerErrorDetailBottomSheetKt$PlayerErrorDetailBottomSheet$2$1 playerErrorDetailBottomSheetKt$PlayerErrorDetailBottomSheet$2$1 = (PlayerErrorDetailBottomSheetKt$PlayerErrorDetailBottomSheet$2$1) create((e71) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        playerErrorDetailBottomSheetKt$PlayerErrorDetailBottomSheet$2$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        wb5 wb5Var = this.e;
        m99 m99Var = (m99) wb5Var.getValue();
        boolean z = m99Var instanceof k99;
        Context context = this.a;
        if (z) {
            fz1.r(context, vs6.player_toast_report_error, 4).show();
            ir.myket.player.ui.client.utils.extensions.a.a(this.b, this.c, this.d, new v7(27));
        } else if (m99Var instanceof g99) {
            m99 m99Var2 = (m99) wb5Var.getValue();
            js3.n(m99Var2, "null cannot be cast to non-null type ir.myket.common.views.core.ViewState.Fail");
            js3.p(context, "context");
            l32 l32Var = ((g99) m99Var2).a;
            String string = l32Var.a;
            if (string == null) {
                string = context.getString(l32Var.b);
                js3.o(string, "getString(...)");
            }
            if (f88.n0(string)) {
                string = null;
            }
            if (string != null) {
                fz1.q(1, context, string).show();
            }
        }
        return tx8.a;
    }
}
