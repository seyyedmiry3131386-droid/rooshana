package ir.mservices.market.setting.themeStyle;

import defpackage.bt2;
import defpackage.e71;
import defpackage.g51;
import defpackage.ja1;
import defpackage.js3;
import defpackage.lu7;
import defpackage.mr7;
import defpackage.pr7;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.rv6;
import defpackage.sj8;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vc8;
import defpackage.vr3;
import defpackage.xk6;
import defpackage.y97;
import defpackage.z0;
import ir.mservices.market.setting.themeStyle.ThemeStyleAction;
import ir.mservices.market.theme.ThemeStyle;
import ir.mservices.market.viewModel.a;
import java.util.ArrayList;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class ThemeStyleViewModel extends a {
    public final vr3 v;
    public final pr7 w;
    public final l x;
    public final rv6 y;
    public final rv6 z;

    /* JADX INFO: renamed from: ir.mservices.market.setting.themeStyle.ThemeStyleViewModel$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.setting.themeStyle.ThemeStyleViewModel$1", f = "ThemeStyleViewModel.kt", l = {70}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;

        public AnonymousClass1(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return ThemeStyleViewModel.this.new AnonymousClass1(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            tx8 tx8Var = tx8.a;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
                return tx8Var;
            }
            b.b(obj);
            ThemeStyleViewModel themeStyleViewModel = ThemeStyleViewModel.this;
            pv6 pv6Var = themeStyleViewModel.u;
            xk6 xk6Var = new xk6(22, themeStyleViewModel);
            this.a = 1;
            Object objA = pv6Var.a.a(new vc8(xk6Var, 1), this);
            if (objA != coroutineSingletons) {
                objA = tx8Var;
            }
            return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThemeStyleViewModel(vr3 vr3Var, pr7 pr7Var) {
        super(true);
        js3.p(pr7Var, "settingsManager");
        this.v = vr3Var;
        this.w = pr7Var;
        l lVarB = ja1.b(pr7Var.c());
        this.x = lVarB;
        this.y = new rv6(lVarB);
        List list = ThemeStyle.p;
        ArrayList arrayList = new ArrayList();
        for (Object obj : (z0) list) {
            if (((Boolean) ((ThemeStyle) obj).f.invoke()).booleanValue()) {
                arrayList.add(obj);
            }
        }
        this.z = new rv6(ja1.b(Integer.valueOf(arrayList.size())));
        bt2.G(y97.G(this), null, null, new AnonymousClass1(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSelectTheme(ThemeStyleAction.SelectThemeAction selectThemeAction) {
        l lVar;
        Object value;
        do {
            lVar = this.x;
            value = lVar.getValue();
        } while (!lVar.n(value, selectThemeAction.getSelectedTheme()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSetTheme(ThemeStyleAction.SetThemeAction setThemeAction) {
        rv6 rv6Var = this.y;
        ThemeStyle themeStyle = (ThemeStyle) rv6Var.a.getValue();
        pr7 pr7Var = this.w;
        ((mr7) pr7Var.b.get()).b("SETTING_THEME_STYLE", pr7Var.c().name(), themeStyle.name());
        pr7Var.a.i(lu7.f0, themeStyle.name());
        Object obj = sj8.a;
        sj8.j((ThemeStyle) rv6Var.a.getValue());
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        p(new ThemeStyleViewModel$doRequest$1(this, null));
    }
}
