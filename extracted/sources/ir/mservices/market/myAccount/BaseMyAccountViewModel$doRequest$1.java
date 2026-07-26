package ir.mservices.market.myAccount;

import androidx.paging.e;
import androidx.paging.m;
import defpackage.bl4;
import defpackage.bp2;
import defpackage.br9;
import defpackage.bz6;
import defpackage.dp2;
import defpackage.g51;
import defpackage.gu9;
import defpackage.qp2;
import defpackage.rs6;
import defpackage.ru7;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.vb7;
import defpackage.wu0;
import defpackage.xe2;
import defpackage.y97;
import defpackage.z4;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.myAccount.data.MyAccountInfoDto;
import ir.mservices.market.myAccount.recycler.MyAccountCheckBoxData;
import ir.mservices.market.myAccount.recycler.MyAccountHeaderData;
import ir.mservices.market.myAccount.recycler.MyAccountInfoNestedData;
import ir.mservices.market.myAccount.recycler.MyAccountItemData;
import ir.mservices.market.myAccount.recycler.MyAccountLinkItemData;
import ir.mservices.market.myAccount.recycler.MyAccountPrivacyNestedData;
import ir.mservices.market.myAccount.recycler.MyAccountPrivateNestedData;
import ir.mservices.market.version2.ui.recycler.filter.GeneralFilter;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.myAccount.BaseMyAccountViewModel$doRequest$1", f = "BaseMyAccountViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
final class BaseMyAccountViewModel$doRequest$1 extends SuspendLambda implements qp2 {
    public final /* synthetic */ BaseMyAccountViewModel a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseMyAccountViewModel$doRequest$1(BaseMyAccountViewModel baseMyAccountViewModel, g51 g51Var) {
        super(2, g51Var);
        this.a = baseMyAccountViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new BaseMyAccountViewModel$doRequest$1(this.a, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((BaseMyAccountViewModel$doRequest$1) create((bz6) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        b.b(obj);
        final BaseMyAccountViewModel baseMyAccountViewModel = this.a;
        final z4 z4Var = baseMyAccountViewModel.t;
        z4Var.getClass();
        return new bz6(e.b(gu9.x((xe2) new m(gu9.B(), new bp2() { // from class: ir.mservices.market.myAccount.model.a
            @Override // defpackage.bp2
            public final Object invoke() {
                return new ir.mservices.market.model.paging.b(new MyAccountRepositoryImpl$getPersonalInfo$1$1(z4Var, baseMyAccountViewModel, null));
            }
        }).a, new dp2() { // from class: ir.mservices.market.myAccount.a
            @Override // defpackage.dp2
            public final Object invoke(Object obj2) {
                Object value;
                Boolean bool;
                MyAccountInfoDto myAccountInfoDto = (MyAccountInfoDto) obj2;
                Pair pair = new Pair(MyAccountItemsType.c, myAccountInfoDto.getNickname());
                BaseMyAccountViewModel baseMyAccountViewModel2 = baseMyAccountViewModel;
                baseMyAccountViewModel2.t(pair);
                baseMyAccountViewModel2.t(new Pair(MyAccountItemsType.d, myAccountInfoDto.getBio()));
                baseMyAccountViewModel2.t(new Pair(MyAccountItemsType.e, myAccountInfoDto.getGender()));
                baseMyAccountViewModel2.t(new Pair(MyAccountItemsType.f, myAccountInfoDto.getCity()));
                baseMyAccountViewModel2.t(new Pair(MyAccountItemsType.g, myAccountInfoDto.getShamsiBirthDate()));
                baseMyAccountViewModel2.t(new Pair(MyAccountItemsType.h, myAccountInfoDto.getPrivacySetting().getPrivacyAccessLevel()));
                baseMyAccountViewModel2.t(new Pair(MyAccountItemsType.i, myAccountInfoDto.getPrivacySetting().getMessageAccessLevel()));
                baseMyAccountViewModel2.t(new Pair(MyAccountItemsType.j, String.valueOf(myAccountInfoDto.getPrivacySetting().isPrivate())));
                l lVar = baseMyAccountViewModel2.D;
                do {
                    value = lVar.getValue();
                    ((Boolean) value).getClass();
                    bool = Boolean.FALSE;
                } while (!lVar.n(value, bool));
                ArrayList arrayList = new ArrayList();
                arrayList.add(new MyAccountHeaderData(baseMyAccountViewModel2.x, myAccountInfoDto.getHighResAvatarUrl()));
                arrayList.add(new MyAccountInfoNestedData(new bz6(br9.C(new RecyclerItem(new MyAccountItemData(rs6.name, baseMyAccountViewModel2.r(MyAccountItemsType.c))), new RecyclerItem(new MyAccountItemData(rs6.account_bio, baseMyAccountViewModel2.r(MyAccountItemsType.d))), new RecyclerItem(new MyAccountItemData(rs6.account_gender, baseMyAccountViewModel2.r(MyAccountItemsType.e))), new RecyclerItem(new MyAccountItemData(rs6.city, baseMyAccountViewModel2.r(MyAccountItemsType.f))), new RecyclerItem(new MyAccountItemData(rs6.birthday, baseMyAccountViewModel2.r(MyAccountItemsType.g)))), (GeneralFilter) null, new BaseMyAccountViewModel$myAccountRecyclerItems$1$1(2, baseMyAccountViewModel2, BaseMyAccountViewModel.class, "setDivider", "setDivider(Lir/mservices/market/common/ui/recycler/RecyclerItem;Lir/mservices/market/common/ui/recycler/RecyclerItem;)Lir/mservices/market/common/ui/recycler/RecyclerItem;", 0), 2), new BaseMyAccountViewModel$myAccountRecyclerItems$1$2(1, baseMyAccountViewModel2, BaseMyAccountViewModel.class, "removeIfEmptyCallback", "removeIfEmptyCallback(Ljava/lang/String;)V", 0)));
                arrayList.add(new MyAccountPrivateNestedData(new bz6(br9.B(new RecyclerItem(new MyAccountCheckBoxData(baseMyAccountViewModel2.r(MyAccountItemsType.j), d.A(new vb7(new BaseMyAccountViewModel$getLoadingStateFlow$$inlined$transform$1(baseMyAccountViewModel2.F, null)), y97.G(baseMyAccountViewModel2), ru7.b, bool)))), (GeneralFilter) null, (qp2) null, 6), new BaseMyAccountViewModel$myAccountRecyclerItems$1$3(1, baseMyAccountViewModel2, BaseMyAccountViewModel.class, "removeIfEmptyCallback", "removeIfEmptyCallback(Ljava/lang/String;)V", 0)));
                arrayList.add(new MyAccountPrivacyNestedData(new bz6(br9.C(new RecyclerItem(new MyAccountLinkItemData(rs6.who_see_you, baseMyAccountViewModel2.r(MyAccountItemsType.h), Integer.valueOf(rs6.followers_access_data))), new RecyclerItem(new MyAccountLinkItemData(rs6.followers_send_you_messages, baseMyAccountViewModel2.r(MyAccountItemsType.i), null))), (GeneralFilter) null, new BaseMyAccountViewModel$myAccountRecyclerItems$1$4(2, baseMyAccountViewModel2, BaseMyAccountViewModel.class, "setDivider", "setDivider(Lir/mservices/market/common/ui/recycler/RecyclerItem;Lir/mservices/market/common/ui/recycler/RecyclerItem;)Lir/mservices/market/common/ui/recycler/RecyclerItem;", 0), 2), new BaseMyAccountViewModel$myAccountRecyclerItems$1$5(1, baseMyAccountViewModel2, BaseMyAccountViewModel.class, "removeIfEmptyCallback", "removeIfEmptyCallback(Ljava/lang/String;)V", 0)));
                ArrayList arrayList2 = new ArrayList(wu0.V(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    bl4.G((MyketRecyclerData) it.next(), arrayList2);
                }
                return arrayList2;
            }
        }), y97.G(baseMyAccountViewModel)), null, null, null, 14);
    }
}
