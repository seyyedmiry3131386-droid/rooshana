package ir.myket.player.ui.client;

import defpackage.cf6;
import defpackage.cr;
import defpackage.dl5;
import defpackage.e71;
import defpackage.g51;
import defpackage.ka8;
import defpackage.la8;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wb5;
import ir.myket.movie.common.domain.models.SampleWatch;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.player.ui.client.PlayerScreenKt$PlayerScreen$3$1", f = "PlayerScreen.kt", l = {}, m = "invokeSuspend", v = 1)
final class PlayerScreenKt$PlayerScreen$3$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ wb5 a;
    public final /* synthetic */ dl5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlayerScreenKt$PlayerScreen$3$1(wb5 wb5Var, dl5 dl5Var, g51 g51Var) {
        super(2, g51Var);
        this.a = wb5Var;
        this.b = dl5Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new PlayerScreenKt$PlayerScreen$3$1(this.a, this.b, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        PlayerScreenKt$PlayerScreen$3$1 playerScreenKt$PlayerScreen$3$1 = (PlayerScreenKt$PlayerScreen$3$1) create((e71) obj, (g51) obj2);
        tx8 tx8Var = tx8.a;
        playerScreenKt$PlayerScreen$3$1.invokeSuspend(tx8Var);
        return tx8Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SampleWatch sampleWatch;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        kotlin.b.b(obj);
        la8 la8Var = (la8) this.a.getValue();
        ka8 ka8Var = la8Var instanceof ka8 ? (ka8) la8Var : null;
        if (ka8Var != null && (sampleWatch = ka8Var.a.a.k) != null) {
            this.b.a(new cr(new cf6(sampleWatch)));
        }
        return tx8.a;
    }
}
