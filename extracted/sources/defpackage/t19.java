package defpackage;

import androidx.paging.m;
import defpackage.dc0;
import ir.mservices.market.social.users.common.data.UserDto;
import ir.mservices.market.social.users.common.data.UsersDto;
import ir.mservices.market.viewModel.a;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class t19 {
    public final y19 a;

    public t19(y19 y19Var) {
        js3.p(y19Var, "service");
        this.a = y19Var;
    }

    public final xe2 a(final UsersDto usersDto, final String str, final a aVar) {
        js3.p(str, "id");
        return (xe2) new m(gu9.o(false), new bp2() { // from class: ir.mservices.market.social.users.list.model.a
            @Override // defpackage.bp2
            public final Object invoke() {
                dc0 dc0Var = null;
                UserRepositoryImpl$getUsers$1$1 userRepositoryImpl$getUsers$1$1 = new UserRepositoryImpl$getUsers$1$1(this, str, aVar, null);
                UsersDto usersDto2 = usersDto;
                if (usersDto2 != null) {
                    List<UserDto> accounts = usersDto2.getAccounts();
                    dc0Var = new dc0(accounts != null ? accounts.size() : 0, 9, usersDto2);
                }
                return new ir.mservices.market.model.paging.a(userRepositoryImpl$getUsers$1$1, dc0Var);
            }
        }).a;
    }
}
