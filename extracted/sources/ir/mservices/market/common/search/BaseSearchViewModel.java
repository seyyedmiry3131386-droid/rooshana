package ir.mservices.market.common.search;

import com.google.gson.reflect.TypeToken;
import defpackage.b90;
import defpackage.bt2;
import defpackage.dw3;
import defpackage.dy3;
import defpackage.e71;
import defpackage.ey1;
import defpackage.f88;
import defpackage.fy1;
import defpackage.g51;
import defpackage.gy1;
import defpackage.hy1;
import defpackage.iy1;
import defpackage.jd7;
import defpackage.js3;
import defpackage.jy1;
import defpackage.l99;
import defpackage.n;
import defpackage.n4;
import defpackage.n99;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.r4;
import defpackage.rv6;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.y97;
import defpackage.z57;
import ir.mservices.market.common.data.DynamicButtonDto;
import ir.mservices.market.common.search.SearchAction;
import java.lang.reflect.Type;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class BaseSearchViewModel extends ir.mservices.market.viewModel.a {
    public final l A;
    public final rv6 B;
    public final l C;
    public final rv6 D;
    public final l E;
    public final rv6 F;
    public final n G;
    public final jd7 v;
    public final b90 w;
    public final pv6 x;
    public final l y;
    public final rv6 z;

    /* JADX INFO: renamed from: ir.mservices.market.common.search.BaseSearchViewModel$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.common.search.BaseSearchViewModel$1", f = "BaseSearchViewModel.kt", l = {174}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;

        public AnonymousClass1(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return BaseSearchViewModel.this.new AnonymousClass1(g51Var);
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
                kotlin.b.b(obj);
                return tx8Var;
            }
            kotlin.b.b(obj);
            BaseSearchViewModel baseSearchViewModel = BaseSearchViewModel.this;
            pv6 pv6Var = baseSearchViewModel.u;
            r4 r4Var = new r4(12, baseSearchViewModel);
            this.a = 1;
            Object objA = pv6Var.a.a(new n4(r4Var, 15), this);
            if (objA != coroutineSingletons) {
                objA = tx8Var;
            }
            return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.common.search.BaseSearchViewModel$onShowDynamicButtonAction$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.common.search.BaseSearchViewModel$onShowDynamicButtonAction$1", f = "BaseSearchViewModel.kt", l = {96}, m = "invokeSuspend", v = 1)
    public static final class C01791 extends SuspendLambda implements qp2 {
        public int a;
        public final /* synthetic */ DynamicButtonDto c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01791(DynamicButtonDto dynamicButtonDto, g51 g51Var) {
            super(2, g51Var);
            this.c = dynamicButtonDto;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return BaseSearchViewModel.this.new C01791(this.c, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C01791) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws InterruptedException {
            BaseSearchViewModel baseSearchViewModel = BaseSearchViewModel.this;
            n nVar = baseSearchViewModel.G;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            DynamicButtonDto dynamicButtonDto = this.c;
            if (i == 0) {
                kotlin.b.b(obj);
                b90 b90Var = baseSearchViewModel.w;
                String animationUrl = dynamicButtonDto.getAnimationUrl();
                this.a = 1;
                ey1 ey1Var = b90Var.a;
                ey1Var.getClass();
                Type type = new TypeToken<dw3>() { // from class: ir.mservices.market.common.service.DynamicButtonService$getDynamicButton$2
                }.getType();
                js3.o(type, "getType(...)");
                obj = dy3.v(ey1Var, type, new z57(animationUrl), baseSearchViewModel, this, 504);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            n99 n99Var = (n99) obj;
            if (n99Var instanceof l99) {
                nVar.invoke(new fy1(dynamicButtonDto, (dw3) ((l99) n99Var).a));
            } else {
                dynamicButtonDto.getAnimationUrl();
                nVar.invoke(new gy1(dynamicButtonDto));
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0037  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public BaseSearchViewModel(defpackage.jd7 r5, defpackage.b90 r6) {
        /*
            r4 = this;
            java.lang.String r0 = "savedStateHandle"
            defpackage.js3.p(r5, r0)
            java.lang.String r0 = "baseSearchRepository"
            defpackage.js3.p(r6, r0)
            r0 = 0
            r4.<init>(r0)
            r4.v = r5
            r4.w = r6
            fu0 r6 = defpackage.y97.G(r4)
            ir.mservices.market.common.search.BaseSearchViewModel$1 r1 = new ir.mservices.market.common.search.BaseSearchViewModel$1
            r2 = 0
            r1.<init>(r2)
            r3 = 3
            defpackage.bt2.G(r6, r2, r2, r1, r3)
            java.lang.String r6 = "search_state"
            java.lang.Object r1 = r5.b(r6)
            ir.mservices.market.common.search.SearchState r1 = (ir.mservices.market.common.search.SearchState) r1
            if (r1 == 0) goto L37
            boolean r3 = r1 instanceof ir.mservices.market.common.search.SearchState.Suggestion
            if (r3 == 0) goto L31
            ir.mservices.market.common.search.SearchState$Suggestion r1 = (ir.mservices.market.common.search.SearchState.Suggestion) r1
            goto L32
        L31:
            r1 = r2
        L32:
            if (r1 == 0) goto L37
            java.lang.String r1 = r1.a
            goto L38
        L37:
            r1 = r2
        L38:
            kotlinx.coroutines.flow.l r1 = defpackage.ja1.b(r1)
            pv6 r3 = new pv6
            r3.<init>(r1)
            r4.x = r3
            kotlinx.coroutines.flow.l r1 = defpackage.ja1.b(r2)
            r4.y = r1
            rv6 r3 = new rv6
            r3.<init>(r1)
            r4.z = r3
            java.lang.String r1 = "open_search_box"
            java.lang.Object r1 = r5.b(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L5f
            boolean r1 = r1.booleanValue()
            goto L60
        L5f:
            r1 = r0
        L60:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            kotlinx.coroutines.flow.l r1 = defpackage.ja1.b(r1)
            r4.A = r1
            rv6 r3 = new rv6
            r3.<init>(r1)
            r4.B = r3
            java.lang.Object r5 = r5.b(r6)
            ir.mservices.market.common.search.SearchState r5 = (ir.mservices.market.common.search.SearchState) r5
            if (r5 != 0) goto L7e
            ir.mservices.market.common.search.SearchState$Normal r5 = new ir.mservices.market.common.search.SearchState$Normal
            r5.<init>(r0)
        L7e:
            kotlinx.coroutines.flow.l r5 = defpackage.ja1.b(r5)
            r4.C = r5
            rv6 r6 = new rv6
            r6.<init>(r5)
            r4.D = r6
            kotlinx.coroutines.flow.l r5 = defpackage.ja1.b(r2)
            r4.E = r5
            rv6 r6 = new rv6
            r6.<init>(r5)
            r4.F = r6
            n r5 = new n
            r6 = 17
            r5.<init>(r6, r4)
            r4.G = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.common.search.BaseSearchViewModel.<init>(jd7, b90):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onOpenSearchBoxAction(SearchAction.OpenSearchBoxAction openSearchBoxAction) {
        Boolean boolValueOf = Boolean.valueOf(openSearchBoxAction.getSearchBoxOpen());
        l lVar = this.A;
        lVar.getClass();
        lVar.p(null, boolValueOf);
        this.v.d(Boolean.valueOf(openSearchBoxAction.getSearchBoxOpen()), "open_search_box");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSetFirstListShow(SearchAction.SetFirstListShow setFirstListShow) {
        this.y.o(setFirstListShow.getFirstListShow());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onShowDynamicButtonAction(SearchAction.ShowDynamicButtonAction showDynamicButtonAction) throws InterruptedException {
        DynamicButtonDto dynamicButtonDto = showDynamicButtonAction.getDynamicButtonDto();
        boolean zN0 = f88.n0(dynamicButtonDto.getAction());
        n nVar = this.G;
        if (zN0) {
            nVar.invoke(new gy1(dynamicButtonDto));
            return;
        }
        String animationUrl = dynamicButtonDto.getAnimationUrl();
        if (animationUrl != null && !f88.n0(animationUrl)) {
            bt2.G(y97.G(this), null, null, new C01791(dynamicButtonDto, null), 3);
            return;
        }
        String iconUrl = dynamicButtonDto.getIconUrl();
        if (iconUrl != null && !f88.n0(iconUrl)) {
            nVar.invoke(new hy1(dynamicButtonDto));
            return;
        }
        String name = dynamicButtonDto.getName();
        if (name == null || f88.n0(name)) {
            nVar.invoke(new gy1(dynamicButtonDto));
        } else {
            nVar.invoke(new iy1(dynamicButtonDto));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onUpdateSearchStateAction(SearchAction.UpdateSearchStateAction updateSearchStateAction) {
        this.C.o(updateSearchStateAction.getState());
        this.v.d(updateSearchStateAction.getState(), "search_state");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final tx8 updateDynamicButtonState$lambda$0(BaseSearchViewModel baseSearchViewModel, jy1 jy1Var) {
        js3.p(jy1Var, "it");
        l lVar = baseSearchViewModel.E;
        lVar.getClass();
        lVar.p(null, jy1Var);
        return tx8.a;
    }
}
