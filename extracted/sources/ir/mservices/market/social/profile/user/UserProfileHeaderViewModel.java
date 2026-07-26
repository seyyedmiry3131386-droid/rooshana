package ir.mservices.market.social.profile.user;

import defpackage.bt2;
import defpackage.cw5;
import defpackage.e71;
import defpackage.fu0;
import defpackage.g51;
import defpackage.hl5;
import defpackage.ja1;
import defpackage.ja4;
import defpackage.jd7;
import defpackage.js3;
import defpackage.o19;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.rs6;
import defpackage.ru7;
import defpackage.rv6;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vb7;
import defpackage.vc8;
import defpackage.vy2;
import defpackage.xk6;
import defpackage.y97;
import ir.mservices.market.common.ui.recycler.DividerData;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.social.profile.common.recycler.ProfileHeaderData;
import ir.mservices.market.social.profile.common.recycler.ProfileInfoData;
import ir.mservices.market.social.profile.data.AccountDto;
import ir.mservices.market.social.profile.data.MenuDto;
import ir.mservices.market.social.profile.data.ProfileResponseDto;
import ir.mservices.market.social.profile.data.Relation;
import ir.mservices.market.social.profile.own.recycler.FollowRequestData;
import ir.mservices.market.social.profile.own.recycler.OwnProfileTipData;
import ir.mservices.market.social.profile.user.UserProfileHeaderAction;
import ir.mservices.market.social.profile.user.recycler.UserProfileActionData;
import java.util.ArrayList;
import java.util.List;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.j;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class UserProfileHeaderViewModel extends ir.mservices.market.viewModel.a {
    public final i A;
    public final pv6 B;
    public final l C;
    public final rv6 D;
    public final i E;
    public final pv6 F;
    public final i G;
    public final pv6 H;
    public final l I;
    public final i J;
    public final l K;
    public final l L;
    public final rv6 M;
    public final rv6 N;
    public final l O;
    public final rv6 P;
    public final hl5 v;
    public final cw5 w;
    public final o19 x;
    public final i y;
    public final pv6 z;

    /* JADX INFO: renamed from: ir.mservices.market.social.profile.user.UserProfileHeaderViewModel$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.social.profile.user.UserProfileHeaderViewModel$1", f = "UserProfileHeaderViewModel.kt", l = {242}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;

        public AnonymousClass1(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return UserProfileHeaderViewModel.this.new AnonymousClass1(g51Var);
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
            UserProfileHeaderViewModel userProfileHeaderViewModel = UserProfileHeaderViewModel.this;
            pv6 pv6Var = userProfileHeaderViewModel.u;
            xk6 xk6Var = new xk6(28, userProfileHeaderViewModel);
            this.a = 1;
            Object objA = pv6Var.a.a(new vc8(xk6Var, 9), this);
            if (objA != coroutineSingletons) {
                objA = tx8Var;
            }
            return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.social.profile.user.UserProfileHeaderViewModel$fillRecyclerData$5, reason: invalid class name */
    @tb1(c = "ir.mservices.market.social.profile.user.UserProfileHeaderViewModel$fillRecyclerData$5", f = "UserProfileHeaderViewModel.kt", l = {136}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass5 extends SuspendLambda implements qp2 {
        public int a;
        public final /* synthetic */ ProfileResponseDto c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(ProfileResponseDto profileResponseDto, g51 g51Var) {
            super(2, g51Var);
            this.c = profileResponseDto;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return UserProfileHeaderViewModel.this.new AnonymousClass5(this.c, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass5) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i == 0) {
                b.b(obj);
                i iVar = UserProfileHeaderViewModel.this.y;
                Boolean boolValueOf = Boolean.valueOf(this.c.getAccount().isBirthDate());
                this.a = 1;
                if (iVar.emit(boolValueOf, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
            }
            return tx8.a;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.social.profile.user.UserProfileHeaderViewModel$onLoadAction$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.social.profile.user.UserProfileHeaderViewModel$onLoadAction$1", f = "UserProfileHeaderViewModel.kt", l = {161}, m = "invokeSuspend", v = 1)
    public static final class C02361 extends SuspendLambda implements qp2 {
        public int a;
        public final /* synthetic */ UserProfileHeaderAction.LoadAction c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02361(UserProfileHeaderAction.LoadAction loadAction, g51 g51Var) {
            super(2, g51Var);
            this.c = loadAction;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return UserProfileHeaderViewModel.this.new C02361(this.c, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C02361) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i == 0) {
                b.b(obj);
                i iVar = UserProfileHeaderViewModel.this.A;
                ja4 state = this.c.getState();
                this.a = 1;
                if (iVar.emit(state, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
            }
            return tx8.a;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.social.profile.user.UserProfileHeaderViewModel$onRefreshAction$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.social.profile.user.UserProfileHeaderViewModel$onRefreshAction$1", f = "UserProfileHeaderViewModel.kt", l = {167}, m = "invokeSuspend", v = 1)
    public static final class C02371 extends SuspendLambda implements qp2 {
        public int a;

        public C02371(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return UserProfileHeaderViewModel.this.new C02371(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C02371) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
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
            i iVar = UserProfileHeaderViewModel.this.E;
            this.a = 1;
            return iVar.emit(tx8Var, this) == coroutineSingletons ? coroutineSingletons : tx8Var;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.social.profile.user.UserProfileHeaderViewModel$onResetRelationAction$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.social.profile.user.UserProfileHeaderViewModel$onResetRelationAction$1", f = "UserProfileHeaderViewModel.kt", l = {173}, m = "invokeSuspend", v = 1)
    public static final class C02381 extends SuspendLambda implements qp2 {
        public int a;

        public C02381(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return UserProfileHeaderViewModel.this.new C02381(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C02381) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
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
            i iVar = UserProfileHeaderViewModel.this.J;
            this.a = 1;
            return iVar.emit(tx8Var, this) == coroutineSingletons ? coroutineSingletons : tx8Var;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.social.profile.user.UserProfileHeaderViewModel$showErrorMessage$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.social.profile.user.UserProfileHeaderViewModel$showErrorMessage$1", f = "UserProfileHeaderViewModel.kt", l = {225}, m = "invokeSuspend", v = 1)
    public static final class C02391 extends SuspendLambda implements qp2 {
        public int a;
        public final /* synthetic */ String c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02391(String str, g51 g51Var) {
            super(2, g51Var);
            this.c = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return UserProfileHeaderViewModel.this.new C02391(this.c, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C02391) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i == 0) {
                b.b(obj);
                i iVar = UserProfileHeaderViewModel.this.G;
                this.a = 1;
                if (iVar.emit(this.c, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
            }
            return tx8.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserProfileHeaderViewModel(jd7 jd7Var, hl5 hl5Var, cw5 cw5Var) {
        super(true);
        js3.p(jd7Var, "savedStateHandle");
        js3.p(cw5Var, "otherAccountConnectionRepository");
        this.v = hl5Var;
        this.w = cw5Var;
        if (!jd7Var.a("accountKey")) {
            throw new IllegalArgumentException("Required argument \"accountKey\" is missing and does not have an android:defaultValue");
        }
        String str = (String) jd7Var.b("accountKey");
        if (str == null) {
            throw new IllegalArgumentException("Argument \"accountKey\" is marked as non-null but was passed a null value");
        }
        if (!jd7Var.a("nickname")) {
            throw new IllegalArgumentException("Required argument \"nickname\" is missing and does not have an android:defaultValue");
        }
        String str2 = (String) jd7Var.b("nickname");
        if (!jd7Var.a("refId")) {
            throw new IllegalArgumentException("Required argument \"refId\" is missing and does not have an android:defaultValue");
        }
        this.x = new o19(str, str2, (String) jd7Var.b("refId"));
        i iVarE = vy2.e(0, 7, null);
        this.y = iVarE;
        this.z = new pv6(iVarE);
        i iVarE2 = vy2.e(0, 7, null);
        this.A = iVarE2;
        this.B = new pv6(iVarE2);
        l lVarB = ja1.b(null);
        this.C = lVarB;
        this.D = new rv6(lVarB);
        i iVarE3 = vy2.e(0, 7, null);
        this.E = iVarE3;
        this.F = new pv6(iVarE3);
        i iVarE4 = vy2.e(0, 7, null);
        this.G = iVarE4;
        this.H = new pv6(iVarE4);
        this.I = ja1.b(Relation.NONE);
        this.J = vy2.e(0, 7, null);
        this.K = ja1.b(null);
        l lVarB2 = ja1.b(EmptyList.a);
        this.L = lVarB2;
        vb7 vb7Var = new vb7(new UserProfileHeaderViewModel$special$$inlined$transform$1(lVarB2, null));
        fu0 fu0VarG = y97.G(this);
        j jVar = ru7.b;
        this.M = d.A(vb7Var, fu0VarG, jVar, null);
        this.N = d.A(new vb7(new UserProfileHeaderViewModel$special$$inlined$transform$2(lVarB2, null)), y97.G(this), jVar, null);
        l lVarB3 = ja1.b(null);
        this.O = lVarB3;
        this.P = new rv6(lVarB3);
        bt2.G(y97.G(this), null, null, new AnonymousClass1(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<MyketRecyclerData> fillRecyclerData(ProfileResponseDto profileResponseDto) {
        l lVar;
        Object value;
        l lVar2;
        Object value2;
        l lVar3;
        Object value3;
        List<MenuDto> menus = profileResponseDto.getMenus();
        if (menus != null) {
            l lVar4 = this.L;
            lVar4.getClass();
            lVar4.p(null, menus);
        }
        this.O.o(profileResponseDto.getAccount());
        ArrayList arrayList = new ArrayList();
        do {
            lVar = this.K;
            value = lVar.getValue();
        } while (!lVar.n(value, profileResponseDto.getRelations()));
        do {
            lVar2 = this.I;
            value2 = lVar2.getValue();
        } while (!lVar2.n(value2, Relation.Companion.getByValue(profileResponseDto.getRelations().getForward())));
        do {
            lVar3 = this.C;
            value3 = lVar3.getValue();
        } while (!lVar3.n(value3, new ProfileHeaderData(lVar, profileResponseDto.getRelations(), profileResponseDto.getAccount(), rs6.profile_header_user_following)));
        arrayList.add(new UserProfileActionData(profileResponseDto.getMessaging(), profileResponseDto.getRelations(), profileResponseDto.getAccount().getAccountKey(), lVar2, this.J));
        arrayList.add(new ProfileInfoData(profileResponseDto.getAccount()));
        bt2.G(y97.G(this), null, null, new AnonymousClass5(profileResponseDto, null), 3);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFollowAction(UserProfileHeaderAction.FollowAction followAction) {
        String accountKey;
        AccountDto accountDto = (AccountDto) this.O.getValue();
        if (accountDto == null || (accountKey = accountDto.getAccountKey()) == null) {
            return;
        }
        bt2.G(y97.G(this), null, null, new UserProfileHeaderViewModel$onFollowAction$1$1(this, accountKey, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onLoadAction(UserProfileHeaderAction.LoadAction loadAction) {
        bt2.G(y97.G(this), null, null, new C02361(loadAction, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onRefreshAction(UserProfileHeaderAction.RefreshAction refreshAction) {
        bt2.G(y97.G(this), null, null, new C02371(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onResetRelationAction(UserProfileHeaderAction.ResetRelation resetRelation) {
        bt2.G(y97.G(this), null, null, new C02381(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onUnfollowAction(UserProfileHeaderAction.UnfollowAction unfollowAction) {
        String accountKey;
        AccountDto accountDto = (AccountDto) this.O.getValue();
        if (accountDto == null || (accountKey = accountDto.getAccountKey()) == null) {
            return;
        }
        bt2.G(y97.G(this), null, null, new UserProfileHeaderViewModel$onUnfollowAction$1$1(this, accountKey, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecyclerItem setDivider(RecyclerItem recyclerItem, RecyclerItem recyclerItem2) {
        if (recyclerItem == null || recyclerItem2 == null) {
            return null;
        }
        MyketRecyclerData myketRecyclerData = recyclerItem.c;
        if (!(myketRecyclerData instanceof FollowRequestData) && !(myketRecyclerData instanceof OwnProfileTipData)) {
            return null;
        }
        DividerData dividerData = new DividerData();
        dividerData.b = true;
        return new RecyclerItem(dividerData);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showErrorMessage(String str) {
        bt2.G(y97.G(this), null, null, new C02391(str, null), 3);
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        p(new UserProfileHeaderViewModel$doRequest$1(this, null));
    }
}
