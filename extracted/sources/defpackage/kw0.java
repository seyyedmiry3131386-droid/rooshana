package defpackage;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.d;
import ir.mservices.market.common.comment.CommentFlowFragment;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.login.data.LoginData;
import ir.mservices.market.login.data.PhoneBindData;
import ir.mservices.market.version2.fragments.dialog.AlertBottomDialogFragment;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import ir.mservices.market.version2.webapi.responsedto.ResultDTO;
import ir.mservices.market.views.MyketProgressState;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class kw0 implements ze2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ CommentFlowFragment b;

    public /* synthetic */ kw0(CommentFlowFragment commentFlowFragment, int i) {
        this.a = i;
        this.b = commentFlowFragment;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        wl2 wl2VarL;
        int i = this.a;
        tx8 tx8Var = tx8.a;
        CommentFlowFragment commentFlowFragment = this.b;
        switch (i) {
            case 0:
                String string = (String) obj;
                if (string == null || f88.n0(string)) {
                    string = commentFlowFragment.K().getString(rs6.comment_Like_send_error);
                    js3.o(string, "getString(...)");
                }
                hh2 hh2Var = new hh2(commentFlowFragment.F(), string);
                hh2Var.G();
                hh2.H(hh2Var);
                break;
            case 1:
                int i2 = CommentFlowFragment.P0;
                FragmentActivity fragmentActivityF = commentFlowFragment.F();
                if (fragmentActivityF != null && (wl2VarL = fragmentActivityF.L()) != null) {
                    p40 p40Var = new p40(wl2VarL);
                    p40Var.j(commentFlowFragment);
                    p40Var.e();
                }
                break;
            case 2:
                n99 n99Var = (n99) obj;
                if (n99Var instanceof l99) {
                    int i3 = CommentFlowFragment.P0;
                    if (commentFlowFragment.J0.g() instanceof AlertBottomDialogFragment) {
                        commentFlowFragment.J0.q();
                    }
                    FragmentActivity fragmentActivityF2 = commentFlowFragment.F();
                    String translatedMessage = ((ResultDTO) ((l99) n99Var).a).getTranslatedMessage();
                    if (f88.n0(translatedMessage)) {
                        translatedMessage = commentFlowFragment.K().getString(rs6.comment_remove_successful);
                    }
                    hh2.H(new hh2(fragmentActivityF2, translatedMessage));
                } else if (n99Var instanceof h99) {
                    int i4 = CommentFlowFragment.P0;
                    d dVarG = commentFlowFragment.J0.g();
                    AlertBottomDialogFragment alertBottomDialogFragment = dVarG instanceof AlertBottomDialogFragment ? (AlertBottomDialogFragment) dVarG : null;
                    if (alertBottomDialogFragment != null) {
                        alertBottomDialogFragment.e1.setStateCommit(MyketProgressState.b);
                    }
                    String translatedMessage2 = ((h99) n99Var).a.getTranslatedMessage();
                    if (translatedMessage2 == null || f88.n0(translatedMessage2)) {
                        translatedMessage2 = commentFlowFragment.K().getString(rs6.comment_remove_error);
                        js3.o(translatedMessage2, "getString(...)");
                    }
                    hh2.H(new hh2(commentFlowFragment.F(), translatedMessage2));
                }
                break;
            case 3:
                ((Boolean) obj).getClass();
                int i5 = CommentFlowFragment.P0;
                pk5.g(commentFlowFragment.C0(), new NavIntentDirections.AlertBottom(new bd(new DialogDataModel(commentFlowFragment.I0(), "DIALOG_KEY_NOT_INSTALLED", null, 12), null, commentFlowFragment.K().getString(rs6.app_must_installed), commentFlowFragment.K().getString(rs6.download_app), commentFlowFragment.K().getString(rs6.button_cancel), true)), -1);
                break;
            case 4:
                int iIntValue = ((Number) obj).intValue();
                FragmentActivity fragmentActivityF3 = commentFlowFragment.F();
                hh2 hh2Var2 = new hh2(fragmentActivityF3, fragmentActivityF3 != null ? fragmentActivityF3.getString(iIntValue) : null);
                hh2Var2.G();
                hh2.H(hh2Var2);
                break;
            case 5:
                Pair pair = (Pair) obj;
                int iIntValue2 = ((Number) pair.a).intValue();
                int iIntValue3 = ((Number) pair.b).intValue();
                int i6 = CommentFlowFragment.P0;
                DialogDataModel dialogDataModel = new DialogDataModel(commentFlowFragment.I0(), "DIALOG_KEY_LOGIN", null, 12);
                PhoneBindData phoneBindData = new PhoneBindData("");
                String string2 = commentFlowFragment.K().getString(iIntValue2);
                String string3 = commentFlowFragment.K().getString(iIntValue3);
                js3.o(string3, "getString(...)");
                pk5.g(commentFlowFragment.C0(), new NavIntentDirections.Login(new wd4(dialogDataModel, new LoginData(phoneBindData, string2, string3, (String) null, (String) null, (String) null, (String) null, 1016))), -1);
                break;
            default:
                ((Boolean) obj).getClass();
                int i7 = CommentFlowFragment.P0;
                pk5.g(commentFlowFragment.C0(), new NavIntentDirections.Nickname(new tn5(new DialogDataModel(commentFlowFragment.I0(), "DIALOG_KEY_NICKNAME_REPLY", null, 12), commentFlowFragment.K().getString(rs6.nickname_description_comment))), -1);
                break;
        }
        return tx8Var;
    }
}
