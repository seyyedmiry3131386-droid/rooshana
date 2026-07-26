package defpackage;

import ir.mservices.market.social.mynet.MynetViewModel;
import ir.mservices.market.social.users.common.data.UsersDto;
import ir.mservices.market.social.users.followers.AccountFollowersViewModel;
import ir.mservices.market.social.users.following.AccountFollowingViewModel;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l4 implements dp2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ UsersDto b;

    public /* synthetic */ l4(UsersDto usersDto, int i) {
        this.a = i;
        this.b = usersDto;
    }

    @Override // defpackage.dp2
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                return AccountFollowersViewModel.getUserNestedList$lambda$0(this.b, (UsersDto) obj);
            case 1:
                return AccountFollowingViewModel.getUserNestedList$lambda$0(this.b, (UsersDto) obj);
            default:
                return MynetViewModel.getHomeUserNestedList$lambda$0(this.b, (UsersDto) obj);
        }
    }
}
