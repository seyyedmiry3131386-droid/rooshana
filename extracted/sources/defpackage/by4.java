package defpackage;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import ir.mservices.market.common.comment.data.CommentScenario;
import ir.mservices.market.common.comment.data.RemoveReviewData;
import ir.mservices.market.common.comment.data.ReportReviewData;
import ir.mservices.market.common.comment.data.response.ReviewDto;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.version2.ApplicationLauncher;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.fragments.dialog.DialogResult;
import ir.mservices.market.version2.ui.recycler.data.LineMenuItemData;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
public final class by4 implements lt5 {
    public final c5 a;
    public final String b;
    public final String c;
    public final FragmentActivity d;
    public final ay4 e;

    public by4(String str, FragmentActivity fragmentActivity, String str2, ay4 ay4Var) {
        this.c = str;
        this.d = fragmentActivity;
        this.e = ay4Var;
        this.b = str2;
        w91 w91Var = (w91) ApplicationLauncher.o.b();
        this.a = (c5) w91Var.L.get();
    }

    public final void a(Bundle bundle) {
        ReviewDto reviewDto;
        DialogDataModel dialogDataModel = (DialogDataModel) dt2.p(bundle, "BUNDLE_KEY_DATA", DialogDataModel.class);
        if ("DIALOG_KEY_MORE_MENU".equalsIgnoreCase(dialogDataModel.b) && dialogDataModel.d == DialogResult.a && (reviewDto = (ReviewDto) dt2.s(dialogDataModel.c, "BUNDLE_KEY_REVIEW", ReviewDto.class)) != null) {
            String string = bundle.getString("BUNDLE_KEY_ID");
            boolean zEqualsIgnoreCase = string.equalsIgnoreCase("REMOVE_REVIEW");
            FragmentActivity fragmentActivity = this.d;
            if (zEqualsIgnoreCase) {
                pk5.c(fragmentActivity, new CommentScenario.RemoveComment(new RemoveReviewData(this.c, reviewDto.getId(), reviewDto.getParentId())));
            } else if (string.equalsIgnoreCase("REPORT_REVIEW")) {
                ay4 ay4Var = this.e;
                if (ay4Var != null) {
                    ay4Var.e();
                }
                pk5.c(fragmentActivity, new CommentScenario.ReportReview(new ReportReviewData(reviewDto.getId(), reviewDto.getParentId())));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void b(ReviewDto reviewDto) {
        ArrayList arrayList = new ArrayList();
        boolean zEqualsIgnoreCase = this.a.h.e().equalsIgnoreCase(reviewDto.getAccountKey());
        FragmentActivity fragmentActivity = this.d;
        if (zEqualsIgnoreCase) {
            arrayList.add(new LineMenuItemData("REMOVE_REVIEW", fragmentActivity.getString(rs6.button_remove), sj8.b().A));
        } else {
            arrayList.add(new LineMenuItemData("REPORT_REVIEW", fragmentActivity.getString(rs6.report), sj8.b().A));
        }
        Bundle bundle = new Bundle();
        bundle.putSerializable("BUNDLE_KEY_REVIEW", reviewDto);
        NavIntentDirections.LineMenu lineMenu = new NavIntentDirections.LineMenu(new c74(new DialogDataModel(this.b, "DIALOG_KEY_MORE_MENU", bundle), (LineMenuItemData[]) arrayList.toArray(new LineMenuItemData[0]), null));
        if (fragmentActivity instanceof am2) {
            pk5.h((am2) fragmentActivity, lineMenu);
        }
        ay4 ay4Var = this.e;
        if (ay4Var != null) {
            ay4Var.c();
        }
    }
}
