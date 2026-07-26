package ir.mservices.market.social.profile.user;

import defpackage.bt2;
import defpackage.e71;
import defpackage.g51;
import defpackage.hl5;
import defpackage.ja1;
import defpackage.js3;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.rv6;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vc8;
import defpackage.vy2;
import defpackage.xk6;
import defpackage.y97;
import ir.mservices.market.social.profile.user.UserProfileAction;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class UserProfileViewModel extends ir.mservices.market.viewModel.a {
    public final l A;
    public final rv6 B;
    public final i C;
    public final pv6 D;
    public final hl5 v;
    public final l w;
    public final rv6 x;
    public final l y;
    public final rv6 z;

    /* JADX INFO: renamed from: ir.mservices.market.social.profile.user.UserProfileViewModel$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.social.profile.user.UserProfileViewModel$1", f = "UserProfileViewModel.kt", l = {94}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;

        public AnonymousClass1(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return UserProfileViewModel.this.new AnonymousClass1(g51Var);
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
            UserProfileViewModel userProfileViewModel = UserProfileViewModel.this;
            pv6 pv6Var = userProfileViewModel.u;
            xk6 xk6Var = new xk6(29, userProfileViewModel);
            this.a = 1;
            Object objA = pv6Var.a.a(new vc8(xk6Var, 12), this);
            if (objA != coroutineSingletons) {
                objA = tx8Var;
            }
            return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.social.profile.user.UserProfileViewModel$onReportAction$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.social.profile.user.UserProfileViewModel$onReportAction$1", f = "UserProfileViewModel.kt", l = {69, 68}, m = "invokeSuspend", v = 1)
    public static final class C02401 extends SuspendLambda implements qp2 {
        public i a;
        public int b;
        public final /* synthetic */ UserProfileAction.ReportAction d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02401(UserProfileAction.ReportAction reportAction, g51 g51Var) {
            super(2, g51Var);
            this.d = reportAction;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return UserProfileViewModel.this.new C02401(this.d, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C02401) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0093, code lost:
        
            if (r1.emit(r12, r11) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
                int r1 = r11.b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L21
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.b.b(r12)
                r9 = r11
                goto L96
            L12:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1a:
                kotlinx.coroutines.flow.i r1 = r11.a
                kotlin.b.b(r12)
                r9 = r11
                goto L8a
            L21:
                kotlin.b.b(r12)
                ir.mservices.market.social.profile.user.UserProfileViewModel r7 = ir.mservices.market.social.profile.user.UserProfileViewModel.this
                kotlinx.coroutines.flow.i r1 = r7.C
                hl5 r12 = r7.v
                ir.mservices.market.social.profile.user.UserProfileAction$ReportAction r4 = r11.d
                java.lang.String r5 = r4.getAccountKey()
                ir.mservices.market.social.profile.user.data.ReportType r6 = r4.getType()
                java.lang.String r4 = r4.getDescription()
                r11.a = r1
                r11.b = r3
                java.lang.Object r12 = r12.b
                s19 r12 = (defpackage.s19) r12
                r8 = r6
                ir.mservices.market.social.profile.user.data.ReportAccountRequestDto r6 = new ir.mservices.market.social.profile.user.data.ReportAccountRequestDto
                java.lang.String r8 = r8.name()
                r6.<init>(r8, r4)
                r12.getClass()
                kotlin.Pair r4 = new kotlin.Pair
                java.lang.String r8 = "accountKey"
                r4.<init>(r8, r5)
                kotlin.Pair[] r3 = new kotlin.Pair[r3]
                r5 = 0
                r3[r5] = r4
                java.util.LinkedHashMap r3 = kotlin.collections.b.O(r3)
                java.util.Map r4 = r12.getCommonQueryParam()
                java.util.Map r4 = r12.getCommonQueryParam(r4)
                java.lang.String r5 = "social"
                java.lang.String r8 = "v1/profiles/{accountKey}/inappropriate"
                z57 r5 = r12.createRequestUrl(r5, r8, r3, r4)
                ir.mservices.market.social.profile.user.service.UserProfileService$reportUser$2 r3 = new ir.mservices.market.social.profile.user.service.UserProfileService$reportUser$2
                r3.<init>()
                java.lang.reflect.Type r4 = r3.getType()
                java.lang.String r3 = "getType(...)"
                defpackage.js3.o(r4, r3)
                defpackage.js3.m(r5)
                r8 = 0
                r10 = 496(0x1f0, float:6.95E-43)
                r9 = r11
                r3 = r12
                java.lang.Object r12 = defpackage.dy3.I(r3, r4, r5, r6, r7, r8, r9, r10)
                if (r12 != r0) goto L8a
                goto L95
            L8a:
                r3 = 0
                r9.a = r3
                r9.b = r2
                java.lang.Object r12 = r1.emit(r12, r11)
                if (r12 != r0) goto L96
            L95:
                return r0
            L96:
                tx8 r12 = defpackage.tx8.a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.social.profile.user.UserProfileViewModel.C02401.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public UserProfileViewModel(hl5 hl5Var) {
        super(false);
        this.v = hl5Var;
        l lVarB = ja1.b(null);
        this.w = lVarB;
        this.x = new rv6(lVarB);
        l lVarB2 = ja1.b(null);
        this.y = lVarB2;
        this.z = new rv6(lVarB2);
        l lVarB3 = ja1.b(null);
        this.A = lVarB3;
        this.B = new rv6(lVarB3);
        i iVarE = vy2.e(0, 7, null);
        this.C = iVarE;
        this.D = new pv6(iVarE);
        bt2.G(y97.G(this), null, null, new AnonymousClass1(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onReportAction(UserProfileAction.ReportAction reportAction) {
        bt2.G(y97.G(this), null, null, new C02401(reportAction, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onScrollYAction(UserProfileAction.ScrollYAction scrollYAction) {
        l lVar;
        Object value;
        do {
            lVar = this.A;
            value = lVar.getValue();
        } while (!lVar.n(value, scrollYAction.getScrollY()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTabAction(UserProfileAction.TabAction tabAction) {
        l lVar;
        Object value;
        do {
            lVar = this.w;
            value = lVar.getValue();
        } while (!lVar.n(value, Integer.valueOf(tabAction.getSelectedTab())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onTabAnimationAction(UserProfileAction.TabAnimationAction tabAnimationAction) {
        l lVar;
        Object value;
        Boolean boolValueOf;
        Boolean bool;
        do {
            lVar = this.y;
            value = lVar.getValue();
            boolValueOf = (Boolean) value;
            bool = Boolean.FALSE;
            if (!js3.i(boolValueOf, bool)) {
                boolValueOf = Boolean.valueOf(tabAnimationAction.getAnimation());
            }
        } while (!lVar.n(value, boolValueOf));
        if (js3.i(lVar.getValue(), bool)) {
            Integer num = (Integer) this.w.getValue();
            r(new UserProfileAction.TabAction(num != null ? num.intValue() : 0));
        }
    }
}
