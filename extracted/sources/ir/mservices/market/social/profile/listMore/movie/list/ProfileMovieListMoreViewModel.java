package ir.mservices.market.social.profile.listMore.movie.list;

import android.os.Parcelable;
import defpackage.bt2;
import defpackage.c5;
import defpackage.e71;
import defpackage.g51;
import defpackage.gr5;
import defpackage.h99;
import defpackage.ja1;
import defpackage.jd7;
import defpackage.js3;
import defpackage.l99;
import defpackage.n99;
import defpackage.og6;
import defpackage.pl6;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.rv6;
import defpackage.s45;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.um7;
import defpackage.vy2;
import defpackage.wt3;
import defpackage.wu0;
import defpackage.xk6;
import defpackage.y97;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.movie.data.webapi.MovieDto;
import ir.mservices.market.movie.ui.common.MovieHomeMovieData;
import ir.mservices.market.social.profile.list.data.SocialListPolicies;
import ir.mservices.market.social.profile.list.movie.data.ProfileMovieListDto;
import ir.mservices.market.social.profile.list.recycler.ProfileListTitleData;
import ir.mservices.market.social.profile.listMore.movie.list.ProfileMovieListMoreAction;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.viewModel.a;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class ProfileMovieListMoreViewModel extends a {
    public final pv6 A;
    public final l B;
    public final rv6 C;
    public final i D;
    public final pv6 E;
    public final String F;
    public final l G;
    public final rv6 H;
    public final l I;
    public final rv6 J;
    public final gr5 v;
    public final s45 w;
    public final um7 x;
    public final pl6 y;
    public final l z;

    /* JADX INFO: renamed from: ir.mservices.market.social.profile.listMore.movie.list.ProfileMovieListMoreViewModel$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.social.profile.listMore.movie.list.ProfileMovieListMoreViewModel$1", f = "ProfileMovieListMoreViewModel.kt", l = {195}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;

        public AnonymousClass1(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return ProfileMovieListMoreViewModel.this.new AnonymousClass1(g51Var);
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
            ProfileMovieListMoreViewModel profileMovieListMoreViewModel = ProfileMovieListMoreViewModel.this;
            pv6 pv6Var = profileMovieListMoreViewModel.u;
            xk6 xk6Var = new xk6(4, profileMovieListMoreViewModel);
            this.a = 1;
            Object objA = pv6Var.a.a(new og6(xk6Var, 11), this);
            if (objA != coroutineSingletons) {
                objA = tx8Var;
            }
            return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.social.profile.listMore.movie.list.ProfileMovieListMoreViewModel$getMoviePolicies$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.social.profile.listMore.movie.list.ProfileMovieListMoreViewModel$getMoviePolicies$1", f = "ProfileMovieListMoreViewModel.kt", l = {108}, m = "invokeSuspend", v = 1)
    public static final class C02311 extends SuspendLambda implements qp2 {
        public int a;

        public C02311(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return ProfileMovieListMoreViewModel.this.new C02311(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C02311) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            Object value3;
            Object value4;
            ProfileMovieListMoreViewModel profileMovieListMoreViewModel = ProfileMovieListMoreViewModel.this;
            l lVar = profileMovieListMoreViewModel.B;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i == 0) {
                b.b(obj);
                do {
                    value = lVar.getValue();
                    ((Boolean) value).getClass();
                } while (!lVar.n(value, Boolean.TRUE));
                s45 s45Var = profileMovieListMoreViewModel.w;
                this.a = 1;
                obj = s45Var.b("EDIT_LIST_REQUEST_TAG", this, true);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b.b(obj);
            }
            n99 n99Var = (n99) obj;
            if (n99Var instanceof h99) {
                do {
                    value4 = lVar.getValue();
                    ((Boolean) value4).getClass();
                } while (!lVar.n(value4, Boolean.FALSE));
                profileMovieListMoreViewModel.onToastAction(new ProfileMovieListMoreAction.ToastAction(((h99) n99Var).a.getTranslatedMessage()));
            } else if (n99Var instanceof l99) {
                do {
                    value2 = lVar.getValue();
                    ((Boolean) value2).getClass();
                } while (!lVar.n(value2, Boolean.FALSE));
                l lVar2 = profileMovieListMoreViewModel.G;
                do {
                    value3 = lVar2.getValue();
                } while (!lVar2.n(value3, (SocialListPolicies) ((l99) n99Var).a));
            }
            return tx8.a;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.social.profile.listMore.movie.list.ProfileMovieListMoreViewModel$onReportListAction$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.social.profile.listMore.movie.list.ProfileMovieListMoreViewModel$onReportListAction$1", f = "ProfileMovieListMoreViewModel.kt", l = {167, 166}, m = "invokeSuspend", v = 1)
    public static final class C02321 extends SuspendLambda implements qp2 {
        public i a;
        public int b;
        public final /* synthetic */ ProfileMovieListMoreAction.ReportListAction d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02321(ProfileMovieListMoreAction.ReportListAction reportListAction, g51 g51Var) {
            super(2, g51Var);
            this.d = reportListAction;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return ProfileMovieListMoreViewModel.this.new C02321(this.d, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C02321) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
        
            if (r1.emit(r10, r9) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                r9 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
                int r1 = r9.b
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 == r3) goto L19
                if (r1 != r2) goto L11
                kotlin.b.b(r10)
                r8 = r9
                goto L54
            L11:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L19:
                kotlinx.coroutines.flow.i r1 = r9.a
                kotlin.b.b(r10)
                r8 = r9
                goto L48
            L20:
                kotlin.b.b(r10)
                ir.mservices.market.social.profile.listMore.movie.list.ProfileMovieListMoreViewModel r7 = ir.mservices.market.social.profile.listMore.movie.list.ProfileMovieListMoreViewModel.this
                kotlinx.coroutines.flow.i r1 = r7.D
                r10 = r3
                s45 r3 = r7.w
                java.lang.String r4 = r7.F
                java.lang.String r5 = "access$getAccountKey$p(...)"
                defpackage.js3.o(r4, r5)
                ir.mservices.market.social.profile.listMore.movie.list.ProfileMovieListMoreAction$ReportListAction r5 = r9.d
                r6 = r5
                java.lang.String r5 = r6.getListType()
                ir.mservices.market.social.profile.list.data.ReportListType r6 = r6.getType()
                r9.a = r1
                r9.b = r10
                r8 = r9
                java.lang.Object r10 = r3.c(r4, r5, r6, r7, r8)
                if (r10 != r0) goto L48
                goto L53
            L48:
                r3 = 0
                r8.a = r3
                r8.b = r2
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L54
            L53:
                return r0
            L54:
                tx8 r10 = defpackage.tx8.a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.social.profile.listMore.movie.list.ProfileMovieListMoreViewModel.C02321.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileMovieListMoreViewModel(c5 c5Var, gr5 gr5Var, s45 s45Var, um7 um7Var, jd7 jd7Var) {
        super(true);
        js3.p(c5Var, "accountManager");
        js3.p(s45Var, "movieProfileListRepository");
        js3.p(um7Var, "selectedItemsRepository");
        js3.p(jd7Var, "savedStateHandle");
        this.v = gr5Var;
        this.w = s45Var;
        this.x = um7Var;
        if (!jd7Var.a("data")) {
            throw new IllegalArgumentException("Required argument \"data\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(DialogDataModel.class) && !Serializable.class.isAssignableFrom(DialogDataModel.class)) {
            throw new UnsupportedOperationException(DialogDataModel.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        DialogDataModel dialogDataModel = (DialogDataModel) jd7Var.b("data");
        if (dialogDataModel == null) {
            throw new IllegalArgumentException("Argument \"data\" is marked as non-null but was passed a null value");
        }
        if (!jd7Var.a("profileListTitleData")) {
            throw new IllegalArgumentException("Required argument \"profileListTitleData\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(ProfileListTitleData.class) && !Serializable.class.isAssignableFrom(ProfileListTitleData.class)) {
            throw new UnsupportedOperationException(ProfileListTitleData.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        ProfileListTitleData profileListTitleData = (ProfileListTitleData) jd7Var.b("profileListTitleData");
        if (profileListTitleData == null) {
            throw new IllegalArgumentException("Argument \"profileListTitleData\" is marked as non-null but was passed a null value");
        }
        if (!jd7Var.a("accountKey")) {
            throw new IllegalArgumentException("Required argument \"accountKey\" is missing and does not have an android:defaultValue");
        }
        String str = (String) jd7Var.b("accountKey");
        this.y = new pl6(dialogDataModel, profileListTitleData, str);
        l lVarB = ja1.b(null);
        this.z = lVarB;
        this.A = new pv6(lVarB);
        Boolean bool = Boolean.FALSE;
        l lVarB2 = ja1.b(bool);
        this.B = lVarB2;
        this.C = new rv6(lVarB2);
        i iVarE = vy2.e(0, 7, null);
        this.D = iVarE;
        this.E = new pv6(iVarE);
        this.F = str == null ? c5Var.h.e() : str;
        l lVarB3 = ja1.b(null);
        this.G = lVarB3;
        this.H = new rv6(lVarB3);
        l lVarB4 = ja1.b(bool);
        this.I = lVarB4;
        this.J = new rv6(lVarB4);
        bt2.G(y97.G(this), null, null, new AnonymousClass1(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<RecyclerItem> fillRecyclerItems(List<MovieDto> list) {
        ArrayList arrayList = new ArrayList(wu0.V(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new RecyclerItem(new MovieHomeMovieData((MovieDto) it.next(), null, null, 1)));
        }
        return kotlin.collections.a.Q0(arrayList);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final wt3 getMoviePolicies(ProfileMovieListMoreAction.GetMoviePoliciesAction getMoviePoliciesAction) {
        return bt2.G(y97.G(this), null, null, new C02311(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClearAllAction(ProfileMovieListMoreAction.ClearAllAction clearAllAction) {
        this.x.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onDeleteListAction(ProfileMovieListMoreAction.DeleteListAction deleteListAction) {
        String key;
        ProfileMovieListDto profileMovieListDto = this.y.b.c;
        if (profileMovieListDto == null || (key = profileMovieListDto.getKey()) == null) {
            return;
        }
        bt2.G(y97.G(this), null, null, new ProfileMovieListMoreViewModel$onDeleteListAction$1$1(this, key, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPoliciesMetAction(ProfileMovieListMoreAction.EditListAction editListAction) {
        l lVar;
        Object value;
        do {
            lVar = this.G;
            value = lVar.getValue();
        } while (!lVar.n(value, editListAction.getPolicies()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onReportListAction(ProfileMovieListMoreAction.ReportListAction reportListAction) {
        bt2.G(y97.G(this), null, null, new C02321(reportListAction, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onToastAction(ProfileMovieListMoreAction.ToastAction toastAction) {
        l lVar;
        Object value;
        do {
            lVar = this.z;
            value = lVar.getValue();
        } while (!lVar.n(value, toastAction.getMessage()));
    }

    @Override // ir.mservices.market.viewModel.c, defpackage.k79
    public final void d() {
        super.d();
        h().a("EDIT_LIST_REQUEST_TAG");
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        p(new ProfileMovieListMoreViewModel$doRequest$1(this, null));
    }
}
