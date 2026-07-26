package defpackage;

import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.d;
import ir.mservices.market.social.list.common.ProfileAddListToOwnProfileDialogFragment;
import ir.mservices.market.social.profile.list.ProfileListFragment;
import ir.mservices.market.version2.fragments.dialog.AlertBottomDialogFragment;
import ir.mservices.market.views.MyketProgressState;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: classes3.dex */
public final class il6 implements ze2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileListFragment b;

    public /* synthetic */ il6(ProfileListFragment profileListFragment, int i) {
        this.a = i;
        this.b = profileListFragment;
    }

    @Override // defpackage.ze2
    public final Object emit(Object obj, g51 g51Var) {
        int i = this.a;
        tx8 tx8Var = tx8.a;
        ProfileListFragment profileListFragment = this.b;
        switch (i) {
            case 0:
                n99 n99Var = (n99) obj;
                if (n99Var instanceof h99) {
                    String translatedMessage = ((h99) n99Var).a.getTranslatedMessage();
                    if (translatedMessage == null || f88.n0(translatedMessage)) {
                        translatedMessage = profileListFragment.K().getString(rs6.error_dto_default_message);
                        js3.o(translatedMessage, "getString(...)");
                    }
                    int i2 = ProfileListFragment.Z0;
                    d dVarG = profileListFragment.J0.g();
                    ProfileAddListToOwnProfileDialogFragment profileAddListToOwnProfileDialogFragment = dVarG instanceof ProfileAddListToOwnProfileDialogFragment ? (ProfileAddListToOwnProfileDialogFragment) dVarG : null;
                    if (profileAddListToOwnProfileDialogFragment != null) {
                        profileAddListToOwnProfileDialogFragment.V0(translatedMessage);
                    }
                } else if (n99Var instanceof l99) {
                    int i3 = ProfileListFragment.Z0;
                    if (profileListFragment.J0.g() instanceof ProfileAddListToOwnProfileDialogFragment) {
                        profileListFragment.J0.q();
                    }
                    FragmentActivity fragmentActivityF = profileListFragment.F();
                    hh2 hh2Var = new hh2(fragmentActivityF, fragmentActivityF != null ? fragmentActivityF.getString(rs6.profile_add_list_successful_message) : null);
                    hh2Var.F(qs6.done);
                    hh2Var.G();
                    hh2.H(hh2Var);
                } else if (!(n99Var instanceof j99)) {
                    throw new NoWhenBranchMatchedException();
                }
                return tx8Var;
            case 1:
                ((Boolean) obj).getClass();
                int i4 = ProfileListFragment.Z0;
                d dVarG2 = profileListFragment.J0.g();
                AlertBottomDialogFragment alertBottomDialogFragment = dVarG2 instanceof AlertBottomDialogFragment ? (AlertBottomDialogFragment) dVarG2 : null;
                if (alertBottomDialogFragment != null) {
                    alertBottomDialogFragment.e1.setStateCommit(MyketProgressState.b);
                }
                return tx8Var;
            default:
                int i5 = ProfileListFragment.Z0;
                if (profileListFragment.J0.g() instanceof AlertBottomDialogFragment) {
                    profileListFragment.J0.q();
                }
                return tx8Var;
        }
    }
}
