package ir.mservices.market.movie.streamers;

import androidx.paging.e;
import androidx.paging.m;
import defpackage.bl4;
import defpackage.bt2;
import defpackage.bz6;
import defpackage.e71;
import defpackage.g51;
import defpackage.gu9;
import defpackage.h78;
import defpackage.ja1;
import defpackage.jd7;
import defpackage.js3;
import defpackage.og6;
import defpackage.pq6;
import defpackage.pv6;
import defpackage.qm5;
import defpackage.qp2;
import defpackage.rv6;
import defpackage.tb1;
import defpackage.tx8;
import defpackage.ut4;
import defpackage.vd7;
import defpackage.vy2;
import defpackage.wu0;
import defpackage.xe2;
import defpackage.xk6;
import defpackage.y97;
import ir.mservices.market.common.ui.recycler.DividerData;
import ir.mservices.market.common.ui.recycler.MyketRecyclerData;
import ir.mservices.market.common.ui.recycler.RecyclerItem;
import ir.mservices.market.movie.data.webapi.MovieDto;
import ir.mservices.market.movie.streamers.StreamerProfileListAction;
import ir.mservices.market.movie.streamers.data.StreamerDto;
import ir.mservices.market.movie.streamers.data.StreamerFullDto;
import ir.mservices.market.movie.streamers.data.StreamerMoviesDto;
import ir.mservices.market.movie.streamers.data.StreamerToolbarData;
import ir.mservices.market.movie.streamers.data.StreamersDto;
import ir.mservices.market.movie.streamers.recycler.OtherStreamerData;
import ir.mservices.market.movie.streamers.recycler.OtherStreamersMoreData;
import ir.mservices.market.movie.streamers.recycler.OtherStreamersRowData;
import ir.mservices.market.movie.streamers.recycler.StreamerAvatarData;
import ir.mservices.market.movie.streamers.recycler.StreamerHeaderData;
import ir.mservices.market.movie.streamers.recycler.StreamerMovieData;
import ir.mservices.market.movie.streamers.recycler.StreamerMovieTitleData;
import ir.mservices.market.movie.streamers.recycler.StreamerMoviesMoreData;
import ir.mservices.market.movie.streamers.recycler.StreamerNameData;
import ir.mservices.market.viewModel.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class StreamerProfileViewModel extends a {
    public final l A;
    public final rv6 B;
    public final i C;
    public final i D;
    public final l E;
    public final ut4 v;
    public final qm5 w;
    public final h78 x;
    public final l y;
    public final rv6 z;

    /* JADX INFO: renamed from: ir.mservices.market.movie.streamers.StreamerProfileViewModel$1, reason: invalid class name */
    @tb1(c = "ir.mservices.market.movie.streamers.StreamerProfileViewModel$1", f = "StreamerProfileViewModel.kt", l = {213}, m = "invokeSuspend", v = 1)
    final class AnonymousClass1 extends SuspendLambda implements qp2 {
        public int a;

        public AnonymousClass1(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return StreamerProfileViewModel.this.new AnonymousClass1(g51Var);
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
            StreamerProfileViewModel streamerProfileViewModel = StreamerProfileViewModel.this;
            pv6 pv6Var = streamerProfileViewModel.u;
            xk6 xk6Var = new xk6(16, streamerProfileViewModel);
            this.a = 1;
            Object objA = pv6Var.a.a(new og6(xk6Var, 26), this);
            if (objA != coroutineSingletons) {
                objA = tx8Var;
            }
            return objA == coroutineSingletons ? coroutineSingletons : tx8Var;
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.movie.streamers.StreamerProfileViewModel$onFollowStreamer$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.movie.streamers.StreamerProfileViewModel$onFollowStreamer$1", f = "StreamerProfileViewModel.kt", l = {146, 149, 153}, m = "invokeSuspend", v = 1)
    public static final class C01901 extends SuspendLambda implements qp2 {
        public Object a;
        public int b;

        public C01901(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return StreamerProfileViewModel.this.new C01901(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C01901) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0075, code lost:
        
            if (r9.emit(r0, r13) == r10) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0086, code lost:
        
            if (r9.emit(r0, r13) == r10) goto L24;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                ir.mservices.market.movie.streamers.StreamerProfileViewModel r4 = ir.mservices.market.movie.streamers.StreamerProfileViewModel.this
                kotlinx.coroutines.flow.i r9 = r4.C
                kotlin.coroutines.intrinsics.CoroutineSingletons r10 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
                int r0 = r13.b
                r11 = 3
                r12 = 2
                r1 = 1
                if (r0 == 0) goto L26
                if (r0 == r1) goto L21
                if (r0 == r12) goto L1c
                if (r0 != r11) goto L14
                goto L1c
            L14:
                java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r14.<init>(r0)
                throw r14
            L1c:
                kotlin.b.b(r14)
                r7 = r13
                goto L89
            L21:
                kotlin.b.b(r14)
                r7 = r13
                goto L64
            L26:
                kotlin.b.b(r14)
                ut4 r14 = r4.v
                ir.mservices.market.movie.streamers.data.StreamerFollowDto r3 = new ir.mservices.market.movie.streamers.data.StreamerFollowDto
                h78 r0 = r4.x
                java.lang.String r0 = r0.a
                r3.<init>(r0)
                r13.b = r1
                java.lang.Object r14 = r14.b
                r0 = r14
                l78 r0 = (defpackage.l78) r0
                java.lang.String r14 = "v1/streamer-followers"
                java.util.Map r1 = r0.getCommonQueryParam()
                java.lang.String r2 = "movie-api"
                r5 = 0
                z57 r2 = r0.createRequestUrl(r2, r14, r5, r1)
                ir.mservices.market.movie.streamers.services.StreamersService$followStreamer$2 r14 = new ir.mservices.market.movie.streamers.services.StreamersService$followStreamer$2
                r14.<init>()
                java.lang.reflect.Type r1 = r14.getType()
                java.lang.String r14 = "getType(...)"
                defpackage.js3.o(r1, r14)
                defpackage.js3.m(r2)
                r6 = 0
                r8 = 496(0x1f0, float:6.95E-43)
                r7 = r13
                java.lang.Object r14 = defpackage.dy3.G(r0, r1, r2, r3, r4, r5, r6, r7, r8)
                if (r14 != r10) goto L64
                goto L88
            L64:
                r0 = r14
                n99 r0 = (defpackage.n99) r0
                boolean r1 = r0 instanceof defpackage.l99
                if (r1 == 0) goto L78
                java.lang.Boolean r0 = java.lang.Boolean.TRUE
                r7.a = r14
                r7.b = r12
                java.lang.Object r14 = r9.emit(r0, r13)
                if (r14 != r10) goto L89
                goto L88
            L78:
                boolean r0 = r0 instanceof defpackage.h99
                if (r0 == 0) goto L89
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                r7.a = r14
                r7.b = r11
                java.lang.Object r14 = r9.emit(r0, r13)
                if (r14 != r10) goto L89
            L88:
                return r10
            L89:
                tx8 r14 = defpackage.tx8.a
                return r14
            */
            throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.movie.streamers.StreamerProfileViewModel.C01901.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ir.mservices.market.movie.streamers.StreamerProfileViewModel$onUnFollowStreamer$1, reason: invalid class name and case insensitive filesystem */
    @tb1(c = "ir.mservices.market.movie.streamers.StreamerProfileViewModel$onUnFollowStreamer$1", f = "StreamerProfileViewModel.kt", l = {164, 167, 171}, m = "invokeSuspend", v = 1)
    public static final class C01911 extends SuspendLambda implements qp2 {
        public Object a;
        public int b;

        public C01911(g51 g51Var) {
            super(2, g51Var);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final g51 create(Object obj, g51 g51Var) {
            return StreamerProfileViewModel.this.new C01911(g51Var);
        }

        @Override // defpackage.qp2
        public final Object invoke(Object obj, Object obj2) {
            return ((C01911) create((e71) obj, (g51) obj2)).invokeSuspend(tx8.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0072, code lost:
        
            if (r6.emit(r0, r10) == r7) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:
        
            if (r6.emit(r0, r10) == r7) goto L24;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                ir.mservices.market.movie.streamers.StreamerProfileViewModel r4 = ir.mservices.market.movie.streamers.StreamerProfileViewModel.this
                kotlinx.coroutines.flow.i r6 = r4.D
                kotlin.coroutines.intrinsics.CoroutineSingletons r7 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
                int r0 = r10.b
                r8 = 3
                r9 = 2
                r1 = 1
                if (r0 == 0) goto L26
                if (r0 == r1) goto L21
                if (r0 == r9) goto L1c
                if (r0 != r8) goto L14
                goto L1c
            L14:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1c:
                kotlin.b.b(r11)
                r5 = r10
                goto L86
            L21:
                kotlin.b.b(r11)
                r5 = r10
                goto L61
            L26:
                kotlin.b.b(r11)
                ut4 r11 = r4.v
                ir.mservices.market.movie.streamers.data.StreamerFollowDto r3 = new ir.mservices.market.movie.streamers.data.StreamerFollowDto
                h78 r0 = r4.x
                java.lang.String r0 = r0.a
                r3.<init>(r0)
                r10.b = r1
                java.lang.Object r11 = r11.b
                r0 = r11
                l78 r0 = (defpackage.l78) r0
                java.lang.String r11 = "v1/streamer-followers"
                java.util.Map r1 = r0.getCommonQueryParam()
                java.lang.String r2 = "movie-api"
                r5 = 0
                z57 r2 = r0.createRequestUrl(r2, r11, r5, r1)
                ir.mservices.market.movie.streamers.services.StreamersService$unfollowStreamer$2 r11 = new ir.mservices.market.movie.streamers.services.StreamersService$unfollowStreamer$2
                r11.<init>()
                java.lang.reflect.Type r1 = r11.getType()
                java.lang.String r11 = "getType(...)"
                defpackage.js3.o(r1, r11)
                defpackage.js3.m(r2)
                r5 = r10
                java.lang.Object r11 = defpackage.dy3.r(r0, r1, r2, r3, r4, r5)
                if (r11 != r7) goto L61
                goto L85
            L61:
                r0 = r11
                n99 r0 = (defpackage.n99) r0
                boolean r1 = r0 instanceof defpackage.l99
                if (r1 == 0) goto L75
                java.lang.Boolean r0 = java.lang.Boolean.TRUE
                r5.a = r11
                r5.b = r9
                java.lang.Object r11 = r6.emit(r0, r10)
                if (r11 != r7) goto L86
                goto L85
            L75:
                boolean r0 = r0 instanceof defpackage.h99
                if (r0 == 0) goto L86
                java.lang.Boolean r0 = java.lang.Boolean.FALSE
                r5.a = r11
                r5.b = r8
                java.lang.Object r11 = r6.emit(r0, r10)
                if (r11 != r7) goto L86
            L85:
                return r7
            L86:
                tx8 r11 = defpackage.tx8.a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.movie.streamers.StreamerProfileViewModel.C01911.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StreamerProfileViewModel(ut4 ut4Var, qm5 qm5Var, jd7 jd7Var) {
        super(true);
        js3.p(jd7Var, "savedStateHandle");
        this.v = ut4Var;
        this.w = qm5Var;
        if (!jd7Var.a("streamerKey")) {
            throw new IllegalArgumentException("Required argument \"streamerKey\" is missing and does not have an android:defaultValue");
        }
        String str = (String) jd7Var.b("streamerKey");
        if (str == null) {
            throw new IllegalArgumentException("Argument \"streamerKey\" is marked as non-null but was passed a null value");
        }
        if (!jd7Var.a("refId")) {
            throw new IllegalArgumentException("Required argument \"refId\" is missing and does not have an android:defaultValue");
        }
        this.x = new h78(str, (String) jd7Var.b("refId"));
        l lVarB = ja1.b("");
        this.y = lVarB;
        this.z = new rv6(lVarB);
        l lVarB2 = ja1.b(null);
        this.A = lVarB2;
        this.B = new rv6(lVarB2);
        this.C = vy2.e(0, 7, null);
        this.D = vy2.e(0, 7, null);
        this.E = ja1.b(null);
        bt2.G(y97.G(this), null, null, new AnonymousClass1(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<RecyclerItem> fillData(StreamerFullDto streamerFullDto) {
        l lVar;
        Object value;
        l lVar2;
        Object value2;
        l lVar3;
        Object value3;
        ArrayList arrayList = new ArrayList();
        do {
            lVar = this.y;
            value = lVar.getValue();
        } while (!lVar.n(value, streamerFullDto.getBackgroundImageUrl()));
        do {
            lVar2 = this.A;
            value2 = lVar2.getValue();
        } while (!lVar2.n(value2, new StreamerToolbarData(streamerFullDto.getAvatarImageUrl(), streamerFullDto.getName(), streamerFullDto.getSecondaryTitle())));
        do {
            lVar3 = this.E;
            value3 = lVar3.getValue();
        } while (!lVar3.n(value3, Boolean.valueOf(streamerFullDto.getFollowingStatus())));
        arrayList.add(new StreamerAvatarData(streamerFullDto.getName(), streamerFullDto.getAvatarImageUrl(), streamerFullDto.getMovieCount(), streamerFullDto.getFollowerCount()));
        arrayList.add(new StreamerNameData(streamerFullDto.getName(), streamerFullDto.getSecondaryTitle(), streamerFullDto.getFollowingStatus(), new pv6(this.C), new pv6(this.D)));
        arrayList.add(new StreamerHeaderData(streamerFullDto.getDescription(), streamerFullDto.getAvatarImageUrl(), streamerFullDto.getMovieCount(), streamerFullDto.getFollowerCount()));
        StreamerMoviesDto movies = streamerFullDto.getMovies();
        if (movies != null) {
            arrayList.add(new StreamerMovieTitleData());
            List<MovieDto> movies2 = movies.getMovies();
            ArrayList arrayList2 = new ArrayList(wu0.V(movies2, 10));
            Iterator<T> it = movies2.iterator();
            while (it.hasNext()) {
                arrayList2.add(new StreamerMovieData((MovieDto) it.next()));
            }
            arrayList.addAll(arrayList2);
            if (!movies.getEol()) {
                arrayList.add(new StreamerMoviesMoreData());
            }
        }
        StreamersDto recommendedStreamers = streamerFullDto.getRecommendedStreamers();
        if (recommendedStreamers != null) {
            arrayList.add(new OtherStreamersMoreData(recommendedStreamers.getEol()));
            arrayList.add(new OtherStreamersRowData(getStreamersNestedList(recommendedStreamers), new StreamerProfileViewModel$fillData$1$5$1(1, this, StreamerProfileViewModel.class, "removeIfEmptyCallback", "removeIfEmptyCallback(Ljava/lang/String;)V", 0)));
        }
        ArrayList arrayList3 = new ArrayList(wu0.V(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            bl4.G((MyketRecyclerData) it2.next(), arrayList3);
        }
        return arrayList3;
    }

    private final bz6 getStreamersNestedList(StreamersDto streamersDto) {
        qm5 qm5Var = this.w;
        qm5Var.getClass();
        return new bz6(e.b(gu9.x((xe2) new m(gu9.n(false), new ir.mservices.market.movie.streamers.moreStreamers.model.a(streamersDto, qm5Var, this)).a, new vd7(29)), y97.G(this)), null, null, null, 14);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getStreamersNestedList$lambda$0(StreamersDto streamersDto) {
        js3.p(streamersDto, "it");
        List<StreamerDto> streamers = streamersDto.getStreamers();
        ArrayList arrayList = new ArrayList(wu0.V(streamers, 10));
        Iterator<T> it = streamers.iterator();
        while (it.hasNext()) {
            arrayList.add(new RecyclerItem(new OtherStreamerData((StreamerDto) it.next())));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFollowStreamer(StreamerProfileListAction.FollowStreamerAction followStreamerAction) {
        bt2.G(y97.G(this), null, null, new C01901(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onUnFollowStreamer(StreamerProfileListAction.UnFollowStreamerAction unFollowStreamerAction) {
        bt2.G(y97.G(this), null, null, new C01911(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final RecyclerItem setDivider(RecyclerItem recyclerItem, RecyclerItem recyclerItem2) {
        if (recyclerItem == null || recyclerItem2 == null || !(recyclerItem.c instanceof StreamerHeaderData)) {
            return null;
        }
        DividerData dividerData = new DividerData();
        int i = pq6.space_12;
        dividerData.f = i;
        dividerData.g = i;
        dividerData.b = false;
        return new RecyclerItem(dividerData);
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        p(new StreamerProfileViewModel$doRequest$1(this, null));
    }
}
