package ir.mservices.market.social.users.list;

import defpackage.a67;
import defpackage.g19;
import defpackage.gu9;
import defpackage.jd7;
import defpackage.js3;
import defpackage.t19;
import defpackage.wu0;
import defpackage.xe2;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.social.users.common.BaseAccountUsersViewModel;
import ir.mservices.market.social.users.common.data.UserDto;
import ir.mservices.market.social.users.common.data.UsersDto;
import ir.mservices.market.social.users.common.recycler.UserCardData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;

/* JADX INFO: loaded from: classes3.dex */
public final class UsersListViewModel extends BaseAccountUsersViewModel {
    public final t19 x;
    public final g19 y;

    public UsersListViewModel(t19 t19Var, jd7 jd7Var) {
        js3.p(t19Var, "userRepository");
        js3.p(jd7Var, "savedStateHandle");
        this.x = t19Var;
        if (!jd7Var.a("id")) {
            throw new IllegalArgumentException("Required argument \"id\" is missing and does not have an android:defaultValue");
        }
        String str = (String) jd7Var.b("id");
        if (str == null) {
            throw new IllegalArgumentException("Argument \"id\" is marked as non-null but was passed a null value");
        }
        if (!jd7Var.a("title")) {
            throw new IllegalArgumentException("Required argument \"title\" is missing and does not have an android:defaultValue");
        }
        this.y = new g19(str, (String) jd7Var.b("title"));
    }

    private final List<RecyclerItem> generateUserItems(UsersDto usersDto) {
        List<UserDto> accounts = usersDto.getAccounts();
        if (accounts == null) {
            return EmptyList.a;
        }
        ArrayList arrayList = new ArrayList(wu0.V(accounts, 10));
        Iterator<T> it = accounts.iterator();
        while (it.hasNext()) {
            arrayList.add(new RecyclerItem(new UserCardData((UserDto) it.next(), true)));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getItems$lambda$0(UsersListViewModel usersListViewModel, UsersDto usersDto) {
        js3.p(usersDto, "it");
        return usersListViewModel.generateUserItems(usersDto);
    }

    @Override // ir.mservices.market.social.users.common.BaseAccountUsersViewModel
    public final xe2 s() {
        return gu9.x(this.x.a(null, this.y.a, this), new a67(27, this));
    }
}
