package ir.mservices.market.reels.ui;

import android.os.Parcelable;
import defpackage.f17;
import defpackage.ja1;
import defpackage.jd7;
import defpackage.js3;
import defpackage.pv6;
import defpackage.u17;
import defpackage.ut4;
import defpackage.vy2;
import ir.mservices.market.reels.data.ReelHomeDto;
import ir.mservices.market.viewModel.c;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.b;
import kotlinx.coroutines.flow.i;
import kotlinx.coroutines.flow.l;

/* JADX INFO: loaded from: classes3.dex */
public final class ReelsViewModel extends c {
    public final l A;
    public final l B;
    public final l C;
    public final pv6 D;
    public final f17 E;
    public final ut4 t;
    public final u17 u;
    public final ir.mservices.market.reels.download.a v;
    public final i w;
    public final pv6 x;
    public final i y;
    public final pv6 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReelsViewModel(ut4 ut4Var, jd7 jd7Var, u17 u17Var, ir.mservices.market.reels.download.a aVar) {
        super(true);
        js3.p(jd7Var, "savedStateHandle");
        js3.p(u17Var, "movieNeneDownloadRepository");
        js3.p(aVar, "movieDownloadManager");
        this.t = ut4Var;
        this.u = u17Var;
        this.v = aVar;
        i iVarE = vy2.e(0, 7, null);
        this.w = iVarE;
        this.x = new pv6(iVarE);
        i iVarE2 = vy2.e(0, 7, null);
        this.y = iVarE2;
        this.z = new pv6(iVarE2);
        this.A = ja1.b(new LinkedHashMap());
        this.B = ja1.b(Boolean.FALSE);
        l lVarB = ja1.b(null);
        this.C = lVarB;
        this.D = new pv6(lVarB);
        if (!jd7Var.a("reel")) {
            throw new IllegalArgumentException("Required argument \"reel\" is missing and does not have an android:defaultValue");
        }
        if (!Parcelable.class.isAssignableFrom(ReelHomeDto.class) && !Serializable.class.isAssignableFrom(ReelHomeDto.class)) {
            throw new UnsupportedOperationException(ReelHomeDto.class.getName().concat(" must implement Parcelable or Serializable or must be an Enum."));
        }
        ReelHomeDto reelHomeDto = (ReelHomeDto) jd7Var.b("reel");
        if (!jd7Var.a("query")) {
            throw new IllegalArgumentException("Required argument \"query\" is missing and does not have an android:defaultValue");
        }
        this.E = new f17(reelHomeDto, (String) jd7Var.b("query"));
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x008c, code lost:
    
        if (r6.emit(r1, r5) == r7) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a4, code lost:
    
        if (r6.emit(r2, r5) == r7) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object r(ir.mservices.market.reels.ui.ReelsViewModel r16, ir.mservices.market.reels.data.ReelLikeRequestDto r17, kotlin.coroutines.jvm.internal.ContinuationImpl r18) {
        /*
            r4 = r16
            r0 = r18
            kotlinx.coroutines.flow.i r6 = r4.y
            boolean r1 = r0 instanceof ir.mservices.market.reels.ui.ReelsViewModel$dislikeReel$1
            if (r1 == 0) goto L1a
            r1 = r0
            ir.mservices.market.reels.ui.ReelsViewModel$dislikeReel$1 r1 = (ir.mservices.market.reels.ui.ReelsViewModel$dislikeReel$1) r1
            int r2 = r1.d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r2 & r3
            if (r5 == 0) goto L1a
            int r2 = r2 - r3
            r1.d = r2
        L18:
            r5 = r1
            goto L20
        L1a:
            ir.mservices.market.reels.ui.ReelsViewModel$dislikeReel$1 r1 = new ir.mservices.market.reels.ui.ReelsViewModel$dislikeReel$1
            r1.<init>(r4, r0)
            goto L18
        L20:
            java.lang.Object r0 = r5.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r7 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r1 = r5.d
            r8 = 3
            r9 = 2
            r2 = 1
            if (r1 == 0) goto L42
            if (r1 == r2) goto L3e
            if (r1 == r9) goto L3a
            if (r1 != r8) goto L32
            goto L3a
        L32:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L3a:
            kotlin.b.b(r0)
            goto La7
        L3e:
            kotlin.b.b(r0)
            goto L76
        L42:
            kotlin.b.b(r0)
            ut4 r0 = r4.t
            r5.d = r2
            java.lang.Object r0 = r0.b
            v17 r0 = (defpackage.v17) r0
            java.util.Map r14 = r0.getCommonQueryParam()
            r15 = 0
            java.lang.String r11 = "reel-api"
            java.lang.String r12 = "v1/reel/like"
            r13 = 0
            r10 = r0
            z57 r2 = r10.createRequestUrl(r11, r12, r13, r14, r15)
            ir.mservices.market.reels.services.ReelsService$dislike$2 r1 = new ir.mservices.market.reels.services.ReelsService$dislike$2
            r1.<init>()
            java.lang.reflect.Type r1 = r1.getType()
            java.lang.String r3 = "getType(...)"
            defpackage.js3.o(r1, r3)
            defpackage.js3.m(r2)
            r3 = r17
            java.lang.Object r0 = defpackage.dy3.r(r0, r1, r2, r3, r4, r5)
            if (r0 != r7) goto L76
            goto La6
        L76:
            r1 = r0
            n99 r1 = (defpackage.n99) r1
            boolean r2 = r1 instanceof defpackage.l99
            if (r2 == 0) goto L8f
            l99 r1 = new l99
            java.lang.Boolean r2 = java.lang.Boolean.FALSE
            r1.<init>(r2)
            r5.a = r0
            r5.d = r9
            java.lang.Object r0 = r6.emit(r1, r5)
            if (r0 != r7) goto La7
            goto La6
        L8f:
            boolean r2 = r1 instanceof defpackage.h99
            if (r2 == 0) goto La7
            h99 r2 = new h99
            h99 r1 = (defpackage.h99) r1
            ir.mservices.market.version2.webapi.responsedto.ErrorDTO r1 = r1.a
            r2.<init>(r1)
            r5.a = r0
            r5.d = r8
            java.lang.Object r0 = r6.emit(r2, r5)
            if (r0 != r7) goto La7
        La6:
            return r7
        La7:
            tx8 r0 = defpackage.tx8.a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.reels.ui.ReelsViewModel.r(ir.mservices.market.reels.ui.ReelsViewModel, ir.mservices.market.reels.data.ReelLikeRequestDto, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x008c, code lost:
    
        if (r0.emit(r13, r9) == r1) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00a4, code lost:
    
        if (r0.emit(r14, r9) == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object s(ir.mservices.market.reels.ui.ReelsViewModel r13, ir.mservices.market.reels.data.ReelLikeRequestDto r14, kotlin.coroutines.jvm.internal.ContinuationImpl r15) {
        /*
            kotlinx.coroutines.flow.i r0 = r13.w
            boolean r1 = r15 instanceof ir.mservices.market.reels.ui.ReelsViewModel$likeReel$1
            if (r1 == 0) goto L16
            r1 = r15
            ir.mservices.market.reels.ui.ReelsViewModel$likeReel$1 r1 = (ir.mservices.market.reels.ui.ReelsViewModel$likeReel$1) r1
            int r2 = r1.d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r1.d = r2
        L14:
            r9 = r1
            goto L1c
        L16:
            ir.mservices.market.reels.ui.ReelsViewModel$likeReel$1 r1 = new ir.mservices.market.reels.ui.ReelsViewModel$likeReel$1
            r1.<init>(r13, r15)
            goto L14
        L1c:
            java.lang.Object r15 = r9.b
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r9.d
            r11 = 3
            r12 = 2
            r3 = 1
            if (r2 == 0) goto L3e
            if (r2 == r3) goto L3a
            if (r2 == r12) goto L36
            if (r2 != r11) goto L2e
            goto L36
        L2e:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r14)
            throw r13
        L36:
            kotlin.b.b(r15)
            goto La7
        L3a:
            kotlin.b.b(r15)
            goto L76
        L3e:
            kotlin.b.b(r15)
            ut4 r15 = r13.t
            r9.d = r3
            java.lang.Object r15 = r15.b
            r2 = r15
            v17 r2 = (defpackage.v17) r2
            java.util.Map r6 = r2.getCommonQueryParam()
            r7 = 0
            java.lang.String r3 = "reel-api"
            java.lang.String r4 = "v1/reel/like"
            r5 = 0
            z57 r4 = r2.createRequestUrl(r3, r4, r5, r6, r7)
            ir.mservices.market.reels.services.ReelsService$like$2 r15 = new ir.mservices.market.reels.services.ReelsService$like$2
            r15.<init>()
            java.lang.reflect.Type r3 = r15.getType()
            java.lang.String r15 = "getType(...)"
            defpackage.js3.o(r3, r15)
            defpackage.js3.m(r4)
            r8 = 0
            r10 = 496(0x1f0, float:6.95E-43)
            r7 = 0
            r6 = r13
            r5 = r14
            java.lang.Object r15 = defpackage.dy3.G(r2, r3, r4, r5, r6, r7, r8, r9, r10)
            if (r15 != r1) goto L76
            goto La6
        L76:
            r13 = r15
            n99 r13 = (defpackage.n99) r13
            boolean r14 = r13 instanceof defpackage.l99
            if (r14 == 0) goto L8f
            l99 r13 = new l99
            java.lang.Boolean r14 = java.lang.Boolean.TRUE
            r13.<init>(r14)
            r9.a = r15
            r9.d = r12
            java.lang.Object r13 = r0.emit(r13, r9)
            if (r13 != r1) goto La7
            goto La6
        L8f:
            boolean r14 = r13 instanceof defpackage.h99
            if (r14 == 0) goto La7
            h99 r14 = new h99
            h99 r13 = (defpackage.h99) r13
            ir.mservices.market.version2.webapi.responsedto.ErrorDTO r13 = r13.a
            r14.<init>(r13)
            r9.a = r15
            r9.d = r11
            java.lang.Object r13 = r0.emit(r14, r9)
            if (r13 != r1) goto La7
        La6:
            return r1
        La7:
            tx8 r13 = defpackage.tx8.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.reels.ui.ReelsViewModel.s(ir.mservices.market.reels.ui.ReelsViewModel, ir.mservices.market.reels.data.ReelLikeRequestDto, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // ir.mservices.market.viewModel.c
    public final void e() {
        p(new ReelsViewModel$doRequest$1(this, null));
    }

    public final void t(String str, boolean z) {
        l lVar;
        Object value;
        do {
            lVar = this.A;
            value = lVar.getValue();
        } while (!lVar.n(value, b.P((Map) value, b.M(new Pair(str, Boolean.valueOf(z))))));
    }
}
