package ir.myket.player.ui.client.bottomsheets;

import android.content.Context;
import androidx.compose.material3.n;
import defpackage.bp2;
import defpackage.e71;
import defpackage.fz1;
import defpackage.g51;
import defpackage.k99;
import defpackage.m99;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.v7;
import defpackage.vs6;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.player.ui.client.bottomsheets.PlayerOtherErrorDetailBottomSheetKt$PlayerOtherErrorDetailBottomSheetContent$3$1", f = "PlayerOtherErrorDetailBottomSheet.kt", l = {}, m = "invokeSuspend", v = 1)
final class PlayerOtherErrorDetailBottomSheetKt$PlayerOtherErrorDetailBottomSheetContent$3$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ m99 a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ n c;
    public final /* synthetic */ e71 d;
    public final /* synthetic */ bp2 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerOtherErrorDetailBottomSheetKt$PlayerOtherErrorDetailBottomSheetContent$3$1(m99 m99Var, Context context, n nVar, e71 e71Var, bp2 bp2Var, g51 g51Var) {
        super(2, g51Var);
        this.a = m99Var;
        this.b = context;
        this.c = nVar;
        this.d = e71Var;
        this.e = bp2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new PlayerOtherErrorDetailBottomSheetKt$PlayerOtherErrorDetailBottomSheetContent$3$1(this.a, this.b, this.c, this.d, this.e, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        PlayerOtherErrorDetailBottomSheetKt$PlayerOtherErrorDetailBottomSheetContent$3$1 playerOtherErrorDetailBottomSheetKt$PlayerOtherErrorDetailBottomSheetContent$3$1 = (PlayerOtherErrorDetailBottomSheetKt$PlayerOtherErrorDetailBottomSheetContent$3$1) create((e71) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        playerOtherErrorDetailBottomSheetKt$PlayerOtherErrorDetailBottomSheetContent$3$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        if (this.a instanceof k99) {
            fz1.r(this.b, vs6.player_toast_report_error, 4).show();
            ir.myket.player.ui.client.utils.extensions.a.a(this.c, this.d, this.e, new v7(27));
        }
        return tx8.a;
    }
}
