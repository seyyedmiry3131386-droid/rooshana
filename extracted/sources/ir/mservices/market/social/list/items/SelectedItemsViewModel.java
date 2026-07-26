package ir.mservices.market.social.list.items;

import defpackage.br9;
import defpackage.bt2;
import defpackage.bz6;
import defpackage.e71;
import defpackage.f88;
import defpackage.g51;
import defpackage.j99;
import defpackage.ja1;
import defpackage.jd7;
import defpackage.js3;
import defpackage.n99;
import defpackage.og6;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.rs6;
import defpackage.rv6;
import defpackage.sl3;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.um7;
import defpackage.vy2;
import defpackage.wu0;
import defpackage.xk6;
import defpackage.y97;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.movie.data.webapi.MovieDto;
import ir.mservices.market.social.list.common.app.recycler.ProfileAppData;
import ir.mservices.market.social.list.common.movie.recycler.ProfileMovieData;
import ir.mservices.market.social.list.items.SelectedItemsAction;
import ir.mservices.market.social.list.items.recycler.ProfileListAddTitleData;
import ir.mservices.market.social.list.items.recycler.SelectableRecyclerData;
import ir.mservices.market.social.profile.list.app.data.ProfileApplicationListDto;
import ir.mservices.market.social.profile.list.data.SocialItemPolicies;
import ir.mservices.market.social.profile.list.data.SocialListPolicies;
import ir.mservices.market.social.profile.list.movie.data.ProfileMovieListDto;
import ir.mservices.market.version2.webapi.responsedto.ApplicationDTO;
import ir.mservices.market.viewModel.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Pair;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.h;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class SelectedItemsViewModel extends a {
    public final SocialListPolicies A;
    public final rv6 B;
    public final i C;
    public final pv6 D;
    public final i E;
    public final pv6 F;
    public boolean G;
    public final h H;
    public final l I;
    public final rv6 J;
    public final l K;
    public final rv6 L;
    public final um7 v;
    public final ProfileMovieListDto w;
    public final ProfileApplicationListDto x;
    public final l y;
    public final rv6 z;

    /* JADX INFO: renamed from: ir.mservices.market.social.list.items.SelectedItemsViewModel$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.social.list.items.SelectedItemsViewModel$1", f = "SelectedItemsViewModel.kt", l = {324}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;

        public AnonymousClass1(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return SelectedItemsViewModel.this.new AnonymousClass1(g51Var);
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
            SelectedItemsViewModel selectedItemsViewModel = SelectedItemsViewModel.this;
            pv6 pv6Var = selectedItemsViewModel.u;
            xk6 xk6Var = new xk6(12, selectedItemsViewModel);
            this.a = 1;
            Object objA = pv6Var.a.a(new og6(xk6Var, 23), this);
            if (objA != coroutineSingletons) {
                objA = tx8Var;
            }
            return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.social.list.items.SelectedItemsViewModel$onAddMoreItem$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.social.list.items.SelectedItemsViewModel$onAddMoreItem$1", f = "SelectedItemsViewModel.kt", l = {244}, m = "invokeSuspend", v = 1)
    public static final class C02131 extends SuspendLambda implements qp2 {
        public int a;

        public C02131(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return SelectedItemsViewModel.this.new C02131(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C02131) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
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
            i iVar = SelectedItemsViewModel.this.C;
            this.a = 1;
            return iVar.emit(tx8Var, this) == coroutineSingletons ? coroutineSingletons : tx8Var;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.social.list.items.SelectedItemsViewModel$onSaveAppAction$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.social.list.items.SelectedItemsViewModel$onSaveAppAction$1", f = "SelectedItemsViewModel.kt", l = {285, 288}, m = "invokeSuspend", v = 1)
    public static final class C02141 extends SuspendLambda implements qp2 {
        public SelectedItemsViewModel a;
        public int b;
        public final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02141(String str, g51 g51Var) {
            super(2, g51Var);
            this.d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return SelectedItemsViewModel.this.new C02141(this.d, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C02141) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SelectedItemsViewModel selectedItemsViewModel;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.b;
            if (i == 0) {
                b.b(obj);
                this.b = 1;
                if (kotlinx.coroutines.a.e(10L, this) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                selectedItemsViewModel = this.a;
                b.b(obj);
                selectedItemsViewModel.onSaveAction(new SelectedItemsAction.SaveAction((n99) obj));
                return tx8.a;
            }
            b.b(obj);
            SelectedItemsViewModel selectedItemsViewModel2 = SelectedItemsViewModel.this;
            um7 um7Var = selectedItemsViewModel2.v;
            ProfileApplicationListDto profileApplicationListDto = selectedItemsViewModel2.x;
            String key = profileApplicationListDto != null ? profileApplicationListDto.getKey() : null;
            Iterable iterable = (Iterable) selectedItemsViewModel2.B.a.getValue();
            ArrayList arrayList = new ArrayList(wu0.V(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(((SelectableRecyclerData) it.next()).a());
            }
            this.a = selectedItemsViewModel2;
            this.b = 2;
            obj = um7Var.c(key, this.d, arrayList, selectedItemsViewModel2, this);
            if (obj != coroutineSingletons) {
                selectedItemsViewModel = selectedItemsViewModel2;
                selectedItemsViewModel.onSaveAction(new SelectedItemsAction.SaveAction((n99) obj));
                return tx8.a;
            }
            return coroutineSingletons;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.social.list.items.SelectedItemsViewModel$onSaveMovieAction$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.social.list.items.SelectedItemsViewModel$onSaveMovieAction$1", f = "SelectedItemsViewModel.kt", l = {228, 231}, m = "invokeSuspend", v = 1)
    public static final class C02151 extends SuspendLambda implements qp2 {
        public SelectedItemsViewModel a;
        public int b;
        public final /* synthetic */ String d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02151(String str, g51 g51Var) {
            super(2, g51Var);
            this.d = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return SelectedItemsViewModel.this.new C02151(this.d, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C02151) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SelectedItemsViewModel selectedItemsViewModel;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.b;
            if (i == 0) {
                b.b(obj);
                this.b = 1;
                if (kotlinx.coroutines.a.e(10L, this) != coroutineSingletons) {
                }
                return coroutineSingletons;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                selectedItemsViewModel = this.a;
                b.b(obj);
                selectedItemsViewModel.onSaveAction(new SelectedItemsAction.SaveAction((n99) obj));
                return tx8.a;
            }
            b.b(obj);
            SelectedItemsViewModel selectedItemsViewModel2 = SelectedItemsViewModel.this;
            um7 um7Var = selectedItemsViewModel2.v;
            ProfileMovieListDto profileMovieListDto = selectedItemsViewModel2.w;
            String key = profileMovieListDto != null ? profileMovieListDto.getKey() : null;
            Iterable iterable = (Iterable) selectedItemsViewModel2.B.a.getValue();
            ArrayList arrayList = new ArrayList(wu0.V(iterable, 10));
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                arrayList.add(((SelectableRecyclerData) it.next()).a());
            }
            this.a = selectedItemsViewModel2;
            this.b = 2;
            obj = um7Var.d(key, this.d, arrayList, selectedItemsViewModel2, this);
            if (obj != coroutineSingletons) {
                selectedItemsViewModel = selectedItemsViewModel2;
                selectedItemsViewModel.onSaveAction(new SelectedItemsAction.SaveAction((n99) obj));
                return tx8.a;
            }
            return coroutineSingletons;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.social.list.items.SelectedItemsViewModel$onSelectItemAction$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.social.list.items.SelectedItemsViewModel$onSelectItemAction$1", f = "SelectedItemsViewModel.kt", l = {163}, m = "invokeSuspend", v = 1)
    public static final class C02161 extends SuspendLambda implements qp2 {
        public int a;
        public final /* synthetic */ SelectedItemsAction.SelectItemAction c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02161(SelectedItemsAction.SelectItemAction selectItemAction, g51 g51Var) {
            super(2, g51Var);
            this.c = selectItemAction;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return SelectedItemsViewModel.this.new C02161(this.c, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C02161) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String title;
            ApplicationDTO applicationDTO;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i == 0) {
                b.b(obj);
                i iVar = SelectedItemsViewModel.this.E;
                SelectedItemsAction.SelectItemAction selectItemAction = this.c;
                SelectableRecyclerData item = selectItemAction.getItem();
                ProfileAppData profileAppData = item instanceof ProfileAppData ? (ProfileAppData) item : null;
                if (profileAppData == null || (applicationDTO = profileAppData.b) == null || (title = applicationDTO.getTitle()) == null) {
                    SelectableRecyclerData item2 = selectItemAction.getItem();
                    js3.n(item2, "null cannot be cast to non-null type ir.mservices.market.social.list.common.movie.recycler.ProfileMovieData");
                    title = ((ProfileMovieData) item2).b.getTitle();
                }
                this.a = 1;
                if (iVar.emit(title, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SelectedItemsViewModel(jd7 jd7Var, um7 um7Var) {
        super(true);
        js3.p(jd7Var, "savedStateHandle");
        js3.p(um7Var, "selectedItemsRepository");
        this.v = um7Var;
        ProfileMovieListDto profileMovieListDto = (ProfileMovieListDto) jd7Var.b("movieList");
        this.w = profileMovieListDto;
        this.x = (ProfileApplicationListDto) jd7Var.b("appList");
        l lVarB = ja1.b(jd7Var.b("title"));
        this.y = lVarB;
        this.z = new rv6(lVarB);
        this.A = (SocialListPolicies) jd7Var.b("policies");
        rv6 rv6Var = new rv6(um7Var.c);
        this.B = rv6Var;
        i iVarE = vy2.e(0, 7, null);
        this.C = iVarE;
        this.D = new pv6(iVarE);
        i iVarE2 = vy2.e(0, 7, null);
        this.E = iVarE2;
        this.F = new pv6(iVarE2);
        this.G = true;
        this.H = new h(ja1.b(sl3.y(br9.E(new RecyclerItem(new ProfileListAddTitleData(lVarB))), bz6.e)), rv6Var, new SelectedItemsViewModel$items$1(this, null));
        l lVarB2 = ja1.b(null);
        this.I = lVarB2;
        this.J = new rv6(lVarB2);
        l lVarB3 = ja1.b(null);
        this.K = lVarB3;
        this.L = new rv6(lVarB3);
        bt2.G(y97.G(this), null, null, new AnonymousClass1(null), 3);
        if (profileMovieListDto != null) {
            onSetTitleAction(new SelectedItemsAction.SetTitleAction(profileMovieListDto.getTitle()));
            for (MovieDto movieDto : profileMovieListDto.getMovies()) {
                this.v.e(new ProfileMovieData(movieDto, this.v.b(movieDto.getId())));
            }
        }
        ProfileApplicationListDto profileApplicationListDto = this.x;
        if (profileApplicationListDto != null) {
            onSetTitleAction(new SelectedItemsAction.SetTitleAction(profileApplicationListDto.getTitle()));
            for (ApplicationDTO applicationDTO : profileApplicationListDto.getApps()) {
                um7 um7Var2 = this.v;
                um7 um7Var3 = this.v;
                String packageName = applicationDTO.getPackageName();
                js3.o(packageName, "getPackageName(...)");
                um7Var2.e(new ProfileAppData(applicationDTO, um7Var3.b(packageName)));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAddMoreItem(SelectedItemsAction.AddMoreItem addMoreItem) {
        bt2.G(y97.G(this), null, null, new C02131(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onErrorAction(SelectedItemsAction.ErrorAction errorAction) {
        l lVar;
        Object value;
        do {
            lVar = this.I;
            value = lVar.getValue();
        } while (!lVar.n(value, errorAction.getError()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onInit(SelectedItemsAction.Init init) {
        this.G = init.isApp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onMoveToTopItemAction(SelectedItemsAction.MoveToTopItemAction moveToTopItemAction) {
        Object value;
        SelectableRecyclerData item = moveToTopItemAction.getItem();
        um7 um7Var = this.v;
        um7Var.getClass();
        js3.p(item, "item");
        l lVar = um7Var.c;
        do {
            value = lVar.getValue();
        } while (!lVar.n(value, kotlin.collections.a.z0(kotlin.collections.a.y0(item, (List) value), br9.B(item))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSaveAction(SelectedItemsAction.SaveAction saveAction) {
        l lVar;
        Object value;
        do {
            lVar = this.K;
            value = lVar.getValue();
        } while (!lVar.n(value, saveAction.getViewState()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSaveAppAction(SelectedItemsAction.SaveAppAction saveAppAction) {
        SocialItemPolicies itemPolicies;
        String str = (String) this.z.a.getValue();
        if (str == null || f88.n0(str)) {
            onErrorAction(new SelectedItemsAction.ErrorAction(new Pair(Integer.valueOf(rs6.profile_list_app_title_empty), null)));
            return;
        }
        SocialListPolicies socialListPolicies = this.A;
        if (socialListPolicies == null || (itemPolicies = socialListPolicies.getItemPolicies()) == null) {
            return;
        }
        rv6 rv6Var = this.B;
        if (((List) rv6Var.a.getValue()).size() < itemPolicies.getMin()) {
            onErrorAction(new SelectedItemsAction.ErrorAction(new Pair(Integer.valueOf(rs6.profile_list_app_list_policy_invalid_min), Integer.valueOf(itemPolicies.getMin()))));
        } else if (((List) rv6Var.a.getValue()).size() > itemPolicies.getMax()) {
            onErrorAction(new SelectedItemsAction.ErrorAction(new Pair(Integer.valueOf(rs6.profile_list_app_list_policy_invalid_max), Integer.valueOf(itemPolicies.getMax()))));
        } else {
            onSaveAction(new SelectedItemsAction.SaveAction(new j99(null)));
            bt2.G(y97.G(this), null, null, new C02141(str, null), 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSaveMovieAction(SelectedItemsAction.SaveMovieAction saveMovieAction) {
        SocialItemPolicies itemPolicies;
        String str = (String) this.z.a.getValue();
        if (str == null || f88.n0(str)) {
            onErrorAction(new SelectedItemsAction.ErrorAction(new Pair(Integer.valueOf(rs6.profile_list_movie_title_empty), null)));
            return;
        }
        SocialListPolicies socialListPolicies = this.A;
        if (socialListPolicies == null || (itemPolicies = socialListPolicies.getItemPolicies()) == null) {
            return;
        }
        rv6 rv6Var = this.B;
        if (((List) rv6Var.a.getValue()).size() < itemPolicies.getMin()) {
            onErrorAction(new SelectedItemsAction.ErrorAction(new Pair(Integer.valueOf(rs6.profile_list_movie_list_policy_invalid_min), Integer.valueOf(itemPolicies.getMin()))));
        } else if (((List) rv6Var.a.getValue()).size() > itemPolicies.getMax()) {
            onErrorAction(new SelectedItemsAction.ErrorAction(new Pair(Integer.valueOf(rs6.profile_list_movie_list_policy_invalid_max), Integer.valueOf(itemPolicies.getMax()))));
        } else {
            onSaveAction(new SelectedItemsAction.SaveAction(new j99(null)));
            bt2.G(y97.G(this), null, null, new C02151(str, null), 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSelectItemAction(SelectedItemsAction.SelectItemAction selectItemAction) {
        SocialItemPolicies itemPolicies;
        SocialListPolicies socialListPolicies = this.A;
        if (socialListPolicies == null || (itemPolicies = socialListPolicies.getItemPolicies()) == null) {
            return;
        }
        rv6 rv6Var = this.B;
        int size = ((List) rv6Var.a.getValue()).size();
        int max = itemPolicies.getMax();
        um7 um7Var = this.v;
        if (size >= max && !((List) um7Var.c.getValue()).contains(selectItemAction.getItem())) {
            onErrorAction(new SelectedItemsAction.ErrorAction(new Pair(Integer.valueOf(this.G ? rs6.profile_list_app_list_policy_invalid_max : rs6.profile_list_movie_list_policy_invalid_max), Integer.valueOf(itemPolicies.getMax()))));
            return;
        }
        if (!((List) rv6Var.a.getValue()).contains(selectItemAction.getItem())) {
            bt2.G(y97.G(this), null, null, new C02161(selectItemAction, null), 3);
        }
        um7Var.e(selectItemAction.getItem());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onSetTitleAction(SelectedItemsAction.SetTitleAction setTitleAction) {
        l lVar;
        Object value;
        do {
            lVar = this.y;
            value = lVar.getValue();
        } while (!lVar.n(value, setTitleAction.getTitle()));
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        p(new SelectedItemsViewModel$doRequest$1(this, null));
    }
}
