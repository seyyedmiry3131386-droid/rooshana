package ir.mservices.market.social.users.followers;

import androidx.paging.e;
import defpackage.bl4;
import defpackage.bz6;
import defpackage.gu9;
import defpackage.j4;
import defpackage.jd7;
import defpackage.js3;
import defpackage.l4;
import defpackage.n;
import defpackage.r79;
import defpackage.rs6;
import defpackage.t19;
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
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class AccountFollowersViewModel extends BaseAccountUsersViewModel {
    public boolean A;
    public final r79 x;
    public final t19 y;
    public final j4 z;

    public AccountFollowersViewModel(r79 r79Var, t19 t19Var, jd7 jd7Var) {
        js3.p(t19Var, "userRepository");
        js3.p(jd7Var, "savedStateHandle");
        this.x = r79Var;
        this.y = t19Var;
        if (!jd7Var.a("accountKey")) {
            throw new IllegalArgumentException("Required argument \"accountKey\" is missing and does not have an android:defaultValue");
        }
        String str = (String) jd7Var.b("accountKey");
        if (str == null) {
            throw new IllegalArgumentException("Argument \"accountKey\" is marked as non-null but was passed a null value");
        }
        this.z = new j4(str);
        this.A = true;
    }

    private final List<MyketRecyclerData> generateUserItems(UsersDto usersDto) {
        AccountFollowersViewModel accountFollowersViewModel;
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
        if ((accounts2 == null || accounts2.isEmpty()) && this.A) {
            arrayList.add(new OwnUsersEmptyData(rs6.no_item_in_own_user_follower_list, rs6.no_item_in_own_user_follower_description, false));
        } else if (!this.A && usersDto.getShowMynetHint()) {
            arrayList.add(new OwnUsersEmptyData(rs6.no_item_in_own_user_follower_list, rs6.no_item_in_own_user_follower_description, true));
        }
        UsersDto suggestionList = usersDto.getSuggestionList();
        if (suggestionList != null) {
            arrayList.add(new HomeMoreTitleRowData(suggestionList.getTitle(), suggestionList.getId(), null, suggestionList.getEol(), null, null, null, null, 240));
            accountFollowersViewModel = this;
            arrayList.add(new UserCardRowData(suggestionList, getUserNestedList(suggestionList), new AccountFollowersViewModel$generateUserItems$1$2$1(1, accountFollowersViewModel, AccountFollowersViewModel.class, "removeIfEmptyCallback", "removeIfEmptyCallback(Ljava/lang/String;)V", 0)));
        } else {
            accountFollowersViewModel = this;
        }
        accountFollowersViewModel.A = false;
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getItems$lambda$0(AccountFollowersViewModel accountFollowersViewModel, UsersDto usersDto) {
        Object value;
        js3.p(usersDto, "it");
        l lVar = accountFollowersViewModel.v;
        do {
            value = lVar.getValue();
            ((Boolean) value).getClass();
        } while (!lVar.n(value, Boolean.valueOf(usersDto.isLocked())));
        accountFollowersViewModel.o(usersDto.getTitle());
        List<MyketRecyclerData> listGenerateUserItems = accountFollowersViewModel.generateUserItems(usersDto);
        ArrayList arrayList = new ArrayList(wu0.V(listGenerateUserItems, 10));
        Iterator<T> it = listGenerateUserItems.iterator();
        while (it.hasNext()) {
            bl4.G((MyketRecyclerData) it.next(), arrayList);
        }
        return arrayList;
    }

    private final bz6 getUserNestedList(UsersDto usersDto) {
        return new bz6(e.b(gu9.x(this.y.a(usersDto, usersDto.getId(), this), new l4(usersDto, 0)), y97.G(this)), null, null, null, 14);
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

    @Override // ir.mservices.market.social.users.common.BaseAccountUsersViewModel
    public final xe2 s() {
        return gu9.x(this.x.p(this.z.a, this), new n(3, this));
    }
}
