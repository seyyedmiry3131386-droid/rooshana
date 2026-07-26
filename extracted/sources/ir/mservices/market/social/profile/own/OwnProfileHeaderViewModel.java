package ir.mservices.market.social.profile.own;

import defpackage.bj2;
import defpackage.bt2;
import defpackage.c5;
import defpackage.cw5;
import defpackage.e71;
import defpackage.fu0;
import defpackage.g51;
import defpackage.ja1;
import defpackage.ja4;
import defpackage.js3;
import defpackage.lu7;
import defpackage.o4;
import defpackage.pt1;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.rs6;
import defpackage.ru7;
import defpackage.rv6;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vb7;
import defpackage.vo4;
import defpackage.vy2;
import defpackage.y97;
import defpackage.z4;
import ir.mservices.market.app.detail.data.MessageBoxDto;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.social.profile.common.recycler.ProfileHeaderData;
import ir.mservices.market.social.profile.common.recycler.ProfileInfoData;
import ir.mservices.market.social.profile.data.AccountDto;
import ir.mservices.market.social.profile.data.ForceUpdateDto;
import ir.mservices.market.social.profile.data.MenuDto;
import ir.mservices.market.social.profile.data.ProfileRequestDto;
import ir.mservices.market.social.profile.data.ProfileResponseDto;
import ir.mservices.market.social.profile.own.OwnProfileHeaderAction;
import ir.mservices.market.social.profile.own.recycler.FollowRequestData;
import ir.mservices.market.social.profile.own.recycler.OwnProfileActionData;
import ir.mservices.market.social.profile.own.recycler.OwnProfileTipData;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
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
public final class OwnProfileHeaderViewModel extends ir.mservices.market.viewModel.a {
    public final i A;
    public final pv6 B;
    public final i C;
    public final pv6 D;
    public final i E;
    public final pv6 F;
    public final l G;
    public final rv6 H;
    public final l I;
    public final pv6 J;
    public final l K;
    public final l L;
    public final l M;
    public final rv6 N;
    public final rv6 O;
    public final l P;
    public final rv6 Q;
    public boolean R;
    public final vo4 v;
    public final cw5 w;
    public final c5 x;
    public final i y;
    public final pv6 z;

    /* JADX INFO: renamed from: ir.mservices.market.social.profile.own.OwnProfileHeaderViewModel$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.social.profile.own.OwnProfileHeaderViewModel$1", f = "OwnProfileHeaderViewModel.kt", l = {ErrorDTO.CODE_PACKAGE_NAME_NOT_IN_MYKET_ERROR}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;

        public AnonymousClass1(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return OwnProfileHeaderViewModel.this.new AnonymousClass1(g51Var);
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
            OwnProfileHeaderViewModel ownProfileHeaderViewModel = OwnProfileHeaderViewModel.this;
            pv6 pv6Var = ownProfileHeaderViewModel.u;
            bj2 bj2Var = new bj2(24, ownProfileHeaderViewModel);
            this.a = 1;
            Object objA = pv6Var.a.a(new pt1(bj2Var, 29), this);
            if (objA != coroutineSingletons) {
                objA = tx8Var;
            }
            return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.social.profile.own.OwnProfileHeaderViewModel$2, reason: invalid class name */
    @tb1(c = "ir.mservices.market.social.profile.own.OwnProfileHeaderViewModel$2", f = "OwnProfileHeaderViewModel.kt", l = {98}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements qp2 {
        public int a;

        /* JADX INFO: renamed from: ir.mservices.market.social.profile.own.OwnProfileHeaderViewModel$2$2, reason: invalid class name and collision with other inner class name */
        @tb1(c = "ir.mservices.market.social.profile.own.OwnProfileHeaderViewModel$2$2", f = "OwnProfileHeaderViewModel.kt", l = {99, 100}, m = "invokeSuspend", v = 1)
        final class C00292 extends SuspendLambda implements qp2 {
            public int a;
            public final /* synthetic */ OwnProfileHeaderViewModel b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00292(OwnProfileHeaderViewModel ownProfileHeaderViewModel, g51 g51Var) {
                super(2, g51Var);
                this.b = ownProfileHeaderViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final g51 create(Object obj, g51 g51Var) {
                return new C00292(this.b, g51Var);
            }

            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                return ((C00292) create(bool, (g51) obj2)).invokeSuspend(tx8.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
                int i = this.a;
                tx8 tx8Var = tx8.a;
                OwnProfileHeaderViewModel ownProfileHeaderViewModel = this.b;
                if (i == 0) {
                    b.b(obj);
                    l lVar = ownProfileHeaderViewModel.I;
                    Boolean bool = Boolean.TRUE;
                    this.a = 1;
                    lVar.emit(bool, this);
                    if (tx8Var != coroutineSingletons) {
                    }
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    b.b(obj);
                    return tx8Var;
                }
                b.b(obj);
                cw5 cw5Var = ownProfileHeaderViewModel.w;
                this.a = 2;
                return cw5Var.a(false, this) == coroutineSingletons ? coroutineSingletons : tx8Var;
            }
        }

        public AnonymousClass2(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return OwnProfileHeaderViewModel.this.new AnonymousClass2(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i == 0) {
                b.b(obj);
                OwnProfileHeaderViewModel ownProfileHeaderViewModel = OwnProfileHeaderViewModel.this;
                o4 o4Var = new o4(ownProfileHeaderViewModel.w.b, 16);
                C00292 c00292 = new C00292(ownProfileHeaderViewModel, null);
                this.a = 1;
                if (d.f(o4Var, c00292, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: ir.mservices.market.social.profile.own.OwnProfileHeaderViewModel$fillRecyclerData$10, reason: invalid class name */
    @tb1(c = "ir.mservices.market.social.profile.own.OwnProfileHeaderViewModel$fillRecyclerData$10", f = "OwnProfileHeaderViewModel.kt", l = {146}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass10 extends SuspendLambda implements qp2 {
        public int a;
        public final /* synthetic */ OwnProfileHeaderViewModel b;
        public final /* synthetic */ ProfileResponseDto c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass10(g51 g51Var, ProfileResponseDto profileResponseDto, OwnProfileHeaderViewModel ownProfileHeaderViewModel) {
            super(2, g51Var);
            this.b = ownProfileHeaderViewModel;
            this.c = profileResponseDto;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass10(g51Var, this.c, this.b);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass10) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i == 0) {
                b.b(obj);
                i iVar = this.b.y;
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

    /* JADX INFO: renamed from: ir.mservices.market.social.profile.own.OwnProfileHeaderViewModel$fillRecyclerData$11, reason: invalid class name */
    @tb1(c = "ir.mservices.market.social.profile.own.OwnProfileHeaderViewModel$fillRecyclerData$11", f = "OwnProfileHeaderViewModel.kt", l = {151}, m = "invokeSuspend", v = 1)
    public static final class AnonymousClass11 extends SuspendLambda implements qp2 {
        public int a;
        public final /* synthetic */ ProfileResponseDto b;
        public final /* synthetic */ OwnProfileHeaderViewModel c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass11(g51 g51Var, ProfileResponseDto profileResponseDto, OwnProfileHeaderViewModel ownProfileHeaderViewModel) {
            super(2, g51Var);
            this.b = profileResponseDto;
            this.c = ownProfileHeaderViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new AnonymousClass11(g51Var, this.b, this.c);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass11) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i == 0) {
                b.b(obj);
                ProfileResponseDto profileResponseDto = this.b;
                Boolean boolIsNewUser = profileResponseDto.isNewUser();
                if (boolIsNewUser != null) {
                    boolean zBooleanValue = boolIsNewUser.booleanValue();
                    OwnProfileHeaderViewModel ownProfileHeaderViewModel = this.c;
                    if (!zBooleanValue || ownProfileHeaderViewModel.R) {
                        boolIsNewUser = null;
                    }
                    if (boolIsNewUser != null) {
                        ownProfileHeaderViewModel.R = true;
                        i iVar = ownProfileHeaderViewModel.A;
                        AccountDto account = profileResponseDto.getAccount();
                        this.a = 1;
                        if (iVar.emit(account, this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
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

    /* JADX INFO: renamed from: ir.mservices.market.social.profile.own.OwnProfileHeaderViewModel$onLoadAction$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.social.profile.own.OwnProfileHeaderViewModel$onLoadAction$1", f = "OwnProfileHeaderViewModel.kt", l = {177}, m = "invokeSuspend", v = 1)
    public static final class C02331 extends SuspendLambda implements qp2 {
        public int a;
        public final /* synthetic */ OwnProfileHeaderAction.LoadAction c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02331(OwnProfileHeaderAction.LoadAction loadAction, g51 g51Var) {
            super(2, g51Var);
            this.c = loadAction;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return OwnProfileHeaderViewModel.this.new C02331(this.c, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C02331) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i == 0) {
                b.b(obj);
                i iVar = OwnProfileHeaderViewModel.this.E;
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

    /* JADX INFO: renamed from: ir.mservices.market.social.profile.own.OwnProfileHeaderViewModel$onRefreshAction$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.social.profile.own.OwnProfileHeaderViewModel$onRefreshAction$1", f = "OwnProfileHeaderViewModel.kt", l = {183}, m = "invokeSuspend", v = 1)
    public static final class C02341 extends SuspendLambda implements qp2 {
        public int a;
        public final /* synthetic */ OwnProfileHeaderAction.RefreshAction c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02341(OwnProfileHeaderAction.RefreshAction refreshAction, g51 g51Var) {
            super(2, g51Var);
            this.c = refreshAction;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return OwnProfileHeaderViewModel.this.new C02341(this.c, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C02341) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
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
            l lVar = OwnProfileHeaderViewModel.this.I;
            Boolean boolValueOf = Boolean.valueOf(this.c.isRefresh());
            this.a = 1;
            lVar.emit(boolValueOf, this);
            return tx8Var == coroutineSingletons ? coroutineSingletons : tx8Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OwnProfileHeaderViewModel(vo4 vo4Var, cw5 cw5Var, c5 c5Var) {
        super(true);
        js3.p(cw5Var, "otherAccountConnectionRepository");
        js3.p(c5Var, "accountManager");
        this.v = vo4Var;
        this.w = cw5Var;
        this.x = c5Var;
        i iVarE = vy2.e(0, 7, null);
        this.y = iVarE;
        this.z = new pv6(iVarE);
        i iVarE2 = vy2.e(0, 7, null);
        this.A = iVarE2;
        this.B = new pv6(iVarE2);
        i iVarE3 = vy2.e(0, 7, null);
        this.C = iVarE3;
        this.D = new pv6(iVarE3);
        i iVarE4 = vy2.e(0, 7, null);
        this.E = iVarE4;
        this.F = new pv6(iVarE4);
        l lVarB = ja1.b(null);
        this.G = lVarB;
        this.H = new rv6(lVarB);
        Boolean bool = Boolean.FALSE;
        l lVarB2 = ja1.b(bool);
        this.I = lVarB2;
        this.J = new pv6(lVarB2);
        this.K = ja1.b(bool);
        this.L = ja1.b(null);
        l lVarB3 = ja1.b(EmptyList.a);
        this.M = lVarB3;
        vb7 vb7Var = new vb7(new OwnProfileHeaderViewModel$special$$inlined$transform$1(lVarB3, null));
        fu0 fu0VarG = y97.G(this);
        j jVar = ru7.b;
        this.N = d.A(vb7Var, fu0VarG, jVar, null);
        this.O = d.A(new vb7(new OwnProfileHeaderViewModel$special$$inlined$transform$2(lVarB3, null)), y97.G(this), jVar, null);
        l lVarB4 = ja1.b(null);
        this.P = lVarB4;
        this.Q = new rv6(lVarB4);
        bt2.G(y97.G(this), null, null, new AnonymousClass1(null), 3);
        bt2.G(y97.G(this), null, null, new AnonymousClass2(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<MyketRecyclerData> fillRecyclerData(ProfileResponseDto profileResponseDto) {
        l lVar;
        Object value;
        l lVar2;
        Object value2;
        l lVar3;
        Object value3;
        do {
            lVar = this.L;
            value = lVar.getValue();
        } while (!lVar.n(value, profileResponseDto.getRelations()));
        List<MenuDto> menus = profileResponseDto.getMenus();
        if (menus != null) {
            l lVar4 = this.M;
            lVar4.getClass();
            lVar4.p(null, menus);
        }
        do {
            lVar2 = this.P;
            value2 = lVar2.getValue();
        } while (!lVar2.n(value2, profileResponseDto.getAccount()));
        String userName = profileResponseDto.getAccount().getUserName();
        if (userName != null) {
            z4 z4Var = this.x.h;
            z4Var.i = userName;
            z4Var.i(userName, lu7.r, true);
        }
        ArrayList arrayList = new ArrayList();
        Boolean unread = profileResponseDto.getMessaging().getUnread();
        onUnreadMessageAction(new OwnProfileHeaderAction.UnreadMessageAction(unread != null ? unread.booleanValue() : false));
        do {
            lVar3 = this.G;
            value3 = lVar3.getValue();
        } while (!lVar3.n(value3, new ProfileHeaderData(lVar, profileResponseDto.getRelations(), profileResponseDto.getAccount(), rs6.profile_header_following)));
        arrayList.add(new OwnProfileActionData(profileResponseDto.getMessaging(), this.K));
        arrayList.add(new ProfileInfoData(profileResponseDto.getAccount()));
        ProfileRequestDto profileRequest = profileResponseDto.getProfileRequest();
        if (profileRequest != null) {
            arrayList.add(new FollowRequestData(profileRequest));
        }
        ForceUpdateDto forceUpdate = profileResponseDto.getForceUpdate();
        if (forceUpdate != null) {
            if (forceUpdate.getLastVersionCode() <= 1028) {
                forceUpdate = null;
            }
            if (forceUpdate != null) {
                bt2.G(y97.G(this), null, null, new OwnProfileHeaderViewModel$fillRecyclerData$8$1(this, forceUpdate, null), 3);
            }
        }
        MessageBoxDto tip = profileResponseDto.getTip();
        if (tip != null) {
            arrayList.add(new OwnProfileTipData(tip));
        }
        bt2.G(y97.G(this), null, null, new AnonymousClass10(null, profileResponseDto, this), 3);
        bt2.G(y97.G(this), null, null, new AnonymousClass11(null, profileResponseDto, this), 3);
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onLoadAction(OwnProfileHeaderAction.LoadAction loadAction) {
        bt2.G(y97.G(this), null, null, new C02331(loadAction, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onRefreshAction(OwnProfileHeaderAction.RefreshAction refreshAction) {
        bt2.G(y97.G(this), null, null, new C02341(refreshAction, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onUnreadMessageAction(OwnProfileHeaderAction.UnreadMessageAction unreadMessageAction) {
        l lVar;
        Object value;
        do {
            lVar = this.K;
            value = lVar.getValue();
            ((Boolean) value).getClass();
        } while (!lVar.n(value, Boolean.valueOf(unreadMessageAction.isUnread())));
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        p(new OwnProfileHeaderViewModel$doRequest$1(this, null));
    }
}
