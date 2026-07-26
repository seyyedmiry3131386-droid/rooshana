package defpackage;

import defpackage.bt2;
import defpackage.m88;
import defpackage.pi0;
import defpackage.t32;
import defpackage.y97;
import defpackage.ys5;
import ir.mservices.market.common.comment.CommentFlowFragment;
import ir.mservices.market.common.comment.CommentViewModel;
import ir.mservices.market.common.comment.data.CommentScenario;
import ir.mservices.market.common.comment.data.LikeOrDislikeData;
import ir.mservices.market.version2.webapi.requestdto.LikeAppRequestDto;
import ir.mservices.market.version2.webapi.responsedto.ErrorDTO;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class qw0 implements ze2 {
    public final /* synthetic */ CommentFlowFragment a;

    public qw0(CommentFlowFragment commentFlowFragment) {
        this.a = commentFlowFragment;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [ir.mservices.market.common.comment.a] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        int i = CommentFlowFragment.P0;
        final CommentViewModel commentViewModelH0 = this.a.H0();
        final LikeOrDislikeData value = ((CommentScenario.LikeOrDislikeReview) obj).getValue();
        js3.p(value, "likeOrDislikeData");
        String strA = commentViewModelH0.d.a();
        js3.o(strA, "getAccountId(...)");
        LikeAppRequestDto likeAppRequestDto = new LikeAppRequestDto(value.getLiked(), strA, value.getParentId());
        commentViewModelH0.e.e(value.getPackageName(), value.getReviewId(), value.getParentId(), Boolean.valueOf(value.getLiked()));
        t32 t32VarB = t32.b();
        value.getLiked();
        String packageName = value.getPackageName();
        String reviewId = value.getReviewId();
        value.getParentId();
        t32VarB.g(new ys5(packageName, reviewId));
        commentViewModelH0.h.q(value.getPackageName(), value.getReviewId(), likeAppRequestDto, commentViewModelH0, new en(25), new h32() { // from class: ir.mservices.market.common.comment.a
            @Override // defpackage.h32
            public final void j(Serializable serializable) {
                ErrorDTO errorDTO = (ErrorDTO) serializable;
                CommentViewModel commentViewModel = commentViewModelH0;
                if (errorDTO == null || !m88.T(errorDTO.getMessageCode(), "AlreadyLiked", true)) {
                    pi0 pi0Var = commentViewModel.e;
                    LikeOrDislikeData likeOrDislikeData = value;
                    pi0Var.e(likeOrDislikeData.getPackageName(), likeOrDislikeData.getReviewId(), likeOrDislikeData.getParentId(), null);
                    t32 t32VarB2 = t32.b();
                    String packageName2 = likeOrDislikeData.getPackageName();
                    String reviewId2 = likeOrDislikeData.getReviewId();
                    likeOrDislikeData.getParentId();
                    t32VarB2.g(new ys5(packageName2, reviewId2));
                }
                bt2.G(y97.G(commentViewModel), null, null, new CommentViewModel$doLikeOrDislikeRequest$1$2$1(commentViewModel, errorDTO, null), 3);
            }
        });
        return tx8.a;
    }
}
