package defpackage;

import android.content.ContentResolver;
import android.provider.Settings;
import android.view.OrientationEventListener;
import androidx.fragment.app.FragmentActivity;
import ir.mservices.market.movie.ui.player.BaseMovieViewModel;
import ir.mservices.market.version2.fragments.IbexFragment;

/* JADX INFO: loaded from: classes3.dex */
public final class bh3 extends OrientationEventListener {
    public final /* synthetic */ IbexFragment a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bh3(IbexFragment ibexFragment, FragmentActivity fragmentActivity) {
        super(fragmentActivity);
        this.a = ibexFragment;
    }

    @Override // android.view.OrientationEventListener
    public final void onOrientationChanged(int i) {
        ContentResolver contentResolver;
        IbexFragment ibexFragment = this.a;
        o79 o79Var = ibexFragment.Z0;
        if (ibexFragment.W0 == null) {
            js3.V("graphicUtils");
            throw null;
        }
        FragmentActivity fragmentActivityF = ibexFragment.F();
        if (fragmentActivityF == null || (contentResolver = fragmentActivityF.getContentResolver()) == null || Settings.System.getInt(contentResolver, "accelerometer_rotation", 0) != 1 || !ibexFragment.o1) {
            return;
        }
        ((Number) ((BaseMovieViewModel) o79Var.getValue()).w.a.getValue()).intValue();
        ((Number) ((BaseMovieViewModel) o79Var.getValue()).w.a.getValue()).intValue();
    }
}
