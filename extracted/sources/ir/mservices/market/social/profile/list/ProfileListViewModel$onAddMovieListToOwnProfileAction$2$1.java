package ir.mservices.market.social.profile.list;

import defpackage.e71;
import defpackage.g51;
import defpackage.n99;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.um7;
import defpackage.wu0;
import ir.mservices.market.movie.data.webapi.MovieDto;
import ir.mservices.market.social.profile.list.ProfileListAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.mservices.market.social.profile.list.ProfileListViewModel$onAddMovieListToOwnProfileAction$2$1", f = "ProfileListViewModel.kt", l = {684, 687}, m = "invokeSuspend", v = 1)
public final class ProfileListViewModel$onAddMovieListToOwnProfileAction$2$1 extends SuspendLambda implements qp2 {
    public ProfileListViewModel a;
    public int b;
    public final /* synthetic */ ProfileListViewModel c;
    public final /* synthetic */ String d;
    public final /* synthetic */ List e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileListViewModel$onAddMovieListToOwnProfileAction$2$1(ProfileListViewModel profileListViewModel, String str, List list, g51 g51Var) {
        super(2, g51Var);
        this.c = profileListViewModel;
        this.d = str;
        this.e = list;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final g51 create(Object obj, g51 g51Var) {
        return new ProfileListViewModel$onAddMovieListToOwnProfileAction$2$1(this.c, this.d, this.e, g51Var);
    }

    @Override // defpackage.qp2
    public final Object invoke(Object obj, Object obj2) {
        return ((ProfileListViewModel$onAddMovieListToOwnProfileAction$2$1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        ProfileListViewModel profileListViewModel;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
        int i = this.b;
        if (i == 0) {
            kotlin.b.b(obj);
            this.b = 1;
            if (kotlinx.coroutines.a.e(10L, this) != coroutineSingletons) {
            }
            return coroutineSingletons;
        }
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            profileListViewModel = this.a;
            kotlin.b.b(obj);
            profileListViewModel.onAddListToOwnProfileAction(new ProfileListAction.AddListToOwnProfileAction((n99) obj));
            return tx8.a;
        }
        kotlin.b.b(obj);
        ProfileListViewModel profileListViewModel2 = this.c;
        um7 um7Var = profileListViewModel2.v;
        List list = this.e;
        ArrayList arrayList = new ArrayList(wu0.V(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((MovieDto) it.next()).getId());
        }
        this.a = profileListViewModel2;
        this.b = 2;
        obj = um7Var.d(null, this.d, arrayList, profileListViewModel2, this);
        if (obj != coroutineSingletons) {
            profileListViewModel = profileListViewModel2;
            profileListViewModel.onAddListToOwnProfileAction(new ProfileListAction.AddListToOwnProfileAction((n99) obj));
            return tx8.a;
        }
        return coroutineSingletons;
    }
}
