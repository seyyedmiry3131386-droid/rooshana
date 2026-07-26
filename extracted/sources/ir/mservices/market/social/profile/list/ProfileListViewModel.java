package ir.mservices.market.social.profile.list;

import com.google.gson.reflect.TypeToken;
import defpackage.bl4;
import defpackage.bt2;
import defpackage.bz6;
import defpackage.c5;
import defpackage.cc;
import defpackage.dy3;
import defpackage.e71;
import defpackage.eq;
import defpackage.g51;
import defpackage.hy2;
import defpackage.j99;
import defpackage.ja1;
import defpackage.jd7;
import defpackage.js3;
import defpackage.l99;
import defpackage.n99;
import defpackage.og6;
import defpackage.ol3;
import defpackage.pq6;
import defpackage.pv6;
import defpackage.qp2;
import defpackage.ru7;
import defpackage.rv6;
import defpackage.s45;
import defpackage.sl3;
import defpackage.sr;
import defpackage.t45;
import defpackage.tb1;
import defpackage.tr;
import defpackage.tx8;
import defpackage.um7;
import defpackage.v48;
import defpackage.vy2;
import defpackage.wu0;
import defpackage.x05;
import defpackage.xe2;
import defpackage.xk6;
import defpackage.y97;
import defpackage.yl5;
import defpackage.z4;
import defpackage.z57;
import ir.mservices.market.app.common.recycler.FilteredAppNestedData;
import ir.mservices.market.common.ui.recycler.DividerData;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.movie.data.webapi.MovieDto;
import ir.mservices.market.movie.ui.common.MovieHomeMovieData;
import ir.mservices.market.social.profile.list.ProfileListAction;
import ir.mservices.market.social.profile.list.app.data.ProfileApplicationListDto;
import ir.mservices.market.social.profile.list.app.data.ProfileApplicationsListDto;
import ir.mservices.market.social.profile.list.app.recycler.ProfileListAppListData;
import ir.mservices.market.social.profile.list.data.LikeSocialListDto;
import ir.mservices.market.social.profile.list.movie.data.ProfileMovieListDto;
import ir.mservices.market.social.profile.list.movie.data.ProfileMoviesListDto;
import ir.mservices.market.social.profile.list.movie.recycler.ProfileListMovieListData;
import ir.mservices.market.social.profile.list.recycler.ProfileListAddData;
import ir.mservices.market.social.profile.list.recycler.ProfileListButtonsData;
import ir.mservices.market.social.profile.list.recycler.ProfileListEmptyData;
import ir.mservices.market.social.profile.list.recycler.ProfileListTitleData;
import ir.mservices.market.version2.ui.recycler.filter.GeneralFilter;
import ir.mservices.market.version2.webapi.responsedto.ApplicationDTO;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class ProfileListViewModel extends ir.mservices.market.viewModel.a {
    public final cc A;
    public boolean B;
    public int C;
    public final l D;
    public final pv6 E;
    public final l F;
    public final rv6 G;
    public final l H;
    public final pv6 I;
    public final l J;
    public final pv6 K;
    public final l L;
    public final l M;
    public final rv6 N;
    public final i O;
    public final pv6 P;
    public final i Q;
    public final pv6 R;
    public final l S;
    public final pv6 T;
    public final l U;
    public final String V;
    public final boolean W;
    public final um7 v;
    public final sr w;
    public final yl5 x;
    public final ir.mservices.market.version2.manager.install.a y;
    public final s45 z;

    /* JADX INFO: renamed from: ir.mservices.market.social.profile.list.ProfileListViewModel$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.social.profile.list.ProfileListViewModel$1", f = "ProfileListViewModel.kt", l = {769}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;

        public AnonymousClass1(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return ProfileListViewModel.this.new AnonymousClass1(g51Var);
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
                kotlin.b.b(obj);
                return tx8Var;
            }
            kotlin.b.b(obj);
            ProfileListViewModel profileListViewModel = ProfileListViewModel.this;
            pv6 pv6Var = profileListViewModel.u;
            xk6 xk6Var = new xk6(2, profileListViewModel);
            this.a = 1;
            Object objA = pv6Var.a.a(new og6(xk6Var, 10), this);
            if (objA != coroutineSingletons) {
                objA = tx8Var;
            }
            return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.social.profile.list.ProfileListViewModel$2, reason: invalid class name */
    @tb1(c = "ir.mservices.market.social.profile.list.ProfileListViewModel$2", f = "ProfileListViewModel.kt", l = {134}, m = "invokeSuspend", v = 1)
    final class AnonymousClass2 extends SuspendLambda implements qp2 {
        public int a;

        public AnonymousClass2(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return ProfileListViewModel.this.new AnonymousClass2(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
                return tx8.a;
            }
            kotlin.b.b(obj);
            ProfileListViewModel profileListViewModel = ProfileListViewModel.this;
            l lVar = profileListViewModel.A.a;
            a aVar = new a(profileListViewModel);
            this.a = 1;
            lVar.a(aVar, this);
            return coroutineSingletons;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.social.profile.list.ProfileListViewModel$3, reason: invalid class name */
    @tb1(c = "ir.mservices.market.social.profile.list.ProfileListViewModel$3", f = "ProfileListViewModel.kt", l = {145}, m = "invokeSuspend", v = 1)
    final class AnonymousClass3 extends SuspendLambda implements qp2 {
        public int a;

        public AnonymousClass3(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return ProfileListViewModel.this.new AnonymousClass3(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass3) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) throws Throwable {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
                return tx8.a;
            }
            kotlin.b.b(obj);
            ProfileListViewModel profileListViewModel = ProfileListViewModel.this;
            l lVar = profileListViewModel.A.b;
            b bVar = new b(profileListViewModel);
            this.a = 1;
            lVar.a(bVar, this);
            return coroutineSingletons;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.social.profile.list.ProfileListViewModel$getAppPolicies$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.social.profile.list.ProfileListViewModel", f = "ProfileListViewModel.kt", l = {486}, m = "getAppPolicies", v = 1)
    public static final class C02171 extends ContinuationImpl {
        public ProfileApplicationListDto a;
        public /* synthetic */ Object b;
        public int d;

        public C02171(g51 g51Var) {
            super(g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return ProfileListViewModel.this.getAppPolicies(null, this);
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.social.profile.list.ProfileListViewModel$getMoviePolicies$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.social.profile.list.ProfileListViewModel", f = "ProfileListViewModel.kt", l = {515}, m = "getMoviePolicies", v = 1)
    public static final class C02181 extends ContinuationImpl {
        public ProfileMovieListDto a;
        public /* synthetic */ Object b;
        public int d;

        public C02181(g51 g51Var) {
            super(g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return ProfileListViewModel.this.getMoviePolicies(null, this);
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.social.profile.list.ProfileListViewModel$onAddAppListToOwnProfileAction$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.social.profile.list.ProfileListViewModel", f = "ProfileListViewModel.kt", l = {555}, m = "onAddAppListToOwnProfileAction", v = 1)
    public static final class C02191 extends ContinuationImpl {
        public ProfileListAction.AddAppListToOwnProfileAction a;
        public /* synthetic */ Object b;
        public int d;

        public C02191(g51 g51Var) {
            super(g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return ProfileListViewModel.this.onAddAppListToOwnProfileAction(null, this);
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.social.profile.list.ProfileListViewModel$onAddListAction$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.social.profile.list.ProfileListViewModel$onAddListAction$1", f = "ProfileListViewModel.kt", l = {342, 344}, m = "invokeSuspend", v = 1)
    public static final class C02201 extends SuspendLambda implements qp2 {
        public int a;

        public C02201(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return ProfileListViewModel.this.new C02201(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C02201) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x003f, code lost:
        
            if (r7 == r2) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x004b, code lost:
        
            if (r7 == r2) goto L21;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                ir.mservices.market.social.profile.list.ProfileListViewModel r0 = ir.mservices.market.social.profile.list.ProfileListViewModel.this
                kotlinx.coroutines.flow.l r1 = r0.L
                kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
                int r3 = r6.a
                r4 = 2
                r5 = 1
                if (r3 == 0) goto L20
                if (r3 == r5) goto L1c
                if (r3 != r4) goto L14
                kotlin.b.b(r7)
                goto L4e
            L14:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1c:
                kotlin.b.b(r7)
                goto L42
            L20:
                kotlin.b.b(r7)
            L23:
                java.lang.Object r7 = r1.getValue()
                r3 = r7
                java.lang.Boolean r3 = (java.lang.Boolean) r3
                r3.getClass()
                java.lang.Boolean r3 = java.lang.Boolean.TRUE
                boolean r7 = r1.n(r7, r3)
                if (r7 == 0) goto L23
                boolean r7 = r0.B
                if (r7 == 0) goto L45
                r6.a = r5
                java.lang.Object r7 = ir.mservices.market.social.profile.list.ProfileListViewModel.O(r0, r6)
                if (r7 != r2) goto L42
                goto L4d
            L42:
                n99 r7 = (defpackage.n99) r7
                goto L50
            L45:
                r6.a = r4
                java.lang.Object r7 = ir.mservices.market.social.profile.list.ProfileListViewModel.P(r0, r6)
                if (r7 != r2) goto L4e
            L4d:
                return r2
            L4e:
                n99 r7 = (defpackage.n99) r7
            L50:
                boolean r7 = r7 instanceof defpackage.j99
                if (r7 != 0) goto L66
            L54:
                java.lang.Object r7 = r1.getValue()
                r0 = r7
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                r0.getClass()
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                boolean r7 = r1.n(r7, r0)
                if (r7 == 0) goto L54
            L66:
                tx8 r7 = defpackage.tx8.a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.social.profile.list.ProfileListViewModel.C02201.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.social.profile.list.ProfileListViewModel$onAddMovieListToOwnProfileAction$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.social.profile.list.ProfileListViewModel", f = "ProfileListViewModel.kt", l = {632}, m = "onAddMovieListToOwnProfileAction", v = 1)
    public static final class C02211 extends ContinuationImpl {
        public ProfileListAction.AddMovieListToOwnProfileAction a;
        public /* synthetic */ Object b;
        public int d;

        public C02211(g51 g51Var) {
            super(g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.b = obj;
            this.d |= Integer.MIN_VALUE;
            return ProfileListViewModel.this.onAddMovieListToOwnProfileAction(null, this);
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.social.profile.list.ProfileListViewModel$onDeleteListAction$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.social.profile.list.ProfileListViewModel$onDeleteListAction$1", f = "ProfileListViewModel.kt", l = {379, 381, 391}, m = "invokeSuspend", v = 1)
    public static final class C02221 extends SuspendLambda implements qp2 {
        public ProfileListViewModel a;
        public int b;
        public final /* synthetic */ ProfileListAction.DeleteListAction d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02221(ProfileListAction.DeleteListAction deleteListAction, g51 g51Var) {
            super(2, g51Var);
            this.d = deleteListAction;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return ProfileListViewModel.this.new C02221(this.d, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C02221) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0053, code lost:
        
            if (r9 == r2) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:22:0x0065, code lost:
        
            if (r9 == r2) goto L37;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00b1, code lost:
        
            if (r9.emit(r4, r8) == r2) goto L37;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                ir.mservices.market.social.profile.list.ProfileListViewModel r0 = ir.mservices.market.social.profile.list.ProfileListViewModel.this
                kotlinx.coroutines.flow.l r1 = r0.M
                kotlin.coroutines.intrinsics.CoroutineSingletons r2 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
                int r3 = r8.b
                tx8 r4 = defpackage.tx8.a
                r5 = 3
                r6 = 2
                r7 = 1
                if (r3 == 0) goto L2c
                if (r3 == r7) goto L28
                if (r3 == r6) goto L24
                if (r3 != r5) goto L1c
                ir.mservices.market.social.profile.list.ProfileListViewModel r0 = r8.a
                kotlin.b.b(r9)
                goto Lb4
            L1c:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L24:
                kotlin.b.b(r9)
                goto L68
            L28:
                kotlin.b.b(r9)
                goto L56
            L2c:
                kotlin.b.b(r9)
            L2f:
                java.lang.Object r9 = r1.getValue()
                r3 = r9
                java.lang.Boolean r3 = (java.lang.Boolean) r3
                r3.getClass()
                java.lang.Boolean r3 = java.lang.Boolean.TRUE
                boolean r9 = r1.n(r9, r3)
                if (r9 == 0) goto L2f
                boolean r9 = r0.B
                ir.mservices.market.social.profile.list.ProfileListAction$DeleteListAction r3 = r8.d
                if (r9 == 0) goto L59
                sr r9 = r0.w
                java.lang.String r3 = r3.getListType()
                r8.b = r7
                java.lang.Object r9 = r9.a(r3, r0, r8)
                if (r9 != r2) goto L56
                goto Lb3
            L56:
                n99 r9 = (defpackage.n99) r9
                goto L6a
            L59:
                s45 r9 = r0.z
                java.lang.String r3 = r3.getListType()
                r8.b = r6
                java.lang.Object r9 = r9.a(r3, r0, r8)
                if (r9 != r2) goto L68
                goto Lb3
            L68:
                n99 r9 = (defpackage.n99) r9
            L6a:
                boolean r3 = r9 instanceof defpackage.h99
                if (r3 == 0) goto L91
            L6e:
                java.lang.Object r2 = r1.getValue()
                r3 = r2
                java.lang.Boolean r3 = (java.lang.Boolean) r3
                r3.getClass()
                java.lang.Boolean r3 = java.lang.Boolean.FALSE
                boolean r2 = r1.n(r2, r3)
                if (r2 == 0) goto L6e
                ir.mservices.market.social.profile.list.ProfileListAction$ToastAction r1 = new ir.mservices.market.social.profile.list.ProfileListAction$ToastAction
                h99 r9 = (defpackage.h99) r9
                ir.mservices.market.version2.webapi.responsedto.ErrorDTO r9 = r9.a
                java.lang.String r9 = r9.getTranslatedMessage()
                r1.<init>(r9)
                ir.mservices.market.social.profile.list.ProfileListViewModel.M(r0, r1)
                return r4
            L91:
                boolean r9 = r9 instanceof defpackage.l99
                if (r9 == 0) goto Lbc
            L95:
                java.lang.Object r9 = r1.getValue()
                r3 = r9
                java.lang.Boolean r3 = (java.lang.Boolean) r3
                r3.getClass()
                java.lang.Boolean r3 = java.lang.Boolean.FALSE
                boolean r9 = r1.n(r9, r3)
                if (r9 == 0) goto L95
                kotlinx.coroutines.flow.i r9 = r0.O
                r8.a = r0
                r8.b = r5
                java.lang.Object r9 = r9.emit(r4, r8)
                if (r9 != r2) goto Lb4
            Lb3:
                return r2
            Lb4:
                ir.mservices.market.social.profile.list.ProfileListAction$RefreshAction r9 = new ir.mservices.market.social.profile.list.ProfileListAction$RefreshAction
                r9.<init>(r7)
                ir.mservices.market.social.profile.list.ProfileListViewModel.J(r0, r9)
            Lbc:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.social.profile.list.ProfileListViewModel.C02221.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.social.profile.list.ProfileListViewModel$onEditListAction$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.social.profile.list.ProfileListViewModel$onEditListAction$1", f = "ProfileListViewModel.kt", l = {356}, m = "invokeSuspend", v = 1)
    public static final class C02231 extends SuspendLambda implements qp2 {
        public int a;
        public final /* synthetic */ ProfileListAction.EditAppsListAction c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02231(ProfileListAction.EditAppsListAction editAppsListAction, g51 g51Var) {
            super(2, g51Var);
            this.c = editAppsListAction;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return ProfileListViewModel.this.new C02231(this.c, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C02231) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            ProfileListViewModel profileListViewModel = ProfileListViewModel.this;
            l lVar = profileListViewModel.L;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i == 0) {
                kotlin.b.b(obj);
                do {
                    value = lVar.getValue();
                    ((Boolean) value).getClass();
                } while (!lVar.n(value, Boolean.TRUE));
                ProfileApplicationListDto applicationList = this.c.getApplicationList();
                this.a = 1;
                obj = profileListViewModel.getAppPolicies(applicationList, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            if (!(((n99) obj) instanceof j99)) {
                do {
                    value2 = lVar.getValue();
                    ((Boolean) value2).getClass();
                } while (!lVar.n(value2, Boolean.FALSE));
            }
            return tx8.a;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.social.profile.list.ProfileListViewModel$onEditListAction$2, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.social.profile.list.ProfileListViewModel$onEditListAction$2", f = "ProfileListViewModel.kt", l = {367}, m = "invokeSuspend", v = 1)
    public static final class C02242 extends SuspendLambda implements qp2 {
        public int a;
        public final /* synthetic */ ProfileListAction.EditMoviesListAction c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02242(ProfileListAction.EditMoviesListAction editMoviesListAction, g51 g51Var) {
            super(2, g51Var);
            this.c = editMoviesListAction;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return ProfileListViewModel.this.new C02242(this.c, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C02242) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            ProfileListViewModel profileListViewModel = ProfileListViewModel.this;
            l lVar = profileListViewModel.L;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i == 0) {
                kotlin.b.b(obj);
                do {
                    value = lVar.getValue();
                    ((Boolean) value).getClass();
                } while (!lVar.n(value, Boolean.TRUE));
                ProfileMovieListDto movieList = this.c.getMovieList();
                this.a = 1;
                obj = profileListViewModel.getMoviePolicies(movieList, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.b.b(obj);
            }
            if (!(((n99) obj) instanceof j99)) {
                do {
                    value2 = lVar.getValue();
                    ((Boolean) value2).getClass();
                } while (!lVar.n(value2, Boolean.FALSE));
            }
            return tx8.a;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.social.profile.list.ProfileListViewModel$onLikeListAction$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.social.profile.list.ProfileListViewModel$onLikeListAction$1", f = "ProfileListViewModel.kt", l = {451, 457}, m = "invokeSuspend", v = 1)
    public static final class C02251 extends SuspendLambda implements qp2 {
        public l a;
        public Map b;
        public String c;
        public int d;
        public final /* synthetic */ ProfileListAction.LikeListAction f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02251(ProfileListAction.LikeListAction likeListAction, g51 g51Var) {
            super(2, g51Var);
            this.f = likeListAction;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return ProfileListViewModel.this.new C02251(this.f, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C02251) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String listType;
            Object objG;
            l lVar;
            Map map;
            String listType2;
            Object objG2;
            Pair pair;
            ProfileListViewModel profileListViewModel = ProfileListViewModel.this;
            String str = profileListViewModel.V;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.d;
            if (i == 0) {
                kotlin.b.b(obj);
                l lVar2 = profileListViewModel.U;
                Map map2 = (Map) lVar2.getValue();
                boolean z = profileListViewModel.B;
                ProfileListAction.LikeListAction likeListAction = this.f;
                if (z) {
                    listType2 = likeListAction.getListType();
                    sr srVar = profileListViewModel.w;
                    String listType3 = likeListAction.getListType();
                    this.a = lVar2;
                    this.b = map2;
                    this.c = listType2;
                    this.d = 1;
                    tr trVar = srVar.a;
                    trVar.getClass();
                    z57 z57VarCreateRequestUrl = trVar.createRequestUrl("social", "v1/profiles/{accountKey}/custom-app-lists/{listType}/activity/like", kotlin.collections.b.O(new Pair("accountKey", str), new Pair("listType", listType3)), trVar.getCommonQueryParam());
                    Type type = new TypeToken<LikeSocialListDto>() { // from class: ir.mservices.market.social.profile.list.app.service.AppProfileService$likeAppList$2
                    }.getType();
                    js3.o(type, "getType(...)");
                    js3.m(z57VarCreateRequestUrl);
                    objG2 = dy3.G(trVar, type, z57VarCreateRequestUrl, new hy2(27), profileListViewModel, null, null, this, 496);
                    if (objG2 != coroutineSingletons) {
                        lVar = lVar2;
                        map = map2;
                        pair = new Pair(listType2, objG2);
                    }
                } else {
                    listType = likeListAction.getListType();
                    s45 s45Var = profileListViewModel.z;
                    String listType4 = likeListAction.getListType();
                    this.a = lVar2;
                    this.b = map2;
                    this.c = listType;
                    this.d = 2;
                    t45 t45Var = s45Var.a;
                    t45Var.getClass();
                    z57 z57VarCreateRequestUrl2 = t45Var.createRequestUrl("social", "v1/profiles/{accountKey}/custom-movie-lists/{listType}/activity/like", kotlin.collections.b.O(new Pair("accountKey", str), new Pair("listType", listType4)), t45Var.getCommonQueryParam());
                    Type type2 = new TypeToken<LikeSocialListDto>() { // from class: ir.mservices.market.social.profile.list.movie.service.MovieProfileService$likeMovieList$2
                    }.getType();
                    js3.o(type2, "getType(...)");
                    js3.m(z57VarCreateRequestUrl2);
                    objG = dy3.G(t45Var, type2, z57VarCreateRequestUrl2, new sl3(6), profileListViewModel, null, null, this, 496);
                    if (objG != coroutineSingletons) {
                        lVar = lVar2;
                        map = map2;
                        pair = new Pair(listType, objG);
                    }
                }
                return coroutineSingletons;
            }
            if (i == 1) {
                String str2 = this.c;
                map = this.b;
                lVar = this.a;
                kotlin.b.b(obj);
                listType2 = str2;
                objG2 = obj;
                pair = new Pair(listType2, objG2);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str3 = this.c;
                map = this.b;
                lVar = this.a;
                kotlin.b.b(obj);
                listType = str3;
                objG = obj;
                pair = new Pair(listType, objG);
            }
            Map mapQ = kotlin.collections.b.Q(map, pair);
            lVar.getClass();
            lVar.p(null, mapQ);
            return tx8.a;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.social.profile.list.ProfileListViewModel$onMoveToTopListAction$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.social.profile.list.ProfileListViewModel$onMoveToTopListAction$1", f = "ProfileListViewModel.kt", l = {405, 407}, m = "invokeSuspend", v = 1)
    public static final class C02261 extends SuspendLambda implements qp2 {
        public int a;
        public final /* synthetic */ ProfileListAction.MoveToTopListAction c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02261(ProfileListAction.MoveToTopListAction moveToTopListAction, g51 g51Var) {
            super(2, g51Var);
            this.c = moveToTopListAction;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return ProfileListViewModel.this.new C02261(this.c, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C02261) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0075, code lost:
        
            if (r12 == r9) goto L21;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x00ae, code lost:
        
            if (r12 == r9) goto L21;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instruction units count: 233
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.social.profile.list.ProfileListViewModel.C02261.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.social.profile.list.ProfileListViewModel$onRemoveLikeListAction$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.social.profile.list.ProfileListViewModel$onRemoveLikeListAction$1", f = "ProfileListViewModel.kt", l = {470, 476}, m = "invokeSuspend", v = 1)
    public static final class C02271 extends SuspendLambda implements qp2 {
        public l a;
        public Map b;
        public String c;
        public int d;
        public final /* synthetic */ ProfileListAction.RemoveLikeListAction f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02271(ProfileListAction.RemoveLikeListAction removeLikeListAction, g51 g51Var) {
            super(2, g51Var);
            this.f = removeLikeListAction;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return ProfileListViewModel.this.new C02271(this.f, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C02271) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            String listType;
            Object objR;
            l lVar;
            Map map;
            String listType2;
            Object objR2;
            Pair pair;
            ProfileListViewModel profileListViewModel = ProfileListViewModel.this;
            String str = profileListViewModel.V;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.d;
            if (i == 0) {
                kotlin.b.b(obj);
                l lVar2 = profileListViewModel.U;
                Map map2 = (Map) lVar2.getValue();
                boolean z = profileListViewModel.B;
                ProfileListAction.RemoveLikeListAction removeLikeListAction = this.f;
                if (z) {
                    listType2 = removeLikeListAction.getListType();
                    sr srVar = profileListViewModel.w;
                    String listType3 = removeLikeListAction.getListType();
                    this.a = lVar2;
                    this.b = map2;
                    this.c = listType2;
                    this.d = 1;
                    tr trVar = srVar.a;
                    trVar.getClass();
                    z57 z57VarCreateRequestUrl = trVar.createRequestUrl("social", "v1/profiles/{accountKey}/custom-app-lists/{listType}/activity/remove-like", kotlin.collections.b.O(new Pair("accountKey", str), new Pair("listType", listType3)), trVar.getCommonQueryParam());
                    Type type = new TypeToken<LikeSocialListDto>() { // from class: ir.mservices.market.social.profile.list.app.service.AppProfileService$removeLikeAppList$2
                    }.getType();
                    js3.o(type, "getType(...)");
                    js3.m(z57VarCreateRequestUrl);
                    objR2 = dy3.r(trVar, type, z57VarCreateRequestUrl, new eq(28), profileListViewModel, this);
                    if (objR2 != coroutineSingletons) {
                        lVar = lVar2;
                        map = map2;
                        pair = new Pair(listType2, objR2);
                    }
                } else {
                    listType = removeLikeListAction.getListType();
                    s45 s45Var = profileListViewModel.z;
                    String listType4 = removeLikeListAction.getListType();
                    this.a = lVar2;
                    this.b = map2;
                    this.c = listType;
                    this.d = 2;
                    t45 t45Var = s45Var.a;
                    t45Var.getClass();
                    z57 z57VarCreateRequestUrl2 = t45Var.createRequestUrl("social", "v1/profiles/{accountKey}/custom-movie-lists/{listType}/activity/remove-like", kotlin.collections.b.O(new Pair("accountKey", str), new Pair("listType", listType4)), t45Var.getCommonQueryParam());
                    Type type2 = new TypeToken<LikeSocialListDto>() { // from class: ir.mservices.market.social.profile.list.movie.service.MovieProfileService$removeLikeMovieList$2
                    }.getType();
                    js3.o(type2, "getType(...)");
                    js3.m(z57VarCreateRequestUrl2);
                    objR = dy3.r(t45Var, type2, z57VarCreateRequestUrl2, new ol3(7), profileListViewModel, this);
                    if (objR != coroutineSingletons) {
                        lVar = lVar2;
                        map = map2;
                        pair = new Pair(listType, objR);
                    }
                }
                return coroutineSingletons;
            }
            if (i == 1) {
                String str2 = this.c;
                map = this.b;
                lVar = this.a;
                kotlin.b.b(obj);
                listType2 = str2;
                objR2 = obj;
                pair = new Pair(listType2, objR2);
            } else {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                String str3 = this.c;
                map = this.b;
                lVar = this.a;
                kotlin.b.b(obj);
                listType = str3;
                objR = obj;
                pair = new Pair(listType, objR);
            }
            Map mapQ = kotlin.collections.b.Q(map, pair);
            lVar.getClass();
            lVar.p(null, mapQ);
            return tx8.a;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.social.profile.list.ProfileListViewModel$onReportListAction$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.social.profile.list.ProfileListViewModel$onReportListAction$1", f = "ProfileListViewModel.kt", l = {429, 436, 427}, m = "invokeSuspend", v = 1)
    public static final class C02281 extends SuspendLambda implements qp2 {
        public i a;
        public int b;
        public final /* synthetic */ ProfileListAction.ReportListAction d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C02281(ProfileListAction.ReportListAction reportListAction, g51 g51Var) {
            super(2, g51Var);
            this.d = reportListAction;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return ProfileListViewModel.this.new C02281(this.d, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C02281) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
        
            if (r10 == r0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x006c, code lost:
        
            if (r10 == r0) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x007a, code lost:
        
            if (r1.emit(r10, r9) == r0) goto L24;
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
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2b
                if (r1 == r4) goto L24
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                kotlin.b.b(r10)
                r8 = r9
                goto L7d
            L15:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1d:
                kotlinx.coroutines.flow.i r1 = r9.a
                kotlin.b.b(r10)
                r8 = r9
                goto L6f
            L24:
                kotlinx.coroutines.flow.i r1 = r9.a
                kotlin.b.b(r10)
                r8 = r9
                goto L52
            L2b:
                kotlin.b.b(r10)
                ir.mservices.market.social.profile.list.ProfileListViewModel r7 = ir.mservices.market.social.profile.list.ProfileListViewModel.this
                kotlinx.coroutines.flow.i r1 = r7.Q
                boolean r10 = r7.B
                ir.mservices.market.social.profile.list.ProfileListAction$ReportListAction r5 = r9.d
                if (r10 == 0) goto L55
                sr r3 = r7.w
                r10 = r4
                java.lang.String r4 = r7.V
                r6 = r5
                java.lang.String r5 = r6.getListType()
                ir.mservices.market.social.profile.list.data.ReportListType r6 = r6.getType()
                r9.a = r1
                r9.b = r10
                r8 = r9
                java.lang.Object r10 = r3.c(r4, r5, r6, r7, r8)
                if (r10 != r0) goto L52
                goto L7c
            L52:
                n99 r10 = (defpackage.n99) r10
                goto L71
            L55:
                r8 = r9
                r10 = r3
                r6 = r5
                s45 r3 = r7.z
                java.lang.String r4 = r7.V
                java.lang.String r5 = r6.getListType()
                ir.mservices.market.social.profile.list.data.ReportListType r6 = r6.getType()
                r8.a = r1
                r8.b = r10
                java.lang.Object r10 = r3.c(r4, r5, r6, r7, r8)
                if (r10 != r0) goto L6f
                goto L7c
            L6f:
                n99 r10 = (defpackage.n99) r10
            L71:
                r3 = 0
                r8.a = r3
                r8.b = r2
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L7d
            L7c:
                return r0
            L7d:
                tx8 r10 = defpackage.tx8.a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.social.profile.list.ProfileListViewModel.C02281.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ProfileListViewModel(jd7 jd7Var, c5 c5Var, um7 um7Var, sr srVar, yl5 yl5Var, ir.mservices.market.version2.manager.install.a aVar, s45 s45Var, cc ccVar) {
        super(true);
        js3.p(jd7Var, "savedStateHandle");
        js3.p(c5Var, "accountManager");
        z4 z4Var = c5Var.h;
        js3.p(um7Var, "selectedItemsRepository");
        js3.p(srVar, "appProfileListRepository");
        js3.p(yl5Var, "neneDownloadRepository");
        js3.p(aVar, "installQueue");
        js3.p(s45Var, "movieProfileListRepository");
        js3.p(ccVar, "addListToOwnProfileRepository");
        this.v = um7Var;
        this.w = srVar;
        this.x = yl5Var;
        this.y = aVar;
        this.z = s45Var;
        this.A = ccVar;
        this.B = true;
        l lVarB = ja1.b(null);
        this.D = lVarB;
        this.E = new pv6(lVarB);
        l lVarB2 = ja1.b(null);
        this.F = lVarB2;
        this.G = new rv6(lVarB2);
        l lVarB3 = ja1.b(null);
        this.H = lVarB3;
        this.I = new pv6(lVarB3);
        Boolean bool = Boolean.FALSE;
        l lVarB4 = ja1.b(bool);
        this.J = lVarB4;
        this.K = new pv6(lVarB4);
        this.L = ja1.b(bool);
        l lVarB5 = ja1.b(bool);
        this.M = lVarB5;
        this.N = new rv6(lVarB5);
        i iVarE = vy2.e(0, 7, null);
        this.O = iVarE;
        this.P = new pv6(iVarE);
        i iVarE2 = vy2.e(0, 7, null);
        this.Q = iVarE2;
        this.R = new pv6(iVarE2);
        l lVarB6 = ja1.b(null);
        this.S = lVarB6;
        this.T = new pv6(lVarB6);
        this.U = ja1.b(kotlin.collections.b.I());
        String strE = (String) jd7Var.b("BUNDLE_KEY_ACCOUNT_KEY");
        if (strE == null) {
            strE = z4Var.e();
            js3.o(strE, "getAccountKey(...)");
        }
        this.V = strE;
        this.W = strE.equals(z4Var.e());
        bt2.G(y97.G(this), null, null, new AnonymousClass1(null), 3);
        bt2.G(y97.G(this), null, null, new AnonymousClass2(null), 3);
        bt2.G(y97.G(this), null, null, new AnonymousClass3(null), 3);
    }

    public static /* synthetic */ Object O(ProfileListViewModel profileListViewModel, g51 g51Var) {
        return profileListViewModel.getAppPolicies(null, g51Var);
    }

    public static /* synthetic */ Object P(ProfileListViewModel profileListViewModel, g51 g51Var) {
        return profileListViewModel.getMoviePolicies(null, g51Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getAppPolicies(ir.mservices.market.social.profile.list.app.data.ProfileApplicationListDto r5, defpackage.g51<? super defpackage.n99> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ir.mservices.market.social.profile.list.ProfileListViewModel.C02171
            if (r0 == 0) goto L13
            r0 = r6
            ir.mservices.market.social.profile.list.ProfileListViewModel$getAppPolicies$1 r0 = (ir.mservices.market.social.profile.list.ProfileListViewModel.C02171) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ir.mservices.market.social.profile.list.ProfileListViewModel$getAppPolicies$1 r0 = new ir.mservices.market.social.profile.list.ProfileListViewModel$getAppPolicies$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ir.mservices.market.social.profile.list.app.data.ProfileApplicationListDto r5 = r0.a
            kotlin.b.b(r6)
            goto L46
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.b.b(r6)
            if (r5 == 0) goto L38
            r6 = r3
            goto L39
        L38:
            r6 = 0
        L39:
            r0.a = r5
            r0.d = r3
            sr r2 = r4.w
            java.lang.Object r6 = r2.b(r4, r0, r6)
            if (r6 != r1) goto L46
            return r1
        L46:
            r0 = r6
            n99 r0 = (defpackage.n99) r0
            boolean r1 = r0 instanceof defpackage.h99
            if (r1 == 0) goto L5e
            ir.mservices.market.social.profile.list.ProfileListAction$ToastAction r5 = new ir.mservices.market.social.profile.list.ProfileListAction$ToastAction
            h99 r0 = (defpackage.h99) r0
            ir.mservices.market.version2.webapi.responsedto.ErrorDTO r0 = r0.a
            java.lang.String r0 = r0.getTranslatedMessage()
            r5.<init>(r0)
            r4.onToastAction(r5)
            return r6
        L5e:
            boolean r1 = r0 instanceof defpackage.l99
            if (r1 == 0) goto L91
            l99 r0 = (defpackage.l99) r0
            java.lang.Object r0 = r0.a
            ir.mservices.market.social.profile.list.data.SocialListPolicies r0 = (ir.mservices.market.social.profile.list.data.SocialListPolicies) r0
            boolean r1 = r0.getCanAddList()
            if (r1 == 0) goto L85
            ir.mservices.market.social.profile.list.ProfileListAction$PoliciesMetAction r1 = new ir.mservices.market.social.profile.list.ProfileListAction$PoliciesMetAction
            if (r5 != 0) goto L78
            ih6 r5 = new ih6
            r5.<init>(r0)
            goto L7e
        L78:
            kh6 r2 = new kh6
            r2.<init>(r0, r5)
            r5 = r2
        L7e:
            r1.<init>(r5)
            r4.onPoliciesMetAction(r1)
            return r6
        L85:
            ir.mservices.market.social.profile.list.ProfileListAction$ToastAction r5 = new ir.mservices.market.social.profile.list.ProfileListAction$ToastAction
            java.lang.String r0 = r0.getMessage()
            r5.<init>(r0)
            r4.onToastAction(r5)
        L91:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.social.profile.list.ProfileListViewModel.getAppPolicies(ir.mservices.market.social.profile.list.app.data.ProfileApplicationListDto, g51):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getData$lambda$0(ProfileListViewModel profileListViewModel, ProfileApplicationsListDto profileApplicationsListDto) {
        js3.p(profileApplicationsListDto, "it");
        return profileListViewModel.mapCustomAppList(profileApplicationsListDto, profileListViewModel.W);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getData$lambda$1(ProfileListViewModel profileListViewModel, ProfileMoviesListDto profileMoviesListDto) {
        js3.p(profileMoviesListDto, "it");
        return profileListViewModel.mapCustomMovieList(profileMoviesListDto, profileListViewModel.W);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object getMoviePolicies(ir.mservices.market.social.profile.list.movie.data.ProfileMovieListDto r5, defpackage.g51<? super defpackage.n99> r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof ir.mservices.market.social.profile.list.ProfileListViewModel.C02181
            if (r0 == 0) goto L13
            r0 = r6
            ir.mservices.market.social.profile.list.ProfileListViewModel$getMoviePolicies$1 r0 = (ir.mservices.market.social.profile.list.ProfileListViewModel.C02181) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            ir.mservices.market.social.profile.list.ProfileListViewModel$getMoviePolicies$1 r0 = new ir.mservices.market.social.profile.list.ProfileListViewModel$getMoviePolicies$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.d
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            ir.mservices.market.social.profile.list.movie.data.ProfileMovieListDto r5 = r0.a
            kotlin.b.b(r6)
            goto L46
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.b.b(r6)
            if (r5 == 0) goto L38
            r6 = r3
            goto L39
        L38:
            r6 = 0
        L39:
            r0.a = r5
            r0.d = r3
            s45 r2 = r4.z
            java.lang.Object r6 = r2.b(r4, r0, r6)
            if (r6 != r1) goto L46
            return r1
        L46:
            r0 = r6
            n99 r0 = (defpackage.n99) r0
            boolean r1 = r0 instanceof defpackage.h99
            if (r1 == 0) goto L5e
            ir.mservices.market.social.profile.list.ProfileListAction$ToastAction r5 = new ir.mservices.market.social.profile.list.ProfileListAction$ToastAction
            h99 r0 = (defpackage.h99) r0
            ir.mservices.market.version2.webapi.responsedto.ErrorDTO r0 = r0.a
            java.lang.String r0 = r0.getTranslatedMessage()
            r5.<init>(r0)
            r4.onToastAction(r5)
            return r6
        L5e:
            boolean r1 = r0 instanceof defpackage.l99
            if (r1 == 0) goto L91
            l99 r0 = (defpackage.l99) r0
            java.lang.Object r0 = r0.a
            ir.mservices.market.social.profile.list.data.SocialListPolicies r0 = (ir.mservices.market.social.profile.list.data.SocialListPolicies) r0
            boolean r1 = r0.getCanAddList()
            if (r1 == 0) goto L85
            ir.mservices.market.social.profile.list.ProfileListAction$PoliciesMetAction r1 = new ir.mservices.market.social.profile.list.ProfileListAction$PoliciesMetAction
            if (r5 != 0) goto L78
            jh6 r5 = new jh6
            r5.<init>(r0)
            goto L7e
        L78:
            lh6 r2 = new lh6
            r2.<init>(r0, r5)
            r5 = r2
        L7e:
            r1.<init>(r5)
            r4.onPoliciesMetAction(r1)
            return r6
        L85:
            ir.mservices.market.social.profile.list.ProfileListAction$ToastAction r5 = new ir.mservices.market.social.profile.list.ProfileListAction$ToastAction
            java.lang.String r0 = r0.getMessage()
            r5.<init>(r0)
            r4.onToastAction(r5)
        L91:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.social.profile.list.ProfileListViewModel.getMoviePolicies(ir.mservices.market.social.profile.list.movie.data.ProfileMovieListDto, g51):java.lang.Object");
    }

    private final v48 initLikeResultFlow(String str, String str2, boolean z) {
        return d.A(new x05(this.U, str, 1), y97.G(this), ru7.b, new l99(new LikeSocialListDto(str2, z)));
    }

    private final List<RecyclerItem> mapCustomAppList(ProfileApplicationsListDto profileApplicationsListDto, boolean z) {
        l lVar;
        Object value;
        do {
            lVar = this.L;
            value = lVar.getValue();
            ((Boolean) value).getClass();
        } while (!lVar.n(value, Boolean.FALSE));
        ArrayList arrayList = new ArrayList();
        List<ProfileApplicationListDto> list = profileApplicationsListDto.getList();
        boolean z2 = this.W;
        if ((list == null || list.isEmpty()) && this.C == 0) {
            arrayList.add(new ProfileListEmptyData(lVar, z2, true));
        } else {
            if (z2 && this.C == 0) {
                arrayList.add(new ProfileListAddData(lVar));
            }
            List<ProfileApplicationListDto> list2 = profileApplicationsListDto.getList();
            this.C = list2 != null ? list2.size() : 0;
            List<ProfileApplicationListDto> list3 = profileApplicationsListDto.getList();
            if (list3 != null) {
                for (ProfileApplicationListDto profileApplicationListDto : list3) {
                    String title = profileApplicationListDto.getTitle();
                    profileApplicationListDto.getMessaging();
                    arrayList.add(new ProfileListTitleData(title, profileApplicationListDto, null, 4));
                    List<ApplicationDTO> apps = profileApplicationListDto.getApps();
                    ArrayList arrayList2 = new ArrayList(wu0.V(apps, 10));
                    for (ApplicationDTO applicationDTO : apps) {
                        String title2 = applicationDTO.getTitle();
                        js3.o(title2, "getTitle(...)");
                        String packageName = applicationDTO.getPackageName();
                        js3.o(packageName, "getPackageName(...)");
                        xe2 xe2VarA = this.x.a(packageName);
                        pv6 pv6Var = this.y.b;
                        js3.p(pv6Var, "installStateFlow");
                        arrayList2.add(new RecyclerItem(new FilteredAppNestedData(applicationDTO, title2, false, true, xe2VarA, pv6Var, 1)));
                    }
                    arrayList.add(new ProfileListAppListData(profileApplicationListDto, new bz6(arrayList2, (GeneralFilter) null, (qp2) null, 6), new ProfileListViewModel$mapCustomAppList$2$2(1, this, ProfileListViewModel.class, "removeIfEmptyCallback", "removeIfEmptyCallback(Ljava/lang/String;)V", 0)));
                    arrayList.add(new ProfileListButtonsData(profileApplicationListDto.getTitle(), profileApplicationListDto, null, profileApplicationListDto.getMessaging(), z, initLikeResultFlow(profileApplicationListDto.getKey(), profileApplicationListDto.getLikeCount(), profileApplicationListDto.isLiked()), 4));
                }
            }
        }
        ArrayList arrayList3 = new ArrayList(wu0.V(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bl4.G((MyketRecyclerData) it.next(), arrayList3);
        }
        return arrayList3;
    }

    private final List<RecyclerItem> mapCustomMovieList(ProfileMoviesListDto profileMoviesListDto, boolean z) {
        l lVar;
        Object value;
        do {
            lVar = this.L;
            value = lVar.getValue();
            ((Boolean) value).getClass();
        } while (!lVar.n(value, Boolean.FALSE));
        ArrayList arrayList = new ArrayList();
        List<ProfileMovieListDto> list = profileMoviesListDto.getList();
        boolean z2 = this.W;
        if ((list == null || list.isEmpty()) && this.C == 0) {
            arrayList.add(new ProfileListEmptyData(lVar, z2, false));
        } else {
            if (z2 && this.C == 0) {
                arrayList.add(new ProfileListAddData(lVar));
            }
            List<ProfileMovieListDto> list2 = profileMoviesListDto.getList();
            this.C = list2 != null ? list2.size() : 0;
            List<ProfileMovieListDto> list3 = profileMoviesListDto.getList();
            if (list3 != null) {
                for (ProfileMovieListDto profileMovieListDto : list3) {
                    String title = profileMovieListDto.getTitle();
                    profileMovieListDto.getMessaging();
                    arrayList.add(new ProfileListTitleData(title, null, profileMovieListDto, 2));
                    List<MovieDto> movies = profileMovieListDto.getMovies();
                    ArrayList arrayList2 = new ArrayList(wu0.V(movies, 10));
                    Iterator<T> it = movies.iterator();
                    while (it.hasNext()) {
                        MovieHomeMovieData movieHomeMovieData = new MovieHomeMovieData((MovieDto) it.next(), null, null, 1);
                        movieHomeMovieData.f = "social-profile-list-own";
                        arrayList2.add(new RecyclerItem(movieHomeMovieData));
                    }
                    arrayList.add(new ProfileListMovieListData(profileMovieListDto, new bz6(arrayList2, (GeneralFilter) null, (qp2) null, 6), new ProfileListViewModel$mapCustomMovieList$2$2(1, this, ProfileListViewModel.class, "removeIfEmptyCallback", "removeIfEmptyCallback(Ljava/lang/String;)V", 0)));
                    arrayList.add(new ProfileListButtonsData(profileMovieListDto.getTitle(), null, profileMovieListDto, profileMovieListDto.getMessaging(), z, initLikeResultFlow(profileMovieListDto.getKey(), profileMovieListDto.getLikeCount(), profileMovieListDto.isLiked()), 2));
                }
            }
        }
        ArrayList arrayList3 = new ArrayList(wu0.V(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            bl4.G((MyketRecyclerData) it2.next(), arrayList3);
        }
        return arrayList3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object onAddAppListToOwnProfileAction(ir.mservices.market.social.profile.list.ProfileListAction.AddAppListToOwnProfileAction r7, defpackage.g51<? super defpackage.tx8> r8) {
        /*
            Method dump skipped, instruction units count: 247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.social.profile.list.ProfileListViewModel.onAddAppListToOwnProfileAction(ir.mservices.market.social.profile.list.ProfileListAction$AddAppListToOwnProfileAction, g51):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAddListAction(ProfileListAction.AddListAction addListAction) {
        bt2.G(y97.G(this), null, null, new C02201(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onAddListToOwnProfileAction(ProfileListAction.AddListToOwnProfileAction addListToOwnProfileAction) {
        l lVar;
        Object value;
        do {
            lVar = this.S;
            value = lVar.getValue();
        } while (!lVar.n(value, addListToOwnProfileAction.getViewState()));
        if (addListToOwnProfileAction.getViewState() instanceof l99) {
            boolean z = this.B;
            cc ccVar = this.A;
            if (z) {
                l lVar2 = ccVar.a;
                Boolean bool = Boolean.TRUE;
                lVar2.getClass();
                lVar2.p(null, bool);
                return;
            }
            l lVar3 = ccVar.b;
            Boolean bool2 = Boolean.TRUE;
            lVar3.getClass();
            lVar3.p(null, bool2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object onAddMovieListToOwnProfileAction(ir.mservices.market.social.profile.list.ProfileListAction.AddMovieListToOwnProfileAction r7, defpackage.g51<? super defpackage.tx8> r8) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.social.profile.list.ProfileListViewModel.onAddMovieListToOwnProfileAction(ir.mservices.market.social.profile.list.ProfileListAction$AddMovieListToOwnProfileAction, g51):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onClearAllAction(ProfileListAction.ClearAll clearAll) {
        this.v.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onDeleteListAction(ProfileListAction.DeleteListAction deleteListAction) {
        bt2.G(y97.G(this), null, null, new C02221(deleteListAction, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onEditListAction(ProfileListAction.EditAppsListAction editAppsListAction) {
        bt2.G(y97.G(this), null, null, new C02231(editAppsListAction, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onErrorAction(ProfileListAction.ErrorAction errorAction) {
        l lVar;
        Object value;
        do {
            lVar = this.F;
            value = lVar.getValue();
        } while (!lVar.n(value, errorAction.getErrorMessage()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onInit(ProfileListAction.Init init) {
        this.B = init.isApp();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onLikeListAction(ProfileListAction.LikeListAction likeListAction) {
        bt2.G(y97.G(this), null, null, new C02251(likeListAction, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onMoveToTopListAction(ProfileListAction.MoveToTopListAction moveToTopListAction) {
        bt2.G(y97.G(this), null, null, new C02261(moveToTopListAction, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onPoliciesMetAction(ProfileListAction.PoliciesMetAction policiesMetAction) {
        l lVar;
        Object value;
        do {
            lVar = this.H;
            value = lVar.getValue();
        } while (!lVar.n(value, policiesMetAction.getPolicies()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onRefreshAction(ProfileListAction.RefreshAction refreshAction) {
        l lVar;
        Object value;
        this.C = 0;
        do {
            lVar = this.J;
            value = lVar.getValue();
            ((Boolean) value).getClass();
        } while (!lVar.n(value, Boolean.valueOf(refreshAction.getRefresh())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onRemoveLikeListAction(ProfileListAction.RemoveLikeListAction removeLikeListAction) {
        bt2.G(y97.G(this), null, null, new C02271(removeLikeListAction, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onReportListAction(ProfileListAction.ReportListAction reportListAction) {
        bt2.G(y97.G(this), null, null, new C02281(reportListAction, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onToastAction(ProfileListAction.ToastAction toastAction) {
        l lVar;
        Object value;
        do {
            lVar = this.D;
            value = lVar.getValue();
        } while (!lVar.n(value, toastAction.getMessage()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecyclerItem setDivider(RecyclerItem recyclerItem, RecyclerItem recyclerItem2) {
        if (recyclerItem == null || recyclerItem2 == null || (recyclerItem.c instanceof ProfileListAddData) || !(recyclerItem2.c instanceof ProfileListTitleData)) {
            return null;
        }
        DividerData dividerData = new DividerData();
        dividerData.d = pq6.space_l;
        dividerData.j = pq6.divider_height_small;
        return new RecyclerItem(dividerData);
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        p(new ProfileListViewModel$doRequest$1(this, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onEditListAction(ProfileListAction.EditMoviesListAction editMoviesListAction) {
        bt2.G(y97.G(this), null, null, new C02242(editMoviesListAction, null), 3);
    }
}
