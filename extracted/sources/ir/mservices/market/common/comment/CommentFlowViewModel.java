package ir.mservices.market.common.comment;

import defpackage.c5;
import defpackage.dp3;
import defpackage.jd7;
import defpackage.js3;
import defpackage.k79;
import defpackage.pv6;
import defpackage.rs6;
import defpackage.tx8;
import defpackage.vy2;
import ir.mservices.market.common.comment.data.CommentScenario;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.i;

/* JADX INFO: loaded from: classes3.dex */
public final class CommentFlowViewModel extends k79 {
    public final pv6 A;
    public final dp3 b;
    public final c5 c;
    public final CommentScenario d;
    public String e;
    public final i f;
    public final pv6 g;
    public final i h;
    public final pv6 i;
    public final i j;
    public final pv6 k;
    public final i l;
    public final pv6 m;
    public final i n;
    public final pv6 o;
    public final i p;
    public final pv6 q;
    public final i r;
    public final pv6 s;
    public final i t;
    public final pv6 u;
    public final i v;
    public final pv6 w;
    public final i x;
    public final pv6 y;
    public final i z;

    public CommentFlowViewModel(jd7 jd7Var, dp3 dp3Var, c5 c5Var) {
        js3.p(jd7Var, "savedStateHandle");
        js3.p(dp3Var, "installManager");
        js3.p(c5Var, "accountManager");
        this.b = dp3Var;
        this.c = c5Var;
        this.d = (CommentScenario) jd7Var.b("comment_scenario");
        i iVarE = vy2.e(0, 7, null);
        this.f = iVarE;
        this.g = new pv6(iVarE);
        i iVarE2 = vy2.e(0, 7, null);
        this.h = iVarE2;
        this.i = new pv6(iVarE2);
        i iVarE3 = vy2.e(0, 7, null);
        this.j = iVarE3;
        this.k = new pv6(iVarE3);
        i iVarE4 = vy2.e(0, 7, null);
        this.l = iVarE4;
        this.m = new pv6(iVarE4);
        i iVarE5 = vy2.e(0, 7, null);
        this.n = iVarE5;
        this.o = new pv6(iVarE5);
        i iVarE6 = vy2.e(0, 7, null);
        this.p = iVarE6;
        this.q = new pv6(iVarE6);
        i iVarE7 = vy2.e(0, 7, null);
        this.r = iVarE7;
        this.s = new pv6(iVarE7);
        i iVarE8 = vy2.e(0, 7, null);
        this.t = iVarE8;
        this.u = new pv6(iVarE8);
        i iVarE9 = vy2.e(0, 7, null);
        this.v = iVarE9;
        this.w = new pv6(iVarE9);
        i iVarE10 = vy2.e(0, 7, null);
        this.x = iVarE10;
        this.y = new pv6(iVarE10);
        i iVarE11 = vy2.e(0, 7, null);
        this.z = iVarE11;
        this.A = new pv6(iVarE11);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(ir.mservices.market.common.comment.data.CommentScenario r6, kotlin.coroutines.jvm.internal.ContinuationImpl r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof ir.mservices.market.common.comment.CommentFlowViewModel$openLoginDialog$1
            if (r0 == 0) goto L13
            r0 = r7
            ir.mservices.market.common.comment.CommentFlowViewModel$openLoginDialog$1 r0 = (ir.mservices.market.common.comment.CommentFlowViewModel$openLoginDialog$1) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            ir.mservices.market.common.comment.CommentFlowViewModel$openLoginDialog$1 r0 = new ir.mservices.market.common.comment.CommentFlowViewModel$openLoginDialog$1
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.a
            kotlin.coroutines.intrinsics.CoroutineSingletons r1 = kotlin.coroutines.intrinsics.CoroutineSingletons.a
            int r2 = r0.c
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L28
            kotlin.b.b(r7)
            goto Lb9
        L28:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L30:
            kotlin.b.b(r7)
            boolean r7 = r6 instanceof ir.mservices.market.common.comment.data.CommentScenario.SubmitReview
            if (r7 == 0) goto L4b
            kotlin.Pair r6 = new kotlin.Pair
            int r7 = defpackage.rs6.bind_message_comment_phone
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r7)
            int r7 = defpackage.rs6.login_label_app_review
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r7)
            r6.<init>(r2, r4)
            goto Lac
        L4b:
            boolean r7 = r6 instanceof ir.mservices.market.common.comment.data.CommentScenario.SubmitDeveloperStar
            if (r7 == 0) goto L63
            kotlin.Pair r6 = new kotlin.Pair
            int r7 = defpackage.rs6.bind_message_comment_phone
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r7)
            int r7 = defpackage.rs6.login_label_app_review
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r7)
            r6.<init>(r2, r4)
            goto Lac
        L63:
            boolean r7 = r6 instanceof ir.mservices.market.common.comment.data.CommentScenario.ReplyReview
            if (r7 == 0) goto L7b
            kotlin.Pair r6 = new kotlin.Pair
            int r7 = defpackage.rs6.bind_message_all_reviews
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r7)
            int r7 = defpackage.rs6.login_label_sub_review
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r7)
            r6.<init>(r2, r4)
            goto Lac
        L7b:
            boolean r7 = r6 instanceof ir.mservices.market.common.comment.data.CommentScenario.ReportReview
            if (r7 == 0) goto L93
            kotlin.Pair r6 = new kotlin.Pair
            int r7 = defpackage.rs6.bind_message_report
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r7)
            int r7 = defpackage.rs6.login_label_app_review_report
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r7)
            r6.<init>(r2, r4)
            goto Lac
        L93:
            boolean r6 = r6 instanceof ir.mservices.market.common.comment.data.CommentScenario.LikeOrDislikeReview
            if (r6 == 0) goto Lab
            kotlin.Pair r6 = new kotlin.Pair
            int r7 = defpackage.rs6.bind_message_like
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r7)
            int r7 = defpackage.rs6.login_label_app_review_like
            java.lang.Integer r4 = new java.lang.Integer
            r4.<init>(r7)
            r6.<init>(r2, r4)
            goto Lac
        Lab:
            r6 = 0
        Lac:
            if (r6 == 0) goto Lb9
            r0.c = r3
            kotlinx.coroutines.flow.i r7 = r5.x
            java.lang.Object r6 = r7.emit(r6, r0)
            if (r6 != r1) goto Lb9
            return r1
        Lb9:
            tx8 r6 = defpackage.tx8.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: ir.mservices.market.common.comment.CommentFlowViewModel.e(ir.mservices.market.common.comment.data.CommentScenario, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public final Object f(SuspendLambda suspendLambda) throws Throwable {
        CommentScenario commentScenario = this.d;
        boolean z = commentScenario instanceof CommentScenario.SubmitDeveloperStar;
        i iVar = this.t;
        i iVar2 = this.z;
        dp3 dp3Var = this.b;
        c5 c5Var = this.c;
        if (z) {
            String packageName = ((CommentScenario.SubmitDeveloperStar) commentScenario).getValue().getPackageName();
            this.e = packageName;
            if (!dp3Var.G(packageName)) {
                Object objEmit = iVar.emit(Boolean.TRUE, suspendLambda);
                if (objEmit == CoroutineSingletons.a) {
                    return objEmit;
                }
            } else if (!c5Var.d()) {
                Object objE = e(commentScenario, suspendLambda);
                if (objE == CoroutineSingletons.a) {
                    return objE;
                }
            } else if (c5Var.f()) {
                Object objEmit2 = this.h.emit(commentScenario, suspendLambda);
                if (objEmit2 == CoroutineSingletons.a) {
                    return objEmit2;
                }
            } else {
                Object objEmit3 = iVar2.emit(Boolean.TRUE, suspendLambda);
                if (objEmit3 == CoroutineSingletons.a) {
                    return objEmit3;
                }
            }
        } else if (commentScenario instanceof CommentScenario.SubmitDeveloperReview) {
            String packageName2 = ((CommentScenario.SubmitDeveloperReview) commentScenario).getValue().getPackageName();
            this.e = packageName2;
            if (!dp3Var.G(packageName2)) {
                Object objEmit4 = iVar.emit(Boolean.TRUE, suspendLambda);
                if (objEmit4 == CoroutineSingletons.a) {
                    return objEmit4;
                }
            } else if (!c5Var.d()) {
                Object objE2 = e(commentScenario, suspendLambda);
                if (objE2 == CoroutineSingletons.a) {
                    return objE2;
                }
            } else if (c5Var.f()) {
                Object objEmit5 = this.j.emit(commentScenario, suspendLambda);
                if (objEmit5 == CoroutineSingletons.a) {
                    return objEmit5;
                }
            } else {
                Object objEmit6 = iVar2.emit(Boolean.TRUE, suspendLambda);
                if (objEmit6 == CoroutineSingletons.a) {
                    return objEmit6;
                }
            }
        } else {
            boolean z2 = commentScenario instanceof CommentScenario.SubmitReview;
            i iVar3 = this.v;
            if (z2) {
                CommentScenario.SubmitReview submitReview = (CommentScenario.SubmitReview) commentScenario;
                if (dp3Var.G(submitReview.getValue().getPackageName())) {
                    this.e = submitReview.getValue().getPackageName();
                    if (submitReview.getValue().isNewRate() && !dp3Var.G(this.e)) {
                        Object objEmit7 = iVar.emit(Boolean.TRUE, suspendLambda);
                        if (objEmit7 == CoroutineSingletons.a) {
                            return objEmit7;
                        }
                    } else if (!c5Var.d()) {
                        Object objE3 = e(commentScenario, suspendLambda);
                        if (objE3 == CoroutineSingletons.a) {
                            return objE3;
                        }
                    } else if (c5Var.f()) {
                        Object objEmit8 = this.f.emit(commentScenario, suspendLambda);
                        if (objEmit8 == CoroutineSingletons.a) {
                            return objEmit8;
                        }
                    } else {
                        Object objEmit9 = iVar2.emit(Boolean.TRUE, suspendLambda);
                        if (objEmit9 == CoroutineSingletons.a) {
                            return objEmit9;
                        }
                    }
                } else {
                    Object objEmit10 = iVar3.emit(new Integer(rs6.edit_review_not_installed), suspendLambda);
                    if (objEmit10 == CoroutineSingletons.a) {
                        return objEmit10;
                    }
                }
            } else if (commentScenario instanceof CommentScenario.ReplyReview) {
                String packageName3 = ((CommentScenario.ReplyReview) commentScenario).getValue().getPackageName();
                this.e = packageName3;
                if (!dp3Var.G(packageName3)) {
                    Object objEmit11 = iVar3.emit(new Integer(rs6.write_sub_review_not_installed), suspendLambda);
                    if (objEmit11 == CoroutineSingletons.a) {
                        return objEmit11;
                    }
                } else if (!c5Var.d()) {
                    Object objE4 = e(commentScenario, suspendLambda);
                    if (objE4 == CoroutineSingletons.a) {
                        return objE4;
                    }
                } else if (c5Var.f()) {
                    Object objEmit12 = this.l.emit(commentScenario, suspendLambda);
                    if (objEmit12 == CoroutineSingletons.a) {
                        return objEmit12;
                    }
                } else {
                    Object objEmit13 = iVar2.emit(Boolean.TRUE, suspendLambda);
                    if (objEmit13 == CoroutineSingletons.a) {
                        return objEmit13;
                    }
                }
            } else if (commentScenario instanceof CommentScenario.LikeOrDislikeReview) {
                this.e = ((CommentScenario.LikeOrDislikeReview) commentScenario).getValue().getPackageName();
                if (c5Var.d()) {
                    Object objEmit14 = this.r.emit(commentScenario, suspendLambda);
                    if (objEmit14 == CoroutineSingletons.a) {
                        return objEmit14;
                    }
                } else {
                    Object objE5 = e(commentScenario, suspendLambda);
                    if (objE5 == CoroutineSingletons.a) {
                        return objE5;
                    }
                }
            } else if (commentScenario instanceof CommentScenario.ReportReview) {
                if (c5Var.d()) {
                    Object objEmit15 = this.n.emit(commentScenario, suspendLambda);
                    if (objEmit15 == CoroutineSingletons.a) {
                        return objEmit15;
                    }
                } else {
                    Object objE6 = e(commentScenario, suspendLambda);
                    if (objE6 == CoroutineSingletons.a) {
                        return objE6;
                    }
                }
            } else if (commentScenario instanceof CommentScenario.RemoveComment) {
                this.e = ((CommentScenario.RemoveComment) commentScenario).getValue().getPackageName();
                Object objEmit16 = this.p.emit(commentScenario, suspendLambda);
                if (objEmit16 == CoroutineSingletons.a) {
                    return objEmit16;
                }
            } else if (commentScenario != null) {
                throw new NoWhenBranchMatchedException();
            }
        }
        return tx8.a;
    }
}
