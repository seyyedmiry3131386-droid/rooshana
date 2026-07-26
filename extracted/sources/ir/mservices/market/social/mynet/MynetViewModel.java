package ir.mservices.market.social.mynet;

import androidx.paging.e;
import defpackage.bt2;
import defpackage.bz6;
import defpackage.ch5;
import defpackage.e71;
import defpackage.f88;
import defpackage.fl7;
import defpackage.g51;
import defpackage.gu9;
import defpackage.js3;
import defpackage.l4;
import defpackage.pt1;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.t19;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wu0;
import defpackage.xg5;
import defpackage.y97;
import ir.mservices.market.app.home.data.HomeBannerDto;
import ir.mservices.market.app.home.ui.recycler.HomeBannerData;
import ir.mservices.market.app.home.ui.recycler.HomeMoreTitleRowData;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.movie.data.webapi.HomeMovieBannerDto;
import ir.mservices.market.movie.ui.home.recycler.MovieHomeBannerData;
import ir.mservices.market.social.mynet.data.MynetHomeDto;
import ir.mservices.market.social.mynet.data.MynetItemType;
import ir.mservices.market.social.mynet.data.MynetItemsDto;
import ir.mservices.market.social.users.common.data.UserDto;
import ir.mservices.market.social.users.common.data.UsersDto;
import ir.mservices.market.social.users.common.recycler.UserCardData;
import ir.mservices.market.social.users.common.recycler.UserCardRowData;
import ir.mservices.market.viewModel.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
public final class MynetViewModel extends a {
    public final xg5 v;
    public final t19 w;

    /* JADX INFO: renamed from: ir.mservices.market.social.mynet.MynetViewModel$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.social.mynet.MynetViewModel$1", f = "MynetViewModel.kt", l = {170}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;

        public AnonymousClass1(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return MynetViewModel.this.new AnonymousClass1(g51Var);
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
            pv6 pv6Var = MynetViewModel.this.u;
            fl7 fl7Var = new fl7(2);
            this.a = 1;
            Object objA = pv6Var.a.a(new pt1(fl7Var, 24), this);
            if (objA != coroutineSingletons) {
                objA = tx8Var;
            }
            return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MynetViewModel(xg5 xg5Var, t19 t19Var) {
        super(true);
        js3.p(t19Var, "userRepository");
        this.v = xg5Var;
        this.w = t19Var;
        bt2.G(y97.G(this), null, null, new AnonymousClass1(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<MyketRecyclerData> fillRecyclerData(MynetHomeDto mynetHomeDto) {
        HomeMovieBannerDto movieBanner;
        ArrayList arrayList = new ArrayList();
        List<MynetItemsDto> items = mynetHomeDto.getItems();
        if (items != null) {
            for (MynetItemsDto mynetItemsDto : items) {
                MynetItemType byValue = MynetItemType.Companion.getByValue(mynetItemsDto.getItemType());
                int i = byValue == null ? -1 : ch5.a[byValue.ordinal()];
                if (i == 1) {
                    UsersDto users = mynetItemsDto.getUsers();
                    if (users != null) {
                        if (!f88.n0(users.getTitle())) {
                            arrayList.add(new HomeMoreTitleRowData(users.getTitle(), users.getId(), null, true, null, null, null, null, 240));
                        }
                        arrayList.add(new UserCardRowData(users, getHomeUserNestedList(users), new MynetViewModel$fillRecyclerData$1$1$1(1, this, MynetViewModel.class, "removeIfEmptyCallback", "removeIfEmptyCallback(Ljava/lang/String;)V", 0)));
                    }
                } else if (i == 2) {
                    HomeBannerDto appBanner = mynetItemsDto.getAppBanner();
                    if (appBanner != null) {
                        String title = appBanner.getTitle();
                        if (title != null && !f88.n0(title)) {
                            arrayList.add(new HomeMoreTitleRowData(appBanner.getTitle(), appBanner.getItemId(), null, false, null, null, null, null, 240));
                        }
                        arrayList.add(new HomeBannerData(appBanner));
                    }
                } else if (i == 3 && (movieBanner = mynetItemsDto.getMovieBanner()) != null) {
                    arrayList.add(new MovieHomeBannerData(movieBanner, null, false));
                }
            }
        }
        return arrayList;
    }

    private final bz6 getHomeUserNestedList(UsersDto usersDto) {
        return new bz6(e.b(gu9.x(this.w.a(usersDto, usersDto.getId(), this), new l4(usersDto, 2)), y97.G(this)), null, null, null, 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getHomeUserNestedList$lambda$0(UsersDto usersDto, UsersDto usersDto2) {
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

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        p(new MynetViewModel$doRequest$1(this, null));
    }
}
