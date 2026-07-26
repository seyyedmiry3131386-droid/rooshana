package ir.mservices.market.movie.ui.bookmark;

import defpackage.bt2;
import defpackage.c5;
import defpackage.e71;
import defpackage.g51;
import defpackage.js3;
import defpackage.pv6;
import defpackage.ql4;
import defpackage.qp2;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.wu0;
import defpackage.y97;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.movie.data.webapi.SearchMovieDto;
import ir.mservices.market.movie.ui.bookmark.data.MovieBookmarkListDto;
import ir.mservices.market.movie.ui.bookmark.recycler.MovieBookmarkData;
import ir.mservices.market.viewModel.BaseMultiSelectViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.b;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.d;

/* JADX INFO: loaded from: classes3.dex */
public final class MovieBookmarkViewModel extends BaseMultiSelectViewModel {
    public final c5 G;
    public final ql4 H;

    /* JADX INFO: renamed from: ir.mservices.market.movie.ui.bookmark.MovieBookmarkViewModel$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.movie.ui.bookmark.MovieBookmarkViewModel$1", f = "MovieBookmarkViewModel.kt", l = {40}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;

        /* JADX INFO: renamed from: ir.mservices.market.movie.ui.bookmark.MovieBookmarkViewModel$1$1, reason: invalid class name and collision with other inner class name */
        @tb1(c = "ir.mservices.market.movie.ui.bookmark.MovieBookmarkViewModel$1$1", f = "MovieBookmarkViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
        final class C00221 extends SuspendLambda implements qp2 {
            public /* synthetic */ Object a;
            public final /* synthetic */ MovieBookmarkViewModel b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C00221(MovieBookmarkViewModel movieBookmarkViewModel, g51 g51Var) {
                super(2, g51Var);
                this.b = movieBookmarkViewModel;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final g51 create(Object obj, g51 g51Var) {
                C00221 c00221 = new C00221(this.b, g51Var);
                c00221.a = obj;
                return c00221;
            }

            @Override // defpackage.qp2
            public final Object invoke(Object obj, Object obj2) {
                C00221 c00221 = (C00221) create((List) obj, (g51) obj2);
                tx8 tx8Var = tx8.a;
                c00221.invokeSuspend(tx8Var);
                return tx8Var;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                List list = (List) this.a;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
                b.b(obj);
                MovieBookmarkViewModel movieBookmarkViewModel = this.b;
                movieBookmarkViewModel.m(true);
                movieBookmarkViewModel.deleteSelectedItems(list);
                return tx8.a;
            }
        }

        public AnonymousClass1(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return MovieBookmarkViewModel.this.new AnonymousClass1(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.a;
            int i = this.a;
            if (i == 0) {
                b.b(obj);
                MovieBookmarkViewModel movieBookmarkViewModel = MovieBookmarkViewModel.this;
                pv6 pv6Var = movieBookmarkViewModel.y;
                C00221 c00221 = new C00221(movieBookmarkViewModel, null);
                this.a = 1;
                if (d.f(pv6Var, c00221, this) == coroutineSingletons) {
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

    /* JADX INFO: renamed from: ir.mservices.market.movie.ui.bookmark.MovieBookmarkViewModel$deleteSelectedItems$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.movie.ui.bookmark.MovieBookmarkViewModel$deleteSelectedItems$1", f = "MovieBookmarkViewModel.kt", l = {61}, m = "invokeSuspend", v = 1)
    public static final class C01921 extends SuspendLambda implements qp2 {
        public MovieBookmarkViewModel a;
        public Iterator b;
        public int c;
        public int d;
        public final /* synthetic */ List e;
        public final /* synthetic */ MovieBookmarkViewModel f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C01921(List list, MovieBookmarkViewModel movieBookmarkViewModel, g51 g51Var) {
            super(2, g51Var);
            this.e = list;
            this.f = movieBookmarkViewModel;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return new C01921(this.e, this.f, g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C01921) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x0090  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x00b1  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00b5  */
        /* JADX WARN: Removed duplicated region for block: B:32:0x00b9  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00a8 -> B:28:0x00ab). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
                int r1 = r8.d
                ir.mservices.market.movie.ui.bookmark.MovieBookmarkViewModel r2 = r8.f
                r3 = 1
                r4 = 0
                if (r1 == 0) goto L1f
                if (r1 != r3) goto L17
                int r1 = r8.c
                java.util.Iterator r5 = r8.b
                ir.mservices.market.movie.ui.bookmark.MovieBookmarkViewModel r6 = r8.a
                kotlin.b.b(r9)
                goto Lab
            L17:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1f:
                kotlin.b.b(r9)
                java.util.ArrayList r9 = new java.util.ArrayList
                java.util.List r1 = r8.e
                r5 = 10
                int r6 = defpackage.wu0.V(r1, r5)
                r9.<init>(r6)
                java.util.Iterator r1 = r1.iterator()
            L33:
                boolean r6 = r1.hasNext()
                if (r6 == 0) goto L45
                java.lang.Object r6 = r1.next()
                ir.mservices.market.common.ui.recycler.RecyclerItem r6 = (ir.mservices.market.common.ui.recycler.RecyclerItem) r6
                ir.mservices.market.common.ui.recycler.MyketRecyclerData r6 = r6.c
                r9.add(r6)
                goto L33
            L45:
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                java.util.Iterator r9 = r9.iterator()
            L4e:
                boolean r6 = r9.hasNext()
                if (r6 == 0) goto L60
                java.lang.Object r6 = r9.next()
                boolean r7 = r6 instanceof ir.mservices.market.movie.ui.bookmark.recycler.MovieBookmarkData
                if (r7 == 0) goto L4e
                r1.add(r6)
                goto L4e
            L60:
                java.util.ArrayList r9 = new java.util.ArrayList
                int r5 = defpackage.wu0.V(r1, r5)
                r9.<init>(r5)
                java.util.Iterator r1 = r1.iterator()
            L6d:
                boolean r5 = r1.hasNext()
                if (r5 == 0) goto L83
                java.lang.Object r5 = r1.next()
                ir.mservices.market.movie.ui.bookmark.recycler.MovieBookmarkData r5 = (ir.mservices.market.movie.ui.bookmark.recycler.MovieBookmarkData) r5
                ir.mservices.market.movie.data.webapi.SearchMovieDto r5 = r5.h
                java.lang.String r5 = r5.getId()
                r9.add(r5)
                goto L6d
            L83:
                java.util.Iterator r9 = r9.iterator()
                r5 = r9
                r6 = r2
                r1 = r4
            L8a:
                boolean r9 = r5.hasNext()
                if (r9 == 0) goto Lb9
                java.lang.Object r9 = r5.next()
                java.lang.String r9 = (java.lang.String) r9
                ql4 r7 = r6.H
                r8.a = r6
                r8.b = r5
                r8.c = r1
                r8.d = r3
                java.lang.Object r7 = r7.b
                e05 r7 = (defpackage.e05) r7
                java.lang.Object r9 = r7.g(r6, r9, r8)
                if (r9 != r0) goto Lab
                return r0
            Lab:
                n99 r9 = (defpackage.n99) r9
                boolean r9 = r9 instanceof defpackage.l99
                if (r9 == 0) goto Lb5
                r6.w()
                goto L8a
            Lb5:
                r6.s()
                goto L8a
            Lb9:
                r2.m(r4)
                tx8 r9 = defpackage.tx8.a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.movie.ui.bookmark.MovieBookmarkViewModel.C01921.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MovieBookmarkViewModel(c5 c5Var, ql4 ql4Var) {
        super(false);
        js3.p(c5Var, "accountManager");
        this.G = c5Var;
        this.H = ql4Var;
        bt2.G(y97.G(this), null, null, new AnonymousClass1(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<RecyclerItem> bookmarkMovieDtoMapper(MovieBookmarkListDto movieBookmarkListDto) {
        List<SearchMovieDto> movies = movieBookmarkListDto.getMovies();
        if (movies == null) {
            return EmptyList.a;
        }
        ArrayList arrayList = new ArrayList(wu0.V(movies, 10));
        Iterator<T> it = movies.iterator();
        while (it.hasNext()) {
            RecyclerItem recyclerItem = new RecyclerItem(new MovieBookmarkData(this.E, (SearchMovieDto) it.next()));
            this.F.add(recyclerItem);
            arrayList.add(recyclerItem);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void deleteSelectedItems(List<RecyclerItem> list) {
        bt2.G(y97.G(this), null, null, new C01921(list, this, null), 3);
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        p(new MovieBookmarkViewModel$doRequest$1(this, null));
    }
}
