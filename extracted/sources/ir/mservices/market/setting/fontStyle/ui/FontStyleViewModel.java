package ir.mservices.market.setting.fontStyle.ui;

import defpackage.bj2;
import defpackage.bt2;
import defpackage.e71;
import defpackage.g51;
import defpackage.gv;
import defpackage.ja1;
import defpackage.kh2;
import defpackage.pt1;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.rv6;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.y97;
import ir.mservices.market.core.Font$FontStyle;
import ir.mservices.market.setting.fontStyle.ui.FontAction;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class FontStyleViewModel extends ir.mservices.market.viewModel.a {
    public final gv v;
    public final l w;
    public final rv6 x;

    /* JADX INFO: renamed from: ir.mservices.market.setting.fontStyle.ui.FontStyleViewModel$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.setting.fontStyle.ui.FontStyleViewModel$1", f = "FontStyleViewModel.kt", l = {57}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;

        public AnonymousClass1(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return FontStyleViewModel.this.new AnonymousClass1(g51Var);
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
            FontStyleViewModel fontStyleViewModel = FontStyleViewModel.this;
            pv6 pv6Var = fontStyleViewModel.u;
            bj2 bj2Var = new bj2(0, fontStyleViewModel);
            this.a = 1;
            Object objA = pv6Var.a.a(new pt1(bj2Var, 4), this);
            if (objA != coroutineSingletons) {
                objA = tx8Var;
            }
            return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.setting.fontStyle.ui.FontStyleViewModel$onFontSelect$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.setting.fontStyle.ui.FontStyleViewModel$onFontSelect$1", f = "FontStyleViewModel.kt", l = {48}, m = "invokeSuspend", v = 1)
    public static final class C02121 extends SuspendLambda implements qp2 {
        public int a;
        public final /* synthetic */ FontAction.SelectFont c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02121(FontAction.SelectFont selectFont, g51 g51Var) {
            super(2, g51Var);
            this.c = selectFont;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return FontStyleViewModel.this.new C02121(this.c, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C02121) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
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
            l lVar = FontStyleViewModel.this.w;
            Font$FontStyle selectedFont = this.c.getSelectedFont();
            this.a = 1;
            lVar.emit(selectedFont, this);
            return tx8Var == coroutineSingletons ? coroutineSingletons : tx8Var;
        }
    }

    public FontStyleViewModel(gv gvVar) {
        super(true);
        this.v = gvVar;
        l lVarB = ja1.b(kh2.b);
        this.w = lVarB;
        this.x = new rv6(lVarB);
        bt2.G(y97.G(this), null, null, new AnonymousClass1(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFontSelect(FontAction.SelectFont selectFont) {
        bt2.G(y97.G(this), null, null, new C02121(selectFont, null), 3);
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        p(new FontStyleViewModel$doRequest$1(this, null));
    }
}
