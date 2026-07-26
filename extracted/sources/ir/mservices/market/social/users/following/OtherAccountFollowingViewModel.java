package ir.mservices.market.social.users.following;

import defpackage.bl4;
import defpackage.fw5;
import defpackage.gu9;
import defpackage.jd7;
import defpackage.js3;
import defpackage.pj9;
import defpackage.wu0;
import defpackage.xe2;
import defpackage.z45;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.social.users.common.BaseAccountUsersViewModel;
import ir.mservices.market.social.users.common.data.UserDto;
import ir.mservices.market.social.users.common.data.UsersDto;
import ir.mservices.market.social.users.common.recycler.UserCardData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class OtherAccountFollowingViewModel extends BaseAccountUsersViewModel {
    public final pj9 x;
    public final fw5 y;
    public boolean z;

    public OtherAccountFollowingViewModel(pj9 pj9Var, jd7 jd7Var) {
        js3.p(jd7Var, "savedStateHandle");
        this.x = pj9Var;
        if (!jd7Var.a("accountKey")) {
            throw new IllegalArgumentException("Required argument \"accountKey\" is missing and does not have an android:defaultValue");
        }
        String str = (String) jd7Var.b("accountKey");
        if (str == null) {
            throw new IllegalArgumentException("Argument \"accountKey\" is marked as non-null but was passed a null value");
        }
        this.y = new fw5(str);
        this.z = true;
    }

    private final List<MyketRecyclerData> generateUserItems(UsersDto usersDto) {
        List<UserDto> accounts;
        if (((Boolean) this.w.a.getValue()).booleanValue() || (((accounts = usersDto.getAccounts()) == null || accounts.isEmpty()) && this.z)) {
            return EmptyList.a;
        }
        ArrayList arrayList = new ArrayList();
        List<UserDto> accounts2 = usersDto.getAccounts();
        if (accounts2 != null) {
            ArrayList arrayList2 = new ArrayList(wu0.V(accounts2, 10));
            Iterator<T> it = accounts2.iterator();
            while (it.hasNext()) {
                arrayList2.add(Boolean.valueOf(arrayList.add(new UserCardData((UserDto) it.next(), true))));
            }
        }
        this.z = false;
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getItems$lambda$0(OtherAccountFollowingViewModel otherAccountFollowingViewModel, UsersDto usersDto) {
        Object value;
        js3.p(usersDto, "it");
        l lVar = otherAccountFollowingViewModel.v;
        do {
            value = lVar.getValue();
            ((Boolean) value).getClass();
        } while (!lVar.n(value, Boolean.valueOf(usersDto.isLocked())));
        otherAccountFollowingViewModel.o(usersDto.getTitle());
        List<MyketRecyclerData> listGenerateUserItems = otherAccountFollowingViewModel.generateUserItems(usersDto);
        ArrayList arrayList = new ArrayList(wu0.V(listGenerateUserItems, 10));
        Iterator<T> it = listGenerateUserItems.iterator();
        while (it.hasNext()) {
            bl4.G((MyketRecyclerData) it.next(), arrayList);
        }
        return arrayList;
    }

    @Override // ir.mservices.market.social.users.common.BaseAccountUsersViewModel
    public final xe2 s() {
        return gu9.x(this.x.q(this.y.a, this), new z45(11, this));
    }
}
