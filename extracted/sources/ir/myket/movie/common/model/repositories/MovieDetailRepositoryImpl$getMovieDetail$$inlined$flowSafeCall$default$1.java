package ir.myket.movie.common.model.repositories;

import android.graphics.Color;
import defpackage.a76;
import defpackage.ag7;
import defpackage.b15;
import defpackage.bn5;
import defpackage.br9;
import defpackage.cg7;
import defpackage.d76;
import defpackage.f55;
import defpackage.g75;
import defpackage.gc;
import defpackage.hk1;
import defpackage.i15;
import defpackage.is3;
import defpackage.j55;
import defpackage.j75;
import defpackage.jc;
import defpackage.js3;
import defpackage.k75;
import defpackage.kk1;
import defpackage.lx6;
import defpackage.m88;
import defpackage.ma8;
import defpackage.ml9;
import defpackage.n75;
import defpackage.ne8;
import defpackage.o75;
import defpackage.p55;
import defpackage.pa8;
import defpackage.pd0;
import defpackage.pj3;
import defpackage.pn0;
import defpackage.px6;
import defpackage.pz4;
import defpackage.qe8;
import defpackage.r75;
import defpackage.rp2;
import defpackage.sa8;
import defpackage.sd0;
import defpackage.sn0;
import defpackage.sp8;
import defpackage.st7;
import defpackage.tb1;
import defpackage.tk7;
import defpackage.tx8;
import defpackage.uu4;
import defpackage.vp8;
import defpackage.wf7;
import defpackage.wu0;
import defpackage.yt7;
import defpackage.z0;
import defpackage.z25;
import defpackage.ze2;
import defpackage.zu4;
import ir.myket.movie.common.domain.models.MovieType;
import ir.myket.movie.common.domain.models.SubscriptionItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.b;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: loaded from: classes3.dex */
@tb1(c = "ir.myket.movie.common.model.repositories.MovieDetailRepositoryImpl$getMovieDetail$$inlined$flowSafeCall$default$1", f = "MovieDetailRepositoryImpl.kt", l = {198, 59}, m = "invokeSuspend", v = 1)
public final class MovieDetailRepositoryImpl$getMovieDetail$$inlined$flowSafeCall$default$1 extends SuspendLambda implements rp2 {
    public ze2 a;
    public int b;
    public int c;

    @Override // defpackage.rp2
    public final Object a(Object obj, Object obj2, Object obj3) {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26, types: [k75] */
    /* JADX WARN: Type inference failed for: r10v28, types: [k75] */
    /* JADX WARN: Type inference failed for: r11v23 */
    /* JADX WARN: Type inference failed for: r11v24, types: [o75] */
    /* JADX WARN: Type inference failed for: r11v27 */
    /* JADX WARN: Type inference failed for: r17v4, types: [pj3] */
    /* JADX WARN: Type inference failed for: r19v0 */
    /* JADX WARN: Type inference failed for: r19v1, types: [pj3] */
    /* JADX WARN: Type inference failed for: r19v2 */
    /* JADX WARN: Type inference failed for: r23v2, types: [pj3] */
    /* JADX WARN: Type inference failed for: r24v2, types: [cg7] */
    /* JADX WARN: Type inference failed for: r25v2, types: [uu4] */
    /* JADX WARN: Type inference failed for: r28v2, types: [ma8] */
    /* JADX WARN: Type inference failed for: r29v2, types: [pd0] */
    /* JADX WARN: Type inference failed for: r30v0 */
    /* JADX WARN: Type inference failed for: r30v1, types: [sp8] */
    /* JADX WARN: Type inference failed for: r30v2 */
    /* JADX WARN: Type inference failed for: r31v0 */
    /* JADX WARN: Type inference failed for: r31v1, types: [pj3] */
    /* JADX WARN: Type inference failed for: r31v2 */
    /* JADX WARN: Type inference failed for: r34v0 */
    /* JADX WARN: Type inference failed for: r34v1, types: [j55] */
    /* JADX WARN: Type inference failed for: r34v3 */
    /* JADX WARN: Type inference failed for: r34v5 */
    /* JADX WARN: Type inference failed for: r34v6, types: [pj3] */
    /* JADX WARN: Type inference failed for: r34v7 */
    /* JADX WARN: Type inference failed for: r36v0 */
    /* JADX WARN: Type inference failed for: r36v1, types: [gc] */
    /* JADX WARN: Type inference failed for: r36v2 */
    /* JADX WARN: Type inference failed for: r37v0 */
    /* JADX WARN: Type inference failed for: r37v1, types: [hk1] */
    /* JADX WARN: Type inference failed for: r37v2 */
    /* JADX WARN: Type inference failed for: r37v3 */
    /* JADX WARN: Type inference failed for: r37v4, types: [pj3] */
    /* JADX WARN: Type inference failed for: r37v5 */
    /* JADX WARN: Type inference failed for: r38v0 */
    /* JADX WARN: Type inference failed for: r38v1, types: [st7] */
    /* JADX WARN: Type inference failed for: r38v2 */
    /* JADX WARN: Type inference failed for: r38v3 */
    /* JADX WARN: Type inference failed for: r38v4, types: [b55] */
    /* JADX WARN: Type inference failed for: r38v5 */
    /* JADX WARN: Type inference failed for: r3v9, types: [ze2] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r4v55 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        pj3 pj3VarZ;
        MovieType movieType;
        Object next;
        String str;
        String str2;
        String str3;
        String str4;
        pj3 pj3Var;
        String str5;
        Object objZ;
        ?? Z;
        CoroutineSingletons coroutineSingletons;
        Object obj2;
        String str6;
        String str7;
        String str8;
        String str9;
        MovieType movieType2;
        Object objZ2;
        Object cg7Var;
        Object uu4Var;
        Object obj3;
        Object ma8Var;
        ?? Z2;
        boolean z;
        Object obj4;
        String str10;
        ?? j55Var;
        String str11;
        ?? gcVar;
        ?? Z3;
        CoroutineSingletons coroutineSingletons2;
        String str12;
        Iterator it;
        MovieType movieType3;
        ?? Z4;
        String str13;
        Enum r30;
        Object next2;
        String str14;
        pj3 pj3Var2;
        String str15;
        ?? k75Var;
        CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.a;
        int i = this.c;
        if (i == 0) {
            b.b(obj);
            throw null;
        }
        if (i == 1) {
            int i2 = this.b;
            ze2 ze2Var = this.a;
            b.b(obj);
            i15 i15Var = (i15) obj;
            js3.p(i15Var, "<this>");
            String str16 = i15Var.a;
            String str17 = i15Var.b;
            String str18 = i15Var.c;
            List list = i15Var.d;
            if (list != null) {
                ArrayList arrayList = new ArrayList(wu0.V(list, 10));
                int i3 = 0;
                for (Object obj5 : list) {
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        br9.P();
                        throw null;
                    }
                    arrayList.add(is3.O((tk7) obj5, i15Var.c, i3 == br9.y(list)));
                    i3 = i4;
                }
                th = null;
                pj3VarZ = ml9.z(arrayList);
            } else {
                th = null;
                pj3VarZ = null;
            }
            String str19 = i15Var.e;
            String str20 = i15Var.f;
            MovieType movieType4 = MovieType.d;
            Iterator it2 = ((z0) MovieType.f).iterator();
            while (true) {
                if (!it2.hasNext()) {
                    movieType = movieType4;
                    next = th;
                    break;
                }
                next = it2.next();
                movieType = movieType4;
                if (m88.T(((Enum) next).name(), str20, true)) {
                    break;
                }
                movieType4 = movieType;
            }
            Enum r9 = (Enum) next;
            MovieType movieType5 = (MovieType) (r9 == null ? movieType : r9);
            String str21 = i15Var.g;
            List list2 = i15Var.h;
            if (list2 != null) {
                str = str21;
                ArrayList arrayList2 = new ArrayList(wu0.V(list2, 10));
                Iterator it3 = list2.iterator();
                while (it3.hasNext()) {
                    j75 j75Var = (j75) it3.next();
                    js3.p(j75Var, "<this>");
                    Iterator it4 = it3;
                    String str22 = j75Var.a;
                    String str23 = str16;
                    r75 r75Var = j75Var.b;
                    String str24 = str17;
                    ?? o75Var = r75Var != null ? new o75(r75Var.a) : th;
                    n75 n75Var = j75Var.c;
                    if (n75Var != null) {
                        str14 = str18;
                        pj3Var2 = pj3VarZ;
                        str15 = str19;
                        k75Var = new k75(n75Var.a, n75Var.b, n75Var.c, n75Var.d);
                    } else {
                        str14 = str18;
                        pj3Var2 = pj3VarZ;
                        str15 = str19;
                        k75Var = th;
                    }
                    arrayList2.add(new g75(str22, o75Var, k75Var));
                    it3 = it4;
                    str16 = str23;
                    str17 = str24;
                    str18 = str14;
                    pj3VarZ = pj3Var2;
                    str19 = str15;
                }
                str2 = str16;
                str3 = str17;
                str4 = str18;
                pj3Var = pj3VarZ;
                str5 = str19;
                objZ = ml9.z(arrayList2);
            } else {
                str = str21;
                str2 = str16;
                str3 = str17;
                str4 = str18;
                pj3Var = pj3VarZ;
                str5 = str19;
                objZ = th;
            }
            String str25 = i15Var.i;
            List<qe8> list3 = i15Var.j;
            if (list3 != null) {
                ArrayList arrayList3 = new ArrayList(wu0.V(list3, 10));
                for (qe8 qe8Var : list3) {
                    arrayList3.add(new ne8(qe8Var.a, qe8Var.b, qe8Var.c));
                }
                Z = ml9.z(arrayList3);
            } else {
                Z = th;
            }
            String str26 = i15Var.k;
            String str27 = i15Var.l;
            String str28 = i15Var.m;
            List list4 = i15Var.n;
            if (list4 != null) {
                ArrayList arrayList4 = new ArrayList(wu0.V(list4, 10));
                Iterator it5 = list4.iterator();
                while (it5.hasNext()) {
                    px6 px6Var = (px6) it5.next();
                    String str29 = px6Var.a;
                    Object obj6 = objZ;
                    String str30 = px6Var.b;
                    String str31 = str25;
                    List list5 = px6Var.c;
                    String str32 = str26;
                    String str33 = str27;
                    String str34 = str28;
                    ArrayList arrayList5 = new ArrayList(wu0.V(list5, 10));
                    Iterator it6 = list5.iterator();
                    while (it6.hasNext()) {
                        z25 z25Var = (z25) it6.next();
                        js3.p(z25Var, "<this>");
                        String str35 = z25Var.a;
                        Iterator it7 = it6;
                        String str36 = z25Var.b;
                        String str37 = z25Var.c;
                        List list6 = z25Var.d;
                        if (list6 != null) {
                            str12 = str35;
                            it = it5;
                            movieType3 = movieType5;
                            ArrayList arrayList6 = new ArrayList(wu0.V(list6, 10));
                            Iterator it8 = list6.iterator();
                            int i5 = 0;
                            while (it8.hasNext()) {
                                Object next3 = it8.next();
                                int i6 = i5 + 1;
                                if (i5 < 0) {
                                    br9.P();
                                    throw th;
                                }
                                List list7 = list6;
                                tk7 tk7Var = (tk7) next3;
                                Iterator it9 = it8;
                                CoroutineSingletons coroutineSingletons4 = coroutineSingletons3;
                                arrayList6.add(is3.O(tk7Var, z25Var.c, i5 == br9.y(list7)));
                                it8 = it9;
                                i5 = i6;
                                list6 = list7;
                                coroutineSingletons3 = coroutineSingletons4;
                            }
                            coroutineSingletons2 = coroutineSingletons3;
                            Z4 = ml9.z(arrayList6);
                        } else {
                            coroutineSingletons2 = coroutineSingletons3;
                            str12 = str35;
                            it = it5;
                            movieType3 = movieType5;
                            Z4 = th;
                        }
                        String str38 = z25Var.e;
                        String str39 = z25Var.f;
                        Enum r10 = MovieType.d;
                        Iterator it10 = ((z0) MovieType.f).iterator();
                        while (true) {
                            if (!it10.hasNext()) {
                                str13 = str38;
                                r30 = r10;
                                next2 = th;
                                break;
                            }
                            next2 = it10.next();
                            str13 = str38;
                            r30 = r10;
                            if (m88.T(((Enum) next2).name(), str39, true)) {
                                break;
                            }
                            r10 = r30;
                            str38 = str13;
                        }
                        Enum r15 = (Enum) next2;
                        if (r15 != null) {
                            r30 = r15;
                        }
                        arrayList5.add(new pz4(str12, str36, str37, Z4, str13, (MovieType) r30, z25Var.g, z25Var.h));
                        it6 = it7;
                        it5 = it;
                        movieType5 = movieType3;
                        coroutineSingletons3 = coroutineSingletons2;
                    }
                    arrayList4.add(new lx6(str29, str30, ml9.z(arrayList5), px6Var.d));
                    objZ = obj6;
                    str25 = str31;
                    str26 = str32;
                    str27 = str33;
                    str28 = str34;
                    coroutineSingletons3 = coroutineSingletons3;
                }
                coroutineSingletons = coroutineSingletons3;
                obj2 = objZ;
                str6 = str25;
                str7 = str26;
                str8 = str27;
                str9 = str28;
                movieType2 = movieType5;
                objZ2 = ml9.z(arrayList4);
            } else {
                coroutineSingletons = coroutineSingletons3;
                obj2 = objZ;
                str6 = str25;
                str7 = str26;
                str8 = str27;
                str9 = str28;
                movieType2 = movieType5;
                objZ2 = th;
            }
            List<ag7> list8 = i15Var.o;
            if (list8 != null) {
                ArrayList arrayList7 = new ArrayList(wu0.V(list8, 10));
                for (ag7 ag7Var : list8) {
                    arrayList7.add(new wf7(ag7Var.a, ag7Var.b, ag7Var.c, ag7Var.d, ag7Var.e));
                }
                cg7Var = new cg7(ml9.z(arrayList7));
            } else {
                cg7Var = th;
            }
            zu4 zu4Var = i15Var.p;
            if (zu4Var != null) {
                String str40 = zu4Var.a;
                String str41 = zu4Var.b;
                String str42 = zu4Var.c;
                uu4Var = new uu4(str40, str41, str42 != null ? Integer.valueOf(Color.parseColor(str42)) : th);
            } else {
                uu4Var = th;
            }
            String str43 = i15Var.q;
            String str44 = i15Var.r;
            pa8 pa8Var = i15Var.s;
            if (pa8Var != null) {
                String str45 = pa8Var.a;
                String str46 = pa8Var.b;
                List list9 = pa8Var.c;
                obj3 = objZ2;
                ArrayList arrayList8 = new ArrayList(wu0.V(list9, 10));
                for (Iterator it11 = list9.iterator(); it11.hasNext(); it11 = it11) {
                    sa8 sa8Var = (sa8) it11.next();
                    js3.p(sa8Var, "<this>");
                    arrayList8.add(new SubscriptionItem(sa8Var.a, sa8Var.b, sa8Var.c, sa8Var.d, sa8Var.e, sa8Var.f, sa8Var.g, sa8Var.h));
                }
                ma8Var = new ma8(str45, str46, ml9.z(arrayList8), pa8Var.d);
            } else {
                obj3 = objZ2;
                ma8Var = th;
            }
            sd0 sd0Var = i15Var.t;
            Object pd0Var = sd0Var != null ? new pd0(sd0Var.a) : th;
            vp8 vp8Var = i15Var.u;
            ?? sp8Var = vp8Var != null ? new sp8(vp8Var.a, vp8Var.b, vp8Var.c, vp8Var.d) : th;
            List list10 = i15Var.v;
            if (list10 != null) {
                int i7 = 10;
                ArrayList arrayList9 = new ArrayList(wu0.V(list10, 10));
                Iterator it12 = list10.iterator();
                while (it12.hasNext()) {
                    sn0 sn0Var = (sn0) it12.next();
                    String str47 = sn0Var.a;
                    List list11 = sn0Var.b;
                    Iterator it13 = it12;
                    ArrayList arrayList10 = new ArrayList(wu0.V(list11, i7));
                    Iterator it14 = list11.iterator();
                    while (it14.hasNext()) {
                        arrayList10.add(new a76(((d76) it14.next()).a));
                    }
                    arrayList9.add(new pn0(ml9.z(arrayList10), str47));
                    it12 = it13;
                    i7 = 10;
                }
                Z2 = ml9.z(arrayList9);
            } else {
                Z2 = th;
            }
            boolean z2 = i15Var.w;
            boolean z3 = i15Var.x;
            p55 p55Var = i15Var.y;
            if (p55Var != null) {
                String str48 = p55Var.a;
                String str49 = p55Var.b;
                String str50 = p55Var.c;
                z = z2;
                String str51 = p55Var.d;
                ArrayList arrayList11 = p55Var.e;
                obj4 = cg7Var;
                if (arrayList11 != null) {
                    str10 = str43;
                    ArrayList arrayList12 = new ArrayList(wu0.V(arrayList11, 10));
                    Iterator it15 = arrayList11.iterator();
                    while (it15.hasNext()) {
                        arrayList12.add(is3.N((f55) it15.next()));
                    }
                    Z3 = ml9.z(arrayList12);
                } else {
                    str10 = str43;
                    Z3 = th;
                }
                f55 f55Var = p55Var.f;
                j55Var = new j55(str48, str49, str50, str51, Z3, f55Var != null ? is3.N(f55Var) : th);
            } else {
                z = z2;
                obj4 = cg7Var;
                str10 = str43;
                j55Var = th;
            }
            String str52 = i15Var.z;
            jc jcVar = i15Var.A;
            if (jcVar != null) {
                str11 = str52;
                gcVar = new gc(jcVar.a, jcVar.b, jcVar.c, jcVar.d, jcVar.e, jcVar.f, jcVar.g, jcVar.h);
            } else {
                str11 = str52;
                gcVar = th;
            }
            kk1 kk1Var = i15Var.B;
            ?? hk1Var = kk1Var != null ? new hk1(kk1Var.a, kk1Var.b, kk1Var.c) : th;
            yt7 yt7Var = i15Var.C;
            ?? r25 = uu4Var;
            bn5 bn5Var = new bn5(new b15(str2, str3, str4, pj3Var, str5, movieType2, str, obj2, str6, Z, str7, str8, str9, obj3, obj4, r25, str10, str44, ma8Var, pd0Var, sp8Var, Z2, z, z3, j55Var, str11, gcVar, hk1Var, yt7Var != null ? new st7(yt7Var.a, yt7Var.b) : th));
            this.a = th;
            this.b = i2;
            this.c = 2;
            CoroutineSingletons coroutineSingletons5 = coroutineSingletons;
            if (ze2Var.emit(bn5Var, this) == coroutineSingletons5) {
                return coroutineSingletons5;
            }
        } else {
            if (i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b.b(obj);
        }
        return tx8.a;
    }
}
