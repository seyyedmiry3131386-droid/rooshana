package ir.myket.player.ui.client.ad;

import androidx.media3.exoplayer.ExoPlayer;
import defpackage.am6;
import defpackage.b47;
import defpackage.dp2;
import defpackage.e62;
import defpackage.e71;
import defpackage.g51;
import defpackage.gb6;
import defpackage.js3;
import defpackage.o80;
import defpackage.q8;
import defpackage.qp2;
import defpackage.qz4;
import defpackage.tb1;
import defpackage.tx8;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.player.ui.client.ad.AdPlaybackCallbackHandlerKt$AdPlaybackCallbackHandler$2$1", f = "AdPlaybackCallbackHandler.kt", l = {43}, m = "invokeSuspend", v = 1)
final class AdPlaybackCallbackHandlerKt$AdPlaybackCallbackHandler$2$1 extends SuspendLambda implements qp2 {
    public q8 a;
    public int b;
    public int c;
    public /* synthetic */ Object d;
    public final /* synthetic */ qz4 e;
    public final /* synthetic */ ExoPlayer f;
    public final /* synthetic */ dp2 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdPlaybackCallbackHandlerKt$AdPlaybackCallbackHandler$2$1(qz4 qz4Var, ExoPlayer exoPlayer, dp2 dp2Var, g51 g51Var) {
        super(2, g51Var);
        this.e = qz4Var;
        this.f = exoPlayer;
        this.g = dp2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        AdPlaybackCallbackHandlerKt$AdPlaybackCallbackHandler$2$1 adPlaybackCallbackHandlerKt$AdPlaybackCallbackHandler$2$1 = new AdPlaybackCallbackHandlerKt$AdPlaybackCallbackHandler$2$1(this.e, this.f, this.g, g51Var);
        adPlaybackCallbackHandlerKt$AdPlaybackCallbackHandler$2$1.d = obj;
        return adPlaybackCallbackHandlerKt$AdPlaybackCallbackHandler$2$1;
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((AdPlaybackCallbackHandlerKt$AdPlaybackCallbackHandler$2$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i;
        q8 q8Var;
        String str;
        e71 e71Var = (e71) this.d;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i2 = this.c;
        if (i2 == 0) {
            kotlin.b.b(obj);
            q8 q8Var2 = this.e.c;
            i = q8Var2.b;
            q8Var = q8Var2;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.b;
            q8Var = this.a;
            kotlin.b.b(obj);
        }
        while (js3.C(e71Var)) {
            gb6 gb6Var = this.f;
            if (((o80) gb6Var).H()) {
                int iV = b47.v(((e62) gb6Var).d0());
                if (iV == 0) {
                    str = q8Var.e;
                } else if (iV == i / 4) {
                    str = q8Var.f;
                } else if (iV == i / 2) {
                    str = q8Var.g;
                } else if (iV == (i * 3) / 4) {
                    str = q8Var.h;
                } else if (iV == i - 1) {
                    str = q8Var.i;
                } else {
                    am6 am6Var = q8Var.l;
                    str = (am6Var == null || iV != am6Var.b) ? null : am6Var.a;
                }
                this.g.invoke(str);
            }
            this.d = e71Var;
            this.a = q8Var;
            this.b = i;
            this.c = 1;
            if (kotlinx.coroutines.a.e(1000L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        }
        return tx8.a;
    }
}
