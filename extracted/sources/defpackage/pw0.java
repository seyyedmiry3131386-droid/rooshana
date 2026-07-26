package defpackage;

import android.os.Bundle;
import ir.mservices.market.common.comment.CommentFlowFragment;
import ir.mservices.market.common.comment.data.CommentScenario;
import ir.mservices.market.data.NavIntentDirections;
import ir.mservices.market.version2.fragments.dialog.DialogDataModel;
import kotlin.Pair;

/* JADX INFO: loaded from: classes3.dex */
public final class pw0 implements ze2 {
    public final /* synthetic */ CommentFlowFragment a;

    public pw0(CommentFlowFragment commentFlowFragment) {
        this.a = commentFlowFragment;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        int i = CommentFlowFragment.P0;
        Bundle bundleG = is3.g(new Pair("comment_scenario", (CommentScenario.RemoveComment) obj));
        CommentFlowFragment commentFlowFragment = this.a;
        pk5.g(commentFlowFragment.C0(), new NavIntentDirections.AlertBottom(new bd(new DialogDataModel(commentFlowFragment.I0(), "DIALOG_ACTION_REMOVE_COMMENT", bundleG, 8), commentFlowFragment.K().getString(rs6.delete_comment), commentFlowFragment.K().getString(rs6.delete_comment_message), commentFlowFragment.K().getString(rs6.delete_comment), commentFlowFragment.K().getString(rs6.button_cancel), false)), -1);
        return tx8.a;
    }
}
