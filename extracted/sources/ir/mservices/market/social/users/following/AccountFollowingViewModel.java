package ir.mservices.market.social.users.following;

import androidx.paging.e;
import defpackage.bl4;
import defpackage.bt2;
import defpackage.bz6;
import defpackage.cw5;
import defpackage.e71;
import defpackage.g51;
import defpackage.gu9;
import defpackage.ja1;
import defpackage.jd7;
import defpackage.js3;
import defpackage.l4;
import defpackage.n;
import defpackage.n4;
import defpackage.o4;
import defpackage.p4;
import defpackage.pj9;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.r4;
import defpackage.rs6;
import defpackage.rv6;
import defpackage.t19;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wu0;
import defpackage.xe2;
import defpackage.y97;
import ir.mservices.market.app.home.ui.recycler.HomeMoreTitleRowData;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.social.users.common.BaseAccountUsersViewModel;
import ir.mservices.market.social.users.common.data.UserDto;
import ir.mservices.market.social.users.common.data.UsersDto;
import ir.mservices.market.social.users.common.recycler.OwnUsersEmptyData;
import ir.mservices.market.social.users.common.recycler.UserCardData;
import ir.mservices.market.social.users.common.recycler.UserCardRowData;
import ir.mservices.market.social.users.following.AccountFollowingAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class AccountFollowingViewModel extends BaseAccountUsersViewModel {
    public final p4 A;
    public final l B;
    public final rv6 C;
    public boolean D;
    public final pj9 x;
    public final t19 y;
    public final cw5 z;

    /* JADX INFO: renamed from: ir.mservices.market.social.users.following.AccountFollowingViewModel$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.social.users.following.AccountFollowingViewModel$1", f = "AccountFollowingViewModel.kt", l = {126}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;

        public AnonymousClass1(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return AccountFollowingViewModel.this.new AnonymousClass1(g51Var);
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
            AccountFollowingViewModel accountFollowingViewModel = AccountFollowingViewModel.this;
            pv6 pv6Var = accountFollowingViewModel.u;
            r4 r4Var = new r4(0, accountFollowingViewModel);
            this.a = 1;
            Object objA = pv6Var.a.a(new n4(r4Var, 1), this);
            if (objA != coroutineSingletons) {
                objA = tx8Var;
            }
            return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.social.users.following.AccountFollowingViewModel$2, reason: invalid class name */
    @tb1(c = "ir.mservices.market.social.users.following.AccountFollowingViewModel$2", f = "AccountFollowingViewModel.kt", l = {57}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements qp2 {
        public int a;

        /* JADX INFO: renamed from: ir.mservices.market.social.users.following.AccountFollowingViewModel$2$2, reason: invalid class name and collision with other inner class name */
        @tb1(c = "ir.mservices.market.social.users.following.AccountFollowingViewModel$2$2", f = "AccountFollowingViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
        final class C00302 extends SuspendLambda implements qp2 {
            public final /* synthetic */ AccountFollowingViewModel a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00302(AccountFollowingViewModel accountFollowingViewModel, g51 g51Var) {
                super(2, g51Var);
                this.a = accountFollowingViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final g51 create(Object obj, g51 g51Var) {
                return new C00302(this.a, g51Var);
            }

            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                C00302 c00302 = (C00302) create(bool, (g51) obj2);
                tx8 tx8Var = tx8.a;
                c00302.invokeSuspend(tx8Var);
                return tx8Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Object value;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
                b.b(obj);
                l lVar = this.a.B;
                do {
                    value = lVar.getValue();
                    ((Boolean) value).getClass();
                } while (!lVar.n(value, Boolean.TRUE));
                return tx8.a;
            }
        }

        public AnonymousClass2(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return AccountFollowingViewModel.this.new AnonymousClass2(g51Var);
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
                AccountFollowingViewModel accountFollowingViewModel = AccountFollowingViewModel.this;
                o4 o4Var = new o4(accountFollowingViewModel.z.b, 1);
                C00302 c00302 = new C00302(accountFollowingViewModel, null);
                this.a = 1;
                if (d.f(o4Var, c00302, this) == coroutineSingletons) {
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

    public AccountFollowingViewModel(pj9 pj9Var, t19 t19Var, cw5 cw5Var, jd7 jd7Var) {
        js3.p(t19Var, "userRepository");
        js3.p(cw5Var, "otherAccountConnectionRepository");
        js3.p(jd7Var, "savedStateHandle");
        this.x = pj9Var;
        this.y = t19Var;
        this.z = cw5Var;
        if (!jd7Var.a("accountKey")) {
            throw new IllegalArgumentException("Required argument \"accountKey\" is missing and does not have an android:defaultValue");
        }
        String str = (String) jd7Var.b("accountKey");
        if (str == null) {
            throw new IllegalArgumentException("Argument \"accountKey\" is marked as non-null but was passed a null value");
        }
        this.A = new p4(str);
        l lVarB = ja1.b(Boolean.FALSE);
        this.B = lVarB;
        this.C = new rv6(lVarB);
        this.D = true;
        bt2.G(y97.G(this), null, null, new AnonymousClass1(null), 3);
        bt2.G(y97.G(this), null, null, new AnonymousClass2(null), 3);
    }

    private final List<MyketRecyclerData> generateUserItems(UsersDto usersDto) {
        AccountFollowingViewModel accountFollowingViewModel;
        if (((Boolean) this.w.a.getValue()).booleanValue()) {
            return EmptyList.a;
        }
        ArrayList arrayList = new ArrayList();
        List<UserDto> accounts = usersDto.getAccounts();
        if (accounts != null) {
            Iterator<T> it = accounts.iterator();
            while (it.hasNext()) {
                arrayList.add(new UserCardData((UserDto) it.next(), true));
            }
        }
        List<UserDto> accounts2 = usersDto.getAccounts();
        if ((accounts2 == null || accounts2.isEmpty()) && this.D) {
            arrayList.add(new OwnUsersEmptyData(rs6.no_item_in_own_user_following_list, rs6.no_item_in_own_user_follower_description, false));
        } else if (!this.D && usersDto.getShowMynetHint()) {
            arrayList.add(new OwnUsersEmptyData(rs6.no_item_in_own_user_following_list, rs6.no_item_in_own_user_follower_description, true));
        }
        UsersDto suggestionList = usersDto.getSuggestionList();
        if (suggestionList != null) {
            arrayList.add(new HomeMoreTitleRowData(suggestionList.getTitle(), suggestionList.getId(), null, suggestionList.getEol(), null, null, null, null, 240));
            accountFollowingViewModel = this;
            arrayList.add(new UserCardRowData(suggestionList, getUserNestedList(suggestionList), new AccountFollowingViewModel$generateUserItems$1$2$1(1, accountFollowingViewModel, AccountFollowingViewModel.class, "removeIfEmptyCallback", "removeIfEmptyCallback(Ljava/lang/String;)V", 0)));
        } else {
            accountFollowingViewModel = this;
        }
        accountFollowingViewModel.D = false;
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getItems$lambda$0(AccountFollowingViewModel accountFollowingViewModel, UsersDto usersDto) {
        Object value;
        js3.p(usersDto, "it");
        l lVar = accountFollowingViewModel.v;
        do {
            value = lVar.getValue();
            ((Boolean) value).getClass();
        } while (!lVar.n(value, Boolean.valueOf(usersDto.isLocked())));
        accountFollowingViewModel.o(usersDto.getTitle());
        List<MyketRecyclerData> listGenerateUserItems = accountFollowingViewModel.generateUserItems(usersDto);
        ArrayList arrayList = new ArrayList(wu0.V(listGenerateUserItems, 10));
        Iterator<T> it = listGenerateUserItems.iterator();
        while (it.hasNext()) {
            bl4.G((MyketRecyclerData) it.next(), arrayList);
        }
        return arrayList;
    }

    private final bz6 getUserNestedList(UsersDto usersDto) {
        return new bz6(e.b(gu9.x(this.y.a(usersDto, usersDto.getId(), this), new l4(usersDto, 1)), y97.G(this)), null, null, null, 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getUserNestedList$lambda$0(UsersDto usersDto, UsersDto usersDto2) {
        js3.p(usersDto2, "it");
        List<UserDto> accounts = usersDto2.getAccounts();
        if (accounts == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(wu0.V(accounts, 10));
        Iterator<T> it = accounts.iterator();
        while (it.hasNext()) {
            arrayList.add(new RecyclerItem(new UserCardData((UserDto) it.next(), usersDto.isMulti())));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onRefreshAction(AccountFollowingAction.Refresh refresh) {
        l lVar;
        Object value;
        do {
            lVar = this.B;
            value = lVar.getValue();
            ((Boolean) value).getClass();
        } while (!lVar.n(value, Boolean.valueOf(refresh.isRefresh())));
    }

    @Override // ir.mservices.market.social.users.common.BaseAccountUsersViewModel
    public final xe2 s() {
        return gu9.x(this.x.q(this.A.a, this), new n(4, this));
    }
}
