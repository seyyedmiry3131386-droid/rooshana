package ir.myket.player.ui.client.ad.components;

import android.content.Context;
import defpackage.bp2;
import defpackage.e71;
import defpackage.g51;
import defpackage.js3;
import defpackage.n08;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vs6;
import defpackage.wb5;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.player.ui.client.ad.components.AdSkipButtonKt$AdSkipButton$2$1", f = "AdSkipButton.kt", l = {73}, m = "invokeSuspend", v = 1)
final class AdSkipButtonKt$AdSkipButton$2$1 extends SuspendLambda implements qp2 {
    public int a;
    public final /* synthetic */ n08 b;
    public final /* synthetic */ bp2 c;
    public final /* synthetic */ wb5 d;
    public final /* synthetic */ Context e;
    public final /* synthetic */ n08 f;
    public final /* synthetic */ wb5 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AdSkipButtonKt$AdSkipButton$2$1(n08 n08Var, bp2 bp2Var, wb5 wb5Var, Context context, n08 n08Var2, wb5 wb5Var2, g51 g51Var) {
        super(2, g51Var);
        this.b = n08Var;
        this.c = bp2Var;
        this.d = wb5Var;
        this.e = context;
        this.f = n08Var2;
        this.g = wb5Var2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new AdSkipButtonKt$AdSkipButton$2$1(this.b, this.c, this.d, this.e, this.f, this.g, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((AdSkipButtonKt$AdSkipButton$2$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.a;
        if (i != 0 && i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        b.b(obj);
        do {
            n08 n08Var = this.b;
            int iH = n08Var.h();
            Context context = this.e;
            wb5 wb5Var = this.d;
            if (iH <= 1) {
                String string = context.getString(vs6.player_ad_skip);
                js3.o(string, "getString(...)");
                wb5Var.setValue(string);
                this.g.setValue(Boolean.TRUE);
                return tx8.a;
            }
            int iH2 = this.f.h() - ((Number) this.c.invoke()).intValue();
            if (iH2 < 1) {
                iH2 = 1;
            }
            n08Var.i(iH2);
            String string2 = context.getString(vs6.player_placeholder_seconds, new Integer(n08Var.h()));
            js3.o(string2, "getString(...)");
            wb5Var.setValue(string2);
            this.a = 1;
        } while (kotlinx.coroutines.a.e(1000L, this) != coroutineSingletons);
        return coroutineSingletons;
    }
}
