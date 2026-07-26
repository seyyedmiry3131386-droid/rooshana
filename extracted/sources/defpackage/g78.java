package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import ir.mservices.market.movie.streamers.StreamerProfileFragment;
import kotlin.b;

/* JADX INFO: loaded from: classes3.dex */
public final class g78 implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ View a;
    public final /* synthetic */ StreamerProfileFragment b;

    public g78(View view, StreamerProfileFragment streamerProfileFragment) {
        this.a = view;
        this.b = streamerProfileFragment;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        this.a.getViewTreeObserver().removeOnPreDrawListener(this);
        StreamerProfileFragment streamerProfileFragment = this.b;
        try {
            int i = StreamerProfileFragment.s1;
            streamerProfileFragment.O1();
            return true;
        } catch (Throwable th) {
            b.a(th);
            return true;
        }
    }
}
